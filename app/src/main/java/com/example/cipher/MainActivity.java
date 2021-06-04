package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class MainActivity extends AppCompatActivity {

    /*static boolean a = true;
    Dialog dialog;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int Chose = intent.getIntExtra("chose", 3);
        /*dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.previewdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
        TextView btnclose = (TextView) dialog.findViewById(R.id.btnclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        if (a) {
            dialog.show();
            a = false;
        }*/


        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() { //Виженер
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, goCipher.class);
                intent1.putExtra("cipher", 1);
                intent1.putExtra("chose", Chose);
                startActivity(intent1);
                finish();
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, goCipher.class);
                intent1.putExtra("cipher", 2);
                intent1.putExtra("chose", Chose);
                startActivity(intent1);
                finish();
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, goCipher.class);
                intent1.putExtra("cipher", 3);
                intent1.putExtra("chose", Chose);
                startActivity(intent1);
                finish();
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, goCipher.class);
                if (Chose==1){
                    Toast toast = Toast.makeText(getApplicationContext(), "Временно недоступно", Toast.LENGTH_SHORT);toast.show();
                } else {
                    intent1.putExtra("cipher", 4);
                    intent1.putExtra("chose", Chose);
                    startActivity(intent1);
                    finish();
                }
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, goCipher.class);
                intent1.putExtra("cipher", 5);
                intent1.putExtra("chose", Chose);
                startActivity(intent1);
                finish();
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "В следующих версиях!", Toast.LENGTH_SHORT);toast.show();
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "В следующих версиях!", Toast.LENGTH_SHORT);toast.show();
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "В следующих версиях!", Toast.LENGTH_SHORT);toast.show();
            }
        });
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "В следующих версиях!", Toast.LENGTH_SHORT);toast.show();
            }
        });

        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "В следующих версиях!", Toast.LENGTH_SHORT);toast.show();
            }
        });
        getSupportActionBar().hide();
    }
    public void back(View view) {
        Intent intent = new Intent(this, Shell.class);
        startActivity(intent);
        finish();
    }
    //Сист кнопка назад
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Shell.class);
        startActivity(intent);
        finish();
    }
}


    /*<Button
        android:id="@+id/buttoni"
        android:layout_width="67dp"
        android:layout_height="53dp"
        android:backgroundTint="#212121"
        android:text="Info"
        android:textColor="#BDBDBD"
        android:textSize="12dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />*/