package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddfacultyActivity extends AppCompatActivity {
EditText t1,t2,t3,t4;
AppCompatButton u1,u2;
String getFacultyname,getDepartment,getDesignation,getMobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfaculty);
        t1=(EditText) findViewById(R.id.facname);
        t2=(EditText) findViewById(R.id.dep);
        t3=(EditText) findViewById(R.id.des);
        t4=(EditText) findViewById(R.id.mbno);
        u1=(AppCompatButton) findViewById(R.id.sub);
        u2=(AppCompatButton) findViewById(R.id.dashboard);
        u2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(c);
            }
        });
        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFacultyname=t1.getText().toString();
                getDepartment=t2.getText().toString();
                getDesignation=t3.getText().toString();
                getMobile=t4.getText().toString();
                Toast.makeText(getApplicationContext(), getFacultyname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDepartment, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDesignation, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getMobile, Toast.LENGTH_SHORT).show();
            }
        });


    }
}