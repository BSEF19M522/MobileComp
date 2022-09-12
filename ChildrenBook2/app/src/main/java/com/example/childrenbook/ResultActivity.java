package com.example.childrenbook;



        import android.os.Bundle;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity  extends AppCompatActivity {

    TextView yourScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        yourScore=findViewById(R.id.yourScore);

        setup();
    }
    private void setup()
    {
        int score = getIntent().getIntExtra("score",0);
        yourScore.setText(yourScore.getText().toString().concat(String.valueOf(score)));

    }
}