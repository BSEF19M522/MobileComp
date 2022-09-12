package com.example.childrenbook;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
public class lessonlistwindow extends  AppCompatActivity{
    ListView listve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listl);
        listve=findViewById(R.id.listv);
        ArrayList<Appsclass> arr= new ArrayList<>();

        arr.add(new Appsclass(R.drawable.a,"Aa","A for ANT"));
        arr.add(new Appsclass(R.drawable.bb,"Bb","B for BUTTERFLY "));
        arr.add(new Appsclass(R.drawable.c,"Cc","C for CAT"));
        arr.add(new Appsclass(R.drawable.dd,"Dd","D for DOG"));
        arr.add(new Appsclass(R.drawable.ee,"Ee","E for ELEPHANT"));
        arr.add(new Appsclass(R.drawable.f,"Ff","F for FIRE"));
        arr.add(new Appsclass(R.drawable.gg,"Gg","G for GRAPES"));
        arr.add(new Appsclass(R.drawable.hh,"Hh","H for HELICOPTER"));
        arr.add(new Appsclass(R.drawable.ii,"Ii","I for ICE-CUBE"));
        arr.add(new Appsclass(R.drawable.jj,"Jj","J for JUG"));
        arr.add(new Appsclass(R.drawable.k,"Kk","K for KITE"));
        arr.add(new Appsclass(R.drawable.lemon,"Ll","L for LEMON"));
        arr.add(new Appsclass(R.drawable.mm,"Mm","M for MILK"));
        arr.add(new Appsclass(R.drawable.nn,"Nn","N for NIGHT"));
        arr.add(new Appsclass(R.drawable.o,"Oo","O for ORANGE"));
        arr.add(new Appsclass(R.drawable.pp,"Pp","P for PRINCE"));
        arr.add(new Appsclass(R.drawable.pp,"Qq","Q for QUEEN"));
        arr.add(new Appsclass(R.drawable.rr,"Rr","R for ROSE"));
        arr.add(new Appsclass(R.drawable.s,"Ss","S for SUN"));
        arr.add(new Appsclass(R.drawable.t,"Tt","T for TREE"));
        arr.add(new Appsclass(R.drawable.u,"Uu","U for UMBRELLA"));
        arr.add(new Appsclass(R.drawable.vv,"Vv","V for VAN"));
        arr.add(new Appsclass(R.drawable.ww,"Ww","W for WATER-MELON"));
        arr.add(new Appsclass(R.drawable.xx,"Xx","X for X-RAY"));
        arr.add(new Appsclass(R.drawable.yy,"Yy","Y for YOGURT"));
        arr.add(new Appsclass(R.drawable.zz,"Zz","Z for ZEBRA"));
        AppclAdapter aAdapt= new AppclAdapter(this,R.layout.customlistabc,arr);
        listve.setAdapter(aAdapt);


    }}
