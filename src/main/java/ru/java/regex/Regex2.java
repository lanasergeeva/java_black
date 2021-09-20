package ru.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        //String s1 = "dabcdababcdababda";
        //Pattern pattern1 =Pattern.compile("d(ab){2,}");

        //String s1 = "dabcdababcdababda";
        //Pattern pattern1 =Pattern.compile("d(ab)*");

        String s1 = "dabcda babcdababda";
        Pattern pattern1 = Pattern.compile("[abcd][bc]");

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position " + matcher.start() + " " + matcher.group());
        }
    }
}
