package com.ruholkabir.fall20.cse299.sec03.practiceappii.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.FacultyBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.FinalBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.MidBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.QuizBean;
import com.ruholkabir.fall20.cse299.sec03.practiceappii.bean.StudentBean;

import java.util.ArrayList;

public class DBAdapter extends SQLiteOpenHelper {


        private static final int DATABASE_VERSION = 1;


        private static final String DATABASE_NAME = "Marksheet";


        private static final String FACULTY_INFO_TABLE = "faculty_table";
        private static final String STUDENT_INFO_TABLE = "student_table";
        private static final String QUIZ_INFO_TABLE = "quiz_table";
        private static final String MID_INFO_TABLE = "mid_table";
        private static final String FINAL_INFO_TABLE = "final_table";





        private static final String KEY_FACULTY_ID = "faculty_id";
        private static final String KEY_FACULTY_FIRSTNAME = "faculty_firstname";
        private static final String KEY_FACULTY_LASTNAME = "faculty_Lastname";
        private static final String KEY_FACULTY_MO_NO = "faculty_mobilenumber";
        private static final String KEY_FACULTY_ADDRESS = "faculty_address";
        private static final String KEY_FACULTY_USERNAME = "faculty_username";
        private static final String KEY_FACULTY_PASSWORD = "faculty_password";

        private static final String KEY_STUDENT_ID = "student_id";
        private static final String KEY_STUDENT_FIRSTNAME = "student_firstname";
        private static final String KEY_STUDENT_LASTNAME = "student_lastname";
        private static final String KEY_STUDENT_MO_NO = "student_mobilenumber";
        private static final String KEY_STUDENT_SECTION = "student_section";

        private static final String KEY_STUDENT_ID_QUIZ = "student_id_quiz";
        private static final String KEY_STUDENT_NAME_QUIZ = "student_name_quiz";
        private static final String KEY_STUDENT_SECTION_QUIZ = "student_section_quiz";
        private static final String KEY_QUIZ_MARKS = "quiz_marks";


        private static final String KEY_STUDENT_ID_MID = "student_id_mid";
        private static final String KEY_STUDENT_NAME_MID = "student_name_mid";
        private static final String KEY_STUDENT_SECTION_MID = "student_section_mid";
        private static final String KEY_MID_MARKS = "mid_marks";


        private static final String KEY_STUDENT_ID_FINAL = "student_id_final";
        private static final String KEY_STUDENT_NAME_FINAL = "student_name_final";
        private static final String KEY_STUDENT_SECTION_FINAL = "student_section_final";
        private static final String KEY_FINAL_MARKS = "quiz_marks";




        public DBAdapter(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }


        @Override

