package com.kashtbhanjan.hanumanuniverse;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.io.IOException;

public class bhajan extends AppCompatActivity {

    TabLayout tablayout;
    ViewPager2 viewpager2;


    Animation fabOpen, fabClose, rotateForward, rotateBackward;
    boolean isOpen = false;


    TextView txthnauman, txtbajrangban, txtarti, txtsundarkand;
    private Bhajan_Adapter adapter;

    FloatingActionButton playallp, hanumanchalisap, bajrangbanp, artip, sundarkandp;
    boolean aBoolean;
    private boolean ishanuman, isbajrang, isarti, issundarkand;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bhajan );


        getSupportActionBar().setBackgroundDrawable( new ColorDrawable( getResources().getColor( R.color.hony ) ) );


        fabOpen = AnimationUtils.loadAnimation
                ( this, R.anim.fab_open );
        fabClose = AnimationUtils.loadAnimation
                ( this, R.anim.fab_close );
        rotateForward = AnimationUtils.loadAnimation
                ( this, R.anim.rotate_forwawrd );
        rotateBackward = AnimationUtils.loadAnimation
                ( this, R.anim.rotate_backward );


        tablayout = findViewById( R.id.tablayout );
        viewpager2 = findViewById( R.id.viewpager2 );
        playallp = findViewById( R.id.playall );
        hanumanchalisap = findViewById( R.id.hanumanchalisap );
        bajrangbanp = findViewById( R.id.bajrangbanp );
        artip = findViewById( R.id.artip );
        txthnauman = findViewById( R.id.txthnuman );
        txtbajrangban = findViewById( R.id.txtbajrangban );
        txtarti = findViewById( R.id.txtarti );
        txtsundarkand = findViewById( R.id.txtsundarkand );


        sundarkandp = findViewById( R.id.sundarkandp );


        playallp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
                if (!aBoolean) {
                    hanumanchalisap.show();
                    bajrangbanp.show();
                    artip.show();
                    sundarkandp.show();
                    txthnauman.setVisibility( View.VISIBLE );
                    txtbajrangban.setVisibility( View.VISIBLE );
                    txtarti.setVisibility( View.VISIBLE );
                    txtsundarkand.setVisibility( View.VISIBLE );
                    aBoolean = true;
                } else {
                    hanumanchalisap.hide();
                    bajrangbanp.hide();
                    artip.hide();
                    sundarkandp.hide();
                    txthnauman.setVisibility( View.GONE );
                    txtbajrangban.setVisibility( View.GONE );
                    txtarti.setVisibility( View.GONE );
                    txtsundarkand.setVisibility( View.GONE );
                    aBoolean = false;
                }
            }

        } );


//  hanuman chalisa song
        MediaPlayer mphanumanchalisa = new MediaPlayer();
        mphanumanchalisa.setAudioStreamType( AudioManager.STREAM_MUSIC );


        String apath = "android.resource://" + getPackageName() + "/raw/hanuman_chalisa";


        Uri hanumanURI = Uri.parse( apath );
        try {
            mphanumanchalisa.setDataSource( this, hanumanURI );
            mphanumanchalisa.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }


        hanumanchalisap.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!ishanuman) {
                    if (isbajrang == false && isarti == false && issundarkand == false) {
                        ishanuman = true;
                        hanumanchalisap.setImageDrawable( getResources().getDrawable(
                                R.drawable.baseline_pause_circle_24 ) );
                        mphanumanchalisa.start();
                        hanumanchalisap.hide();
                        bajrangbanp.hide();
                        artip.hide();
                        sundarkandp.hide();
                        txthnauman.setVisibility( View.GONE );
                        txtbajrangban.setVisibility( View.GONE );
                        txtarti.setVisibility( View.GONE );
                        txtsundarkand.setVisibility( View.GONE );
                    }

                } else {
                    ishanuman = false;
                    hanumanchalisap.setImageDrawable( getResources().getDrawable(
                            R.drawable.baseline_play_circle_24
                    ) );
                    mphanumanchalisa.pause();
                    mphanumanchalisa.seekTo( 0 );
                    hanumanchalisap.hide();
                    bajrangbanp.hide();
                    artip.hide();
                    sundarkandp.hide();
                    txthnauman.setVisibility( View.GONE );
                    txtbajrangban.setVisibility( View.GONE );
                    txtarti.setVisibility( View.GONE );
                    txtsundarkand.setVisibility( View.GONE );
                }

            }
        } );


