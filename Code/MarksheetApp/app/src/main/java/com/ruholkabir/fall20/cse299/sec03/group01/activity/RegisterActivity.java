package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ruholkabir.fall20.cse299.sec03.group01.R;

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



    }






}