        public void onCreate(SQLiteDatabase db) {
            String queryFaculty="CREATE TABLE "+ FACULTY_INFO_TABLE +" (" +
                    KEY_FACULTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_FACULTY_FIRSTNAME + " TEXT, " +
                    KEY_FACULTY_LASTNAME + " TEXT, " +
                    KEY_FACULTY_MO_NO + " TEXT, " +
                    KEY_FACULTY_ADDRESS + " TEXT," +
                    KEY_FACULTY_USERNAME + " TEXT," +
                    KEY_FACULTY_PASSWORD + " TEXT " + ")";
            Log.d("queryFaculty",queryFaculty);


            String queryStudent="CREATE TABLE "+ STUDENT_INFO_TABLE +" (" +
                    KEY_STUDENT_ID + " INTEGER, " +
                    KEY_STUDENT_FIRSTNAME + " TEXT, " +
                    KEY_STUDENT_LASTNAME + " TEXT, " +
                    KEY_STUDENT_MO_NO + " TEXT, " +
                    KEY_STUDENT_SECTION + " TEXT " + ")";
            Log.d("queryStudent",queryStudent );

            String queryQuiz = "CREATE TABLE "+ QUIZ_INFO_TABLE + " ("+
                    KEY_STUDENT_ID_QUIZ + "INTEGER, " +
                    KEY_STUDENT_NAME_QUIZ + " TEXT, " +
                    KEY_STUDENT_SECTION_QUIZ + " TEXT, " +
                    KEY_QUIZ_MARKS + "TEXT " + ")" ;
            Log.d("queryQuiz", queryQuiz);

            String queryMid = "CREATE TABLE "+ MID_INFO_TABLE + " ("+
                    KEY_STUDENT_ID_MID + "INTEGER, " +
                    KEY_STUDENT_NAME_MID + " TEXT, " +
                    KEY_STUDENT_SECTION_MID + " TEXT, " +
                    KEY_MID_MARKS + "TEXT " + ")" ;
            Log.d("queryMid", queryMid);


            String queryFinal = "CREATE TABLE "+ FINAL_INFO_TABLE + " ("+
                    KEY_STUDENT_ID_FINAL + "INTEGER, " +
                    KEY_STUDENT_NAME_FINAL + " TEXT, " +
                    KEY_STUDENT_SECTION_FINAL + " TEXT, " +
                    KEY_FINAL_MARKS + "TEXT " + ")" ;
            Log.d("queryFinal", queryFinal);


            try
            {
                db.execSQL(queryFaculty);
                db.execSQL(queryStudent);
                db.execSQL(queryQuiz);
                db.execSQL(queryMid);
                db.execSQL(queryFinal);

            }
            catch (Exception e) {
                e.printStackTrace();
                Log.e("Exception", e.getMessage());
            }

        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
            String queryFaculty="CREATE TABLE "+ FACULTY_INFO_TABLE +" (" +
                    KEY_FACULTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_FACULTY_FIRSTNAME + " TEXT, " +
                    KEY_FACULTY_LASTNAME + " TEXT, " +
                    KEY_FACULTY_MO_NO + " TEXT, " +
                    KEY_FACULTY_ADDRESS + " TEXT," +
                    KEY_FACULTY_USERNAME + " TEXT," +
                    KEY_FACULTY_PASSWORD + " TEXT " + ")";
            Log.d("queryFaculty",queryFaculty);


            String queryStudent="CREATE TABLE "+ STUDENT_INFO_TABLE +" (" +
                    KEY_STUDENT_ID + " INTEGER, " +
                    KEY_STUDENT_FIRSTNAME + " TEXT, " +
                    KEY_STUDENT_LASTNAME + " TEXT, " +
                    KEY_STUDENT_MO_NO + " TEXT, " +
                    KEY_STUDENT_SECTION + " TEXT " + ")";
            Log.d("queryStudent",queryStudent );


            String queryQuiz = "CREATE TABLE "+ QUIZ_INFO_TABLE + " ("+
                    KEY_STUDENT_ID_QUIZ + "INTEGER, " +
                    KEY_STUDENT_NAME_QUIZ + " TEXT, " +
                    KEY_STUDENT_SECTION_QUIZ + " TEXT, " +
                    KEY_QUIZ_MARKS + "TEXT " + ")" ;
            Log.d("queryQuiz", queryQuiz);

            String queryMid = "CREATE TABLE "+ MID_INFO_TABLE + " ("+
                    KEY_STUDENT_ID_MID + "INTEGER, " +
                    KEY_STUDENT_NAME_MID + " TEXT, " +
                    KEY_STUDENT_SECTION_MID + " TEXT, " +
                    KEY_MID_MARKS + "TEXT " + ")" ;
            Log.d("queryMid", queryMid);


            String queryFinal = "CREATE TABLE "+ FINAL_INFO_TABLE + " ("+
                    KEY_STUDENT_ID_FINAL + "INTEGER, " +
                    KEY_STUDENT_NAME_FINAL + " TEXT, " +
                    KEY_STUDENT_SECTION_FINAL + " TEXT, " +
                    KEY_FINAL_MARKS + "TEXT " + ")" ;
            Log.d("queryFinal", queryFinal);


            try
            {
                db.execSQL(queryFaculty);
                db.execSQL(queryStudent);
                db.execSQL(queryQuiz);
                db.execSQL(queryMid);
                db.execSQL(queryFinal);

            }
            catch (Exception e) {
                e.printStackTrace();
                Log.e("Exception", e.getMessage());
            }
        }

        //facult crud
        public void addFaculty(FacultyBean facultyBean) {
            SQLiteDatabase db = this.getWritableDatabase();

            String query = "INSERT INTO faculty_table (faculty_firstname,faculty_Lastname,faculty_mobilenumber,faculty_address,faculty_username,faculty_password) values ('"+
                    facultyBean.getFaculty_firstname()+"', '"+
                    facultyBean.getFaculty_lastname()+"', '"+
                    facultyBean.getFaculty_mobilenumber()+"', '"+
                    facultyBean.getFaculty_address()+"', '"+
                    facultyBean.getFaculty_username()+"', '"+
                    facultyBean.getFaculty_password()+"')";
            Log.d("query", query);
            db.execSQL(query);
            db.close();
        }

