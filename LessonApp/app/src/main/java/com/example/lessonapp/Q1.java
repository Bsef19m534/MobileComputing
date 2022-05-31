package com.example.lessonapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class Q1 extends AppCompatActivity implements View.OnClickListener {
    Button op1,op2,op3,op4;

    int score=0;
    int totalQuestion = 5;
    int currentQuestionIndex ;
    String selectedAnswer = "";
    TextView total;
    ImageView v;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);


        Button Submit;
        v =findViewById(R.id.imageView5);
         op1=findViewById(R.id.op1);
        op2=findViewById(R.id.op2);
        op3=findViewById(R.id.op3);
        op4=findViewById(R.id.op4);
        Submit=findViewById(R.id.button6);
        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
        op3.setOnClickListener(this);
        op4.setOnClickListener(this);
        Submit.setOnClickListener(this);

        total= findViewById(R.id.textView4);

        total.setText("Total questions : "+totalQuestion);


        loadNewQuestion();

    }
    public void onClick(View view) {
        op1.setBackgroundColor(0xFF018786);
        op2.setBackgroundColor(0xFF018786);
        op3.setBackgroundColor(0xFF018786);
        op4.setBackgroundColor(0xFF018786);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.button6){
            if(selectedAnswer.equals(setQ.correctAnswers[currentQuestionIndex])){
                score++;
            }


            currentQuestionIndex  = new Random().nextInt(25);

            loadNewQuestion();
            i++;



        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(0xFF03DAC5);

        }

    }




    private void loadNewQuestion() {

        if(i == totalQuestion ){
            finishQuiz();
            return;
        }


          v.setImageResource(setQ.question[currentQuestionIndex]);

        op1.setText(setQ.choices[currentQuestionIndex][0]);
        op2.setText(setQ.choices[currentQuestionIndex][1]);
        op3.setText(setQ.choices[currentQuestionIndex][2]);
        op4.setText(setQ.choices[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.50){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    private void restartQuiz() {
        score = 0;
        currentQuestionIndex = new Random().nextInt(25);
        i=1;
        loadNewQuestion();
    }



}