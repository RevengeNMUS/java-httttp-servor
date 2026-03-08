package main.java.datass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Is like da html text thing yesyes yummy bagguette
 */
public class SendData {
    String payload;

    public SendData(String dastringgg) {
        payload = dastringgg;
    }

    public SendData(File mmmmfilesssssyummm) {
        try {
            Scanner scammer = new Scanner(mmmmfilesssssyummm);
            payload = "";
            while (scammer.hasNext()) {
                payload += scammer.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            payload = "File IS NOT HERE you CEILING FAN";
        }
    }

    public SendData() {
        payload = "uhhhh we dont know cope and have a burger or smth :P";
    }

    public String getFormattedPayload() {

        //send th actual thingy
        return "HTTP/1.1 200 OK\n" + //header to confirm that this is ok everything is fine and we are not rapidly approaching our imminent deaths
                "Content-Type: text/html\n" + //Type of content :P
                "Content-Length: " + payload.length() + "\n" +  //Length of the thingy in BITES and CHOMPS and YUMMMMMS snake brrrrrrrrrrrr:0
                "\n" +
                payload;
    }
}
