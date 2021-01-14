package com.ruholkabir.fall20.cse299.sec03.practiceappii.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.R;

import androidx.appcompat.app.AppCompatActivity;

public class QuizMarksActivity extends AppCompatActivity {

    Button addQuizMarks;
    EditText textIDQuiz;
    EditText textNameQuiz;
    EditText textSectionQuiz;
    EditText textQuizMarks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_marks);



        addQuizMarks = (Button)findViewById(R.id.buttonADDQUIZMarks);
        textIDQuiz = (EditText)findViewById(R.id.editTextIDstdQuiz);
        textNameQuiz = (EditText)findViewById(R.id.editTextTextNameStdQuiz);
        textSectionQuiz = (EditText)findViewById(R.id.editTextSectionQuiz);
        textQuizMarks = (EditText)findViewById(R.id.editTextMarksQuiz);


        addQuizMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int student_id_quiz = Integer.parseInt(textIDQuiz.getText().toString());
                String student_name_quiz = textNameQuiz.getText().toString();
                String student_section_quiz = textSectionQuiz.getText().toString();
                String quiz_marks = textQuizMarks.getText().toString();


                if(textIDQuiz.getText().toString().trim().isEmpty()){
                    textIDQuiz.setError("Enter Student ID");
                }
                else if(TextUtils.isEmpty(student_name_quiz)){
                    textNameQuiz.setError("Enter Student Name");
                }
                else if(TextUtils.isEmpty(student_section_quiz)){
                    textSectionQuiz.setError("Enter Student Section");
                }
                else if(TextUtils.isEmpty(quiz_marks)){
                    textQuizMarks.setError("Enter Quiz Marks");
                }
            }
        });








    }
}
