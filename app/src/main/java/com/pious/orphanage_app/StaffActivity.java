package com.pious.orphanage_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StaffActivity extends AppCompatActivity {
    Button Login;
    EditText Ed_name,Ed_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        Login=findViewById(R.id.btn_stafflog);
        Ed_name=findViewById(R.id.ed_gname);
        Ed_pass=findViewById(R.id.ed_pass);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StaffActivity.this,AdminDashBoardActivity.class);
                startActivity(intent);

            }
        });
    }
}