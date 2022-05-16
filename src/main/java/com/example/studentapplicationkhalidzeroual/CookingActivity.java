package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CookingActivity extends AppCompatActivity {

    Button recipeOneJ;
    Button recipeTwoJ;
    Button recipeThreeJ;
    Button recipeFourJ;
    Button recipeFiveJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);
        recipeOneJ = findViewById(R.id.recipeOne);
        recipeOneJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbcgoodfood.com/howto/guide/how-survive-student-basic-recipes"));
                startActivity(browserIntent);

            }
        });
           recipeTwoJ = findViewById(R.id.recipeTwo);
           recipeTwoJ.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.olivemagazine.com/recipes/quick-and-easy/best-ever-easy-recipes-for-students/"));
                   startActivity(browserIntent);
               }
           });
           recipeThreeJ = findViewById(R.id.recipeThree);
           recipeThreeJ.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.taste.com.au/recipes/collections/easy-recipes-for-students"));
                   startActivity(browserIntent);

               }
           });
            recipeFourJ = findViewById(R.id.recipeFour);
            recipeFourJ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=93iL5cR2SEQ"));
                    startActivity(browserIntent);
                }
            });
             recipeFiveJ = findViewById(R.id.recipeFive);
             recipeFiveJ.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ydbMAFaA6Uw"));
                     startActivity(browserIntent);

                 }
             });

    }
}