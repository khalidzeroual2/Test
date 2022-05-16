package com.example.studentapplicationkhalidzeroual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class EmergencyContacts extends AppCompatActivity {
//EditText editTextCall;
ImageButton imageButtonCallJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);

        //editTextCall = (EditText)findViewById(R.id.editTextCall);
        //editTextCall.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {

       //     }
    //    });
        imageButtonCallJ = (ImageButton)findViewById(R.id.imageButtonCall);
        imageButtonCallJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  String phoneNum =editTextCall.getText().toString();
                //String a="tel"+phoneNum;
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+112 "));
                startActivity(intent);

            }
        });
    }
}