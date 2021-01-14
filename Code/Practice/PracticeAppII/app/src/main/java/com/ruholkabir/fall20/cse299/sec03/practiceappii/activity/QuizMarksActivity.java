package com.ruholkabir.fall20.cse299.sec03.practiceappii.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.R;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.QuizBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.db.DBAdapter;

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
                else{
                    QuizBean quizBean = new QuizBean();
                    quizBean.setStudent_id_quiz(student_id_quiz);
                    quizBean.setStudent_name_quiz(student_name_quiz);
                    quizBean.setStudent_section_quiz(student_section_quiz);
                    quizBean.setStudent_quiz_marks(quiz_marks);


                    DBAdapter dbAdapter = new DBAdapter(QuizMarksActivity.this);
                    dbAdapter.addQuizMarks(quizBean);
                    Intent intent = new Intent(QuizMarksActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Quiz Marks added Succesfully", Toast.LENGTH_SHORT).show();
                }










            }
        });








    }
}
