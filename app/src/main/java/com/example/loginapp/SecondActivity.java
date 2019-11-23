package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {
    private Button logout;
    private FirebaseAuth firebaseAuth;
    private Button ibm;
    private Button RATEIT;
    private Button FEEDBACK;
    private Button FATBURN;
    private Button EXERCISE;
    private Button FITTIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ibm=(Button)findViewById(R.id.IBM);
        RATEIT=(Button)findViewById(R.id.RateUs);
        FEEDBACK=(Button)findViewById(R.id.Feedback);
        FATBURN=(Button)findViewById(R.id.Fatburn);
        EXERCISE=(Button)findViewById(R.id.Exercise);
        FITTIP=(Button)findViewById(R.id.FitTip);


        ibm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"Ibm seclected",Toast.LENGTH_SHORT).show();

            }
        });
        FITTIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this," FIT tip  seclected",Toast.LENGTH_SHORT).show();

            }
        });
        EXERCISE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"Exercise seclected",Toast.LENGTH_SHORT).show();

            }
        });
        FATBURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"Fatburn seclected",Toast.LENGTH_SHORT).show();

            }
        });
        FEEDBACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"Feedback seclected",Toast.LENGTH_SHORT).show();

            }
        });
        RATEIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"Rate us seclected",Toast.LENGTH_SHORT).show();

            }
        });

        firebaseAuth =FirebaseAuth.getInstance();
        logout=(Button)findViewById(R.id.Logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logout();
            }
        });
    }
    private void Logout()
    {firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this,MainActivity.class));}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case  R.id.LogoutMenu:{
                Logout();

            }
        }
        return super.onOptionsItemSelected(item);
    }
}
