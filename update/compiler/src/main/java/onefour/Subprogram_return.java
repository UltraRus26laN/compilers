package onefour;

public class Subprogram_return extends Node{
    public Type type;
    public Id id;
    public Signature signature;
    public Block_return block_return;

    @Override
    public java.lang.String toString() {
        java.lang.String st = "";
        if(type==type.INT){
            st = "int ";
        }
        if(type ==type.FLOAT){
            st = "float ";
        }
        if(type==type.VAR){
            st = "float ";
        }
        java.lang.String str = "static "+st + id.toString();
        if(signature!= null)
        {
            str = str+ signature.toString();
        }
        else{
            str = str + "()";
        }
        str = str+ block_return.toString();
        return str;
    }
}
