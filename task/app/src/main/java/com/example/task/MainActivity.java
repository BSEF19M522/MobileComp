package com.example.task;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView List=findViewById(R.id.li);



        java.util.List<String> array = new ArrayList<String>();
        QDH qd=new QDH();



        ArrayAdapter<String> ar_adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,qd.urduSurahNames);
        List.setAdapter(ar_adapter);

    }

}