package com.reis;

public interface LibraryFile {

    void addBookTitles(int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience);

    void createTextFile(String fileId, int bookId, String author, String title, int edition, String genre, String subGenre, String targetAudience);

    void readFile(String fileId);

    void openFile();

    void closeFile();

}




