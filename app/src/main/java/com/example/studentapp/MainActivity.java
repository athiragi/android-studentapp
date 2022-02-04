package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
SharedPreferences mypreference;
String getUsername,getPassword,share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreference=getSharedPreferences("login",MODE_PRIVATE);
        share=mypreference.getString("username","");
        if(share==null || !share.isEmpty())
        {
            Intent a=new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(a);
        }

        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pwd);
    b1=(AppCompatButton)findViewById(R.id.loginbtn);
    b2=(AppCompatButton)findViewById(R.id.registerbtn);
    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
            startActivity(i);

        }
    });
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        getUsername=ed1.getText().toString();
        getPassword=ed2.getText().toString();


        if(getUsername.equals("admin") && getPassword.equals("1234"))
           {
               SharedPreferences.Editor myedit=mypreference.edit();
               myedit.putString("username","admin");
               myedit.commit();
               Intent j=new Intent(getApplicationContext(),DashboardActivity.class);
               startActivity(j);
           }
           else
           {
               Toast.makeText(getApplicationContext(), "Invalid username and password", Toast.LENGTH_SHORT).show();


           }
        }
    });
    }
}