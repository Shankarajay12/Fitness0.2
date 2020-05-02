package com.example.loginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class FittipActivity extends AppCompatActivity {
    EditText namedata,emaildata,messagedata;
    Button send,detail;
    Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fittip);
        namedata=findViewById(R.id.namedata);
        emaildata=findViewById(R.id.emaildata);
        messagedata=findViewById(R.id.messagedata);


        send=findViewById(R.id.button_send);
        detail=findViewById(R.id.button_detail);
        Firebase.setAndroidContext(this);

        String UniqueID =
                Settings.Secure.getString(getApplicationContext().
                        getContentResolver(), Settings.Secure.ANDROID_ID);

        firebase=new Firebase("https://loginapp-ac5ed.firebaseio.com/Users "+UniqueID);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detail.setEnabled(true);
                final String name=namedata.getText().toString();
                final String email=emaildata.getText().toString();
                final String message=messagedata.getText().toString();

                Firebase child_name=firebase.child("Name");
                child_name.setValue(name);
                if(name.isEmpty())
                {
                    namedata.setError("This is a required field!");
                    send.setEnabled(false);
                }
                else
                {
                    namedata.setError(null);
                    send.setEnabled(true);
                }

                Firebase child_email=firebase.child("Email");
                child_email.setValue(email);
                if(email.isEmpty())
                {
                    emaildata.setError("This is a required field!");
                    send.setEnabled(false);
                }
                else
                {
                    emaildata.setError(null);
                    send.setEnabled(true);
                }
                Firebase child_message=firebase.child("Message");
                child_message.setValue(message);
                if(message.isEmpty())
                {
                    messagedata.setError("This is a required field!");
                    send.setEnabled(false);
                }
                else
                {
                    messagedata.setError(null);
                    send.setEnabled(true);
                }

                Toast.makeText(FittipActivity.this,"Your Data was Sended to server! ", Toast.LENGTH_SHORT).show();

                detail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        new AlertDialog.Builder(FittipActivity.this)
                                .setTitle("Reply")
                                .setMessage("You will get your query related answer via email from our Experts" +
                                        " Thank's for asking.")
                                .show();

                    }
                });
            }
        });

        getSupportActionBar().setTitle("Query asking + Fittips and balance diet plan ");
        getSupportActionBar().setSubtitle("your asked queries here will we answered by our expert via email");


    }


    public void regulardiet(View view) {
        openUrl1 ("https://www.verywellfit.com/an-example-of-a-healthy-balanced-meal-plan-2506647");
    }

    public void openUrl1(String url)
    {
        Uri uri= Uri.parse(url);
        Intent  launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void weightlossdiet(View view) {
        openUrl2("https://www.healthline.com/nutrition/indian-diet-weight-loss");
    }
    public void openUrl2(String url)
    {
        Uri uri= Uri.parse(url);
        Intent  launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void weightgaindiet(View view) {
        openUrl3("https://www.health24.com/Diet-and-nutrition/Healthy-diets/Weight-gain-eating-plan-20120721");
    }
    public void openUrl3(String url)
    {
        Uri uri= Uri.parse(url);
        Intent  launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void muscelgaindiet(View view) {
        openUrl4("https://8fit.com/fitness/meal-plan-muscle-gain-much-protein-really-need/");
    }
    public void openUrl4(String url)
    {
        Uri uri= Uri.parse(url);
        Intent  launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void immunitydiet(View view) {
        openUrl5("https://www.healthline.com/health/food-nutrition/foods-that-boost-the-immune-system#turmeric");
    }
    public void openUrl5(String url)
    {
        Uri uri= Uri.parse(url);
        Intent  launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }

    public void tallerdiet(View view) {
        openUrl6("https://www.healthline.com/nutrition/foods-that-make-you-taller");
    }
    public void openUrl6(String url)
    {
        Uri uri= Uri.parse(url);
        Intent  launchWeb=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(launchWeb);
    }
}

