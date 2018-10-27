package com.mydomain.app.week10.model;

import java.util.List;


public class Movie {
    // GSON  ทำให้หมด
    private String title;
    private String image;
    private double rating;
    private int releaseYear;
    private List<String> genre;

    /**
     * title : Dawn of the Planet of the Apes
     * image : http://api.androidhive.info/json/movies/1.jpg
     * rating : 8.3
     * releaseYear : 2014
     * genre : ["Action","Drama","Sci-Fi"]
     */


    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<String> getGenre() {
        return genre;
    }

    public String getType() {
        String result = "";
        for(int i = 0; i < genre.size(); i++){
            result += genre.get(i);
            result += (i == genre.size() - 1) ? "" : ", ";
        }
        return result;
    }
}
