package onefour;

public class Br_expr extends Node{
    public Expression expression;
    @Override
    public java.lang.String toString() {
        return "("+expression.toString()+")";
    }
}
