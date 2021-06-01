import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import onefour.Node;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Main {



    public static void main(String[] args){
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("resources/test_2.txt"));
            LanguageeLexer lexer = new LanguageeLexer(input);
            LanguageeParserV1 parser = new LanguageeParserV1(new CommonTokenStream(lexer));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ParseTree tree = parser.global_program();
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog((Component)null, "Lexer error: " + byteArrayOutputStream.toString());
                return;
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            VariablesMethodReg variablesMethodReg = new VariablesMethodReg();
            LanguageeVisitor<Node> listVisitor = new LanguageeVisitorImpl(parser, "Result", variablesMethodReg);
            Node output = listVisitor.visit(tree);
            System.out.println(gson.toJson(output));
            System.out.println(gson.toJson(variablesMethodReg));
            variablesMethodReg.checkAll();

        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

}
