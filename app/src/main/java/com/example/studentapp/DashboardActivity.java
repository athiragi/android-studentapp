package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton btn1,btn2,btn3,btn4,btn5;
SharedPreferences mydoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mydoc=getSharedPreferences("login",MODE_PRIVATE);
        btn1=(AppCompatButton) findViewById(R.id.add);
        btn2=(AppCompatButton) findViewById(R.id.faculty);
        btn3=(AppCompatButton) findViewById(R.id.exam);
        btn4=(AppCompatButton)findViewById(R.id.web);
        btn5=(AppCompatButton)findViewById(R.id.logout);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit=mydoc.edit();
                edit.clear();
                edit.commit();
                Toast.makeText(getApplicationContext(), "Logout successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(getApplicationContext(),ViewwebActivity.class);
                startActivity(g);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(getApplicationContext(),AddfacultyActivity.class);
                startActivity(d);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(getApplicationContext(),AddcourseActivity.class);
                startActivity(b);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(getApplicationContext(),AddexamActivity.class);
                startActivity(f);
            }
        });

    }
}