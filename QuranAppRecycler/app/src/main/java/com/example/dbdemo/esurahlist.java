package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

public class esurahlist extends AppCompatActivity {
    // ListView surah_list;
    private RecyclerView recyclerView;
    public String[] englishSurahNames = {"Al-Fatihah",
            "Al-Baqara ",
            "Al-i'Imran ",
            "An-Nisaa ",
            "Al-Maidah ",
            "Al-An'am ",
            "Al-A'raf ",
            "Al-Anfal ",
            "At-Tauba ",
            "Yunus ",
            "Hud ",
            "Yusuf ",
            "Ar-Ra'd ",
            "Ibrahim ",
            "Al-Hijr ",
            "An-Nahl ",
            "Al-Israa ",
            "Al-Kahf ",
            "Maryam ",
            "Ta-ha ",
            "Al-Anbiyaa ",
            "Al-Hajj ",
            "Al-Muminun ",
            "An-Nur ",
            "Al-Furqan ",
            "Ash-Shu'araa ",
            "An-Naml ",
            "Al-Qasas ",
            "Al-Ankabut ",
            "Ar-Rum ",
            "Luqman ",
            "As-Sajda ",
            "Al-Ahzab ",
            "Saba ",
            "Fatir ",
            "Ya-Sin ",
            "As-Saffat ",
            "Sad ",
            "Az-Zumar ",
            "Al-Mu'min ",
            "Ha-Mim ",
            "Ash-Shura ",
            "Az-Zukhruf ",
            "Ad-Dukhan ",
            "Al-Jathiya ",
            "Al-Ahqaf ",
            "Muhammad ",
            "Al-Fat-h ",
            "Al-Hujurat ",
            "Qaf ",
            "Az-Zariyat ",
            "At-Tur ",
            "An-Najm ",
            "Al-Qamar ",
            "Ar-Rahman ",
            "Al-Waqi'a ",
            "Al-Hadid ",
            "Al-Mujadila ",
            "Al-Hashr ",
            "Al-Mumtahana ",
            "As-Saff ",
            "Al-Jumu'a ",
            "Al-Munafiqun ",
            "At-Tagabun ",
            "At-Talaq ",
            "At-Tahrim ",
            "Al-Mulk ",
            "Al-Qalam ",
            "Al-Haqqa ",
            "Al-Ma'arij ",
            "Nuh ",
            "Al-Jinn ",
            "Al-Muzzammil ",
            "Al-Muddathth ",
            "Al-Qiyamat ",
            "Ad-Dahr ",
            "Al-Mursalat ",
            "An-Nabaa ",
            "An-Nazi'at ",
            "Abasa ",
            "At-Takwir ",
            "Al-Infitar ",
            "Al-Mutaffife ",
            "Al-Inshiqaq ",
            "Al-Buruj ",
            "At-Tariq ",
            "Al-A'la ",
            "Al-Gashiya ",
            "Al-Fajr ",
            "Al-Balad ",
            "Ash-Shams ",
            "Al-Lail ",
            "Adh-Dhuha ",
            "Al-Sharh ",
            "At-Tin ",
            "Al-Alaq ",
            "Al-Qadr ",
            "Al-Baiyina ",
            "Al-Zalzalah ",
            "Al-Adiyat ",
            "Al-Qari'a ",
            "At-Takathur ",
            "Al-Asr ",
            "Al-Humaza ",
            "Al-Fil ",
            "Quraish ",
            "Al-Ma'un ",
            "Al-Kauthar ",
            "Al-Kafirun ",
            "An-Nasr ",
            "Al-Lahab ",
            "Al-Ikhlas ",
            "Al-Falaq ",
            "Al-Nas ",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.englishsurahlist);
        recyclerView=findViewById(R.id.esurah_list);
//        Intent intent=getIntent();
        QDH qdh=new QDH();


        SurahListAdapter myRecyclerAdapter = new SurahListAdapter(android.R.layout.simple_list_item_1,englishSurahNames);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(myRecyclerAdapter);
        myRecyclerAdapter.onRecyclerViewClickListener(new SurahListAdapter.onRecyclerViewClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent=new Intent(getApplicationContext(), Surah_Display.class);
                intent.putExtra("Surah_no",position+1);
                startActivity(intent);
            }
        });


        //   recyclerView.setOnClickListener();


        // ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,qdh.GetSurahNames());
        // surah_list.setAdapter(arrayadapter);


//            }
        //      });
    }
}