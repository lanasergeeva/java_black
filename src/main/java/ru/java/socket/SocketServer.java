package ru.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8189);
             Socket socket = serverSocket.accept()) {
            //так не всегда удобно, поэтому часто облачают в сканер
            /*InputStream in = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();*/
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            //writer.println("hello");
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                writer.println("you've send " + str);
                System.out.println(str);
                if (str.equals("exit")) {
                    break;
                }
            }
        }
    }
}
