package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
public class signup extends AppCompatActivity {


    private Button button;

    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button=(Button)findViewById(R.id.signupbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, admissionoffer.class);
                startActivity(intent);
            }
        });
    }
}