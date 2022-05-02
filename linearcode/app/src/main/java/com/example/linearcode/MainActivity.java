package com.example.linearcode;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
//import  android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//EditText etname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearpractice);

    }
    public void submission(View view){
        Toast.makeText(MainActivity.this,"Form submitted", Toast.LENGTH_LONG).show();
    }
}