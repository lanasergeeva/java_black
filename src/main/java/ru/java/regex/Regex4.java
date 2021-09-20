package ru.java.regex;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Privet             moy                drug! Kak dela c     java    ?";
        System.out.println(s1);
        //s1 = s1.replaceAll(" {2,}", " ");
        //System.out.println(s1);
        s1 = s1.replaceAll("\\bd\\w+", "4444");
        System.out.println(s1);
    }
}
