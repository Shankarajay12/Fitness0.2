package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class SideLungeToucdwn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_lunge_toucdwn);

        getSupportActionBar().setTitle("Side-Lunge Touchdown");

        TextView txtDetails = (TextView) findViewById(R.id.txtDetails);
        txtDetails.setText("How to Do a Side Lunge (or Lateral Lunge)\n" +
                "A. Stand with feet together and hands clasped in front of chest.\n" +
                "\n" +
                "B. Take a large step out to the right, immediately lowering into a lunge, sinking hips back and bending right knee to track directly in line with right foot. Keep left leg straight but not locked, with both feet pointing forward.\n" +
                "\n" +
                "C. Push off the right foot to straighten right leg, step right foot next to left, and return to starting position.\n" +
                "\n" +
                "Do 8 to 12 reps. Repeat on the other side. Try 3 sets per side." +
                "\n\n" +
                "Side Lunge Form Tips\n" +
                "Sink into the hip of the lunging leg, activating the glute to stand.\n" +
                "Be sure not to drop the chest too far forward.\n" +
                "Don't allow the knee to push forward over toes.");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
    }
}
