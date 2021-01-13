package com.ruholkabir.fall20.cse299.sec03.practiceappii.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.R;

public class MainActivity extends AppCompatActivity {
    Button quiz;
    Button mid;
    Button finalExam;
    Button Marksheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam_marks);

        quiz=(Button)findViewById(R.id.quizButton);
        mid=(Button)findViewById(R.id.midButton);
        finalExam=(Button)findViewById(R.id.finalButton);
        Marksheet=(Button)findViewById(R.id.buttonMArksheet);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizMarksActivity.class);
                startActivity(intent);

            }
        });

        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MidMarksActivity.class);
                startActivity(intent);
            }
        });
        finalExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FinalMarksActivity.class);
                startActivity(intent);
            }
        });
        Marksheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MarksheetActivity.class);
                startActivity(intent);

            }
        });




    }
}