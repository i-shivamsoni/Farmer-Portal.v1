package com.example.farmerportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisteredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
    }

    public void mainScreen(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
