package com.neo.mytwitter.onstartup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.neo.mytwitter.MainActivity;
import com.neo.mytwitter.R;

public class LogInActivity extends AppCompatActivity {

//    UI component
    private Toolbar toolbar;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

//        Assign component ID
        toolbar = findViewById(R.id.toolbar);
        btnConfirm = findViewById(R.id.btnConfirm);

//        Set action listener
        btnConfirm.setOnClickListener(view -> {
            startActivity(new Intent(LogInActivity.this, MainActivity.class));
        });

        setToolbarProperties();
    }

    private void setToolbarProperties() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}