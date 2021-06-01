package onefour;

import java.util.ArrayList;

public class Block_non_return extends Node{
    public ArrayList<Statement> statements;
    @Override
    public java.lang.String toString() {
        java.lang.String statementsstr = "";
        if(!statements.isEmpty()) {
            for (int i = 0; i < statements.size(); i++) {
                statementsstr = statementsstr + statements.get(i).toString() + "\n";
            }
        }
        return "{ "+statementsstr+"return;\n}";
    }
}
