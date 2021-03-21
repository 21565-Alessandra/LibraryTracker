// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

//interface class with methods from LibraryFileManager Class
public interface LibraryFile {

    void addBookTitles(int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience);

    void createTextFile(String fileId, int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience);

    void OpenFileToWrite(String fileToOpen);

    void OpenFileToRead();

    void openFile();

    void closeFile();

}




