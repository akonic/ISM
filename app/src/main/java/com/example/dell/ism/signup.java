package com.example.dell.ism;

import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class signup extends AppCompatActivity implements View.OnClickListener{
    EditText editTextEmail,editTextPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextPassword=findViewById(R.id.editTextPassword);
        mAuth = FirebaseAuth.getInstance();
        findViewById(R.id.buttonSignUp).setOnClickListener(this);

    }
    private void registerUser(){
        String email = editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();
        if(email.isEmpty()){
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Please enter a valid Email");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;}
            if (password.length()<6){
            editTextPassword.setError("Minimum length is 6");
            editTextPassword.requestFocus();
            return;
            }
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListner(new OnCompleteListener<AuthResult>()){
            @Override
                    public void onComplete(Task<AuthResult> task){
                if(task.issuccessful()){
                    Toast.makeText(getApplicationContext(),"User Registered Successfull",Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

    }

    @Override
    public void onClick(View v) {switch (v.getId()){
        case R.id.buttonSignUp;
            registerUser();
            break;
        case R.id.textView:
            startActivity(new Intent(this,login.class));
            break;

    }
}
