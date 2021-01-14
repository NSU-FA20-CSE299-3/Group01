package com.ruholkabir.fall20.cse299.sec03.practiceappii.bean;

public class MidBean {

    private int student_id_mid;
    private String  student_name_mid;
    private String student_section_mid;
    private String student_mid_marks;


    public int getStudent_id_mid(){return student_id_mid;}

    public void setStudent_id_mid(int student_id_mid) {
        this.student_id_mid = student_id_mid;
    }

    public String getStudent_name_mid() {
        return student_name_mid;
    }

    public void setStudent_name_mid(String student_name_mid) {
        this.student_name_mid = student_name_mid;
    }

    public String getStudent_section_mid() {
        return student_section_mid;

    }

    public void setStudent_section_mid(String student_section_mid) {
        this.student_section_mid = student_section_mid;
    }

    public String getStudent_mid_marks() {
        return student_mid_marks;
    }

    public void setStudent_mid_marks(String student_mid_marks) {
        this.student_mid_marks = student_mid_marks;
    }
}
