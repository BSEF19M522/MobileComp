package com.example.singleactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Main Activity :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, " ...Activity Main is created...");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, " ...Activity Main is started...");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, " ...Activity Main is resumed...");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, " ...Activity Main is paused...");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, " ...Activity Main is stopped...");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " ...Activity Main is Destroyed...");
    }

}