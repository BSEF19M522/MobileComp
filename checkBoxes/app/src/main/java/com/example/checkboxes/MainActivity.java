package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    Button Buttn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.cbBlack);
        cb1.setOnClickListener(this);
        cb2 = findViewById(R.id.cBgreen);
        cb2.setOnClickListener(this);
        cb3 = findViewById(R.id.cbpurple);
        cb3.setOnClickListener(this);
        cb4 = findViewById(R.id.cbpink);
        cb4.setOnClickListener(this);
        cb5 = findViewById(R.id.cbBrown);
        cb5.setOnClickListener(this);
        cb6.findViewById(R.id.cbgrey);
        cb6.setOnClickListener(this);
        Buttn = findViewById(R.id.button);
    }

    public void onClick(View View) {

        switch (View.getId()) {
            case R.id.cbBlack:
                if (cb1.isChecked())
                    Buttn.setText("Favorite color:Black");
                break;
            case R.id.cBgreen:
                if (cb2.isChecked())
                    Buttn.setText("Favorite color:Green");
                break;
            case R.id.cbpurple:
                if (cb3.isChecked())
                    Buttn.setText("Favorite color:purple");
                break;
            case R.id.cbpink:
                if (cb4.isChecked())
                    Buttn.setText("Favorite color:pink");
                break;
            case R.id.cbBrown:
                if (cb5.isChecked())
                    Buttn.setText("Favorite color:brown");
                break;
            case R.id.cbgrey:
                if (cb6.isChecked())
                    Buttn.setText("Favorite color:grey");
                break;
        }
    }

}