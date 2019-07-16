package com.securesoftbd.banglakobita;



import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.securesoftbd.banglakobita.Adepter.KobitaListAdepter;

import java.util.ArrayList;
import java.util.List;

public class SelectKobita extends AppCompatActivity {
    RecyclerView recycularView;
    List<String> kobita_list=new ArrayList<>();
    KobitaListAdepter kobitaListAdepter;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_kobita);

        MobileAds.initialize(this,
                "ca-app-pub-9366562842503374~7303027991");

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-9366562842503374/7120917361");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        recycularView=findViewById(R.id.recycuar);
        recycularView.setHasFixedSize(true);
        recycularView.setLayoutManager(new LinearLayoutManager(this));
        loadList();
        kobitaListAdepter =new KobitaListAdepter(kobita_list,this);

        recycularView.setAdapter(kobitaListAdepter);



    }

    private void loadList() {
        kobita_list.add("আম পাতা জোরা জোরা");
        kobita_list.add("চাঁদ উঠেছে ফুল ফুটেছে");
        kobita_list.add("নোটন নোটন পায়রা");
        kobita_list.add("আতা গাছে তোতা পাখি");
        kobita_list.add("ওখানে কে রে");


        kobita_list.add("আয় আয় চাঁদ মামা");
        kobita_list.add("তাই তাই তাই মামা বাড়ি যাই");
       // kobita_list.add("আয় ছেলেরা আয় মেয়েরা");
        kobita_list.add("হাট্টিমা টিম টিম");
        kobita_list.add("আয় বৃষ্টি ঝেঁপে");

        kobita_list.add("সিংহ মামা");
        kobita_list.add("খোকন খোকন");
        kobita_list.add("মামা বাড়ি");
        kobita_list.add("আমাদের গ্রাম");
        kobita_list.add("ঘুম পারানি মাসি");

        kobita_list.add("দোল দোল দুলুনি");
        kobita_list.add("আমাদের ছোট নদী");
        kobita_list.add("আমার পন");
        kobita_list.add("প্রভাতি");
        kobita_list.add("আয়রে আয় মেনি");

        kobita_list.add("কানা বগীর ছা");
        kobita_list.add("ইতল বিতল");
        kobita_list.add("হন হন পনপন");
        kobita_list.add("ভোর হল দোর খোল");
        kobita_list.add("আয়রে আয় টিয়ে");

        kobita_list.add("আমি হব সকাল বেলার পাখি");
        kobita_list.add("ববাক বাকুম পায়রা");
    }
}
