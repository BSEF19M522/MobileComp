package com.example.customizedlistview;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listv=findViewById(R.id.listv);
        ArrayList<Appsclass> arr= new ArrayList<>();
        arr.add(new Appsclass(R.drawable.linkedin,"linkedIn","LinkedIn is a social network that focuses on professional networking and career development"));
        arr.add(new Appsclass(R.drawable.githublogo,"GitHub","It is a provider of Internet hosting for software development and version control using Git"));
        arr.add(new Appsclass(R.drawable.bitbucket,"BitBucket","Bitbucket is a Git-based source code repository hosting service owned by Atlassian."));
        arr.add(new Appsclass(R.drawable.youtube, "Youtube","YouTube is a video sharing service where users can create their own profile, upload videos, watch, like and comment on other videos."));
    //add adapter class
        AppclAdapter aAdapt= new AppclAdapter(this,R.layout.customview,arr);
        listv.setAdapter(aAdapt);
     }
}