package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddcourseActivity extends AppCompatActivity {
EditText e1,e2,e3,e4;
AppCompatButton b1,b2;
String getCoursename,getDescription,getDuration,getRemarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourse);
        e1=(EditText) findViewById(R.id.coursename);
        e2=(EditText) findViewById(R.id.description);
        e3=(EditText) findViewById(R.id.duration);
        e4=(EditText) findViewById(R.id.remarks);
        b1=(AppCompatButton) findViewById(R.id.submit);
        b2=(AppCompatButton) findViewById(R.id.backto);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(a);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCoursename=e1.getText().toString();
                getDescription=e2.getText().toString();
                getDuration=e3.getText().toString();
                getRemarks=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getCoursename, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDescription, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDuration, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getRemarks, Toast.LENGTH_SHORT).show();
            }
        });
    }
}