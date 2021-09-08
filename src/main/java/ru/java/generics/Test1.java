package ru.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        /* List list = new ArrayList();*/
        List<String> list = new ArrayList<String>();
        list.add("Lana");
        list.add("Sergeevna");
        list.add("ok");
        for (String s : list) {
            System.out.println(s + "dlina" + s.length());
        }
        /*for(Object o : list) {
            System.out.println(o + "dlina" + ((String)o).length());
        }*/

    }
}

class Car {

}