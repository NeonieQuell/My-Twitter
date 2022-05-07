package com.neo.mytwitter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class NewTweetActivity extends AppCompatActivity {

//    UI component
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tweet);

//        Assign component ID
        toolbar = findViewById(R.id.toolbar);

        setToolbarProperties();
    }

    private void setToolbarProperties() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_close_outline));
        toolbar.setNavigationOnClickListener(view -> {
            finish();
        });
    }
}