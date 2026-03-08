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

        System.out.println("the serving has started");

        while (true) {
            //Wait until something says "hey do you want to exchange government secrets or like epstein messages or smth"
            Socket socket = serverSocket.accept();

            //where is your input
            InputStream inputStream = socket.getInputStream();

            //actually me do know
            Scanner inScan = new Scanner(inputStream);
            String requestion = inScan.nextLine();
            String[] requestionSplits = requestion.split(" ");
            String shamingString = requestionSplits[1];

            //basically print to the client via FACTS yes yum facts i eat truth for breaky
            PrintStream printstream = new PrintStream(socket.getOutputStream(), true);

            //Payload and itsjfaiweuf lengt:>
            String payload =
                    "<p>HA IMAGINE REQUESTING FOR " + shamingString + " COULD NOT BE ME IMAGINE</p> " +
                    "<p>HAHAHAHHAHAHAHAHA</p>";
            int payloadLength = payload.length();

            //send th actual thingy
            printstream.println("HTTP/1.1 200 OK"); //header to confirm that this is ok everything is fine and we are not rapidly approaching our imminent deaths
            printstream.println("Content-Type: text/html"); //Type of content :P
            printstream.println("Content-Length: " + payloadLength); //Length of the thingy snake brrrrrrrrrrrr:0
            printstream.println(); // newline
            printstream.println(payload); //actual payload :0

            //keep track of how many people youve served a knuckle or chuckle sandwich
            //System.out.println("served");
        }
    }
}
