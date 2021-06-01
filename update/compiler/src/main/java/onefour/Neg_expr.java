package onefour;

public class Neg_expr extends Node{
    public Expression expression;
    @Override
    public java.lang.String toString() {
        return "!"+expression.toString();
    }
}
