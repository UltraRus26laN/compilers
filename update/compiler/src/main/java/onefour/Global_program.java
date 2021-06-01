package onefour;

import java.util.ArrayList;

public class Global_program extends Node{
    public Program program;
    public ArrayList<Subprogram_non_return> subprogram_non_returns;
    public ArrayList<Subprogram_return> subprogram_returns;

    @Override
    public java.lang.String toString() {
        java.lang.String subsre = "";
        java.lang.String subs = "";
        if(subprogram_returns!=null) {
            for (int i = 0; i < subprogram_returns.size(); i++) {
                subsre = subsre + subprogram_returns.get(i).toString() ;
            }
        }
        if(subprogram_non_returns!=null) {
            for (int i = 0; i < subprogram_non_returns.size(); i++) {
                subs = subs + subprogram_non_returns.get(i).toString() ;
            }
        }
        return subsre +subs+program.toString();
    }
}
