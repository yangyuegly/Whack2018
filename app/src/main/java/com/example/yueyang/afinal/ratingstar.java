
package com.example.yueyang.afinal;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;




public class ratingstar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingstar);


        final RatingBar RatingBar = (RatingBar) findViewById(R.id.RatingBar); // initiate a rating bar
        LayerDrawable stars = (LayerDrawable) RatingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
        int numberOfStars = RatingBar.getNumStars(); // get total number of stars of rating bar
        final float rankingNum = RatingBar.getRating();

        Button submitButton = (Button) findViewById(R.id.submitButton);
        // perform click event on button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String rating = "You rated a " + RatingBar.getRating();
                Toast.makeText(getApplicationContext(),  rating, Toast.LENGTH_LONG).show();

                if (rankingNum == 1 || rankingNum == 2) {
                    Intent in = new Intent(ratingstar.this,bad.class);
                    startActivity(in);
                }

                else if (rankingNum == 3 || rankingNum == 4) {
                    Intent in2 = new Intent(ratingstar.this, middle.class);
                    startActivity(in2);
                }

                else if (rankingNum == 5) {
                    Intent in3 = new Intent(ratingstar.this, good.class);
                    startActivity(in3);
                }

            }


        });
    }


}