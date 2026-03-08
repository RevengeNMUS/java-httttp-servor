package main.java;
import java.io.InputStream;
import java.net.*;
import java.io.*;

import java.net.ServerSocket;
import java.util.Scanner;

public class mmmmmmmSerber {
    public static void main(String[] args) throws Exception {

        int port = 1234;

        ServerSocket serverSocket =  new ServerSocket(port);
        Scanner mmmmmbacon = new Scanner(System.in);

        while (true) {
            //Wait until something says "hey do you want to exchange government secrets or like epstein messages or smth"
            Socket socket = serverSocket.accept();


            InputStream inputStream = socket.getInputStream();

            Scanner inScan = new Scanner(inputStream);

            //basically print to the client via FACTS yes yum facts i eat truth for breaky
            PrintStream printstream = new PrintStream(socket.getOutputStream(), true);

            //

            printstream.println("HTTP/1.1 200 OK");
            printstream.println("Content-Type: text/html");
            printstream.println("Content-Length: 11");
            printstream.println(); // newline
            printstream.println("hello world");

            System.out.println("served");
        }
    }
}
