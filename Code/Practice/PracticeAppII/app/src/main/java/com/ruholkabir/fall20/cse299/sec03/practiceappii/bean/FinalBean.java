package com.ruholkabir.fall20.cse299.sec03.practiceappii.bean;

public class FinalBean {
    private int student_id;
    private String  student_name;
    private String student_section;
    private float student_final_marks;


    public int getStudent_id(){return student_id;}

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_section() {
        return student_section;
    }

    public void setStudent_section(String student_section) {
        this.student_section = student_section;
    }

    public float getStudent_quiz_marks() {
        return student_final_marks;
    }

    public void setStudent_quiz_marks(float student_quiz_marks) {
        this.student_final_marks = student_quiz_marks;
    }
}
