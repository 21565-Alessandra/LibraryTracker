// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

import java.util.ArrayList;


public class BookTitles extends Genre {

    //atributes
    int bookId;
    String author;
    String title;
    int edition;
    ArrayList<BookTitles> bookList = new ArrayList<BookTitles>();

    //constructor
    public BookTitles(int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience) {
        super(genre, subGenre, targetAudience);
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.edition = edition;
    }

    //Overriding the super class method from genre abstract class
    @Override
    public String toString() {

        return super.toString();

    }

    public double getBookId() {return bookId;}

    public String getAuthor() {return author;}

    public String getTitle() {return title;}

    public int getEdition() {return edition;}

    public void setBookId(int bookId) { this.bookId = bookId; }

    public void setAuthor(String author) { this.author = author; }

    public void setTitle(String title) { this.title = title; }

    public void setEdition(int bookEdition) { this.edition = bookEdition; }

    //method to use the Array List
    public void bookDetails(){
        for(BookTitles bookTitles: bookList)

        System.out.println(" ");
        System.out.println("Book ID: " + this.getBookId());
        System.out.println("Book author: " + this.getAuthor());
        System.out.println("Book title: " + this.getTitle());
        System.out.println("Edition: " + this.getEdition());
        System.out.println("============================");
    }

    //protected function
    @Override
    protected void genreClassification() {

        System.out.println("Genre Classification Details: " + super.toString());

    }
}




