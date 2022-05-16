package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();


    Button healthButtonJ;
    Button budgetButtonJ;
    Button emergencyButtonJ;
    Button cookButtonJ;
    Button timeButtonJ;
    Button videosButtonJ;
    Button studyButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        healthButtonJ = findViewById(R.id.healthButton);
        healthButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HealthActivity.class));

            }
        });
        budgetButtonJ = findViewById(R.id.budgetButton);
        budgetButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BudgetActivity.class));

            }
        });

        emergencyButtonJ = findViewById(R.id.emergencyButton);
        emergencyButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmergencyContacts.class));

            }
        });
        cookButtonJ = findViewById(R.id.cookButton);
        cookButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CookingActivity.class));

            }
        });
        timeButtonJ = findViewById(R.id.timeButton);
        timeButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TimeActivity.class));


            }
        });
        videosButtonJ = findViewById(R.id.videosButton);
        videosButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xqXwBepxzgI&t=21s"));
                startActivity(browserIntent);


            }


        });
        studyButtonJ = findViewById(R.id.studyButton);
        studyButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StudyActivity.class));


            }
        });

        Log.i(TAG,"in method onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method onResume");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"in method onRestart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "in method onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"in method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestroy");
    }
}





