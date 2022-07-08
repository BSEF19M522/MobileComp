package com.example.counting;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    ListView listv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listv=findViewById(R.id.listv);
        ArrayList<appsclass> arr= new ArrayList<>();
        arr.add(new appsclass(R.drawable.one,"ONE"));
        arr.add(new appsclass(R.drawable.two,"TWO"));
        arr.add(new appsclass(R.drawable.three,"THREE"));
        arr.add(new appsclass(R.drawable.four,"FOUR"));
        arr.add(new appsclass(R.drawable.fivee,"FIVE"));
        arr.add(new appsclass(R.drawable.six,"SIX"));
        arr.add(new appsclass(R.drawable.seven,"SEVEN"));
        arr.add(new appsclass(R.drawable.eight,"EIGHT"));
        arr.add(new appsclass(R.drawable.nine,"NINE"));
        arr.add(new appsclass(R.drawable.ten,"TEN"));





        //add adapter class
        countingAdapter aAdapt= new countingAdapter(this,R.layout.cuslist,arr);
        listv.setAdapter(aAdapt);

    }
}