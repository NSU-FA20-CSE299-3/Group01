package com.ruholkabir.fall20.cse299.sec03.group01.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.ruholkabir.fall20.cse299.sec03.group01.bean.FacultyBean;

public class DBAdapter extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Marksheet";
    private static final String FACULTY_INFO_TABLE = "faculty_table";
    private static final String STUDENT_INFO_TABLE = "student_table";

    private static final String KEY_FACULTY_ID = "faculty_id";
    private static final String KEY_FACULTY_FIRSTNAME = "faculty_firstname";
    private static final String KEY_FACULTY_LASTNAME = "faculty_lastname";
    private static final String KEY_FACULTY_MO_NO = "faculty_mobilenumber";
    private static final String KEY_FACULTY_ADDRESS = "faculty_address";
    private static final String KEY_FACULTY_USERNAME = "faculty_username";
    private static final String KEY_FACULTY_PASSWORD = "faculty_password";

    private static final String KEY_STUDENT_ID = "student_id";
    private static final String KEY_STUDENT_FIRSTNAME = "student_firstname";
    private static final String KEY_STUDENT_LASTNAME = "student_lastname";
    private static final String KEY_STUDENT_MO_NO = "student_mobilenumber";
    private static final String KEY_STUDENT_SECTION = "student_section";

    public DBAdapter(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSION); }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryFaculty="CREATE TABLE "+ FACULTY_INFO_TABLE +" (" +
                KEY_FACULTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                KEY_FACULTY_FIRSTNAME + " TEXT, " +
                KEY_FACULTY_LASTNAME + " TEXT, "+
                KEY_STUDENT_MO_NO + " TEXT, "+
                KEY_FACULTY_ADDRESS + " TEXT, "+
                KEY_FACULTY_USERNAME + " TEXT, " +
                KEY_FACULTY_PASSWORD + " TEXT " + ")";
        Log.d("queryFaculty", queryFaculty);



        String queryStudent="CREATE TABLE "+ STUDENT_INFO_TABLE +" (" +
                KEY_STUDENT_ID + " INTEGER, " +
                KEY_STUDENT_FIRSTNAME + " TEXT, " +
                KEY_STUDENT_LASTNAME + " TEXT, " +
                KEY_STUDENT_MO_NO + " TEXT, " +
                KEY_STUDENT_SECTION + " TEXT " + ")";

        Log.d("queryStudent", queryStudent );

        try
        {
            db.execSQL(queryFaculty);
            db.execSQL(queryStudent);
        }
        catch (Exception e) {
            e.printStackTrace();
            Log.e("Exception", e.getMessage());
        }







    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
        String queryFaculty="CREATE TABLE "+ FACULTY_INFO_TABLE +" (" +
                KEY_FACULTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                KEY_FACULTY_FIRSTNAME + " TEXT, " +
                KEY_FACULTY_LASTNAME + " TEXT, "+
                KEY_STUDENT_MO_NO + " TEXT, "+
                KEY_FACULTY_ADDRESS + " TEXT, "+
                KEY_FACULTY_USERNAME + " TEXT, " +
                KEY_FACULTY_PASSWORD + " TEXT " + ")";
        Log.d("queryFaculty", queryFaculty);

        String queryStudent="CREATE TABLE "+ STUDENT_INFO_TABLE + " (" +
                KEY_STUDENT_ID + " INTEGER, " +
                KEY_STUDENT_FIRSTNAME + " TEXT, " +
                KEY_STUDENT_LASTNAME + " TEXT, " +
                KEY_STUDENT_MO_NO + " TEXT, " +
                KEY_STUDENT_SECTION + " TEXT " + ")";
        Log.d("queryStudent", queryStudent);



        try
        {
            db.execSQL(queryFaculty);
            db.execSQL(queryStudent);
        }

        catch (Exception e) {
            e.printStackTrace();
            Log.e("Exception", e.getMessage());
        }
    }


    public void addFaculty(FacultyBean facultyBean) {

        SQLiteDatabase db = this.getWritableDatabase();

        String query = "INSERT INTO faculty_table (faculty_firstname,faculty_lastname,faculty_mobilenumber,faculty_address,faculty_username,faculty_password) values ('" +
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



}
