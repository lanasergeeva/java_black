package ru.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String s1 = "12345497844844431221698;"
                + "15894789123564890218159;"
                + "74896541234566870822369";
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s1);
        //String s2 = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        //System.out.println(s2);
        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }
    }
}
