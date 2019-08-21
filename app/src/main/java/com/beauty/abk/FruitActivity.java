package com.beauty.abk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FruitActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4,img5;
    private static ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        back = (ImageView) findViewById(R.id.home);

        img1 = (ImageView) findViewById(R.id.apel);
        img2 = (ImageView) findViewById(R.id.jeruk);
        img3 = (ImageView) findViewById(R.id.mangga);
        img4 = (ImageView) findViewById(R.id.pisang);
        img5 = (ImageView) findViewById(R.id.semang);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.apel);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.jeruk);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.mangga);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.pisang);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.semangka);


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
        });img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying())
                {
                    mp.stop();
                }
            }
        });
        click();
    }
    public void click ()
    {


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
