package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class WallPushoff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_pushoff);

        getSupportActionBar().setTitle("Wall-Push Offs");

        TextView txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("How to do it\n" +
                "1.stand in front of a bare wall and lift your arms up to shoulder level.\n" +
                "\n" +
                "2.Place your hands on the wall a little bit wider than your shoulders with your fingers pointed up towards the ceiling.\n" +
                "\n" +
                "3.Back your feet away from the wall so that your elbows are bent as you are leaning against the wall.\n" +
                "\n" +
                "=>Do not arch the back as this could place unnecessary pressure on the lower spine.\n" +
                "\n" +
                "4.inhale as you start the exercise and as you push-off the wall exhale until your arms are out straight then inhale as you bent back towards the wall.\n" +
                "\n" +
                "5. repeat the exercise 10 times and as you feel that you are getting better add a few more to improve your strength." +
                "\n What muscles does it work\n" +
                "wall push ups work your standard muscle groups like your triceps, pecs, and the anterior deltoids that help you with the movement of your shoulder. It also engages your core muscles like abs,back and hips to keep you stable when you are exercising." +
                "\n When you put this altogether these muscles help you with your functional movement like pushing, shoving and throwing.");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
    }
}
