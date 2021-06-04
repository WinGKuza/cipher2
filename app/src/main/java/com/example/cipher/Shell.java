package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Shell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell);
        getSupportActionBar().hide();
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shell.this, MainActivity.class);
                intent.putExtra("chose", 1);
                startActivity(intent);
                finish();
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shell.this, MainActivity.class);
                intent.putExtra("chose", 2);
                startActivity(intent);
                finish();
            }
        });
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shell.this, MainActivity.class);
                intent.putExtra("chose", 3);
                startActivity(intent);
                finish();
            }
        });
        Intent intent = getIntent();
    }
    //Сист кнопка назад
    @Override
    public void onBackPressed() { finishAffinity(); }
}