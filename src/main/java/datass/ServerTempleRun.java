package main.java.datass;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.*;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;
import java.util.Set;

public class ServerTempleRun {
    private final int port;
    private final ServerSocketChannel serverSocketChannel;

    public ServerTempleRun(int portNumber) throws IOException {
        port = portNumber;
        serverSocketChannel = ServerSocketChannel.open().bind(new InetSocketAddress(port));
    }

    private void onUpdate() {
        try (SocketChannel sockChannel = serverSocketChannel.accept()) {
            Socket socksonthetv = sockChannel.socket();
            InputStream mmmmstreamingontwitch = socksonthetv.getInputStream();

            Scanner inScan = new Scanner(mmmmstreamingontwitch);
            String requestion = inScan.nextLine();
            RequestData requestData = new RequestData(requestion);

            PrintStream printstream = new PrintStream(socksonthetv.getOutputStream(), true);
            printstream.println(handleRequest(requestData));
        } catch (Exception e) {

        }
    }

    public SendData handleRequest(RequestData reqData) {
        return null;
    }
}