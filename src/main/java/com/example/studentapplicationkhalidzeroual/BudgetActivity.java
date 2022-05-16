package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BudgetActivity extends AppCompatActivity {

    Button tipsOneJ;
    Button tipsTwoJ;
    Button tipsThreeJ;
    Button tipsFourJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        tipsOneJ = findViewById(R.id.tipsOne);
        tipsOneJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fEp8cfM5rw4"));
                startActivity(browserIntent);

            }
        });

         tipsTwoJ = findViewById(R.id.tipsTwo);
         tipsTwoJ.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NHWqxqUfc9M"));
                 startActivity(browserIntent);

             }
         });
          tipsThreeJ = findViewById(R.id.tipsThree);
          tipsThreeJ.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://students.ubc.ca/ubclife/21-money-saving-tips-tricks"));
                  startActivity(browserIntent);
              }
          });

          tipsFourJ = findViewById(R.id.tipsFour);
          tipsFourJ.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.savethestudent.org/money/student-budgeting/student-budgeting.html"));
                  startActivity(browserIntent);

              }
          });
    }
}