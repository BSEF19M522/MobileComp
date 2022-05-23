package com.example.childrenbook;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Repo(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/BSEF19M522/MobileComp"));
        startActivity(i);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, lessonWindow.class);
        startActivity(intent);
    }

    public void onQuiz(View view) {
        Intent intent = new Intent(MainActivity.this,QuizWindow.class);
        startActivity(intent);
    }
}