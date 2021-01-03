package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ruholkabir.fall20.cse299.sec03.group01.R;

import androidx.appcompat.app.AppCompatActivity;

public class AddStudentActivity extends AppCompatActivity {

    Button addbutton;
    EditText textID;
    EditText textFirstName;
    EditText textLastName;
    EditText textMobileNumber;
    EditText textSection;


    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.add_student);

        addbutton = (Button)findViewById(R.id.buttonADDstd);
        textID = (EditText)findViewById(R.id.editTextIDstd);
        textFirstName = (EditText)findViewById(R.id.editTextFirstNamestd);
        textLastName = (EditText)findViewById(R.id.editTextLastNamestd);
        textMobileNumber = (EditText)findViewById(R.id.editTextphnNostd);
        textSection = (EditText)findViewById(R.id.EditTextSectionstd);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int student_id = Integer.parseInt(textID.getText().toString());
                String first_name = textFirstName.getText().toString();
                String last_name = textLastName.getText().toString();
                String phone_no = textMobileNumber.getText().toString();
                String student_section = textSection.getText().toString();










            }
        });
    }

}
