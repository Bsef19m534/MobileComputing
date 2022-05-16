package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b;

        b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://stackoverflow.com/questions/18221663/open-another-app-with-android-intent-action-view");
                Intent in= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(in);
            }
        });

    }
}