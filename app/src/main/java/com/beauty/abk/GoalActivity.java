package com.beauty.abk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GoalActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4, img5, img6, img7;
    private static ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        img1 = (ImageView) findViewById(R.id.gor_kleb);
        img2 = (ImageView) findViewById(R.id.kerumah_tmn);
        img3 = (ImageView) findViewById(R.id.kolam);
        img4 = (ImageView) findViewById(R.id.lapangan);
        img5 = (ImageView) findViewById(R.id.masjid);
        img6 = (ImageView) findViewById(R.id.sekolah);
        img7 = (ImageView) findViewById(R.id.warung);

        back = (ImageView) findViewById(R.id.home);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.gor_klebengan);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.kerumah_teman);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.kolam_renang);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.lapangan);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.masjid);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.sekolah);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.warung);

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
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
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

    public void click() {


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBook34SatuActivity();
            }
        });

    }

    public void openBook34SatuActivity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
