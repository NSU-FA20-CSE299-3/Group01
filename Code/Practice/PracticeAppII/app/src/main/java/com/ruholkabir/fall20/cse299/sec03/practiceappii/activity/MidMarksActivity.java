package com.ruholkabir.fall20.cse299.sec03.practiceappii.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.R;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.MidBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.QuizBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.db.DBAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class MidMarksActivity extends AppCompatActivity {


    Button addMidMarks;
    EditText textIDMid;
    EditText textNameMid;
    EditText textSectionMid;
    EditText textMidMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mid_marks);

        addMidMarks = (Button)findViewById(R.id.buttonADDmidMarks);
        textIDMid = (EditText)findViewById(R.id.editTextIDstdMID);
        textNameMid = (EditText)findViewById(R.id.editTextTextNameStdMID);
        textSectionMid = (EditText)findViewById(R.id.editTextSectionStdMID);
        textMidMarks = (EditText)findViewById(R.id.editTextMIDMarks);


        addMidMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int student_id_mid = Integer.parseInt(textIDMid.getText().toString());
                String student_name_mid = textNameMid.getText().toString();
                String student_section_mid = textSectionMid.getText().toString();
                String mid_marks = textMidMarks.getText().toString();


                if(textIDMid.getText().toString().trim().isEmpty()){
                    textIDMid.setError("Enter Student ID");
                }
                else if(TextUtils.isEmpty(student_name_mid)){
                    textNameMid.setError("Enter Student Name");
                }
                else if(TextUtils.isEmpty(student_section_mid)){
                    textSectionMid.setError("Enter Student Section");
                }
                else if(TextUtils.isEmpty(mid_marks)){
                    textMidMarks.setError("Enter Mid Marks");
                }
                else{
                    MidBean midBean = new MidBean();
                    midBean.setStudent_id_mid(student_id_mid);
                    midBean.setStudent_name_mid(student_name_mid);
                    midBean.setStudent_section_mid(student_section_mid);
                    midBean.setStudent_mid_marks(mid_marks);


                    DBAdapter dbAdapter = new DBAdapter(MidMarksActivity.this);
                    dbAdapter.addMidMarks(midBean);
                    Intent intent = new Intent(MidMarksActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Mid Marks added Succesfully", Toast.LENGTH_SHORT).show();;
                }





            }
        });







    }
}
