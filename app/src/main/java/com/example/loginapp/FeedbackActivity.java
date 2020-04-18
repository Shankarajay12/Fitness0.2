package com.example.loginapp;

import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;

public class FeedbackActivity extends AppCompatActivity {
    EditText namedata,emaildata,messagedata;
    Button send,detail;
    Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
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

                Toast.makeText(FeedbackActivity.this,"Your Data was Sended to server! ", Toast.LENGTH_SHORT).show();

                detail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        new AlertDialog.Builder(FeedbackActivity.this)
                                .setTitle("Sended Detail")
                                .setMessage("Name - "+ name+ "\n\n Email - "+ email+ "\n\nMessage - "+message)
                                .show();

                    }
                });
            }
        });
    }
}
