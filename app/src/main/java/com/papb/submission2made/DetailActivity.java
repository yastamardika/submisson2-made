package com.papb.submission2made;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moviedesc);

        Intent intent = getIntent();
        movie = intent.getParcelableExtra("EXTRA_MOVIE");
        intent.putExtra("EXTRA_MOVIE", movie);


        TextView tvObject = findViewById(R.id.titleMovie);
        TextView tvDescMovie = findViewById(R.id.description);
        ImageView imgPreview = findViewById(R.id.moviePict);
        tvObject.setText(movie.getTitle());
        tvDescMovie.setText(movie.getDescription());
        imgPreview.setImageResource(movie.getPhoto());

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
