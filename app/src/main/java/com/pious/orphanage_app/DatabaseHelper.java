package com.pious.orphanage_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MY_Project.db";
    public static final String TABLE_NAME = "ITEMS_DONATE";
    public static final String COL1 = "ID";
    public static final String COL2 = "Guest_Name";
    public static final String COL3 = "Guest_Address";
    public static final String COL4 = "ItemONE";
    public static final String COL5 = "ItemTWO";
    public static final String COL6 = "ItemTHREE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " + " Guest_Name Varchar,   Guest_Address VARCHAR,   ItemONE VARCHAR, ItemTWO VARCHAR,  ItemTHREE VARCHAR)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVerson, int newVerson) {
        db.execSQL("DROP TABLE IF EXISTS ITEMS_DONAATE");
        onCreate(db);

    }

    public boolean AddData(String gname, String gaddress, String itemo, String itemt, String itemth) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, gname);
        contentValues.put(COL3, gaddress);
        contentValues.put(COL4, itemo);
        contentValues.put(COL5, itemt);
        contentValues.put(COL6, itemth);
        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }

       // public void Cursor getListContents(){

          //  SQLiteDatabase db=this.getWritableDatabase();
           // Cursor data=db.rawQuery("SELECT * FROM" +TABLE_NAME,null);
           // return data;
    }


    public Cursor getListConetents(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor data=db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return data;
    }


}




