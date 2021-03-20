package com.reis;

//Abstract class
public abstract class BooksEdition extends Library {

    public BooksEdition(int bookId, String author, String title) {
        super(bookId, author, title);
    }

    public abstract void editionDetails();

    @Override
    public final void bookDetails() {
        editionDetails();
    }
}
