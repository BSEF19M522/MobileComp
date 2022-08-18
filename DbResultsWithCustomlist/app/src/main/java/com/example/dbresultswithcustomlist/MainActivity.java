package com.example.dbresultswithcustomlist;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button ADD, VIEW;
    EditText name, phn;
    ListView listViewContact;
    ArrayList<contactss> arrayList;
    listadapter la;
    contactss contact;
    DbHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onLoadad();
        ADD = findViewById(R.id.ADD);
        VIEW = findViewById(R.id.VIEW);
        name = findViewById(R.id.name);
        phn = findViewById(R.id.phn);
        DB=new DbHelper(this);
        listViewContact = findViewById(R.id.listviewContact);
        arrayList = new ArrayList<>();

    }
        private void onLoadad() {
            DbHelper dbHelper=new DbHelper(MainActivity.this);
            arrayList=dbHelper.getAllContacts();
            la=new listadapter(this,arrayList);
            listViewContact.setAdapter(la);
            la.notifyDataSetChanged();

        }
        public void insert(View v){
            contact = new contactss(name.getText().toString(),phn.getText().toString());
            //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
            DbHelper dbHelper  = new DbHelper(MainActivity.this);
            dbHelper.addcontact(contact);
        }

}