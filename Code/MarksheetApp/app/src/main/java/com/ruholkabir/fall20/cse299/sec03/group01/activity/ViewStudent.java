package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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


        ArrayAdapter<String> adapter_section = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,sectionString);
        adapter_section.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSection.setAdapter(adapter_section);

        submit=(Button)findViewById(R.id.buttonSubmitSection);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ViewStudent.this, StudentListView.class);
                intent.putExtra("section", section);
                startActivity(intent);
            }
        });






    }

}
