package com.example.listviewcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView MyList=findViewById(R.id.MyList);
        ArrayList<String> season=new ArrayList<>();
        season.add("Summer");
        season.add("Winter");
        season.add("Rain");
        season.add("Autumn");
        season.add("Spring");


    }
}