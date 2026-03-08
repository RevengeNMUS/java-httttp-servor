package main.java;

import main.java.datass.RequestData;
import main.java.datass.SendData;

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
            RequestData requestData = new RequestData(requestion);

            //basically print to the client via FACTS yes yum facts i eat truth for breaky
            PrintStream printstream = new PrintStream(socket.getOutputStream(), true);
            SendData thedatathatyouwillsendviacarrierpigeontogototheplace;

            File afileofdoomanddestructionandmaybechad = new File("src/main/resources/" + requestData.getHeader() + ".html");

            if (afileofdoomanddestructionandmaybechad.isFile()) {
                thedatathatyouwillsendviacarrierpigeontogototheplace = new SendData(
                        new File("src/main/resources/" + requestData.getHeader() + ".html")
                );
            } else {
                String payload =
                        "<p>HA IMAGINE REQUESTING FOR " + requestData.getHeader() + " COULD NOT BE ME IMAGINE</p> " +
                        "<p>HAHAHAHHAHAHAHAHA</p>";
                thedatathatyouwillsendviacarrierpigeontogototheplace = new SendData(payload);
            }

            printstream.println(thedatathatyouwillsendviacarrierpigeontogototheplace.getFormattedPayload()); //ive oversiimplified. i am not sphere.
            System.out.println(thedatathatyouwillsendviacarrierpigeontogototheplace.getFormattedPayload());

            //keep track of how many people youve served a knuckle or chuckle sandwich
            System.out.println("served");
        }
    }
}
