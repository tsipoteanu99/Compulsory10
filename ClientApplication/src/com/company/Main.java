package com.company;

import com.company.client.GameClient;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GameClient client = new GameClient();
        while(true)
        {
            String request = client.readFromKeyboard();
            if (request.equalsIgnoreCase("exit")) {
                break;
            }else{
                client.sendRequestToServer(request);
                client.receiveResponseFromServer();
            }
        }
    }
}

