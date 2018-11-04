package com.example.yueyang.afinal;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Page1 extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    break;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(Page1.this, WelcomeScreen.class));
                    break;
                case R.id.navigation_notifications:
                    startActivity(new Intent(Page1.this, ratingstar.class));
                    break;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void check2(View view){
        startActivity(new Intent(this, ratingstar.class));
    }
    public void check3(View view){
        startActivity(new Intent(this, job.class));
    }
    public void check4(View view){
        startActivity(new Intent(this, impostor.class));
    }
    public void check5(View view){
        startActivity(new Intent(this, school.class));
    }
    public void check6(View view){
        startActivity(new Intent(this, iamsick.class));
    }
    public void check7(View view){
        startActivity(new Intent(this, excercise.class));
    }
    public void check8(View view){
        startActivity(new Intent(this, localmotion.class));
    }
    public void check9(View view){
        startActivity(new Intent(this, skin.class));
    }


    }







