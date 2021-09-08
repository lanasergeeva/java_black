package ru.java.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);//когда работаем с консоли
        /*System.out.println("Vvedite chislo");
        int i = scanner.nextInt();
        System.out.println("Vvedennoe chislo " + i);*/

        /*System.out.println("Napishite 2 chisla");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Chastnoe = " + x / y);
        System.out.println("ostatok = " + x % y);*/

        /*System.out.println("Napishite paru slov");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Vi napisali frazu" + s1 + " " + s2);*/

        Scanner scanner = new Scanner("Privet moy drug \n Kak dela?" + "\nChto horoshego?");
        /*while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }*/
        System.out.println(scanner.next().charAt(2));


    }
}
