package com.example.farmerportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class BuyerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    public void prof(View view){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }
    public void about(View view){
        Intent intent = new Intent(this,AboutusActivity.class);
        startActivity(intent);
    }

    public void out(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void buyprd(View view){
        Intent intent = new Intent(this,BuyProductActivity.class);
        startActivity(intent);
    }
    public void contact(View view){
        Intent i = new Intent(this,ContactUsActivity.class);
        startActivity(i);
    }
}
