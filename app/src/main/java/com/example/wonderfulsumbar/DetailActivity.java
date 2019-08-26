package com.example.wonderfulsumbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DETAIL_PHOTO = "extra_detail_photo";
    public static final String EXTRA_DETAIL_NAME = "extra_detail_name";
    public static final String EXTRA_DETAIL_DESCRIPTION = "extra_detail_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView ivDetail = findViewById(R.id.ivDetail);
        TextView tvDetailName = findViewById(R.id.tvDetailName);
        TextView tvDetailDescription = findViewById(R.id.tvDetailDescription);

        String photo = getIntent().getStringExtra(EXTRA_DETAIL_PHOTO);
        String name = getIntent().getStringExtra(EXTRA_DETAIL_NAME);
        String description = getIntent().getStringExtra(EXTRA_DETAIL_DESCRIPTION);

        Glide.with(this)
                .load(photo)
                .into(ivDetail);

        String nama = name;
        tvDetailName.setText(nama);
        String desc = description;
        tvDetailDescription.setText(desc);

    }
}
