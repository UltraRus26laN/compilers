package onefour;

import java.util.ArrayList;

public class Expression extends Node{
    public Id id;
    public ArrayList<Expression> expressions;
    public Arif arif;
    public Compare_op compare_op;
    public Br_expr br_expr;
    public Integer number;
    public Neg_expr neg_expr;
    public Function function;
    public String string;


    @Override
    public java.lang.String toString() {
        java.lang.String str = "";
        if (number != null) {
            str = number.toString();
        }
        if (br_expr != null) {
            str = br_expr.toString();
        }
        if (function != null) {
            str = function.toString();
        }
        if (neg_expr != null) {
            str = neg_expr.toString();
        }
        if (string != null) {
            str = string.toString();
        }
        if (compare_op != null) {
            if (!expressions.isEmpty() & expressions.size() == 2) {
                java.lang.String sto = "";
                if(compare_op == compare_op.LESS){
                    sto = " < ";
                }
                if(compare_op == compare_op.LESS_OR_EQUALS){
                    sto = " <= ";
                }
                str = expressions.get(0).toString() + sto +expressions.get(1).toString();
            }
        }
        if (arif != null) {
            if (!expressions.isEmpty() & expressions.size() == 2) {
                java.lang.String st = "";
                if(arif == arif.DIVIDE){
                    st = " / ";
                }
                if(arif == arif.MULTIPLY){
                    st = " * ";
                }
                if(arif == arif.PLUS){
                    st = " + ";
                }
                if(arif == arif.MINUS){
                    st = " - ";
                }
                str = expressions.get(0).toString() + st +expressions.get(1).toString();
            }
        }
        if (id != null) {
            str = id.toString();
        }

        return str;
    }
}
