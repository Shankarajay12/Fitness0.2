package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PowerupExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powerup_exercise);

        getSupportActionBar().setTitle("Power Up");
        getSupportActionBar().setSubtitle("this exercise have to be repeated 4 time");
        getSupportActionBar().isHideOnContentScrollEnabled();
    }
}
