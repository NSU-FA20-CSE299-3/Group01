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
    private ArrayList<QuizBean> quizBeanList;
    private ArrayList<MidBean> midBeanList;
    private ArrayList<FinalBean> finalBeanList;

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

    public ArrayList<QuizBean> getQuizBeanList() {
        return quizBeanList;
    }

    public void setQuizBeanList(ArrayList<QuizBean> quizBeanList) {
        this.quizBeanList = quizBeanList;
    }

    public ArrayList<MidBean> getMidBeanList() {
        return midBeanList;
    }

    public void setMidBeanList(ArrayList<MidBean> midBeanList) {
        this.midBeanList = midBeanList;
    }

    public ArrayList<FinalBean> getFinalBeanList() {
        return finalBeanList;
    }

    public void setFinalBeanList(ArrayList<FinalBean> finalBeanList) {
        this.finalBeanList = finalBeanList;
    }
}
