package com.pious.orphanage_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Items_DonateActivity extends AppCompatActivity {
Button Save;
TextView Guest_Name,Guest_Address;
EditText ItemONE,ItemTWO,ItemTHREE,GName,GAddress;
DatabaseHelper databaseHelper;

    SQLiteDatabase db;
    public static final String EXTRA_TEXT="com.pious.orphanage_app.EXTRA_TEXT";
    public static final String EXTRA_TEXTONE="com.pious.orphanage_app.EXTRA_TEXTONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items__donate);
        Save = findViewById(R.id.btn_sitem);
        GName = findViewById(R.id.ed_gname);
        GAddress = findViewById(R.id.ed_gaddress);
        ItemONE = findViewById(R.id.ed_ditems);
        ItemTWO = findViewById(R.id.ed_ditemone);
        ItemTHREE = findViewById(R.id.ed_ditemtwo);

        GName.setEnabled(false);
        GAddress.setEnabled(false);

        databaseHelper = new DatabaseHelper(this);
        db = openOrCreateDatabase("My_Project", MODE_PRIVATE, null);

        Intent intent=getIntent();
        String text=intent.getStringExtra(GuestActivity.EXTRA_TEXT);
        String text2=intent.getStringExtra(GuestActivity.EXTRA_TEXTONE);

GName.setText(text);
GAddress.setText(text2);
      Save.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


              String Gname=GName.getText().toString();
              String Gaddress=GAddress.getText().toString();
              String ITEMO=ItemONE.getText().toString();
              String ITEMT=ItemTWO.getText().toString();
              String ITEMTH=ItemTHREE.getText().toString();

              if (Gname.length() !=0 && ITEMO.length() !=0 && Gaddress.length() !=0 && ITEMT.length() !=0 && ITEMTH.length() !=0){
                  AddData(Gname,Gaddress,ITEMO,ITEMT,ITEMTH);
                  GName.setText("");
                  GAddress.setText("");
                  ItemONE.setText("");
                  ItemTWO.setText("");
                  ItemTHREE.setText("");


              }else {
                  Toast.makeText(Items_DonateActivity.this,"something is missing",Toast.LENGTH_LONG).show();
              }
          }

          private void AddData(String gname, String gaddress, String itemo, String itemt, String itemth) {
              boolean insertData=databaseHelper.AddData(gname,gaddress,itemo,itemt,itemth);
              if (insertData==true){
                  Toast.makeText(Items_DonateActivity.this,"Sucess",Toast.LENGTH_LONG).show();
                  Intent move=new Intent(Items_DonateActivity.this,MainActivity.class);
                  startActivity(move);
              }else {
                  Toast.makeText(Items_DonateActivity.this,"something is missing",Toast.LENGTH_LONG).show();
              }

          }
      });


    }
}