package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ruholkabir.fall20.cse299.sec03.group01.R;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button addStudent;
    Button StudentProgress;
    Button viewStudent;
    Button marksheet;
    Button examMarks;
    Button logout;

    Protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.home);


        addStudent = (Button)findViewById(R.id.buttonAddStudent);
        StudentProgress= (Button)findViewById(R.id.buttonStudentProgress);
        viewStudent = (Button)findViewById(R.id.buttonViewStudent);
        marksheet = (Button)findViewById(R.id.buttonMarksheet);
        examMarks = (Button)findViewById(R.id.buttonExamMarks);
        logout = (Button)findViewById(R.id.buttonLogout);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, )
            }
        });

    }

}
