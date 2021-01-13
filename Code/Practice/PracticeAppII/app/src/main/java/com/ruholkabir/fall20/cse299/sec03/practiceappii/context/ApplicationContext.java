package com.ruholkabir.fall20.cse299.sec03.practiceappii.context;

import android.app.Application;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.FacultyBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.FinalBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.MidBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.QuizBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.StudentBean;

import java.util.ArrayList;

public class ApplicationContext extends Application {
    private FacultyBean facultyBean;
    private ArrayList<StudentBean> studentBeanList;
    private QuizBean quizBean;
    private MidBean midBean;
    private FinalBean finalBean;

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

    public QuizBean getQuizBean() {
        return quizBean;
    }

    public void setQuizBean(QuizBean quizBean) {
        this.quizBean = quizBean;
    }

    public MidBean getMidBean() {
        return midBean;
    }

    public void setMidBean(MidBean midBean) {
        this.midBean = midBean;
    }

    public FinalBean getFinalBean() {
        return finalBean;
    }

    public void setFinalBean(FinalBean finalBean) {
        this.finalBean = finalBean;
    }
}
