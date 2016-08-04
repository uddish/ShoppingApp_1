package com.example.uddishverma.floatingactionbar;

import android.animation.Animator;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabPlus, fabTaxi, fabLoc;
    Animation fabOpen, fabClose, fabClockwise, fabAnticlockwise;
    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabPlus = (FloatingActionButton) findViewById(R.id.fab_btn_add);
        fabTaxi = (FloatingActionButton) findViewById(R.id.fab_btn_taxi);
        fabLoc = (FloatingActionButton) findViewById(R.id.fab_btn_loc);

        fabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fabClockwise = AnimationUtils.loadAnimation(getApplication(), R.anim.rotate_clockwise);
        fabAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);

        fabPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isOpen)  {

                    fabTaxi.startAnimation(fabClose);
                    fabLoc.startAnimation(fabClose);
                    fabPlus.startAnimation(fabAnticlockwise);
                    fabTaxi.setClickable(false);
                    fabLoc.setClickable(false);
                    isOpen = false;
                }

                else    {

                    fabTaxi.startAnimation(fabOpen);
                    fabLoc.startAnimation(fabOpen);
                    fabPlus.startAnimation(fabClockwise);
                    fabTaxi.setClickable(true);
                    fabLoc.setClickable(true);
                    isOpen = true;

                }

            }
        });

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, FabActivityResult.class));
//            }
//        });
    }
}
