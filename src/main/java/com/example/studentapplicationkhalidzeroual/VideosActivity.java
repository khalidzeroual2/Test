package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class VideosActivity extends AppCompatActivity {
    WebView playViewJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        playViewJ = findViewById(R.id.playView);
        playViewJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView view = findViewById(R.id.playView);
                view.setWebViewClient(new WebViewClient());
                view.loadUrl("https://www.youtube.com/watch?v=xqXwBepxzgI&t=21s");
                view.getSettings().setJavaScriptEnabled(true);
            }
        });

    }
}






