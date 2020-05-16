package com.github.alekzzzzzz.course.server;

public class Server {

    private String content;

    public String get(){
        return content;
    }

    public String post(String newContent){
        this.content = newContent;
        return newContent;
    }

    public String put(String content){
        return "Method not supported!";
    }

    public void delete(){
        content = null;
        System.out.println("Now content = " + content);
    }

    @Override
    public String toString() {
        return "Server{" +
                "content='" + content + '\'' +
                '}';
    }
}
