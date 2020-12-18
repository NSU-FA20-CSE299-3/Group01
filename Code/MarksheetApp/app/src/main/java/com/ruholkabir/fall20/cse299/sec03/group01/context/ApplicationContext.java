package com.ruholkabir.fall20.cse299.sec03.group01.context;

import android.app.Application;

import com.ruholkabir.fall20.cse299.sec03.group01.bean.FacultyBean;
import com.ruholkabir.fall20.cse299.sec03.group01.bean.StudentBean;

import java.util.ArrayList;

public class ApplicationContext extends Application {

    private FacultyBean facultyBean;
    private ArrayList<StudentBean> studentBeanList;

    public FacultyBean getFacultyBean() {
        return facultyBean;
    }

    public void setFacultyBean(FacultyBean facultyBean) {
        this.facultyBean = facultyBean;
    }

    public ArrayList<StudentBean> getStudentBeanList() {
        return studentBeanList;
    }

    public void setStudentBeanList(ArrayList<StudentBean> studentBeanList) {
        this.studentBeanList = studentBeanList;
    }
}
