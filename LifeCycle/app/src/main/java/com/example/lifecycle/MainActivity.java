package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;


        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent in= new Intent(MainActivity.this,MainActivity2.class);
                in.putExtra("value","How are you!");
                startActivity(in);
            }
        });

        Log.d("Life Cycle","OnCreate the Main Activity");
    }
    protected void onStart ()
    {
        super.onStart();
        Log.d("Life Cycle","OnStart the Main Activity");
    }
    protected void onResume ()
    {
        super.onResume();
        Log.d("Life Cycle","OnResume the Main Activity");
    }
    protected void onPause ()
    {
        super.onPause();
        Log.d("Life Cycle","OnPause the Main Activity");
    }
    protected void onStop ()
    {
        super.onStop();
        Log.d("Life Cycle","OnStop the Main Activity");
    }
    protected void onDestroy ()
    {
        super.onDestroy();
        Log.d("Life Cycle","OnDestroy the Main Activity");
    }
    protected void onRestart ()
    {
        super.onRestart();
        Log.d("Life Cycle","OnRestart the Main Activity");
    }


}