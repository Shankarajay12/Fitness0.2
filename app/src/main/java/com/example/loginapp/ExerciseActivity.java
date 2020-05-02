package com.example.loginapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ExerciseActivity extends AppCompatActivity {
    private ImageView warmup;
    private ImageView powerUp;
    private ImageView Stretching;
    private ImageView delta;
    private ImageView alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        getSupportActionBar().setTitle("All Workout ");

        warmup= (ImageView) findViewById(R.id.warmupExercise);
        powerUp=(ImageView) findViewById(R.id.powerupExercise);
        Stretching=(ImageView) findViewById(R.id.stretchingExercise);
        delta=(ImageView) findViewById(R.id.deltaExercise);
        alpha=(ImageView) findViewById(R.id.alphaExercise);



        warmup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWarmupActivity();
            }
        });

        powerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpowerUpActivity();
            }
        });
        Stretching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStretchingActivity();
            }
        });
        delta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeltaActivity();
            }
        });
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalphaActivity();
            }
        });
    }
    public void  openWarmupActivity()
    {
        Intent intent=new Intent(this,WarmupExercise.class);
        startActivity(intent);
    }
    public void  openpowerUpActivity()
    {
        Intent intent=new Intent(this,PowerupExercise.class);
        startActivity(intent);
    }
    public void openStretchingActivity()
    {
        Intent intent=new Intent(this,StretchingExercise.class);
        startActivity(intent);
    }
    public void  opendeltaActivity()
    {
        Intent intent=new Intent(this,DeltaExercise.class);
        startActivity(intent);
    }
    public void openalphaActivity()
    {
        Intent intent= new Intent(this,AlphaExercise.class);
        startActivity(intent);
    }

}
