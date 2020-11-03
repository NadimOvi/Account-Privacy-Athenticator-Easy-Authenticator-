package org.shadowice.flocke.easyauthenticator.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import org.shadowice.flocke.easyauthenticator.R;

public class SplashActivity extends AppCompatActivity {

    ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageview = (ImageView) findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        imageview.setAnimation(animation);
        Thread timer = new Thread()
        {

            @Override
            public void run() {
                try {
                    sleep(4000);
                    super.run();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } ;
        timer.start();
    }
}