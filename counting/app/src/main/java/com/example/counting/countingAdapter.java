package com.example.counting;

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

public class countingAdapter extends ArrayAdapter<appsclass> {
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
        ImageView image= convertView.findViewById(R.id.imageView);
        TextView text1=convertView.findViewById(R.id.textView);
        image.setImageResource(getItem(position).getImages());
        text1.setText(getItem(position).getCount());
        return  convertView;

    }
}
