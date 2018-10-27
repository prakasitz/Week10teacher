package com.mydomain.app.week10.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface MovieService {

    //request url: http://api.androidhive.info/json/movies.json
    @GET("/json/movies.json")
    //ส่วน
    Call<List<Movie>> loadMovies();
}
