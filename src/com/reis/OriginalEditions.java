package com.reis;

//Abstract class
public abstract class OriginalEditions extends BookTitles {

    public OriginalEditions(int bookId, String author, String title, int edition) {
        super(bookId, author, title, edition);
    }

    public abstract void editionDetails();

    @Override
    public final void bookDetails() {
        editionDetails();
    }
}
