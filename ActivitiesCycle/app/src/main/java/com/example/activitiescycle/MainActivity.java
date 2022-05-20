package com.example.activitiescycle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Main Activity :";

     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, " ...Activity Main is created...");
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                }
        });
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