package onefour;

public class While_cicle extends Node{
    public Expression expression;
    public Block block;

    @Override
    public java.lang.String toString() {
        return "while ("+expression.toString()+")\n"+block.toString()+"\n";
    }
}
