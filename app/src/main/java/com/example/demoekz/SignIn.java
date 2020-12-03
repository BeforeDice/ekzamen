package com.example.demoekz;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }
    public void onClickSignUp(View v){
        Intent intent = new Intent(SignIn.this, SignUp.class);
        startActivity(intent);
    }
}
