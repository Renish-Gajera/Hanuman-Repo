package com.kashtbhanjan.hanumanuniverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView wallsection, templessection, Bhajansection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getSupportActionBar().hide();


        wallsection = findViewById( R.id.wallsection );
        templessection = findViewById( R.id.templessection );
        Bhajansection = findViewById( R.id.Bhajansection );


        wallsection.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, wallpaper.class );
                startActivity( intent );
            }
        } );

        templessection.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, temples.class );
                startActivity( intent );
            }
        } );

        Bhajansection.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, bhajan.class );
                startActivity( intent );
            }
        } );


    }
}