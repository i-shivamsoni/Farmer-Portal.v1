package com.example.farmerportal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class LangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    public void com(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder b = new AlertDialog.Builder(LangActivity.this);
        b.setMessage("ARE YOU SURE YOU WANT TO EXIT?").setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LangActivity.super.onBackPressed();
            }
        }).setNegativeButton("Cancel",null).setCancelable(false);

        AlertDialog alert = b.create();
        alert.show();
    }
}
