package ru.java.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
            //127.0.0.1 localhost
            //socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8189), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
