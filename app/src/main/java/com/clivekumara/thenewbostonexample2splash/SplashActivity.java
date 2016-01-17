package com.clivekumara.thenewbostonexample2splash;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // create object
        mediaPlayer = MediaPlayer.create(this, R.raw.sound);
        mediaPlayer.start();

        Thread timer = new Thread(){
            /**
             * Calls the <code>run()</code> method of the Runnable object the receiver
             * holds. If no Runnable is set, does nothing.
             *
             * @see Thread#start
             */
            @Override
            public void run() {

                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(getApplicationContext(),Menu.class);
                    startActivity(intent);
                }

            }
        };

        timer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
        finish();
    }
}
