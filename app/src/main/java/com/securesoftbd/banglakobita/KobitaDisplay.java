package com.securesoftbd.banglakobita;


import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class KobitaDisplay extends AppCompatActivity {
    int data;
    List<Integer> imageList=new ArrayList<>();
    ImageView imageView;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobita_display);
        MobileAds.initialize(this,
                "ca-app-pub-9366562842503374~7303027991");

        mInterstitialAd = new InterstitialAd(this);

        mInterstitialAd.setAdUnitId("ca-app-pub-9366562842503374/1485447304");

        mInterstitialAd.loadAd(new AdRequest.Builder().build());
       // mInterstitialAd.setAdUnitId("ca-app-pub-9366562842503374/7120917361");


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-9366562842503374/7120917361");


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        data=getIntent().getIntExtra("id",0);
        load_image();
        imageView=findViewById(R.id.image);
        imageView.setImageResource(imageList.get(data));



    }

    private void load_image() {
        imageList.add(R.drawable.am_pata);
        imageList.add(R.drawable.chad_utche);
        imageList.add(R.drawable.noton_noton_payra);
        imageList.add(R.drawable.ata_gace_tota);
        imageList.add(R.drawable.okahe_ke);
        imageList.add(R.drawable.ay_ay_cad_mama);
        imageList.add(R.drawable.tai_tai);
       //imageList.add(R.drawable.ay_celera_ay_myera);
        imageList.add(R.drawable.hatti_matim);
        imageList.add(R.drawable.ay_bristi);
        //10
        imageList.add(R.drawable.singho_mama);
        imageList.add(R.drawable.khon_khon_dak);
        imageList.add(R.drawable.mamar_bari);
        imageList.add(R.drawable.amder_gram);
        imageList.add(R.drawable.gum_porani);
        imageList.add(R.drawable.dol_dol_duline);
        imageList.add(R.drawable.amader_coto_nodi);
        imageList.add(R.drawable.amr_pon);
        imageList.add(R.drawable.provati);
        imageList.add(R.drawable.ay_ay_mani);
        imageList.add(R.drawable.kana_bogir_sa);
        imageList.add(R.drawable.itol_bitol);
        imageList.add(R.drawable.hon_pon);
        imageList.add(R.drawable.vor_holo_dor_kholo);
        imageList.add(R.drawable.ay_re_ay_tyia);
        imageList.add(R.drawable.ami_hobo);
        imageList.add(R.drawable.bak_bakum_payra);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
              Log.d("TAG", "The interstitial wasn't loaded yet.");
        }

    }
}
