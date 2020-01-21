package com.example.farmerportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        t = (TextView)findViewById(R.id.textView18);

        Intent i = getIntent();
        String uname = i.getStringExtra("phoneid");

        t.setText("WELCOME "+uname);
    }

    public void prof(View view){

    }

    public void addprd(View view){
        Intent intent = new Intent(this,ProductActivity.class);
        startActivity(intent);
    }

    public void about(View view){
        Intent intent = new Intent(this,AboutusActivity.class);
        startActivity(intent);
    }
}
