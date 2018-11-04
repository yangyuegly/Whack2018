package com.example.yueyang.afinal;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {

    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    break;

                case R.id.navigation_dashboard:
                    startActivity(new Intent(WelcomeScreen.this, Page1.class));
                    break;
                case R.id.navigation_notifications:
                    startActivity(new Intent(WelcomeScreen.this, ratingstar.class));

                    break;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }
    public void randomMe(View view){
        Intent randomIntent = new Intent(WelcomeScreen.this, MainActivity.class);
        startActivity(randomIntent);

    }
}
