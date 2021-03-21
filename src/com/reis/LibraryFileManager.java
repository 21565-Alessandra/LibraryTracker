// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;

public class LibraryFileManager implements LibraryFile {

    ArrayList<BookTitles> bookList = new ArrayList<BookTitles>(); // to create the list for the book titles
    private static Formatter output;
    private static String File = "libraryTracker.txt";

    //method to use the Array List
    public void addBookTitles(int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience) {

        BookTitles bookTitles = new BookTitles(bookId, author, title, edition, genre, subGenre, targetAudience);
        bookList.add(bookTitles);
    }

    //to create text file
    public void createTextFile(String fileId, int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience) {

        File = fileId;
        openFile();
        addBookTitles(bookId, author, title, edition, genre, subGenre, targetAudience);
        closeFile();

    }

    //to write to a file
    @Override
    public void OpenFileToWrite(String fileToOpen) {

        try {
            FileWriter fileWriter = new FileWriter(fileToOpen, true);
            output = new Formatter(fileWriter);
        } catch (SecurityException securityException) {
            System.out.println("Permission denied");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error opening file.");
            System.exit(1);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    //to open the file created
    @Override
    public void openFile() {

        try {
            output = new Formatter(File);
        } catch (SecurityException securityException) {
            System.out.println("Restricted Access");
            System.exit(1);

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("THE FILE COULD NOT BE OPEN");
            System.exit(1);
        }


    }

    //method to allow the file to be closed
    @Override
    public void closeFile() {

        if (output != null) {
            output.close();
        }

    }

    //and method to allow the file to be read
    public void OpenFileToRead() {

        output = new Formatter();

    }
}







