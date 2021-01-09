package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ruholkabir.fall20.cse299.sec03.group01.R;
import com.ruholkabir.fall20.cse299.sec03.group01.bean.StudentBean;
import com.ruholkabir.fall20.cse299.sec03.group01.db.DBAdapter;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class StudentListView extends AppCompatActivity {
    ArrayList<StudentBean> studentBeanList;
    private ListView listView;
    private ArrayAdapter<String> listAdapter;
    String section;

    DBAdapter dbAdapter = new DBAdapter(this);

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentlistview);
    }
}
