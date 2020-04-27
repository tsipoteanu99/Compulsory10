package com.company.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GameClient {
    private static String SERVER_ADDRESS = "127.0.0.1";
    private static int PORT = 8100;
    Socket socket = null;

    public String readFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void sendRequestToServer(String request) throws IOException {
        OutputStreamWriter output = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter out = new BufferedWriter(output);
        out.write(request + "\n");
        out.flush();
    }
    public void receiveResponseFromServer() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String rsp = in.readLine();
        if (rsp != null) {
            System.out.println(rsp);
        }
    }
}

