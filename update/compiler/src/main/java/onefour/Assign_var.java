package onefour;

public class Assign_var extends Node{
    public Type type1;
    public Type type2;
    public Id id;
    public Expression expression;

    @Override
    public java.lang.String toString() {
        java.lang.String str = "";

        if (type1 != null) {
            java.lang.String st = "";
            if (type1== type1.INT) {
                st = "int ";
            }
            if (type1 == type1.FLOAT) {
                st = "float ";
            }
            if (type1 == type1.VAR) {
                st = "float ";
            }
            str = str + st;
        }
        str = str  +id.toString() + " = ";
        if (type2 != null) {
            java.lang.String st = "";
            if (type2== type2.INT) {
                st = "int";
            }
            if (type2 == type2.FLOAT) {
                st = "float ";
            }
            if (type2 == type2.VAR) {
                st = "float ";
            }
            str = str + "(" + st + ")";
        }
        str = str + expression.toString() +";";
        return str;
    }
}
