package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Rockstar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rockstar);

        getSupportActionBar().setTitle("Rockstar");

        TextView txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("How To Do: Rock Star Jumps \n (a) Stand with your knees just wider than hip-width apart and ever so slightly bent.\n" +
                "\n" +
                "(b) Jump, flicking your heels back (so you kick yourself in the bum) and land with soft knees, keeping your upper body controlled.");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
    }
}
