// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

//Abstract class with the genre details of the books
public abstract class Genre {

    private String genre;
    private String subGenre;
    private String targetAudience;

    public Genre (String genre, String subGenre, String targetAudience) {
        this.genre = genre;
        this.subGenre = subGenre;
        this.targetAudience = targetAudience;
    }

    protected abstract void genreClassification();

    //Overriding toString method of a super class
    @Override
    public String toString(){

        return "Genre: " + this.genre + "Sub Genre: " + this.subGenre + "Target Audience: " + this.targetAudience;

    }

}


