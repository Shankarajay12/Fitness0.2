package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DeltaExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delta_exercise);

        getSupportActionBar().setTitle("Delta");
        getSupportActionBar().setSubtitle("Repat all the exercise in this section 4 times");
    }
}
