package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ruholkabir.fall20.cse299.sec03.group01.R;
import com.ruholkabir.fall20.cse299.sec03.group01.bean.FacultyBean;
import com.ruholkabir.fall20.cse299.sec03.group01.db.DBAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    Button registerButton;
    EditText textFirstName;
    EditText textLastName;
    EditText textPhoneNumber;
    EditText textAddress;
    EditText textUsername;
    EditText textPassword;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        textFirstName=(EditText)findViewById(R.id.editTextFirstname);
        textLastName=(EditText)findViewById(R.id.editTextlastname);
        textPhoneNumber=(EditText)findViewById(R.id.editTextPhoneNumber);
        textAddress=(EditText)findViewById(R.id.editTextAddress);
        textUsername=(EditText)findViewById(R.id.editTextUsernameREG);
        textPassword=(EditText)findViewById(R.id.editTextPasswordREG);
        registerButton=(Button)findViewById(R.id.DoneButton);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_name = textFirstName.getText().toString();
                String last_name = textLastName.getText().toString();
                String phone_number = textPhoneNumber.getText().toString();
                String address = textAddress.getText().toString();
                String username = textUsername.getText().toString();
                String password = textPassword.getText().toString();
                
                if(TextUtils.isEmpty(first_name)){
                    textFirstName.setError("Please Enter YOUR first name");
                }
                else if(TextUtils.isEmpty(last_name))
                {
                    textLastName.setError("Please Enter YOUR last name");
                }
                else if(TextUtils.isEmpty(phone_number)){
                    textPhoneNumber.setError("Please Enter YOUR phone number");
                }
                else if(TextUtils.isEmpty(address))
                {
                    textAddress.setError("Please Enter YOUR address");
                }
                else if(TextUtils.isEmpty(username))
                {
                    textUsername.setError("Please Enter a Username");
                }
                else if(TextUtils.isEmpty(password))
                {
                    textPassword.setError("Please Enter a password");
                }
                else
                {
                    FacultyBean facultyBean = new FacultyBean();
                    facultyBean.setFaculty_firstname(first_name);
                    facultyBean.setFaculty_lastname(last_name);
                    facultyBean.setFaculty_mobilenumber(phone_number);
                    facultyBean.setFaculty_address(address);
                    facultyBean.setFaculty_username(username);
                    facultyBean.setFaculty_password(password);


                    DBAdapter dbAdapter = new DBAdapter(RegisterActivity.this);
                    dbAdapter.addFaculty(facultyBean);
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }






}
