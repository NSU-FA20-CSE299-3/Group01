package com.ruholkabir.fall20.cse299.sec03.group01.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ruholkabir.fall20.cse299.sec03.group01.R;
import com.ruholkabir.fall20.cse299.sec03.group01.bean.StudentBean;
import com.ruholkabir.fall20.cse299.sec03.group01.db.DBAdapter;

import java.util.ArrayList;

import androidx.appcompat.app.AlertDialog;
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
        final ArrayList<String> studentList = new ArrayList<>();
        section = getIntent().getExtras().getString("section");

        studentBeanList = dbAdapter.getAllStudentBySection(section);
        for(StudentBean studentBean : studentBeanList)
        {
            String users = studentBean.getStudent_id()+ "    "+studentBean.getStudent_firstname()+"    "+studentBean.getStudent_lastname()+"    "+studentBean.getStudent_mobilenumber();
            studentList.add(users);
            Log.d("users: ", users);
        }

        listAdapter = new ArrayAdapter<String>(this, R.layout.view_student_list,R.id.label, studentList);
        listView.setAdapter(listAdapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(StudentListView.this);
                alertDialogBuilder.setTitle(getTitle()+"decision");
                alertDialogBuilder.setMessage("Are You Sure?");
                alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        studentList.remove(position);
                        listAdapter.notifyDataSetChanged();
                        listAdapter.notifyDataSetInvalidated();

                        dbAdapter.deleteStudent(studentBeanList.get(position).getStudent_id());
                        studentBeanList=dbAdapter.getAllStudentBySection(section);




                        for(StudentBean studentBean: studentBeanList)
                        {
                            String users = studentBean.getStudent_id() + "," + studentBean.getStudent_firstname() + "," + studentBean.getStudent_lastname() + "," + studentBean.getStudent_mobilenumber();
                            studentList.add(users);
                            Log.d("users: ", users);


                        }

                    }
                });
                alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Canceled",Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                return false;
            }
        });























    }
}
