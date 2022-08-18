package com.example.dbresultswithcustomlist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listadapter extends BaseAdapter{
    private Context lContext;
    ArrayList<contactss> arrayList;


    public listadapter(Context lContext,ArrayList arrayList) {
        this.lContext = lContext;
        this.arrayList=arrayList;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

            LayoutInflater inflater=(LayoutInflater) lContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           // LayoutInflater layoutinf=LayoutInflater.from(lContext);
            convertView=inflater.inflate(R.layout.customviewcontact,null);
            TextView text1=convertView.findViewById(R.id.textView);
            TextView text2=convertView.findViewById(R.id.textView2);
            contactss contact=arrayList.get(i);
           text1.setText(contact.getName());
            text2.setText(contact.getPhoneNumber());


        return null;

    }

    @Override
    public int getCount() {
        return this.arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
       return i;
    }
}