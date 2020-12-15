package com.ruholkabir.fall20.cse299.sec03.group01.db;

import android.database.sqlite.SQLiteOpenHelper;

public class DBAdapter extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Marksheet";
    private static final String FACULTY_INFO_TABLE = "faculty_table";
    private static final String STUDENT_INFO_TABLE = "student_table";

    private static final String KEY_FACULTY_ID = "faculty_id";
    private static final String KEY_FACULTY_FIRSTNAME = "faculty_firstname";
    private static final String KEY_FACULTY_LASTNAME = "faculty_lastname";
    private static final String KEY_FACULTY_MO_NO = "faculty_mobilenumber";
    private static final String KEY_ADDRESS = "faculty_address";
    private static final String KEY_USERNAME = "faculty_username";
    private static final String KEY_PASSWORD = "faculty_password";

    private static final String KEY_STUDENT_ID = "student_id";
    private static final String KEY_STUDENT_FIRSTNAME = "student_firstname";
    private static final String KEY_STUDENT_LASTNAME = "student_lastname";
    private static final String KEY_STUDENT_MO_NO = "student_mobilenumber";
    private static final String KEY_STUDENT_SECTION = "student_section";






}
