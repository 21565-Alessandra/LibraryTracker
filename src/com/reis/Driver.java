package com.reis;

public class Driver {

    public static void run() {

        Library book1 = new Library(101, "ADICHIE, Chimamanda", "Americanah");
        book1.createTextFile("bookTracker");

        Library book2 = new Library(102, "ADICHIE, Chimamanda", "Half of a Yellow Sun");
        book2.bookDetails();

        Library book3 = new Library(103, "ADICHIE, Chimamanda", "Purple Hibiscus");
        book3.bookDetails();

        Library book4 = new Library(104, "GOMES, Laurentino", "1808");
        book4.bookDetails();

        Library book5 = new Library(105, "GOMES, Laurentino", "1822");
        book5.bookDetails();

        Library book6 = new Library(106, "GOMES, Laurentino", "1889");
        book6.bookDetails();

        Library book7 = new Library(107, "TOLKIEN, J.R.R.", "LOTR COLLECTION - The Fellowship of the Ring");
        book7.bookDetails();

        Library book8 = new Library(108, "TOLKIEN, J.R.R.", "LOTR COLLECTION - The Two Towers");
        book8.bookDetails();

        Library book9 = new Library(109, "TOLKIEN, J.R.R.", "LOTR COLLECTION - The Return of the King");
        book9.bookDetails();

        Library book10 = new Library(110, "TOLKIEN, J.R.R.", "The Hobbit");
        book10.bookDetails();

    }

}
