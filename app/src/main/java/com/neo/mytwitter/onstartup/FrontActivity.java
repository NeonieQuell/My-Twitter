package com.neo.mytwitter.onstartup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;

import com.neo.mytwitter.R;

public class FrontActivity extends AppCompatActivity {

//    UI component
    private Toolbar toolbar;
    private Button btnCreateAcc;
    private TextView tvLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

//        Assign component ID
        toolbar = findViewById(R.id.toolbar);
        btnCreateAcc = findViewById(R.id.btnCreateAcc);
        tvLogIn = findViewById(R.id.tvLogIn);

//        Set action listener
        btnCreateAcc.setOnClickListener(view -> {
            startActivity(new Intent(FrontActivity.this, CreateAccountActivity.class));
        });
        tvLogIn.setOnClickListener(view -> {
            startActivity(new Intent(FrontActivity.this, LogInActivity.class));
        });

        setToolbarProperties();
    }

    private void setToolbarProperties() {
        setSupportActionBar(toolbar);
    }
}