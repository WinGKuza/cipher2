package com.example.cipher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    private final int SPLASH_DISPLEY_LENGTH = 1000;//время заставки в ms
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent shellIntend = new Intent(SplashScreen.this, Shell.class);
                SplashScreen.this.startActivity(shellIntend);
                SplashScreen.this.finish();

            }
        },SPLASH_DISPLEY_LENGTH);
        }
    //Сист кнопка назад
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
    }

