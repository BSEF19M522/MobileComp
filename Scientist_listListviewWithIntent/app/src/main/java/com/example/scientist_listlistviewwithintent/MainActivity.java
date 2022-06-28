package com.example.scientist_listlistviewwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
      /*  MyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg="Season" +i +" "+((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });*/


    }
}