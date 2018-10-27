package com.mydomain.app.week10.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mydomain.app.week10.R;
import com.mydomain.app.week10.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder>{
    private Context context;
    private List<Movie> movies;
    private MovieItemClickListener movieItemClickListener;

    public MovieAdapter(Context context, List<Movie> movies,
                        MovieItemClickListener movieItemClickListener){
        this.context = context;
        this.movies = movies;
        this.movieItemClickListener = movieItemClickListener;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder movieViewHolder, int i){ //
        Movie movie = movies.get(i);
        movieViewHolder.bindMovieViewHolder(context, movie); //ว่า viewHolder ทำการ by กับ obj ทำแบบไหน
        //ตอน bind

    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.movie_item, viewGroup, false);
        return new MovieViewHolder(itemView, movieItemClickListener);
    }

    @Override
    public int getItemCount(){
        return movies.size();
    }
}

class MovieViewHolder extends RecyclerView.ViewHolder{

    private MovieItemClickListener movieItemClickListener;
    private Movie movie;
    protected TextView tvMovieTitle;
    protected TextView tvMovieType;
    protected TextView tvMovieYear;
    protected TextView tvMovieRating;
    protected ImageView ivMovie;

    public MovieViewHolder(View v, MovieItemClickListener movieItemClickListener){
        super(v);
        this.movieItemClickListener = movieItemClickListener;

        tvMovieTitle = (TextView) v.findViewById(R.id.tvMovieTitle);
        tvMovieType = (TextView) v.findViewById(R.id.tvMovieType);
        tvMovieYear = (TextView) v.findViewById(R.id.tvMovieYear);
        tvMovieRating = (TextView) v.findViewById(R.id.tvMovieRating);
        ivMovie = (ImageView) v.findViewById(R.id.ivMovie);
        // bind ให่ view เลยนะครับ
        v.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //เรียกใช้ และส่ง movie ไป
                MovieViewHolder.this.movieItemClickListener.onMovieItemClick(MovieViewHolder.this.movie);
            }
        });
    }

    public void bindMovieViewHolder(Context context, Movie movie){
        // bind โน้นนี้นั้น
        this.movie = movie;
        tvMovieTitle.setText(movie.getTitle());
        tvMovieType.setText(movie.getType());
        tvMovieYear.setText("Year: " + movie.getReleaseYear());
        tvMovieRating.setText("Rating: " + movie.getRating()); //โหลดหนังมาไว้ที่ movie
        Picasso.with(context).load(movie.getImage()).into(ivMovie); // เรียกใช้ picasso  //getImge return url รูป
    }
}
