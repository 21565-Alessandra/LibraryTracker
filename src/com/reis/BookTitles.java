package com.reis;

public class BookTitles extends Genre {

    int bookId;
    String author;
    String title;
    int edition;


    public BookTitles(int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience) {
        super(genre, subGenre, targetAudience);
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.edition = edition;
    }

    @Override
    public String toString() {

        return "Book ID: " + this.bookId + " Author: " + this.author + " Title: " + " Edition: " + this.edition + super.toString();

    }

    public double getBookId() {return bookId;}

    public String getAuthor() {return author;}

    public String getTitle() {return title;}

    public int getEdition() {return edition;}

    public void setBookId(int bookId) { this.bookId = bookId; }

    public void setAuthor(String author) { this.author = author; }

    public void setTitle(String title) { this.title = title; }

    public void setEdition(int bookEdition) { this.edition = bookEdition; }

    public void bookDetails(){
        System.out.println("Book ID: " + this.getBookId());
        System.out.println("Book author: " + this.author);
        System.out.println("Book title: " + this.title);
        System.out.println("Edition: " + this.edition);
    }

    /*
    public void bookDetails(){

        for(BookTitles bookTitles: libraryFile)
            System.out.println("Book ID: " + bookTitles.getBookId() +
                    ". Book author: " + bookTitles.getAuthor() +
                    ". Book title: " + bookTitles.getTitle() +
                    ". Edition: " + bookTitles.getEdition());

    }
     */

    @Override
    public void genreClassification() {

        System.out.println("Genre Classification Details: " + super.toString());

    }
}




