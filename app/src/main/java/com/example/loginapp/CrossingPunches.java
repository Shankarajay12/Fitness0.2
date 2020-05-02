package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class CrossingPunches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossing_punches);

        getSupportActionBar().setTitle("CrossingPunches");

        TextView txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("Stand with feet shoulder-width apart, a dumbbell in each hand, elbows softly bent, and arms in front of you. Punch out in front of you with your left fist, using the length of your arm muscles to control the movement. Return to start and punch with your right fist. Continue alternating sides for 20 reps. \n" +
                "For more leverage and core focus, allow your feet to pivot as you punch, rotating your body slightly to each side." +
                "\n Quick change: Instead of punching straight out, pivot on your feet and rotate to alternating sides as you punch to work more of your core in addition to your arms.");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
    }
}
