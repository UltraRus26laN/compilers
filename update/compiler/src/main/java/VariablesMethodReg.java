import onefour.Id;
import onefour.Type;

import java.util.ArrayList;


public class VariablesMethodReg {
    private ArrayList<Method> methods;
    private ArrayList<Variable> variables;


    public void checkAll() {
        //System.out.println("METHODS");
        if (methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                if (methods.get(i).count == 1) {
                    System.out.println("Unused method " + methods.get(i).name);
                }
            }
        }
        //System.out.println("VARIABLES");
        if (variables != null) {
            for (int i = 0; i < variables.size(); i++) {
                if (variables.get(i).count == 1 && variables.get(i).value) {
                    System.out.println("Unused variable " + variables.get(i).name);
                }

                if (!variables.get(i).value) {
                    System.out.println("Not initialize variable " + variables.get(i).name);
                }

            }
        }

        if (variables != null && methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                for (int j = 0; j < variables.size(); j++) {
                    if (variables.get(j).name.equals(methods.get(i).name)) {
                        if (!variables.get(j).value) {
                            System.out.println("Not correct use method: " + methods.get(i).name);
                        } else {
                            System.out.println("Not correct use variable: " + variables.get(j).name);
                        }
                    }
                }
            }
        }

        if(methods!= null){
            for(int i=0; i<methods.size(); i++){
                checkMethodTypes(methods.get(i).name);
            }
        }
    }

    public void addMethod(String name) {
        boolean flag = false;
        int index = 0;
        if (methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                if (methods.get(i).name.equals(name)) {
                    flag = true;
                    index = i;
                }
            }
            if (!flag) {
                Method method = new Method();
                method.name = name;
                method.count++;
                methods.add(method);
            } else {
                methods.get(index).count++;
            }
        } else {
            methods = new ArrayList<>();
            Method method = new Method();
            method.name = name;
            method.count++;
            methods.add(method);
        }
    }

    public void addVariable(String name, boolean value) {
        boolean flag = false;
        int index = 0;
        if (variables != null) {
            for (int i = 0; i < variables.size(); i++) {
                if (variables.get(i).name.equals(name)) {
                    flag = true;
                    index = i;
                }
            }
            if (!flag) {
                Variable variable = new Variable();
                variable.name = name;
                if (value) {
                    variable.value = value;
                }
                variable.count++;
                variables.add(variable);
            } else {
                if (value) {
                    variables.get(index).value = value;
                }

                variables.get(index).count++;
            }
        } else {
            variables = new ArrayList<>();
            Variable variable = new Variable();
            variable.name = name;
            if (value) {
                variable.value = value;
            }
            variable.count++;
            variables.add(variable);
        }
    }

    public void addMethodTypes(String name, ArrayList<Type> types) {
        if (methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                if (methods.get(i).name.equals(name)) {
                    methods.get(i).types = types;
                }
            }
        }
    }

    public void addMethodCallIDs(String name,ArrayList<Id> ids){
        if (methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                if (methods.get(i).name.equals(name)) {
                    if(methods.get(i).callIDs==null){
                        ArrayList<ArrayList<Id>> callID = new ArrayList<>();
                        callID.add(ids);
                        methods.get(i).callIDs = callID;
                    }
                    else{
                        methods.get(i).callIDs.add(ids);
                    }
                }
            }
        }
    }

    public void checkMethodTypes(String name) {
        if (methods != null) {
            for (int i = 0; i < methods.size(); i++) {
                if(methods.get(i).callIDs!=null) {
                    for (int t = 0; t < methods.get(i).callIDs.size(); t++) {
                        ArrayList ids = methods.get(i).callIDs.get(t);
                        if (methods.get(i).name.equals(name)) {

                            for (int j = 0; j < variables.size(); j++) {
                                for (int k = 0; k < ids.size(); k++) {

                                    if (variables.get(j).type != null) {
                                        if (!methods.get(i).types.get(k).equals(variables.get(j).type)) {
                                            System.out.println("Incorrect type of input variable in method: " + methods.get(i).name);
                                        }
                                    } else {
                                        System.out.println("Variable " + variables.get(j).name + " don't have type");

                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void addVariableType(String name, Type type){
        if(variables!=null){
            for(int i=0; i<variables.size(); i++){
                if(variables.get(i).name.equals(name)){
                    variables.get(i).type=type;
                }
            }
        }

    }
}
