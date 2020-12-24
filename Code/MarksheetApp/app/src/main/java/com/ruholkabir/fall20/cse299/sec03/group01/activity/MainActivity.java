package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ruholkabir.fall20.cse299.sec03.group01.R;
import com.ruholkabir.fall20.cse299.sec03.group01.bean.FacultyBean;
import com.ruholkabir.fall20.cse299.sec03.group01.db.DBAdapter;

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

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = username.getText().toString();
                String pass_word = password.getText().toString();
                if(TextUtils.isEmpty(user_name))
                {
                    username.setError("Invalid User Name");
                }
                else if (TextUtils.isEmpty(pass_word))
                {
                    password.setError("Enter Password");
                }

                DBAdapter dbAdapter = new DBAdapter(MainActivity.this);
                FacultyBean facultyBean = dbAdapter.validateFaculty(user_name, pass_word);


            }
        });



    }








}