        public FacultyBean validateFaculty(String userName,String password)
        {
            SQLiteDatabase db = this.getWritableDatabase();

            String query = "SELECT * FROM faculty_table where faculty_username='"+userName+"' and faculty_password='"+password+"'";
            Cursor cursor = db.rawQuery(query, null);

            if(cursor.moveToFirst())
            {

                FacultyBean facultyBean = new FacultyBean();
                facultyBean.setFaculty_id(Integer.parseInt(cursor.getString(0)));
                facultyBean.setFaculty_firstname(cursor.getString(1));
                facultyBean.setFaculty_lastname(cursor.getString(2));
                facultyBean.setFaculty_mobilenumber(cursor.getString(3));
                facultyBean.setFaculty_address(cursor.getString(4));
                facultyBean.setFaculty_username(cursor.getString(5));
                facultyBean.setFaculty_password(cursor.getString(6));
                return facultyBean;
            }
            return null;
        }

        public ArrayList<FacultyBean> getAllFaculty()
        {
            Log.d("in get all","in get all" );
            ArrayList<FacultyBean> list = new ArrayList<FacultyBean>();

            SQLiteDatabase db = this.getWritableDatabase();
            String query = "SELECT * FROM faculty_table";
            Cursor cursor = db.rawQuery(query, null);

            if(cursor.moveToFirst())
            {
                do{
                    FacultyBean facultyBean = new FacultyBean();
                    facultyBean.setFaculty_id(Integer.parseInt(cursor.getString(0)));
                    facultyBean.setFaculty_firstname(cursor.getString(1));
                    facultyBean.setFaculty_lastname(cursor.getString(2));
                    facultyBean.setFaculty_mobilenumber(cursor.getString(3));
                    facultyBean.setFaculty_address(cursor.getString(4));
                    facultyBean.setFaculty_username(cursor.getString(5));
                    facultyBean.setFaculty_password(cursor.getString(6));
                    list.add(facultyBean);

                }while(cursor.moveToNext());
            }
            return list;
        }

        public void deleteFaculty(int facultyId) {
            SQLiteDatabase db = this.getWritableDatabase();

            String query = "DELETE FROM faculty_table WHERE faculty_id="+facultyId ;

            Log.d("query", query);
            db.execSQL(query);
            db.close();
        }

        //student crud
        public void addStudent(StudentBean studentBean) {
            SQLiteDatabase db = this.getWritableDatabase();

            String query = "INSERT INTO student_table (student_id,student_firstname,student_lastname,student_mobilenumber,student_section) values ('"+
                    studentBean.getStudent_id()+"','"+
                    studentBean.getStudent_firstname()+"', '"+
                    studentBean.getStudent_lastname()+"','"+
                    studentBean.getStudent_mobilenumber()+"','" +
                    studentBean.getStudent_section()+"')";
            Log.d("query", query);
            db.execSQL(query);
            db.close();
        }

        public ArrayList<StudentBean> getAllStudent()
        {
            ArrayList<StudentBean> list = new ArrayList<StudentBean>();

            SQLiteDatabase db = this.getWritableDatabase();
            String query = "SELECT * FROM student_table";
            Cursor cursor = db.rawQuery(query, null);

            if(cursor.moveToFirst())
            {
                do{
                    StudentBean studentBean = new StudentBean();
                    studentBean.setStudent_id(Integer.parseInt(cursor.getString(0)));
                    studentBean.setStudent_firstname(cursor.getString(1));
                    studentBean.setStudent_lastname(cursor.getString(2));
                    studentBean.setStudent_mobilenumber(cursor.getString(3));
                    studentBean.setStudent_section(cursor.getString(4));
                    list.add(studentBean);
                }while(cursor.moveToNext());
            }
            return list;
        }

        public ArrayList<StudentBean> getAllStudentBySection(String student_section)
        {
            ArrayList<StudentBean> list = new ArrayList<StudentBean>();

            SQLiteDatabase db = this.getWritableDatabase();
            String query = "SELECT * FROM student_table where student_section='"+student_section+"' ";
            Cursor cursor = db.rawQuery(query, null);

            if(cursor.moveToFirst())
            {
                do{
                    StudentBean studentBean = new StudentBean();
                    studentBean.setStudent_id(Integer.parseInt(cursor.getString(0)));
                    studentBean.setStudent_firstname(cursor.getString(1));
                    studentBean.setStudent_lastname(cursor.getString(2));
                    studentBean.setStudent_mobilenumber(cursor.getString(3));
                    studentBean.setStudent_section(cursor.getString(4));
                    list.add(studentBean);
                }while(cursor.moveToNext());
            }
            return list;
        }

