package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t=findViewById(R.id.textView2);
        Intent i = getIntent();
        t.setText(i.getStringExtra("value"));

        Log.d("Life Cycle","OnCreate the Main Activity 2");
    }
    protected void onStart ()
    {
        super.onStart();
        Log.d("Life Cycle","OnStart the Main Activity 2");
    }
    protected void onResume ()
    {
        super.onResume();
        Log.d("Life Cycle","OnResume the Main Activity 2");
    }
    protected void onPause ()
    {
        super.onPause();
        Log.d("Life Cycle","OnPause the Main Activity 2");
    }
    protected void onStop ()
    {
        super.onStop();
        Log.d("Life Cycle","OnStop the Main Activity 2");
    }
    protected void onDestroy ()
    {
        super.onDestroy();
        Log.d("Life Cycle","OnDestroy the Main Activity 2");
    }
    protected void onRestart ()
    {
        super.onRestart();
        Log.d("Life Cycle","OnRestart the Main Activity 2");
    }
}