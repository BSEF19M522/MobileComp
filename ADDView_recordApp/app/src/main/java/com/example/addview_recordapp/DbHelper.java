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

    public void  addcontact(contactss conT){
        SQLiteDatabase db = this.getWritableDatabase();
        //Hash map, as we did in bundles
        ContentValues cv = new ContentValues();

        cv.put(Contact_NAME, contactss.getName());
        cv.put(Contact_ID, contactss.getPhoneNumber());

        db.insert(Contact_TABLE, null, cv);
        db.close();

    }
    public ArrayList<contactss> getAllContacts() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + Contact_TABLE, null);

        ArrayList<contactss> contactArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {

                contactArrayList.add(new contactss(cursorCourses.getString(1), cursorCourses.getString(2)));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return contactArrayList;
    }



}
