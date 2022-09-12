package com.example.childrenbook;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;
public class QuizWindow extends AppCompatActivity {

    TextView no,Question,result,correctAnswer;
    RadioButton radioButton,radioButton2,radioButton3,radioButton4;
    RadioGroup radioGroup;
    Button Done,Next;
    int score,total;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizact);
        score=0;
        total=0;

        no=findViewById(R.id.Q_No);
        Question=findViewById(R.id.Question);

        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);
        radioGroup=findViewById(R.id.radioGroup);

        result=findViewById(R.id.result);
        correctAnswer=findViewById(R.id.correctAnswer);
        Done=findViewById(R.id.button5);
        Next=findViewById(R.id.next);
        q1();

    }
    private void donebutton(RadioButton rb){
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioGroup.getCheckedRadioButtonId()==-1) return;
                if(rb.isChecked()) {
                    score++;
                    result.setText("Right Option");

                }
                else{
                    result.setText("Wrong Option");
                    correctAnswer.setText("Correct Answer:\t".concat(rb.getText().toString()));
                }
                total++;
                Done.setEnabled(false);
                radioButton.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                Next.setEnabled(true);
                nextbutton();
            }
        });
    }
    private void nextbutton()
    {
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Done.setEnabled(true);
                radioButton.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                if(total==1) q2();
                else if(total==2) q3();
                else if(total==3) q4();
                else if(total==4) q5();
                else if(total==5){
                    Intent intent = new Intent(com.example.childrenbook.QuizWindow.this,ResultActivity.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }
                Next.setEnabled(false);
                if(radioGroup.getCheckedRadioButtonId()!=-1)
                {
                    RadioButton temp=findViewById(radioGroup.getCheckedRadioButtonId());
                    temp.setChecked(false);
                }
            }
        });
    }
    private void q1()
    {
        no.setText("Question 1");
        Question.setText("A for ");
        radioButton.setText("Ant");
        radioButton2.setText("ball");
        radioButton3.setText("dog");
        radioButton4.setText("fish");
        donebutton(radioButton);
    }
    private void q2()
    {
        no.setText("Question 2");
        Question.setText("Doll first word is ");
        radioButton.setText("C");
        radioButton2.setText("B");
        radioButton3.setText("D");
        radioButton4.setText("G");
        donebutton(radioButton3);
    }
    private void q3()
    {
        no.setText("Q3");
        Question.setText("B for ");
        radioButton.setText("Happy");
        radioButton2.setText("sad");
        radioButton3.setText("Gun");
        radioButton4.setText("Ballon");
        donebutton(radioButton4);
    }
    private void q4()
    {
        no.setText("Q4");
        Question.setText("ۛۛۛZebra first letter is ");
        radioButton.setText("H");
        radioButton2.setText("Z");
        radioButton3.setText("M");
        radioButton4.setText("K");
        donebutton(radioButton2);
    }
    private void q5()
    {
        no.setText("Q5");
        Question.setText("First alphabet is ");
        radioButton.setText("A");
        radioButton2.setText("C");
        radioButton3.setText("K");
        radioButton4.setText("O");
        donebutton(radioButton);
    }



}