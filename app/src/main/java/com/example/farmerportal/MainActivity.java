package com.example.farmerportal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String root = "1";
    String root_pass = "1";

    String root1 = "2";
    String root1_pass = "2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    public void log(View view){
        EditText phoneId = findViewById(R.id.editText);
        EditText passId = findViewById(R.id.editText2);
        String phoneid = phoneId.getText().toString();
        String pass_1 = passId.getText().toString();

        if(phoneid.equalsIgnoreCase(root) && pass_1.equals(root_pass) || phoneid.equalsIgnoreCase(root1) && pass_1.equals(root1_pass)){
            String cat = "seller";
            Class a;
            if(phoneid.equalsIgnoreCase("2")){
                a = BuyerActivity.class;
            }
            else{
                a = ComActivity.class;
            }
            Intent intent = new Intent(this, a);
            intent.putExtra("phoneid",phoneid);
            startActivity(intent);


        }
        else{
            AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
            b.setMessage("WRONG ID AND PASSWORD").setPositiveButton("OK",null).setCancelable(false);

            AlertDialog alert = b.create();
            alert.show();
        }


       // Toast.makeText(this,phone_pass,Toast.LENGTH_SHORT).show();

    }
    public void register(View view) {
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}
