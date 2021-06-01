package onefour;

public class If_then extends Node{
    public Expression expression;
    public Block block;
    public Block_then block_then;

    @Override
    public java.lang.String toString() {
        java.lang.String elsestr = "";
        if(block_then!=null){
            elsestr = block_then.toString();
        }
        return "if("+expression.toString()+")"+block.toString()+ elsestr;
    }
}
