package onefour;

public class Statement extends Node{
    public Assign_var assign_var;
    public While_cicle while_cicle;
    public If_then if_then;
    public Function function;
    public Print_expr print_expr;


    @Override
    public java.lang.String toString() {
        java.lang.String str = "";
        if(function!= null){
            str = str+function.toString();
        }
        if(while_cicle!= null){
            str = str+while_cicle.toString();
        }
        if(assign_var!= null){
            str = str+assign_var.toString();
        }
        if(if_then!= null){
            str = str+if_then.toString();
        }
        if(print_expr!= null){
            str = str+print_expr.toString();
        }
        return str;
    }
}
