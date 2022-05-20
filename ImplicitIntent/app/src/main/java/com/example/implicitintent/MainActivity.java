package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonLinkclicked(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/BSEF19M522/MobileComp"));
        startActivity(i);
    }
}