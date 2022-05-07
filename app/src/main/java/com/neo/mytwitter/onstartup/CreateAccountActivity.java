package com.neo.mytwitter.onstartup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.neo.mytwitter.R;

public class CreateAccountActivity extends AppCompatActivity {

//    UI component
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

//        Assign component ID
        toolbar = findViewById(R.id.toolbar);

        setToolbarProperties();
    }

    private void setToolbarProperties() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}