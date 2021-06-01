package onefour;

public class Function extends Node{
    public Id id;
    public Signature_method signature_method;

    @Override
    public java.lang.String toString() {
        java.lang.String str = id.toString();
        if(signature_method!=null){
            str = str+ signature_method.toString();
        }
        else{
            str = str + "()";
        }
        return str+";";
    }
}
