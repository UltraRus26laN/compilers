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
import java.io.FileWriter;

public class Main {



    public static void main(String[] args){
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("resources/test_3.txt"));
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
            Node output = listVisitor.visit(tree);//создаем синтаксическое дерево
            System.out.println(gson.toJson(output));
            System.out.println(gson.toJson(variablesMethodReg));
            variablesMethodReg.checkAll();

            FileWriter writer = new FileWriter("src/main/java/Try.java", false);//путь записи файла(перезаписываем)

            String text = "public class Try {\n"+output.toString()+"\n}";//через него записываем в файл
            writer.write(text);
            writer.flush();
            Process pro = Runtime.getRuntime().exec("javac Try.java");//запускаем наш файл
            pro.waitFor();
            System.out.println(pro.exitValue());

        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

}
