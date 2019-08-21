package com.beauty.abk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DrinkActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4,img5,img6;
    private static ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        img1 = (ImageView) findViewById(R.id.air_putih);
        img2 = (ImageView) findViewById(R.id.es_teh);
        img3 = (ImageView) findViewById(R.id.es_jeruk);
        img4 = (ImageView) findViewById(R.id.susu_coklat);
        img5 = (ImageView) findViewById(R.id.jus);
        img6 = (ImageView) findViewById(R.id.sop_buah);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.airputih);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.es_teh);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.es_jeruk);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.susu_cokelat);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.jus);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.sop_buah);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });
        click();
    }
    public void click ()
    {

        back = (ImageView) findViewById(R.id.home);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34SatuActivity();
            }
        });

    }
    public void openBook34SatuActivity(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        finish();
    }

}
