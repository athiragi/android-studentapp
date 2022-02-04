package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddexamActivity extends AppCompatActivity {
EditText x1,x2,x3,x4;
AppCompatButton o1,o2;
String getSemester,getExamname,getExamdate,getRemark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addexam);
        x1=(EditText) findViewById(R.id.sem);
        x2=(EditText) findViewById(R.id.exam);
        x3=(EditText) findViewById(R.id.date);
        x4=(EditText) findViewById(R.id.re);
        o1=(AppCompatButton)findViewById(R.id.subm);
        o2=(AppCompatButton)findViewById(R.id.to);
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(e);
            }
        });
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSemester=x1.getText().toString();
                getExamname=x2.getText().toString();
                getExamdate=x3.getText().toString();
                getRemark=x4.getText().toString();
                Toast.makeText(getApplicationContext(), getSemester, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getExamname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getExamdate, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getRemark, Toast.LENGTH_SHORT).show();
            }
        });
    }
}