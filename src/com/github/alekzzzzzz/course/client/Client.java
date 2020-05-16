package com.github.alekzzzzzz.course.client;

import com.github.alekzzzzzz.course.server.Server;

import java.util.Scanner;

public class Client {

    private String content;
    private Server server;


    public Client(){ }

    public Client(Server server){
        System.out.println(this.server = server);

    }

    public void setServer(Server server){
        this.server = server;
    }

    public void printContent(){
        try {
            String contentFromServer = server.get();
            System.out.println("Content = " + contentFromServer);
        }catch (Exception a){
            System.out.println("Мы предотвратили ошибку в методе чему равен контент на сервере");
        }



    }

    public void saveNewContentOnServer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new content");
        String newContent = scanner.next();
        try {
            String savedContent = server.post(newContent);
            System.out.println("New content: " + savedContent + " - has been saved on server!");
        }catch (Exception g){
            System.out.println("Мы предотвратили ошибку в методе сохранения нового контента на сервере");
        }

    }

    public void cleanServerContent(){
       try {
           server.delete();
           System.out.println("Content has been deleted from server!");
       }catch (Exception a){
           System.out.println("Мы предотвратили ошибку в методе очистки контента из сервера");
       }

    }
}
