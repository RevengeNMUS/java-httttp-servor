package main.java.examples;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String ip = "192.168.0.200"; // obtain using server's ipconfig (windows), ifconfig (mac, linux)
        int port = 1234; // obtain the server's port

        try (Socket socket = new Socket(ip, port)) {

            InputStream socketIn = socket.getInputStream();

            Scanner systemScanner = new Scanner(System.in);
            Scanner socketScanner = new Scanner(socketIn);

            PrintStream socketOut = new PrintStream(socket.getOutputStream(), true);

            System.out.println("Please enter your username:");

            String username = systemScanner.nextLine();
            String prefix = "<" + username + ">: ";

            System.out.println("\nWelcome to the chatroom! Type a message and press enter to send it.");

            while (true) {
                if (System.in.available() > 0) {
                    String message = systemScanner.nextLine();
                    System.out.println(prefix + message); // print to own console
                    socketOut.println(prefix + message); // print to server socket
                }

                if (socketIn.available() > 0) {
                    String message = socketScanner.nextLine();
                    System.out.println(message); // print to own console
                }
            }
        }
    }
}

