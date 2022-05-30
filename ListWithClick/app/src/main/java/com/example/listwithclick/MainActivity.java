package com.example.listwithclick;

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
        ArrayList<String> season=new ArrayList<>();
        season.add("Summer");
        season.add("Winter");
        season.add("Rain");
        season.add("Autumn");
        season.add("Spring");

        ArrayAdapter<String> ar_adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,season);
        MyList.setAdapter(ar_adapter);
        MyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg="Season" +i +" "+((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
            }
        });
    }
}