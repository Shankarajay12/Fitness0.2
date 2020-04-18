package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class APPpage extends AppCompatActivity {
    private Button login;
    private Button singin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apppage);
        login =(Button) findViewById(R.id.logIN);
        singin =(Button)findViewById(R.id.signIN);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(APPpage.this, MainActivity.class));


            }
        });
        singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(APPpage.this,SignUp.class));
            }
        });
    }
    }

