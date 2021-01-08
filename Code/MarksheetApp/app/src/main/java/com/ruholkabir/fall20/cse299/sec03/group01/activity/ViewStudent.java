package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import com.ruholkabir.fall20.cse299.sec03.group01.R;

import androidx.appcompat.app.AppCompatActivity;

public class ViewStudent extends AppCompatActivity {
    Spinner spinnerSection;
    String section;
    private String[] sectionString = new String[]{"1","2","3","4","5"};
    Button submit;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewstudent);

        

    }

}
