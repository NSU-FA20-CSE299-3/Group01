package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ruholkabir.fall20.cse299.sec03.group01.R;
import com.ruholkabir.fall20.cse299.sec03.group01.bean.FacultyBean;
import com.ruholkabir.fall20.cse299.sec03.group01.context.ApplicationContext;
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
        username=(EditText)findViewById(R.id.editTextusernameLOG);
        password=(EditText)findViewById(R.id.editTextpasswordLOG);

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

                if(facultyBean!=null)
                {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                    ((ApplicationContext)MainActivity.this.getApplicationContext()).setFacultyBean(facultyBean);
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });



    }








}