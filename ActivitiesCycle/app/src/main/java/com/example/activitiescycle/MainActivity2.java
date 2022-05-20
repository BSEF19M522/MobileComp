package com.example.activitiescycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG ="Main Activity2 :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, " ...Activity Main2 is created...");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, " ...Activity Main2 is started...");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, " ...Activity Main2 is resumed...");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, " ...Activity Main2 is paused...");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, " ...Activity Main2 is stopped...");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " ...Activity Main2 is Destroyed...");
    }

}