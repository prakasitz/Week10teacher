package com.mydomain.app.week10.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import com.mydomain.app.week10.R;
import com.mydomain.app.week10.adapter.MovieAdapter;
import com.mydomain.app.week10.adapter.MovieItemClickListener;
import com.mydomain.app.week10.model.Movie;
import com.mydomain.app.week10.model.MovieService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
        implements Callback<List<Movie>>, MovieItemClickListener{
    //ต้องให้ Main จัดการ MovieItemClickListener ด้วย เลยต้อง implement
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        loadMovies();
    }

    private void loadMovies() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.androidhive.info")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MovieService movieService = retrofit.create(MovieService.class);
        Call<List<Movie>> call = movieService.loadMovies();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
        Toast.makeText(MainActivity.this,
                response.body().size() + " movies loaded!", Toast.LENGTH_LONG).show();
        List<Movie> movies = response.body();

        MovieAdapter movieAdapter = new MovieAdapter(this, movies, this);
        recyclerView.setAdapter(movieAdapter);
    }

    @Override
    public void onFailure(Call<List<Movie>> call, Throwable t) {
        Toast.makeText(MainActivity.this,
                "Fail to load data!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onMovieItemClick(Movie movie){
        Intent i = new Intent(this, ImageActivity.class);
        i.putExtra("image_url", movie.getImage());
        i.putExtra("movie_name", movie.getTitle());
        startActivity(i);
    }
}
