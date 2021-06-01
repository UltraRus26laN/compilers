package onefour;

import java.util.ArrayList;

public class Expression extends Node{
    public Id id;
    public ArrayList<Expression> expressions;
    public Arif arif;
    public Compare_op compare_op;
    public Br_expr br_expr;
    public int number;
    public Neg_expr neg_expr;
    public Function function;
    public String string;

}
