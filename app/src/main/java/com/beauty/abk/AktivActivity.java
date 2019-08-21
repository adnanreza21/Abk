package com.beauty.abk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AktivActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4,img5,img6,img7;
    private static ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiv);

        img1 = (ImageView) findViewById(R.id.belajar);
        img2 = (ImageView) findViewById(R.id.bermain);
        img3 = (ImageView) findViewById(R.id.bersepeda);
        img4 = (ImageView) findViewById(R.id.mengaji);
        img5 = (ImageView) findViewById(R.id.mengambil_jemuran);
        img6 = (ImageView) findViewById(R.id.mengepel);
        img7 = (ImageView) findViewById(R.id.menyapu);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.belajar);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.bermain);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.bermain_sepeda);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.mengaji);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.mengangkat_jemuran);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.mengepel);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.menyapu);

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
        });img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });img5.setOnClickListener(new View.OnClickListener() {
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
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
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
