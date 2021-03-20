package com.reis;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;

public class LibraryFile extends BookTitles implements File {

    private int clientId;
    public String clientName;
    ArrayList<BookTitles> libraryFile = new ArrayList<BookTitles>();

    public int getClientId() { return clientId; }

    public String getClientName() { return clientName; }

    public void setClientId() { this.clientId = clientId; }

    public void setClientName() { this.clientName = clientName; }

    public void addBookTitles() {
        int bookId, edition;
        String author, title;

        BookTitles bookTitles = new BookTitles();
    }

    //constructor
    public LibraryFile(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
            }

    //method
    public void bookDetails(){

        for(BookTitles bookTitles: libraryFile)
            System.out.println("Book ID: " + bookTitles.getBookId() +
                    ". Book author: " + bookTitles.getAuthor() +
                    ". Book title: " + bookTitles.getTitle() +
                    ". Edition: " + bookTitles.getEdition());

    }



    public void createTextFile(String bookTracker) {

    }
}

//array lista com os livros
