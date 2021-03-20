package com.reis;

public class BookTitles {

    int bookId;
    String author;
    String title;
    int edition;

    public double getBookId() {return bookId;}

    public String getAuthor() {return author;}

    public String getTitle() {return title;}

    public int getEdition() {return edition;}

    public void setBookId(int bookId) { this.bookId = bookId; }

    public void setAuthor(String author) { this.author = author; }

    public void setTitle(String title) { this.title = title; }

    public void setEdition(int bookEdition) { this.edition = bookEdition; }

    public BookTitles(int bookId, String author, String title, int bookEdition) {

    }

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

    public BookTitles() {}

}




