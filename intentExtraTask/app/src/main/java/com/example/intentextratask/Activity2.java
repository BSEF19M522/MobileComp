package com.example.intentextratask;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent = getIntent();
        String idd = intent.getStringExtra("t");
        ImageView im;
        TextView t1;
        im=findViewById(R.id.imageView);
        im.setImageResource(R.drawable.c);
        t1=findViewById(R.id.textView);
        t1.setText("HELLO");
        

    }
}