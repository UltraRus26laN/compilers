package onefour;

import java.util.ArrayList;

public class Block_return extends Node{
    public ArrayList<Statement> statements;
    public Id id;

    @Override
    public java.lang.String toString() {
        java.lang.String statementsstr = "";
        if(!statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {
                statementsstr = statementsstr + statements.get(i).toString() + "\n";
            }
        }
        return "{\n"+statementsstr +"return "+id.toString()+";\n}\n";
    }
}
