package com.example.piers.bottone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //PER IL BOTTONE RECOGNIZE
        findViewById(R.id.recognize_id).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button bottone=((Button)v);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        bottone.setText(R.string.button_recognize_stop);
                        return true; // if you want to handle the touch event

                    case MotionEvent.ACTION_UP:
                        bottone.setText(R.string.button_recognize_start);
                        return true; // if you want to handle the touch event

                }
                return false;
            }
        });

        //PER IL BOTTONE TRAIN
        findViewById(R.id.button_id).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        ((Button)v).setText(R.string.button_train);
                        return true; // if you want to handle the touch event

                    case MotionEvent.ACTION_UP:
                        ((Button)v).setText(R.string.button_train_stop);
                        return true; // if you want to handle the touch event

                }
                return false;
            }
        });
    }


}
