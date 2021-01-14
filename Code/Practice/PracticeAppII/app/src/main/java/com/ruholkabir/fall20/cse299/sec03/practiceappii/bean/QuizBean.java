package com.ruholkabir.fall20.cse299.sec03.practiceappii.bean;

public class QuizBean {
    private int student_id_quiz;
    private String  student_name_quiz;
    private String student_section_quiz;
    private String student_quiz_marks;


    public int getStudent_id_quiz(){return student_id_quiz;}

    public void setStudent_id_quiz(int student_id_quiz) {
        this.student_id_quiz = student_id_quiz;
    }

    public String getStudent_name_quiz() {
        return student_name_quiz;
    }

    public void setStudent_name_quiz(String student_name_quiz) {
        this.student_name_quiz = student_name_quiz;
    }

    public String getStudent_section_quiz() {
        return student_section_quiz;
    }

    public void setStudent_section_quiz(String student_section_quiz) {
        this.student_section_quiz = student_section_quiz;
    }

    public String getStudent_quiz_marks() {
        return student_quiz_marks;
    }

    public void setStudent_quiz_marks(String student_quiz_marks) {
        this.student_quiz_marks = student_quiz_marks;
    }
}
