package com.github.alekzzzzzz.course.server;

import com.github.alekzzzzzz.course.client.Client;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client();
//        Client client = new Client(server);
//       client.setServer(server);
        client.saveNewContentOnServer();
        client.printContent();
        client.cleanServerContent();



    }
}
