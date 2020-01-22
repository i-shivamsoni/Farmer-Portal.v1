package com.example.farmerportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ComActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        t = (TextView)findViewById(R.id.textView18);

        Intent i = getIntent();
        String uname = i.getStringExtra("phoneid");

        t.setText("WELCOME "+uname);
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

    public void addprd(View view){
        Intent intent = new Intent(this,ProductActivity.class);
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

}
