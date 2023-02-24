package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Api {
    public ArrayList<String> getClass(String name) throws ClassNotFoundException {
        Class<?> c = Class.forName(name);
        Method [] m = c.getDeclaredMethods();
        Field[] declared = c.getDeclaredFields();
        ArrayList<String> response = new ArrayList<String>();
        for (Method me: m ) {
            response.add("METODO ->" + me.getName());
        }
        for(Field f:declared){
            response.add("FIELD -> " + f.getName());
        }
        return response;
    }
    public void claddVI(){
    }
}
