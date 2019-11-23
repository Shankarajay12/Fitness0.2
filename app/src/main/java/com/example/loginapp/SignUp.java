package com.example.loginapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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

public class SignUp extends AppCompatActivity {
    private EditText username,upassword,usermail;
    private Button Submit;
    private TextView alreadysign;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setupUIview();
        firebaseAuth =FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate())
                { progressDialog.setMessage(" Registring" +
                        "Wait ");
                progressDialog.show();
                    String User_email=usermail.getText().toString().trim();
                    String User_password=upassword.getText().toString().trim();
                    firebaseAuth.createUserWithEmailAndPassword(User_email,User_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete( Task<AuthResult> task) {
                            if(task.isSuccessful())
                            { progressDialog.dismiss();
                                Toast.makeText(SignUp.this,"Registration Success !",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUp.this,MainActivity.class));
                                
                            }
                            else
                                Toast.makeText(SignUp.this,"Registration Fail !",Toast.LENGTH_SHORT).show();

                        }
                    });

                }
            }
        });
        alreadysign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(SignUp.this,MainActivity.class ));


            }
        });
    }

    private void setupUIview()
    {
        username=(EditText)findViewById(R.id.Susername);
        upassword=(EditText)findViewById(R.id.Spassword);
        usermail=(EditText)findViewById(R.id.Usermail);
        Submit=(Button)findViewById(R.id.Submittbutton);
        alreadysign=(TextView)findViewById(R.id.Alreadysign);


    }
    private Boolean validate()
    { Boolean result =false;
      String name=username.getText().toString();
      String password=upassword.getText().toString();
      String emial=usermail.getText().toString();
      if(name.isEmpty() && password.isEmpty() && emial.isEmpty())
      {

          Toast.makeText(this,"Please Enter all Detail First !",Toast.LENGTH_SHORT).show();

      }
        else
      {
          result=true;
      }
      return  result;
    }
}
