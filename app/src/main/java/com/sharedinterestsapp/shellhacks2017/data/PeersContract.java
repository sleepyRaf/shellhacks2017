package com.sharedinterestsapp.shellhacks2017.data;

import android.provider.BaseColumns;

import org.json.JSONArray;

import java.sql.Blob;

/**
 * Created by Raf on 10/1/2017.
 */

public class PeersContract {
    /** constant for table name */
    public final static String TABLE_NAME = "users";

    /** constants for column names */
    public final static String _ID = BaseColumns._ID;
    public final static String COLUMN_EMAIL = "email";
    public final static String COLUMN_USERNAME = "username";
    public final static String COLUMN_PASSWORD = "password";
    public final static String COLUMN_STATUS = "status";
    public final static String COLUMN_INTERESTS = "interests";
    //public final static Blob COLUMN_IMAGE;

    /** statement for creating table */
    public final static String CREATE_STATEMENT = "CREATE TABLE " + TABLE_NAME
            + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_EMAIL + " TEXT NOT NULL , "
            + COLUMN_USERNAME + " TEXT NOT NULL, "
            + COLUMN_PASSWORD + " TEXT NOT NULL, "
            + COLUMN_STATUS + " TEXT NOT NULL" + ");";





}
