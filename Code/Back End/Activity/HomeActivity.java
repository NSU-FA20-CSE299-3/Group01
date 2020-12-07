
package com.example.secondapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.secondapplication.R;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button addStudent;
    Button StudentProgress;
    Button marksheet;
    Button examMarks;
    Button logout;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        addStudent = (Button)findViewById(R.id.buttonAddStudent);
        StudentProgress = (Button)findViewById(R.id.buttonStudentProgress);
        marksheet = (Button)findViewById(R.id.buttonMarksheet);
        examMarks = (Button)findViewById(R.id.buttonExamMarks);
        logout = (Button)findViewById(R.id.buttonLogout);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AddStudentActivity.class);
                startActivity(intent);

            }
        });
        StudentProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,StudentProgressActivity.class);
                startActivity(intent);
            }
        });
        marksheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MarksheetActivity.class);
                startActivity(intent);
            }
        });
        examMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ExamMarksActivity.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
