package com.example.scientist_listlistviewwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import  android.content.Intent;
import android.net.Uri;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView MyList=findViewById(R.id.MyList);
        ArrayList<String> scientists=new ArrayList<>();
        scientists.add("Albert Einstein");
        scientists.add("Marie Curie");
        scientists.add("Isaac Newton");
        scientists.add("Charles Darwin");
        scientists.add("Nikola Tesla");
        scientists.add("Galileo Galilei");
        scientists.add("Ada Lovelace");
        scientists.add("Pythagoras");
        scientists.add("Carl Linnaeus");
        scientists.add("Rosalind Franklin");

        ArrayAdapter<String> ar_adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,scientists);
        MyList.setAdapter(ar_adapter);
        MyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
             if(pos==0){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Albert_Einstein"));
                 startActivity(i);
             }
             else if(pos==1){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Marie_Curie"));
                 startActivity(i);
             }
             else if(pos==2){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Isaac_Newton"));
                 startActivity(i);
                }
             else if(pos==3){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Charles_Darwin"));
                 startActivity(i);
                }
             else if(pos==4){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Nikola_Tesla"));
                 startActivity(i);
                }
             else if(pos==5){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Galileo_Galilei"));
                 startActivity(i);
                }
             else if(pos==6){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Ada_Lovelace"));
                 startActivity(i);
                }
             else if(pos==7){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Pythagoras"));
                 startActivity(i);
                }
             else if(pos==8){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Carl_Linnaeus"));
                 startActivity(i);
                }
             else if  (pos==9){
                 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Rosalind_Franklin"));
                 startActivity(i);
                }

            }
        });


    }
}