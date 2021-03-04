package com.pious.orphanage_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.animation.ObjectAnimator;

import java.lang.annotation.Repeatable;

public class MainActivity extends AppCompatActivity {

    TextView tv;
   // RadioButton Guset, Staff;
    Button Staff, Guest;
   Animation move_anim;
   Float mContent_container;
    //private Object Repeatable;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Guest=findViewById(R.id.btn_guest);
        Staff=findViewById(R.id.btn_staff);
        tv = (TextView) this.findViewById(R.id.tv_welcome);

        // animation.

        move_anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        //tv=findViewById(R.id.tv_welcome);
       tv.setEllipsize(TextUtils.TruncateAt.MARQUEE);
     tv.startAnimation(move_anim);


       //Object Repeatable=new Object();
       //Repeatable.equals(tv);

        //tv.setSelected(true);
        //tv.setSelected(true);  // Set focus to the textview

        Guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GuestActivity.class);
               startActivity(intent);
           }
        });

        Staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StaffActivity.class);
                startActivity(intent);
           }
       });


    }
}