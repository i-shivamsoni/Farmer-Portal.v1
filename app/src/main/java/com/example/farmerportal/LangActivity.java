package com.example.farmerportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LangActivity extends AppCompatActivity {
    Locale myLocale;
    Spinner spinner;
    String currentLanguage = "en", currentLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang);

        currentLanguage = getIntent().getStringExtra(currentLang);
        spinner = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<>();

        list.add("Select Language(अपनी भाषा चुने)");
        list.add("English");
        list.add("Hindi(हिन्दी)");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

    {
        @Override
        public void onItemSelected (AdapterView< ? > adapterView, View view, int position, long l){
        switch (position) {
            case 0:
                break;
            case 1:
                setLocale("en");
                break;
            case 2:
                setLocale("hi");
                break;
        }
    }
        @Override
        public void onNothingSelected (AdapterView < ? > adapterView){
    }
    });
}

    private void setLocale(String localName) {
        if (!localName.equals(currentLanguage)) {
            myLocale = new Locale(localName);
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.locale = myLocale;
            res.updateConfiguration(conf, dm);
            Intent refresh = new Intent(this, LangActivity.class);
            refresh.putExtra(currentLang, localName);
            startActivity(refresh);
        } else {
            Toast.makeText(LangActivity.this, "Language already selected!", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }

    public void com(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
