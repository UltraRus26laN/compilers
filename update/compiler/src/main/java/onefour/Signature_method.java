package onefour;

import java.util.ArrayList;

public class Signature_method extends Node{
    public ArrayList<Id> ids;

    @Override
    public java.lang.String toString() {
        java.lang.String str = "(";
        if(!ids.isEmpty()){
            str = str+ids.get(0).toString();
            for(int i=1; i<ids.size(); i++){
                str = str+","+ids.get(i).toString();
            }
        }
        str = str+")";
        return str;
    }
}
