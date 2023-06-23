package com.kashtbhanjan.hanumanuniverse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class templeinfo extends AppCompatActivity {


    ImageView templepic;
    TextView templename;
    TextView templeplace;
    TextView templedescription;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templeinfo);


        templepic = findViewById(R.id.templepic);
        templename = findViewById(R.id.templename);
        templeplace = findViewById(R.id.templeplace);
        templedescription = findViewById(R.id.templedescription);






        templepic.setImageResource(getIntent().getExtras().getInt("photo"));
        templename.setText(getIntent().getStringExtra("name"));
        templeplace.setText(getIntent().getStringExtra("place"));
        templedescription.setText(getIntent().getStringExtra("description"));



    }
}