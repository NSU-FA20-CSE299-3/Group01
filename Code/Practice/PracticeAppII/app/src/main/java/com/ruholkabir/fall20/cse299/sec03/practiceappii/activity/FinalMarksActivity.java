package com.ruholkabir.fall20.cse299.sec03.practiceappii.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.R;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.FinalBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.QuizBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.db.DBAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class FinalMarksActivity extends AppCompatActivity {




    Button addFinalMarks;
    EditText textIDFinal;
    EditText textNameFinal;
    EditText textSectionFinal;
    EditText textFinalMarks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_marks);

        addFinalMarks = (Button)findViewById(R.id.buttonADDstdFinal);
        textIDFinal = (EditText)findViewById(R.id.editTextIDstdFinal);
        textNameFinal = (EditText)findViewById(R.id.editTextNamestdFinal);
        textSectionFinal = (EditText)findViewById(R.id.editTextSectionstdFinal);
        textFinalMarks = (EditText)findViewById(R.id.editTextFINALMarks);


        addFinalMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int student_id_final = Integer.parseInt(textIDFinal.getText().toString());
                String student_name_final = textNameFinal.getText().toString();
                String student_section_final = textSectionFinal.getText().toString();
                String final_marks = textFinalMarks.getText().toString();


                if(textIDFinal.getText().toString().trim().isEmpty()){
                    textIDFinal.setError("Enter Student ID");
                }
                else if(TextUtils.isEmpty(student_name_final)){
                    textNameFinal.setError("Enter Student Name");
                }
                else if(TextUtils.isEmpty(student_section_final)){
                    textSectionFinal.setError("Enter Student Section");
                }
                else if(TextUtils.isEmpty(final_marks)){
                    textFinalMarks.setError("Enter Final Marks");
                }
                else{
                    FinalBean finalBean = new FinalBean();
                    finalBean.setStudent_id_final(student_id_final);
                    finalBean.setStudent_name_final(student_name_final);
                    finalBean.setStudent_section_final(student_section_final);
                    finalBean.setStudent_final_marks(final_marks);


                    DBAdapter dbAdapter = new DBAdapter(FinalMarksActivity.this);
                    dbAdapter.addFinalMarks(finalBean);
                    Intent intent = new Intent(FinalMarksActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Final Marks added Succesfully", Toast.LENGTH_SHORT).show();
                }










            }
        });





    }
}
