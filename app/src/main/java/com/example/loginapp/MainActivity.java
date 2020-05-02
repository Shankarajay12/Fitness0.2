package com.example.loginapp;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText UPassword;
    private TextView Info;
    private Button Login;
    private TextView Freshuser;
    private  int Count=5;
    private TextView submit;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name =(EditText) findViewById(R.id.Username);
        UPassword=(EditText) findViewById(R.id.UPassword);
        Info =(TextView) findViewById(R.id.Info);
        Login=(Button) findViewById(R.id.Login);
        Freshuser=(TextView) findViewById(R.id.NewUser);
        Info.setText("No of attempts Remaining: 5");

        firebaseAuth =FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);
        FirebaseUser user =firebaseAuth.getCurrentUser();
        if(user!=null)
        {
            finish();
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
        }


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),UPassword.getText().toString());

            }
        });
        Freshuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUp.class));

            }
        });


    }
    private  void validate(final String username, final String userPassword)
    {  progressDialog.setMessage("Verifying");
    progressDialog.show();
     firebaseAuth.signInWithEmailAndPassword(username,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
         @Override
         public void onComplete(@NonNull Task<AuthResult> task) {
             if(task.isSuccessful())
             {   progressDialog.dismiss();
                 Toast.makeText(MainActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();

                 startActivity(new Intent(MainActivity.this,SecondActivity.class));
             }
             else if(username.isEmpty() && userPassword.isEmpty())
             {

                 Toast.makeText(MainActivity.this,"Please Enter all Detail First !",Toast.LENGTH_SHORT).show();

             }
             else {
                 Toast.makeText(MainActivity.this, "Login Fail !", Toast.LENGTH_SHORT).show();
                 Count--;
                 Info.setText("No of attempts Remaining: "+String.valueOf(Count));
                 progressDialog.dismiss();
                 if (Count == 0)
                     Login.setEnabled(false);
             }
         }
     });
    }
}
