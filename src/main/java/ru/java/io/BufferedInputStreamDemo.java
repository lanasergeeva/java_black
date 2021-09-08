package ru.java.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

//авторские права указываются с & по ;
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s = "This is a &copy; copyright symbol "
                + "but this is &copy not.\n";
        byte[] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;
        try (BufferedInputStream bis = new BufferedInputStream(in)) {
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
