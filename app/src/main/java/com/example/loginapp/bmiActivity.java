package com.example.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmiActivity extends AppCompatActivity {
    EditText weight, height;
    TextView resulttext;
    String calculation, BMIresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resulttext = findViewById(R.id.result);

    }

    public void calculateBMI(View view) {
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();
        float weightValue = Float.parseFloat(S1);
        float heightVlaue = Float.parseFloat(S2) / 100;
        float bmi= weightValue/(heightVlaue*heightVlaue);

        if (bmi<16)
        {
            BMIresult="Severely Under Weight";
        }
        else if(bmi<18.5)
        {
            BMIresult="Under Weight";
        }
        else if(bmi >=18.5 && bmi <=24.9)
        {
            BMIresult="Normal Weight";
        }
        else if(bmi>=25 && bmi <=29.9)
        {
            BMIresult="Over Weight";
        }
        else
        {
            BMIresult="Obese";
        }
        calculation ="Result: \n\n"+ bmi + "\n"+ BMIresult;

        resulttext.setText(calculation);

    }
}
