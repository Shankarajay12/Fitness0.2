package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Frog_Squats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frog__squats);

        getSupportActionBar().setTitle("Frog-Squats");

        TextView txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("Starting Position\n" +
                "1.the legs are a bit wider than shoulder width opened\n" +
                "2.turn the feet out to 20-30 degrees\n" +
                "3.go into the squat position, make sure that the knees do not protrude the toes to prevent injuries (the knees are rectangular)\n" +
                "4.tilt the upper body forward simultaneously, so that the elbows touch the inner sides of your knees, bring the hands together in front of your chest\n" +
                "\nCorrect Execution\n" +
                "1.stretch out the legs almost completely\n" +
                "2.the elbows stick to the knees\n" +
                "3.the upper body is coming down until it is nearly parallel to the floor\n" +
                "4.your head follows the motion and always remains in extension to the spine\n" +
                "5.the body weight is on the heels, not on the toes\n" +
                "6.bend the knees, your upper body comes up again\n" +
                "7.if you hold the bent position for a bit, the exercise becomes more effective\n" +
                "8.repeat this several times\n");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
    }
}
