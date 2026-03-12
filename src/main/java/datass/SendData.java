package main.java.datass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Is like da html text thing yesyes yummy bagguette
 */
public class SendData {
    private final String payload;
    private final Status stratusphere;

    public SendData(String dastringgg, Status status) {
        payload = dastringgg;
        stratusphere = status;
    }

    public SendData(File mmmmfilesssssyummm, Status status) {
        String payloadTemporarillyOutOfUse = "";

        try {
            Scanner scammer = new Scanner(mmmmfilesssssyummm);
            payloadTemporarillyOutOfUse = "";
            while (scammer.hasNext()) {
                payloadTemporarillyOutOfUse += scammer.nextLine() + "\n";
            }


        } catch (FileNotFoundException e) {
            payloadTemporarillyOutOfUse = "File IS NOT HERE you CEILING FAN";
        }

        stratusphere = status;
        payload = payloadTemporarillyOutOfUse;
    }

    public SendData() {
        payload = "uhhhh we dont know cope and have a burger or smth :P";
        stratusphere = new Status(505, "NOT OK IDK COPE");

    }

    public String getFormattedPayload() {

        //send th actual thingy
        return "HTTP/1.1 " + stratusphere.toString() + "\n" + //header to confirm that this is ok everything is fine and we are not rapidly approaching our imminent deaths
                "Content-Type: text/html\n" + //Type of content :P
                "Content-Length: " + payload.length() + "\n" +  //Length of the thingy in BITES and CHOMPS and YUMMMMMS snake brrrrrrrrrrrr:0
                "\n" +
                payload;
    }
}
