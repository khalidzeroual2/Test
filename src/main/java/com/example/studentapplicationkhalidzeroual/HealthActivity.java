package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class HealthActivity extends AppCompatActivity {
Button usefulOneJ;
Button usefulTwoJ;
Button usefulThreeJ;
Button usefulFourJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        usefulOneJ = findViewById(R.id.usefulOne);
        usefulOneJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yF7Ou43Vj6c"));
                startActivity(browserIntent);
            }
        });
          usefulTwoJ = findViewById(R.id.usefulTwo);
          usefulTwoJ.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bsc2QkCC3uI"));
                  startActivity(browserIntent);

              }
          });

          usefulThreeJ = findViewById(R.id.usefulThree);
          usefulThreeJ.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.york.ac.uk/students/health/wellbeing/"));
                  startActivity(browserIntent);

              }
          });
           usefulFourJ = findViewById(R.id.usefulFour);
           usefulFourJ.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mentalhealthireland.ie/five-ways-to-wellbeing/"));
                   startActivity(browserIntent);

               }
           });


    }
}