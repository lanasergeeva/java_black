package ru.java;

public class Years {
    public static int leapYearCount(int year) {
      /*  int rsl = 0;
        for (int i = 4; i <= year; i++) {
            if (!(i % 100 == 0) && (i % 4 == 0 || i % 400 == 0)) {
                rsl++;
            }
        }
        return rsl;*/
       /*int years = 1;
        int count = 0;
        while (years <= year) {
            if (!(years % 100 == 0) && (years % 4 == 0 || years % 400 == 0)) {
                count++;
            }
            years++;
        }
        return count;*/
        return year / 4 - year / 100 + year / 400; //(year/4) - (year/100);
    }

    public static boolean isPalindrome(String text) {
        String[] array = text.split("");
        text = text.replaceAll("[^A-Za-z1-9]+", "");
        java.lang.StringBuilder sbtext = new java.lang.StringBuilder(text);
        String rtext = sbtext.reverse().toString();
        return text.equalsIgnoreCase(rtext);
    }

    public static void main(String[] args) {
        System.out.println(leapYearCount(1896));
        System.out.println(new String("A" + 12));
        System.out.println(new String('A' + "12"));
        System.out.println(new String("A" + ('\t' + '\u0003')));
        System.out.println(new String('A' + '1' + "2"));
        int[] array = new int[0];
        System.out.println(array.length);
    }
}
