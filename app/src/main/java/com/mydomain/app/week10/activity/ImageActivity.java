
package com.mydomain.app.week10.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.mydomain.app.week10.R;
import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {
    //อันนี้เอาไว้แสเดงรูปใหญ่
    private ImageView ivMovieFullScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ivMovieFullScreen = (ImageView) findViewById(R.id.ivMovieFullScreen);
        String imageUrl = getIntent().getStringExtra("image_url"); //เอามาจาก intent
        Log.d("MOVIE_IMAGE", imageUrl);
        String movieName = getIntent().getStringExtra("movie_name"); // เอามาจาก intent

        //String imageUrl = "http://api.androidhive.info/json/movies/1.jpg";
        Picasso.with(this).load(imageUrl).into(ivMovieFullScreen); // this คือ act ทำการโหลด img url และยัดใส่่ ivMovie
        //ใช้ picasso โหลดอีกรอบนึง
        Toast.makeText(this, movieName, Toast.LENGTH_SHORT).show();
    }
}
