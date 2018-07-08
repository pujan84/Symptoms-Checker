package com.schecker.project.symptomschecker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 28/02/2017.
 */

public class DBHandler extends SQLiteOpenHelper{

    private static String database_name = "medical.db";
    private static String table_name = "medical";
    private static String coloumn_diseases = "diseases";
    private static String coloumn_symptoms = "symptoms";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, database_name, factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " +
                table_name + "(" + coloumn_diseases + " TEXT," + coloumn_symptoms + " TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists "+table_name);
        onCreate(db);
    }

    public void addMedical(Medical m)
    {
        if(m.diseases!=null || m.symptoms!=null)
        {
            ContentValues value = new ContentValues();
            value.put(coloumn_diseases,m.diseases);
            value.put(coloumn_symptoms,m.symptoms);
            SQLiteDatabase db = getWritableDatabase();
            db.insert(table_name,null,value);
            db.close();
        }
    }

    public String[] checkMedical(String[] select,int i)
    {
        String s="";
        String[] d = new String[20];
        int ct=0;
        String d1="";
        String df="";
        String[] a = new String[4];
        int k=0,kt=0,isnull=1;
        int j,count=0,dbp;
        SQLiteDatabase db = getWritableDatabase();
        String query = "select * from " + table_name;
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();
        try
        {
            for(dbp=0;dbp<20;dbp++)
            {
                if(c.getString(c.getColumnIndex(coloumn_diseases))!=null)
                {
                    s = c.getString(c.getColumnIndex(coloumn_symptoms));
                    loop:for(j=0;j<i;j++)
                    {
                        if(s.indexOf(select[j])!=-1)
                        {
                            count++;
                        }
                        if(count>=3 && count<5)
                        {
                            d[ct]= c.getString(c.getColumnIndex(coloumn_diseases));
                            isnull=0;
                            kt++;
                            ct++;
                        }
                        if(count>=5)
                        {
                            d1 += c.getString(c.getColumnIndex(coloumn_diseases));
                            isnull=0;
                            k++;
                            d1+=",";
                            break loop;
                        }
                    }
                }
                count=0;
                c.moveToNext();
            }
        }
        catch (Exception e)
        {}
        db.close();
        int kt1=0;
        for(int m=0;m<kt;m++)
        {
            if(!d1.contains(d[m]) && !df.contains(d[m]))
            {
                df=df+d[m]+",";
                kt1++;
            }
        }
        a[0]=df;
        a[1]=String.valueOf(kt1);
        a[2]=d1;
        a[3]=String.valueOf(k);
        return a;
    }
}
