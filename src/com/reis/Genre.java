package com.reis;

//Abstract class
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

    @Override
    public String toString(){

        return "Genre: " + this.genre + "Sub Genre: " + this.subGenre + "Target Audience: " + this.targetAudience;

    }

}