        public StudentBean getStudentById(int studentId)
        {
            StudentBean studentBean = new StudentBean();
            SQLiteDatabase db = this.getWritableDatabase();
            String query = "SELECT * FROM student_table where student_id="+studentId;
            Cursor cursor = db.rawQuery(query, null);

            if(cursor.moveToFirst())
            {
                do{

                    studentBean.setStudent_id(Integer.parseInt(cursor.getString(0)));
                    studentBean.setStudent_firstname(cursor.getString(1));
                    studentBean.setStudent_lastname(cursor.getString(2));
                    studentBean.setStudent_mobilenumber(cursor.getString(3));

                    studentBean.setStudent_section(cursor.getString(4));

                }while(cursor.moveToNext());
            }
            return studentBean;
        }

        public void deleteStudent(int studentId) {
            SQLiteDatabase db = this.getWritableDatabase();

            String query = "DELETE FROM student_table WHERE student_id="+studentId ;

            Log.d("query", query);
            db.execSQL(query);
            db.close();
        }

    public void addQuizMarks(QuizBean quizBean) {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO quiz_table (student_id_quiz,student_name_quiz,student_section_quiz,quiz_marks) values ('"+

                quizBean.getStudent_id_quiz()+"', '"+
                quizBean.getStudent_name_quiz()+"', '"+
                quizBean.getStudent_section_quiz()+"', '"+
                quizBean.getStudent_quiz_marks()+"')";

        Log.d("query", query);
        db.execSQL(query);
        db.close();
    }



    public void addMidMarks(MidBean midBean) {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO mid_table (student_id_quiz,student_name_quiz,student_section_quiz,quiz_marks) values ('"+

                midBean.getStudent_id_mid()+"', '"+
                midBean.getStudent_name_mid()+"', '"+
                midBean.getStudent_section_mid()+"', '"+
                midBean.getStudent_mid_marks()+"')";

        Log.d("query", query);
        db.execSQL(query);
        db.close();
    }



    public void addFinalMarks(FinalBean finalBean) {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO final_table (student_id_final,student_name_final,student_section_final,final_marks) values ('"+

                finalBean.getStudent_id_final()+"', '"+
                finalBean.getStudent_name_final()+"', '"+
                finalBean.getStudent_section_final()+"', '"+
                finalBean.getStudent_final_marks()+"')";

        Log.d("query", query);
        db.execSQL(query);
        db.close();
    }

    public ArrayList<QuizBean> getQuizMarksBySection(String student_section)
    {
        ArrayList<QuizBean> list = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM quiz_table where student_section='"+student_section+"' ";
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst())
        {
            do{
                QuizBean quizBean = new QuizBean();
                quizBean.setStudent_id_quiz(Integer.parseInt(cursor.getString(0)));
                quizBean.setStudent_name_quiz(cursor.getString(1));
                quizBean.setStudent_section_quiz(cursor.getString(2));
                quizBean.setStudent_quiz_marks(cursor.getString(3));
                list.add(quizBean);
            }while(cursor.moveToNext());
        }
        return list;
    }






    public ArrayList<MidBean> getMidMarksBySection(String student_section)
    {
        ArrayList<MidBean> list = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM mid_table where student_section='"+student_section+"' ";
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst())
        {
            do{
                MidBean midBean = new MidBean();
                midBean.setStudent_id_mid(Integer.parseInt(cursor.getString(0)));
                midBean.setStudent_name_mid(cursor.getString(1));
                midBean.setStudent_section_mid(cursor.getString(2));
                midBean.setStudent_mid_marks(cursor.getString(3));
                list.add(midBean);
            }while(cursor.moveToNext());
        }
        return list;
    }



    public ArrayList<FinalBean> getFinalMarksBySection(String student_section)
    {
        ArrayList<FinalBean> list = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM final_table where student_section_quiz='"+student_section+"' ";
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst())
        {
            do{
                FinalBean finalBean = new FinalBean();
                finalBean.setStudent_id_final(Integer.parseInt(cursor.getString(0)));
                finalBean.setStudent_name_final(cursor.getString(1));
                finalBean.setStudent_section_final(cursor.getString(2));
                finalBean.setStudent_final_marks(cursor.getString(3));
                list.add(finalBean);
            }while(cursor.moveToNext());
        }
        return list;
    }

















}
