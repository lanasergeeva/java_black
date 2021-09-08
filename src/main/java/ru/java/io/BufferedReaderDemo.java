package ru.java.io;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is a &copy; copyright symbol "
                + "but this is &copy not.\n";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        int c;
        boolean marked = false;
        CharArrayReader in = new CharArrayReader(buf);
        try (BufferedReader bis = new BufferedReader(in)) {
            while ((c = bis.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            bis.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                            break;
                        }
                    case ' ':
                        if (marked) {
                            marked = false;
                            bis.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                            break;
                        }
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                            break;
                        }
                }
            }
        }
    }
}

