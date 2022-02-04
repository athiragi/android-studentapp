package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6;
AppCompatButton bt1,bt2;
String getName,getRollno,getAdmissionno,getUser,getPass,getconfirmpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.rollno);
        e3=(EditText)findViewById(R.id.admno);
        e4=(EditText)findViewById(R.id.username);
        e5=(EditText)findViewById(R.id.pass);
        e6=(EditText)findViewById(R.id.confirm);
        bt1=(AppCompatButton)findViewById(R.id.reg);
        bt2=(AppCompatButton)findViewById(R.id.log);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(x);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                getRollno=e2.getText().toString();
                getAdmissionno=e3.getText().toString();
                getUser=e4.getText().toString();
                getPass=e5.getText().toString();
                getconfirmpass=e6.getText().toString();

                if(getPass.equals(getconfirmpass)) {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getRollno, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getAdmissionno, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getUser, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getconfirmpass, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Password and Confirmpassword doesn't match", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}