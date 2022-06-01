package com.example.customizedlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listv=findViewById(R.id.listv);
      String [] textlink={"linkedIn", "GitHub", "BitBucket","Youtube"};
      Integer[] images={R.drawable.linkedIn, R.drawable.GitHublogo,R.drawable.bitbucket,R.drawable.youtube};

    }
    public class CustomAdapter extends ArrayAdapter<String>{

        public CustomAdapter(@NonNull Context context, int resource) {
            super(context, resource);
        }
    }
}