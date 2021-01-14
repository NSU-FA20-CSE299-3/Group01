package com.ruholkabir.fall20.cse299.sec03.practiceappii.bean;

public class FinalBean {
    private int student_id_final;
    private String  student_name_final;
    private String student_section_final;
    private String student_final_marks;


    public int getStudent_id_final(){return student_id_final;}

    public void setStudent_id_final(int student_id_final) {
        this.student_id_final = student_id_final;
    }

    public String getStudent_name_final() {
        return student_name_final;
    }

    public void setStudent_name_final(String student_name_final) {
        this.student_name_final = student_name_final;
    }

    public String getStudent_section_final() {
        return student_section_final;
    }

    public void setStudent_section_final(String student_section_final) {

        this.student_section_final = student_section_final;
    }

    public String getStudent_final_marks() {
        return student_final_marks;
    }

    public void setStudent_final_marks(String student_final_marks) {
        this.student_final_marks = student_final_marks;
    }
}
