package com.example.farmerportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void log(View view){
        Toast.makeText(this,"You have been succesfully resgistered",Toast.LENGTH_SHORT).show();
        boolean registered = true;
        if(registered){
            Intent intent = new Intent(this,RegisteredActivity.class);
            startActivity(intent);
        }
    }
}
