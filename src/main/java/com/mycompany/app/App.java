package com.mycompany.app;

/**
 * Hello world  first AWS!
 */
public class App
{

    private final String message = "AWS!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
