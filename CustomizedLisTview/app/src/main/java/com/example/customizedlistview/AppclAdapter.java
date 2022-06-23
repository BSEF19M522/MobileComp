package com.example.customizedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AppclAdapter extends ArrayAdapter<Appsclass> {
    private Context lContext;
    private  int lResources;
    public AppclAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Appsclass> objects) {
        super(context, resource, objects);

        this.lContext = context;
        this.lResources=resource;


    }

    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent ){
        LayoutInflater layoutinf=LayoutInflater.from(lContext);
        convertView=layoutinf.inflate(lResources,parent,false);
        ImageView image= convertView.findViewById(R.id.img);
        TextView text1=convertView.findViewById(R.id.textView);
        TextView text2=convertView.findViewById(R.id.textView2);
        image.setImageResource(getItem(position).getImages());
        text1.setText(getItem(position).getNames());
        text2.setText(getItem(position).getDes());
        return  convertView;

    }
}
