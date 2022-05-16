package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeActivity extends AppCompatActivity {
    Button timeOneJ;
    Button timeTwoJ;
    Button timeThreeJ;
    Button timeFourJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        timeOneJ = findViewById(R.id.timeOne);
        timeOneJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://theglobalscholars.com/2019/05/09/6-essential-time-management-tips-for-students/"));
                startActivity(browserIntent);


            }
        });

        timeTwoJ = findViewById(R.id.timeTwo);
        timeTwoJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.qualifax.ie/index.php?option=com_content&view=article&id=180&Itemid=205"));
                startActivity(browserIntent);

            }
        });

        timeThreeJ = findViewById(R.id.timeThree);
        timeThreeJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JGr46kYMEQQ"));
                startActivity(browserIntent);

            }
        });
        timeFourJ = findViewById(R.id.timeFour);
        timeFourJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xTQwYi6jAuQ"));
                startActivity(browserIntent);

            }
        });
    }
}