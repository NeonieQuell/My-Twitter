package com.neo.mytwitter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.neo.mytwitter.fragment.*;

public class MainActivity extends AppCompatActivity {

//    UI component
    public BottomNavigationView btnBottomNav;
    public FloatingActionButton fabNewTweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Set home fragment as default visible fragment on application start
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new FragmentHomeActivity()).commit();

//        Assign component ID
        btnBottomNav = findViewById(R.id.btnBottomNav);
        fabNewTweet = findViewById(R.id.fabNewTweet);

//        Set action listener
        btnBottomNav.setOnNavigationItemSelectedListener(btnBottomNavOnClickListener);

        fabNewTweet.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, NewTweetActivity.class));
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener btnBottomNavOnClickListener = menuItem -> {
        Fragment selectedFragment = null;

        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                selectedFragment = new FragmentHomeActivity();
                break;
            case R.id.nav_search:
                selectedFragment = new FragmentSearchActivity();
                break;
            case R.id.nav_notifs:
                selectedFragment = new FragmentNotifsActivity();
                break;
            case R.id.nav_messages:
                selectedFragment = new FragmentMessagesActivity();
                break;
        }

        Fragment finalSelectedFragment = selectedFragment;
        runOnUiThread(() -> { getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, finalSelectedFragment).commit(); });

        return true;
    };
}