package org.example;

public class Book {
    private String title;
    private String author;

    public void getInfo() {
        System.out.println("Title: " + this.title + " Author: " + this.author);
    }

    public  Book(String title, String author) {
        this.title = title;
        this. author = author;
    }
}
