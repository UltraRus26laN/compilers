package onefour;

import java.util.ArrayList;

public class Signature extends Node{
    public ArrayList<Type> types;
    public ArrayList<Id> ids;

    @Override
    public java.lang.String toString() {
        java.lang.String str = "(";
        if (!types.isEmpty()) {
            if (!ids.isEmpty()) {
                java.lang.String st = "";
                Type type = types.get(0);
                if(type==type.INT){
                    st = "int ";
                }
                if(type ==type.FLOAT){
                    st = "float ";
                }
                if(type==type.VAR){
                    st = "float ";
                }
                str = str+ st;
                str = str + ids.get(0).toString();

                for (int i = 1; i < ids.size()&& i<types.size(); i++) {
                    java.lang.String stt = "";
                    Type typ = types.get(0);
                    if(typ==typ.INT){
                        stt = "int ";
                    }
                    if(typ ==typ.FLOAT){
                        stt = "float ";
                    }
                    if(typ==typ.VAR){
                        stt = "float ";
                    }
                    str = str + "," +stt+ ids.get(i).toString();
                }
            }
        }
        str = str + ")";
        return str;
    }
}
