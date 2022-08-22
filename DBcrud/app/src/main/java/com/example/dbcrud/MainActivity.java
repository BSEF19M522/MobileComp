package com.example.dbcrud;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ADD, VIEW;
        EditText name,phn;
        ListView listViewContact;

        ADD = findViewById(R.id.ADD);
        VIEW = findViewById(R.id.VIEW);
        name = findViewById(R.id.name);
        phn = findViewById(R.id.phn);
        listViewContact = findViewById(R.id.listViewContact);

        ADD.setOnClickListener(new View.OnClickListener() {
            contactss contact;
            @Override
            public void onClick(View view) {

                try {
                    contact = new contactss(name.getText().toString(),phn.getText().toString());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DbHelper dbHelper  = new DbHelper(MainActivity.this);
                dbHelper.addcontact(contact);
            }
        });
        VIEW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper dbHelper = new DbHelper(MainActivity.this);
                List<contactss> list = dbHelper.getAllContacts();
                ArrayAdapter arrayAdapter = new ArrayAdapter<contactss>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
                listViewContact.setAdapter(arrayAdapter);

            }
        });

    }
}

