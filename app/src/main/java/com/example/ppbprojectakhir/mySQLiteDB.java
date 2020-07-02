package com.example.ppbprojectakhir;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class mySQLiteDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "Gamess.db";
    private static final String DB_TABLE = "Users_Table";

    private static final String ID = "ID";
    private static final String QUESTION = "QUESTION";
    private static final String QUESTION1 = "QUESTION1";
    private static final String JAWAB = "JAWAB";
    private static final String JAWAB1 = "JAWAB1";

    private static final String CREATE_TABLE = "CREATE TABLE "+ DB_TABLE+" ("+
            ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            QUESTION + " TEXT, " + QUESTION1 + " TEXT, " + JAWAB + " TEXT, " + JAWAB1 + " TEXT " + ")";

    public mySQLiteDB(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //sqLiteDatabase = sqlLiteDB.getWritableDatabase();
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ DB_TABLE);

        onCreate(db);
    }

    public boolean insertData(String question, String question1, String jawab, int jawab1){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(QUESTION, String.valueOf(question));
        contentValues.put(QUESTION1, String.valueOf(question1));
        contentValues.put(JAWAB, String.valueOf(jawab));
        contentValues.put(JAWAB1, String.valueOf(jawab1));

        long result = db.insert(DB_TABLE, null, contentValues);

        return result != -1;
    }

    public Cursor viewData(String a){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "Select * from " + DB_TABLE + " WHERE " + ID + "=" + a;
        Cursor cursor = db.rawQuery(query, null);

        return cursor;
    }

}
