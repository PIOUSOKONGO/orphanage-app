package com.pious.orphanage_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DonationActivity extends AppCompatActivity {
    ListView list_People;
    SQLiteDatabase   db;
    ArrayList<String> arrayList;
    CustomAddapter addapter;
    DatabaseHelper databaseHelper;
    Context context;
    UserDBHelper userDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        list_People=findViewById(R.id.list_details);


       databaseHelper = new DatabaseHelper(this);
      //  LoadDataInListView ();

       ArrayList<String> theList=new ArrayList<>();
       Cursor data= (Cursor) databaseHelper.getListConetents();
        if (data.getCount()==0){
            Toast.makeText(DonationActivity.this, "you must enter your name", Toast.LENGTH_LONG).show();

        }else
        {
            while (data.moveToNext()){
               theList.add(data.getString(1));
                theList.add(data.getString(2));
                theList.add(data.getString(3));
                theList.add(data.getString(4));
                theList.add(data.getString(5));
                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,theList);
                list_People.setAdapter(listAdapter);

            }
        }

        // people=new ArrayList<>();

       // addapter=new CustomAddapter(this,people);

       // Person p1=new Person("pious","pious@gmail","munuki juba","Donate",R.mipmap.visitor);
      //  Person p2=new Person("pious","pious@gmail","munuki juba","Counseling",R.mipmap.visitor);
       // Person p3=new Person("pious","pious@gmail","munuki juba","Visiting",R.mipmap.visitor);
       // Person p4=new Person("pious","pious@gmail","munuki juba","Training",R.mipmap.visitor);
       // Person p5=new Person("pious","pious@gmail","munuki juba","Donate",R.mipmap.visitor);
       // Person p6=new Person("pious","pious@gmail","munuki juba","Donate",R.mipmap.visitor);
       // Person p7=new Person("pious","pious@gmail","munuki juba","Training",R.mipmap.visitor);
        //Person p8=new Person("pious","pious@gmail","munuki juba","privite",R.mipmap.visitor);
        //Person p9=new Person("pious","pious@gmail","munuki juba","Donate",R.mipmap.visitor);
        //Person p10=new Person("pious","pious@gmail","munuki juba","Donate",R.mipmap.visitor);

  // people.add(p1);
       // people.add(p2);
        //people.add(p3);
        //people.add(p4);
        //people.add(p5);
       // people.add(p6);
       // people.add(p7);
        //people.add(p8);
        //people.add(p9);
       // people.add(p10);

       // list_People.setAdapter(addapter);

    }

   // private void LoadDataInListView() {
    //    arrayList=databaseHelper.getAllData();
     //   userDBHelper=new UserDBHelper(this,arrayList);
     //   list_People.setAdapter(addapter);
//userDBHelper.notifyDataSetChanged();
   // }
}