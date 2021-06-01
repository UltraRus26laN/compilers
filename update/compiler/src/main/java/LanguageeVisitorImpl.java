import onefour.*;
import onefour.String;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class LanguageeVisitorImpl extends LanguageeBaseVisitor<Node>  {
    private final LanguageeParserV1 parserV1;
    private final VariablesMethodReg variablesMethodReg;
    private final java.lang.String name;

    public LanguageeVisitorImpl(LanguageeParserV1 parserV1, java.lang.String name, VariablesMethodReg variablesMethodReg) {
        this.parserV1 = parserV1;
        this.name = name;
        this.variablesMethodReg = variablesMethodReg;
    }

    @Override
    public Node visitProgram(LanguageeParser.ProgramContext ctx) {
        Program program = new Program();
        program.block = (Block) this.visitBlock(ctx.block());
        return program;
    }

    @Override
    public Node visitBlock(LanguageeParser.BlockContext ctx) {
        Block block = new Block();
        ArrayList<Statement> statements = new ArrayList<>();
        List<LanguageeParser.StatementContext> states = ctx.statement();
        for(int i=0; i<states.size(); i++){
            statements.add((Statement) this.visitStatement(states.get(i)));
        }
        block.statements= statements;
        return block;
    }

    @Override
    public Node visitStatement(LanguageeParser.StatementContext ctx) {
        Statement statement = new Statement();
        if (ctx.if_then()!=null) {
            statement.if_then= (If_then) this.visitIf_then(ctx.if_then());
        }
        if (ctx.print_expr()!=null) {
            statement.print_expr= (Print_expr) this.visitPrint_expr(ctx.print_expr());
        }
        if (ctx.method()!=null) {
            statement.function = (Function) this.visitMethod(ctx.method());
        }
        if (ctx.while_cycle()!=null) {
            statement.while_cicle= (While_cicle) this.visitWhile_cycle(ctx.while_cycle());
        }
        if (ctx.assign_var()!=null) {
            statement.assign_var= (Assign_var) this.visitAssign_var(ctx.assign_var());
        }
        return statement;
    }

    @Override
    public Node visitExpression(LanguageeParser.ExpressionContext ctx) {
        Expression expression = new Expression();

        if (!ctx.expression().isEmpty()) {
            ArrayList<Expression> expressions = new ArrayList<>();
            List<LanguageeParser.ExpressionContext> exps = ctx.expression();
            for(int i=0; i<exps.size(); i++){
                expressions.add((Expression) this.visitExpression(exps.get(i)));
            }
            expression.expressions= expressions;
            if (ctx.arif()!= null) {
                switch (ctx.arif().getText()) {
                    case "+":
                        expression.arif = Arif.PLUS;
                        break;
                    case "-":
                        expression.arif = Arif.MINUS;
                        break;
                    case "*":
                        expression.arif = Arif.MULTIPLY;
                        break;
                    case "/":
                        expression.arif = Arif.DIVIDE;
                        break;
                    case "%":
                        expression.arif = Arif.PERCENT;
                        break;
                    case "^":
                        expression.arif = Arif.DEGREE;
                        break;

                }

            }
            if(ctx.compare_op()!=null){
                switch (ctx.compare_op().getText()) {
                    case "==":
                        expression.compare_op = Compare_op.EQUAL;
                        break;
                    case "!=":
                        expression.compare_op = Compare_op.NON_EQUAL;
                        break;
                    case "<":
                        expression.compare_op = Compare_op.LESS ;
                        break;
                    case ">":
                        expression.compare_op = Compare_op.GREATER;
                        break;
                    case "<=":
                        expression.compare_op = Compare_op.LESS_OR_EQUALS;
                        break;
                    case ">=":
                        expression.compare_op = Compare_op.GREATER_OR_EQUALS;
                        break;

                }
            }

        }
        if (ctx.NUMBER() != null) {
            expression.number = Integer.parseInt(ctx.NUMBER().getText());
        }
        if (ctx.ID() != null) {
            expression.id = new Id();
            expression.id.name = ctx.ID().getText();
            variablesMethodReg.addVariable(ctx.ID().getText(), false);
        }

        if (ctx.br_expr()!=null) {
            expression.br_expr= (Br_expr) this.visitBr_expr(ctx.br_expr());
        }
        if (ctx.neg_expr()!=null) {
            expression.neg_expr= (Neg_expr) this.visitNeg_expr(ctx.neg_expr());
        }
        if (ctx.string()!=null) {
            expression.string= (onefour.String) this.visitString(ctx.string());
        }
        if (ctx.method()!=null) {
            expression.function = (Function) this.visitMethod(ctx.method());
        }

        return expression;
    }

    @Override
    public Node visitType(LanguageeParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Node visitArif(LanguageeParser.ArifContext ctx) {
        return null;
    }

    @Override
    public Node visitCompare_op(LanguageeParser.Compare_opContext ctx) {
        return null;
    }

    @Override
    public Node visitString(LanguageeParser.StringContext ctx) {
        String string = new String();
        Id id = new Id();
        id.name = ctx.ID().getText();
        string.id=id;
        return string;
    }

    @Override
    public Node visitSignature_method(LanguageeParser.Signature_methodContext ctx) {
        Signature_method signature_method = new Signature_method();
        ArrayList<Id> ids = new ArrayList<>();
        List<TerminalNode> is = ctx.ID();
        for(int i=0; i<is.size(); i++){
            Id id  = new Id();
            id.name=is.get(i).getText();
            ids.add(id);
            variablesMethodReg.addVariable(is.get(i).getText(), false);
        }
        signature_method.ids = ids;
        return signature_method;
    }

    @Override
    public Node visitMethod(LanguageeParser.MethodContext ctx) {
        Function method = new Function();
        Id id = new Id();
        id.name = ctx.ID().getText();
        method.id = id;
        variablesMethodReg.addMethod(ctx.ID().getText());
        if(!ctx.signature_method().isEmpty()) {
            method.signature_method = (Signature_method) this.visitSignature_method(ctx.signature_method());
            variablesMethodReg.addMethodCallIDs(ctx.ID().getText() , method.signature_method.ids);
        }
        return method;
    }

    @Override
    public Node visitAssign_var(LanguageeParser.Assign_varContext ctx) {
        Assign_var assign_var = new Assign_var();
        assign_var.expression = (Expression) this.visitExpression(ctx.expression());
        assign_var.id = new Id();
        assign_var.id.name = ctx.ID().getText();
        variablesMethodReg.addVariable(ctx.ID().getText(), true);
        List<LanguageeParser.TypeContext> types = ctx.type();

        if(types.size()>=1) {
            switch (types.get(0).getText()) {
                case "int":
                    assign_var.type1 = Type.INT;
                    break;
                case "float":
                    assign_var.type1 = Type.FLOAT;
                    break;
                case "var":
                    assign_var.type1 = Type.VAR;
                    break;
            }
        }
        variablesMethodReg.addVariableType(ctx.ID().getText(),assign_var.type1);
        if(types.size()>=2) {
            switch (types.get(1).getText()) {
                case "int":
                    assign_var.type2 = Type.INT;
                    break;
                case "float":
                    assign_var.type2 = Type.FLOAT;
                    break;
                case "var":
                    assign_var.type2 = Type.VAR;
                    break;
            }
        }
        return assign_var;
    }

    @Override
    public Node visitPrint_expr(LanguageeParser.Print_exprContext ctx) {
        Print_expr print_expr = new Print_expr();
        print_expr.expression = (Expression) this.visitExpression(ctx.expression());
        return print_expr;
    }

    @Override
    public Node visitBr_expr(LanguageeParser.Br_exprContext ctx) {
        Br_expr br_expr = new Br_expr();
        br_expr.expression = (Expression) this.visitExpression(ctx.expression());
        return br_expr;
    }

    @Override
    public Node visitNeg_expr(LanguageeParser.Neg_exprContext ctx) {
        Neg_expr neg_expr = new Neg_expr();
        neg_expr.expression = (Expression) this.visitExpression(ctx.expression());
        return neg_expr;
    }

    @Override
    public Node visitWhile_cycle(LanguageeParser.While_cycleContext ctx) {
        While_cicle while_cicle = new While_cicle();
        while_cicle.block = (Block) this.visitBlock(ctx.block());
        while_cicle.expression =(Expression) this.visitExpression(ctx.expression());
        return while_cicle;
    }

    @Override
    public Node visitIf_then(LanguageeParser.If_thenContext ctx) {
        If_then if_then = new If_then();
        if(!ctx.block_then().isEmpty()){
            if_then.block_then = (Block_then) this.visitBlock_then(ctx.block_then());
        }
        if_then.expression = (Expression) this.visitExpression(ctx.expression());
        if_then.block = (Block) this.visitBlock(ctx.block());
        return if_then;
    }

    @Override
    public Node visitBlock_then(LanguageeParser.Block_thenContext ctx) {
        Block_then block_then = new Block_then();
        block_then.block = (Block) this.visitBlock(ctx.block());
        return block_then;
    }

    @Override
    public Node visitSignature(LanguageeParser.SignatureContext ctx) {
        Signature signature = new Signature();
        ArrayList<Id> ids = new ArrayList<>();
        List<TerminalNode> is = ctx.ID();
        for(int i=0; i<is.size(); i++){
            Id id  = new Id();
            id.name=is.get(i).getText();
            variablesMethodReg.addVariable(is.get(i).getText(), false);
            ids.add(id);
        }
        signature.ids = ids;
        List<LanguageeParser.TypeContext> types = ctx.type();
        ArrayList<Type> typess = new ArrayList<>();
        for (int i = 0; i < types.size(); i++) {
            Type type;
            switch (types.get(i).getText()) {
                case "int":
                    type = Type.INT;
                    break;
                case "float":
                    type = Type.FLOAT;
                    break;
                case "var":
                    type = Type.VAR;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + types.get(i).getText());
            }
            typess.add(type);
        }
        signature.types = typess;
        return signature;
    }

    @Override
    public Node visitBlock_return(LanguageeParser.Block_returnContext ctx) {
        Block_return block_return = new Block_return();
        Id id = new Id();
        id.name = ctx.ID().getText();
        block_return.id = id;
        variablesMethodReg.addVariable(ctx.ID().getText(), false);
        ArrayList<Statement> statements = new ArrayList<>();
        List<LanguageeParser.StatementContext> states = ctx.statement();
        for(int i=0; i<states.size(); i++){
            statements.add((Statement) this.visitStatement(states.get(i)));
        }
        block_return.statements= statements;
        return null;
    }

    @Override
    public Node visitBlock_non_return(LanguageeParser.Block_non_returnContext ctx) {
        Block_non_return block_non_return = new Block_non_return();
        ArrayList<Statement> statements = new ArrayList<>();
        List<LanguageeParser.StatementContext> states = ctx.statement();
        for(int i=0; i<states.size(); i++){
            statements.add((Statement) this.visitStatement(states.get(i)));
        }
        block_non_return.statements= statements;
        return block_non_return;
    }

    @Override
    public Node visitSubprogram_return(LanguageeParser.Subprogram_returnContext ctx) {
        Subprogram_return subprogram_return = new Subprogram_return();
        Id id = new Id();
        id.name = ctx.ID().getText();
        subprogram_return.id=id;
        variablesMethodReg.addMethod(subprogram_return.id.name);
        subprogram_return.block_return = (Block_return) this.visitBlock_return(ctx.block_return());
        if(!ctx.signature().isEmpty()) {
            subprogram_return.signature = (Signature) this.visitSignature(ctx.signature());
            variablesMethodReg.addMethodTypes(subprogram_return.id.name,subprogram_return.signature.types);
        }
        switch (ctx.type().getText()) {
            case "int":
                subprogram_return.type = Type.INT;
                break;
            case "float":
                subprogram_return.type = Type.FLOAT;
                break;
            case "var":
                subprogram_return.type = Type.VAR;
                break;
        }
        return subprogram_return;
    }

    @Override
    public Node visitSubprogram_non_return(LanguageeParser.Subprogram_non_returnContext ctx) {
        Subprogram_non_return subprogram_non_return = new Subprogram_non_return();
        subprogram_non_return.block_non_return = (Block_non_return) this.visitBlock_non_return(ctx.block_non_return());
        Id id = new Id();
        id.name = ctx.ID().getText();
        subprogram_non_return.id = id;
        variablesMethodReg.addMethod(subprogram_non_return.id.name);
        if(!ctx.signature().isEmpty()) {
            subprogram_non_return.signature = (Signature) this.visitSignature(ctx.signature());
            variablesMethodReg.addMethodTypes(subprogram_non_return.id.name,subprogram_non_return.signature.types);
        }

        return subprogram_non_return;
    }

    @Override
    public Node visitGlobal_program(LanguageeParser.Global_programContext ctx) {
        Global_program global_program = new Global_program();
        global_program.program = (Program) this.visitProgram(ctx.program());
        if (!ctx.subprogram_non_return().isEmpty()) {
            ArrayList<Subprogram_return> prs = new ArrayList<>();
            List<LanguageeParser.Subprogram_returnContext> states = ctx.subprogram_return();
            for (int i = 0; i < states.size(); i++) {
                prs.add((Subprogram_return) this.visitSubprogram_return(states.get(i)));
            }
            global_program.subprogram_returns = prs;
        }

        if (!ctx.subprogram_non_return().isEmpty()) {
            ArrayList<Subprogram_non_return> prsn = new ArrayList<>();
            List<LanguageeParser.Subprogram_non_returnContext> statesn = ctx.subprogram_non_return();
            for (int i = 0; i < statesn.size(); i++) {
                prsn.add((Subprogram_non_return) this.visitSubprogram_non_return(statesn.get(i)));
            }
            global_program.subprogram_non_returns = prsn;
        }
        return global_program;
    }


}