package com.reis;

import java.util.ArrayList;

public class Library {

    //books atributes
    private int bookId;
    public String author;
    public String title;
    ArrayList<Titles> libraryTitles = new ArrayList<Titles>();

    public void addLibraryTitles(Titles ann) {
        libraryTitles.add(ann); //?
    }

    /*public double getBookId() {return bookId;}

    public String getAuthor() {return author;}

    public String getTitle() {return title;}

    public void setBookId(double bookId) { this.bookId = bookId; }

    public void setAuthor(double author) { this.bookId = author; }

    public void setTitle(double title) { this.bookId = title; }*/

    //books constructor
    public Library(int bookId, String author, String title) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
            }

    //method
    public void bookDetails(){
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book author: " + this.author);
        System.out.println("Book title: " + this.title);


    }

    public void createTextFile(String bookTracker) {

    }
}

//array lista com os livros
