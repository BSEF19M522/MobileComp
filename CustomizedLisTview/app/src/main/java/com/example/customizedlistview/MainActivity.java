package com.example.customizedlistview;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listv=findViewById(R.id.listv);
      String [] Names={"linkedIn", "GitHub", "BitBucket","Youtube"};
      Integer[] images={R.drawable.linkedin, R.drawable.githublogo,R.drawable.bitbucket,R.drawable.youtube};
       CustomAdapter customadapt=new CustomAdapter(getApplicationContext(),Names,images);
       listv.setAdapter(customadapt);

    }
     public class CustomAdapter extends ArrayAdapter<String> {
         private final Activity context;
         private final String[] Names;
         private final Integer[] images;

         public CustomAdapter(Context context, String[] Names, Integer[] images) {
             super(context, R.layout.customview, Names);
             this.context = (Activity) context;
             this.Names = Names;
             this.images = images;

         }

         public View getView(int i, View view, ViewGroup vg) {
             LayoutInflater inflater=context.getLayoutInflater();
             View v = inflater.inflate(R.layout.customview, null, true);
             ImageView img = findViewById(R.id.img);
             TextView text = findViewById(R.id.textView);
             img.setImageResource(images[i]);
             text.setText(Names[i]);
             return v;
         }
     }
}