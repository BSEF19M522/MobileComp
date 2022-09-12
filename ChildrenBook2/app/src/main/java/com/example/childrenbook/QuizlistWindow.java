package com.example.childrenbook;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class QuizlistWindow extends AppCompatActivity {

        Button button2;
        private int score;
        ListView listView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            score=0;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.quizlist);


            listView=findViewById(R.id.listQuiz);
            //arraylist creation
            ArrayList<Quiz> arrayList = new ArrayList<Quiz>();
            arrayList.add(new Quiz(
                    "Q1","Last alphabet of apple is",
                    "E","B","C","D",R.id.radioA
            ));
            arrayList.add(new Quiz(
                    "Q2","Cat starts from alphabet:"
                    ,"Q","  C","N","C",R.id.radioB
            ));
            arrayList.add(new Quiz(
                    "Q3","Sun starts with:"
                    ,"A","K","S","N",R.id.radioC
            ));
            arrayList.add(new Quiz(
                    "Q4","B is the alphabet"
                    ,"2","6","7","3",R.id.radioA
            ));
            arrayList.add(new Quiz(
                    "Q5","Car Starts with"
                    ,"C","O","X","N",R.id.radioA
            ));

            QuizClass adapter = new QuizClass(this,arrayList);
            listView.setAdapter(adapter);
            button2=findViewById(R.id.button11);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    for(int ind=0;ind<arrayList.size();ind++){
                        if(arrayList.get(ind).isCorrect()) score++;
                    }
                    Intent intent = new Intent(QuizlistWindow.this,ResultActivity.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }
            });
        }
}
