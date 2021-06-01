package onefour;

public class Subprogram_non_return extends Node{
    public Id id;
    public Signature signature;
    public Block_non_return block_non_return;

    @Override
    public java.lang.String toString() {
        java.lang.String str = "static void "+ id.toString();
        if(signature!= null)
        {
            str = str+ signature.toString();
        }
        else{
            str = str + "()";
        }
        str = str+ block_non_return.toString();
        return str;
    }
}
