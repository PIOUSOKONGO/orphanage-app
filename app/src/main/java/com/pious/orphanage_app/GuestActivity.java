package com.pious.orphanage_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.sql.SQLData;

public class GuestActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button Next;
    RadioButton radioButton;
    EditText Name,Email,Address,Password,Reason;
    SQLiteDatabase db;
    public static final String EXTRA_TEXT="com.pious.orphanage_app.EXTRA_TEXT";
    public static final String EXTRA_TEXTONE="com.pious.orphanage_app.EXTRA_TEXTONE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);
        db=openOrCreateDatabase("My_Project", MODE_PRIVATE,null);

Name=findViewById(R.id.ed_gname);
Email=findViewById(R.id.ed_gemail);
Address=findViewById(R.id.ed_gaddress);
Password=findViewById(R.id.ed_password);
        Reason=findViewById(R.id.ed_reason);
        Reason.setEnabled(false);


        db.execSQL("CREATE TABLE IF NOT EXISTS ORPHANS(Name VARCHAR,Email VARCHAR,Address VARCHAR,Password VARCHAR,Reasons VARCHAR)");

        Next= (Button)findViewById(R.id.btn_register);
        radioGroup=findViewById(R.id.btn_rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String NAME,EMAIL,ADDRESS,PASSWORD,REASON;
                NAME=Name.getText().toString().trim();
                EMAIL=Email.getText().toString().trim();
                ADDRESS=Address.getText().toString().trim();
                PASSWORD=Password.getText().toString().trim();
                REASON=Reason.getText().toString().trim();
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);

                    Reason.setText( ""+radioButton.getText());




            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME,EMAIL,ADDRESS,PASSWORD,REASON;
                NAME=Name.getText().toString().trim();
                EMAIL=Email.getText().toString().trim();
                ADDRESS=Address.getText().toString().trim();
                PASSWORD=Password.getText().toString().trim();
                REASON=Reason.getText().toString().trim();


                if (NAME.isEmpty()){
                    Name.setError("please fill the name");
                }else if (EMAIL.isEmpty()){
                    Email.setError("please enter YOUR  EMAIL");
                }else if (ADDRESS.isEmpty()){
                    Address.setError("ENTER YOUR ADDRESS");
                } else if (PASSWORD.isEmpty()){
                    Password.setError("Enter your Password");
                    }
                     else if (REASON.isEmpty()){
                      Reason.setError("Enter your Password");
                }else {
                         db.execSQL("INSERT INTO ORPHANS VALUES('"+Name+"','"+Email+"','"+Address+"','"+Password+"','"+Reason+"')");
                    int radioId = radioGroup.getCheckedRadioButtonId();
                    radioButton = findViewById(radioId);

                    Reason.setText("" + radioButton.getText());

                    switch ("" + radioButton.getText()) {
                        case "Donate":
                            Intent intent = new Intent(GuestActivity.this, Items_DonateActivity.class);
                            intent.putExtra(EXTRA_TEXT,NAME);
                            intent.putExtra(EXTRA_TEXTONE,ADDRESS);
                            startActivity(intent);

                            break;
                        case "Visit":
                            Intent visit = new Intent(GuestActivity.this, VisitActivity.class);
                            startActivity(visit);
                            break;
                        case "Other Support":
                            Intent other = new Intent(GuestActivity.this, Other_supportActivity.class);

                            startActivity(other);
                            break;

                    }

                }


                }


              
        });
            }

}