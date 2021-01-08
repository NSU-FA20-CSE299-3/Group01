package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

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

        spinnerSection=(Spinner)findViewById(R.id.spinnerSection);

        spinnerSection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int arg2, long arg3) {
                ((TextView) arg0.getChildAt(0)).setTextColor(Color.BLACK);
                section=(String) spinnerSection.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                

            }
        });

    }

}
