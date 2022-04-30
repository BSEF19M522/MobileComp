package com.example.code2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=(EditText)findViewById(R.id.editTextTextPersonName2);
    }
    public void onClick(View view){
    TextView text = (TextView) findViewById(R.id.textView);
    text.setText("Button Clicked");
    }

    public void cancelclick(View view) {
    // String myName=etname.getText().toString();
        Toast.makeText(MainActivity.this,"cancel button is clicked", Toast.LENGTH_LONG).show();
    }
}