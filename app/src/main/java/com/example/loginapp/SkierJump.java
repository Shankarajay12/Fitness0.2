package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class SkierJump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skier_jump);

        getSupportActionBar().setTitle("Skier-Jump");
        TextView txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("Start in a bent squat position.\n" +
                "1.Jump up out of the squat.\n" +
                "2.Only jump a small distance off the floor, before returning down into the squat position.\n" +
                "3.Do six jumps and then hold the squat for three seconds.\n" +
                "4.Do three sets of six, 18 jumps in total, and then rest for one minute.\n" +
                "5.Repeat the whole thing three or four times a week to feel a difference.\n");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());

    }
}
