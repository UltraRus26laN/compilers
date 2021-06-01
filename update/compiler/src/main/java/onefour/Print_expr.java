package onefour;

public class Print_expr extends Node{
    public Expression expression;
    @Override
    public java.lang.String toString() {
        return "System.out.println("+expression.toString()+");";
    }
}
