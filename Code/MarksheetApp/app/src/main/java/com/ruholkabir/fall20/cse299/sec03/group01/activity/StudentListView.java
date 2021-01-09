package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.os.Bundle;
import android.util.Log;
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

        listView = (ListView)findViewById(R.id.ListViewofStudent);
        final Arraylist<String> studentList = new ArrayList<>();
        section = getIntent().getExtras().getString("section");

        studentBeanList = dbAdapter.getAllStudentBySection(section);
        for(StudentBean studentBean : studentBeanList);
        {
            String users = studentBean.getStudent_id + "     "+studentBean.getStudent_firstname()+"     "+studentBean.getStudent_lastname()+"     "+studentBean.getStudent_mobilenumber();
            studentList.add(users);
            Log.d("users: ", users);
        }

        listAdapter = new ArrayAdapter<String>(this, R.layout.view_student_list,R.id.label, studentList);
        listView.setAdapter(listAdapter);

        listView.setOnItemLongClickListener(new adapterView.OnItemLongClickListener());























    }
}
