package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ruholkabir.fall20.cse299.sec03.group01.R;

public class MainActivity extends AppCompatActivity {

    Button login, register;
    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login=(Button)findViewById(R.id.buttonlogin);
        register=(Button)findViewById(R.id.buttonregister);
        username=(EditText)findViewById(R.id.editTextusername);
        password=(EditText)findViewById(R.id.editTextpassword);





    }








}