// bajrang ban song

        MediaPlayer mpbajrangban = new MediaPlayer();
        mpbajrangban.setAudioStreamType( AudioManager.STREAM_MUSIC );


        String bpath = "android.resource://" + getPackageName() + "/raw/bajrang_baan";


        Uri bajragURI = Uri.parse( bpath );
        try {
            mpbajrangban.setDataSource( this, bajragURI );
            mpbajrangban.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }


        bajrangbanp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isbajrang) {
                    if (ishanuman == false && isarti == false && issundarkand == false) {
                        isbajrang = true;
                        bajrangbanp.setImageDrawable( getResources().getDrawable(
                                R.drawable.baseline_pause_circle_24
                        ) );
                        mpbajrangban.start();
                        hanumanchalisap.hide();
                        bajrangbanp.hide();
                        artip.hide();
                        sundarkandp.hide();
                        txthnauman.setVisibility( View.GONE );
                        txtbajrangban.setVisibility( View.GONE );
                        txtarti.setVisibility( View.GONE );
                        txtsundarkand.setVisibility( View.GONE );
                    }

                } else {
                    isbajrang = false;
                    bajrangbanp.setImageDrawable( getResources().getDrawable(
                            R.drawable.baseline_play_circle_24
                    ) );
                    mpbajrangban.pause();
                    mpbajrangban.seekTo( 0 );
                    hanumanchalisap.hide();
                    bajrangbanp.hide();
                    artip.hide();
                    sundarkandp.hide();
                    txthnauman.setVisibility( View.GONE );
                    txtbajrangban.setVisibility( View.GONE );
                    txtarti.setVisibility( View.GONE );
                    txtsundarkand.setVisibility( View.GONE );

                }

            }
        } );


// arti ban song

        MediaPlayer mparti = new MediaPlayer();
        mparti.setAudioStreamType( AudioManager.STREAM_MUSIC );


        String cpath = "android.resource://" + getPackageName() + "/raw/arti";


        Uri artiURI = Uri.parse( cpath );
        try {
            mparti.setDataSource( this, artiURI );
            mparti.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }


        artip.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isarti) {
                    if (!ishanuman && !isbajrang && !issundarkand) {
                        isarti = true;
                        artip.setImageDrawable( getResources().getDrawable(
                                R.drawable.baseline_pause_circle_24
                        ) );
                        mparti.start();
                        hanumanchalisap.hide();
                        bajrangbanp.hide();
                        artip.hide();
                        sundarkandp.hide();
                        txthnauman.setVisibility( View.GONE );
                        txtbajrangban.setVisibility( View.GONE );
                        txtarti.setVisibility( View.GONE );
                        txtsundarkand.setVisibility( View.GONE );
                    }

                } else {
                    isarti = false;
                    artip.setImageDrawable( getResources().getDrawable(
                            R.drawable.baseline_play_circle_24
                    ) );
                    mparti.pause();
                    mparti.seekTo( 0 );
                    hanumanchalisap.hide();
                    bajrangbanp.hide();
                    artip.hide();
                    sundarkandp.hide();
                    txthnauman.setVisibility( View.GONE );
                    txtbajrangban.setVisibility( View.GONE );
                    txtarti.setVisibility( View.GONE );
                    txtsundarkand.setVisibility( View.GONE );
                }
            }
        } );

// sunderkand ban song

        MediaPlayer mpsundarkand = new MediaPlayer();
        mpsundarkand.setAudioStreamType( AudioManager.STREAM_MUSIC );


        String dpath = "android.resource://" + getPackageName() + "/raw/sankatmochan_paath";


        Uri sundarURI = Uri.parse( dpath );
        try {
            mpsundarkand.setDataSource( this, sundarURI );
            mpsundarkand.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }


        sundarkandp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!issundarkand) {
                    if (!ishanuman && !isbajrang && !isarti) {
                        issundarkand = true;
                        sundarkandp.setImageDrawable( getResources().getDrawable(
                                R.drawable.baseline_pause_circle_24
                        ) );
                        mpsundarkand.start();
                        hanumanchalisap.hide();
                        bajrangbanp.hide();
                        artip.hide();
                        sundarkandp.hide();
                        txthnauman.setVisibility( View.GONE );
                        txtbajrangban.setVisibility( View.GONE );
                        txtarti.setVisibility( View.GONE );
                        txtsundarkand.setVisibility( View.GONE );
                    }

                } else {
                    issundarkand = false;
                    sundarkandp.setImageDrawable( getResources().getDrawable(
                            R.drawable.baseline_play_circle_24
                    ) );
                    mpsundarkand.pause();
                    mpsundarkand.seekTo( 0 );
                    hanumanchalisap.hide();
                    bajrangbanp.hide();
                    artip.hide();
                    sundarkandp.hide();
                    txthnauman.setVisibility( View.GONE );
                    txtbajrangban.setVisibility( View.GONE );
                    txtarti.setVisibility( View.GONE );
                    txtsundarkand.setVisibility( View.GONE );
                }

            }
        } );


        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new Bhajan_Adapter( fragmentManager, getLifecycle() );
        viewpager2.setAdapter( adapter );


        tablayout.addOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager2.setCurrentItem( tab.getPosition() );

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );


        viewpager2.registerOnPageChangeCallback( new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout.selectTab( tablayout.getTabAt( position ) );
            }
        } );


    }


    private void animateFab() {
        if (isOpen) {
            playallp.startAnimation( rotateForward );
            isOpen = false;
        } else {
            playallp.startAnimation( rotateBackward );
            isOpen = true;
        }
    }
}



