package com.reis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

public class Library implements LibraryFile {

    private int clientId;
    public String clientName;
    ArrayList<BookTitles> bookList = new ArrayList<BookTitles>();
    private static Formatter print;
    private static String file = "libraryTracker.txt";

    public int getClientId() { return clientId; }

    public String getClientName() { return clientName; }

    public void setClientId() { this.clientId = clientId; }

    public void setClientName() { this.clientName = clientName; }

    public void addBookTitles(int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience) {

        BookTitles bookTitles = new BookTitles(bookId, author, title, edition, genre, subGenre, targetAudience);
        bookList.add(bookTitles);
    }

    //constructor
    public Library(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
            }

    //method
    public void bookDetails(){

        for(BookTitles bookTitles: bookList)
            System.out.println("Book ID: " + bookTitles.getBookId() +
                    ". Book author: " + bookTitles.getAuthor() +
                    ". Book title: " + bookTitles.getTitle() +
                    ". Edition: " + bookTitles.getEdition());

    }



    public void createTextFile(String fileId, int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience) {

        file = fileId;
        openFile();
        addBookTitles(bookId, author, title, edition, genre, subGenre, targetAudience);
        closeFile();

    }

    @Override
    public void readFile(String file) {

/////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    @Override
    public void openFile() {

        try {
            print = new Formatter(file);
        } catch (SecurityException securityException) {
            System.out.println("Restricted Access");
            System.exit(1);

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("THE FILE COULD NOT BE OPEN");
            System.exit(1);
        }


    }

    @Override
    public void closeFile() {

        if (print != null) {
            print.close();
        }

    }
}




