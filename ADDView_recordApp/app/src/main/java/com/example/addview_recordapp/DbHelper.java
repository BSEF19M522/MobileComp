package com.example.addview_recordapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;


public class DbHelper extends SQLiteOpenHelper {
    public static final String Contact_ID = "ContactID";
    public static final String Contact_NAME = "Name";
    public static final String Contact_Phn = "PhoneNumber";
    public static final String Contact_TABLE = "ContactTable";

    public DbHelper(@Nullable Context context) {
        super(context, "MyDB.db", null, 1);}
        @Override
        public void onCreate(SQLiteDatabase db) {
            String query = "CREATE TABLE " + Contact_TABLE + "(" + Contact_ID + " Integer PRIMARY KEY AUTOINCREMENT, " + Contact_NAME + " Text, " + Contact_Phn +"  Text ) ";
            db.execSQL(query);
        }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Contact_TABLE);
        onCreate(db);
    }



}
