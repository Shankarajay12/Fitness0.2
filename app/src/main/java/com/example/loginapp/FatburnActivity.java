package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FatburnActivity extends AppCompatActivity {

    ImageView rockstar;
    ImageView frogSquats;
    ImageView Wallpushoff;
    ImageView SideLungeTouchdown;
    ImageView skierjump;
    ImageView Crossingjump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatburn);

        getSupportActionBar().setTitle("Fat Burn ");
        getSupportActionBar().setSubtitle("Repeat all the exercise 4 time");

        rockstar =(ImageView)findViewById(R.id.RockstarExercise);
        frogSquats=(ImageView)findViewById(R.id.frogExercise);
        Wallpushoff=(ImageView)findViewById(R.id.wallpushoffExercise);
        SideLungeTouchdown=(ImageView)findViewById(R.id.side_lungeExercise);
        skierjump=(ImageView)findViewById(R.id.skieJumpExercise);
        Crossingjump=(ImageView)findViewById(R.id.crossingExercise);

        rockstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRockstarActivity();
            }
        });
        frogSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFrogActivity();
            }
        });
        Wallpushoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWallpushActivity();
            }
        });
        SideLungeTouchdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSideTouchdownActivity();
            }
        });

        skierjump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSkieJumpActivity();
            }
        });

        Crossingjump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCrossingActivity();
            }
        });


    }

    public void  openRockstarActivity()
    {
        Intent intent=new Intent(this,Rockstar.class);
        startActivity(intent);
    }

    public void  openFrogActivity()
    {
        Intent intent=new Intent(this,Frog_Squats.class);
        startActivity(intent);
    }
    public void  openWallpushActivity()
    {
        Intent intent=new Intent(this,WallPushoff.class);
        startActivity(intent);
    }
    public void  openSideTouchdownActivity()
    {
        Intent intent=new Intent(this,SideLungeToucdwn.class);
        startActivity(intent);
    }
    public void  openSkieJumpActivity()
    {
        Intent intent=new Intent(this,SkierJump.class);
        startActivity(intent);
    }
    public void  openCrossingActivity()
    {
        Intent intent=new Intent(this,CrossingPunches.class);
        startActivity(intent);
    }
}
