package ru.practice.p1;

public class Book {
    private String name;
    private String author;
    private int pages;

    public Book (String n, String a, int p){
        name = n;
        author = a;
        pages = p;
    }
    public Book (String n, String a){
        name = n;
        author = a;
        pages = 0;
    }
    public Book (String n){
        name = n;
        author = "";
        pages = 0;
    }
    public Book (){
        name = "";
        author = "";
        pages = 0;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setAuthor (String author){
        this.author = author;
    }
    public void setPages (int pages){
        this.pages = pages;
    }
    public void getBookInfo (){
        System.out.println("Book: '" + name + "' Author is: " + author + " which has a " + pages + " pages");
    }
}
