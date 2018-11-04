package com.example.yueyang.afinal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    startActivity(new Intent(MainActivity.this, WelcomeScreen.class));

                    break;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(MainActivity.this, Page1.class));
                    break;
                case R.id.navigation_notifications:
                    startActivity(new Intent(MainActivity.this, ratingstar.class));
                    break;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goodBye(View view) {
        Intent randomIntent = new Intent(MainActivity.this, Page1.class);
        startActivity(randomIntent);
    }



}
