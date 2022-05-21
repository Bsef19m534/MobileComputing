package com.example.lessonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Lesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        Bundle extras = getIntent().getExtras();
        TextView t=findViewById(R.id.textView3);

        ImageView image = (ImageView) findViewById(R.id.imageView);

      if (extras!=null)
      {   int pic=extras.getInt("picture");
          image.setImageResource(pic);
          t.setText(extras.getString("value"));
      }

    }
}