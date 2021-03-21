// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

public class Driver {

    //Driver Class will take the input with the details of the books and the library member.
    public static void run() {

        BookTitles book1 = new BookTitles(101, "ADICHIE, Chimamanda.", "Half of a Yellow Sun", 2019, "Novel || ", " Historical Fiction || ", "Adult");
        book1.bookDetails();
        System.out.println(book1);
        System.out.println("============================");
        Member member1 = new Member(1508, "John Smith");
        member1.memberDetails();
        System.out.println(member1);
        System.out.println("============================");




        /*LibraryFile book2 = new LibraryFile(102, "ADICHIE, Chimamanda", "Americanah", 2019, "Novel || ", " Romance || ", "Adult");
        book2.bookDetails();

        LibraryFile book3 = new LibraryFile(103, "ADICHIE, Chimamanda", "Purple Hibiscus", 2018, "Novel || ", " Fiction || ", "Adult");
        book3.bookDetails();

        LibraryFile book4 = new LibraryFile(104, "GOMES, Laurentino", "1808", 2010, "History || ", " History || ", " NA");
        book4.bookDetails();

        LibraryFile book5 = new LibraryFile(105, "GOMES, Laurentino", "1822", 2012, "History || ", " History || ", " NA");
        book5.bookDetails();

        LibraryFile book6 = new LibraryFile(106, "GOMES, Laurentino", "1889", 2015, "History || ", " History || ", " NA ");
        book6.bookDetails();

        LibraryFile book7 = new LibraryFile(107, "TOLKIEN, J.R.R.", "LOTR COLLECTION - The Fellowship of the Ring", 1998);
        book7.bookDetails();

        LibraryFile book8 = new LibraryFile(108, "TOLKIEN, J.R.R.", "LOTR COLLECTION - The Two Towers", 1998, "Fantasy || ", " Fiction || ", " NA ");
        book8.bookDetails();

        LibraryFile book9 = new LibraryFile(109, "TOLKIEN, J.R.R.", "LOTR COLLECTION - The Return of the King", 1998, "Fantasy || ", " Fiction || ", " NA ");
        book9.bookDetails();

        LibraryFile book10 = new LibraryFile(110, "TOLKIEN, J.R.R.", "The Hobbit", 2000, "Fantasy || ", " Fiction || ", " NA ");
        book10.bookDetails();

         */

    }

}
