package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class goCipher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_cipher);
        getSupportActionBar().hide();
        Intent intent1 = getIntent();
        int Chose = intent1.getIntExtra("chose", 3);
        int What = intent1.getIntExtra("cipher", 0);
        if (What == 2) disableEditText(findViewById(R.id.editText2));
        if (What == 3) disableEditText(findViewById(R.id.editText));
        if (What == 4 || What == 5) {
            disableEditText(findViewById(R.id.editText));
            disableEditText(findViewById(R.id.editText2));
        }
        Intent intent2 = new Intent(goCipher.this, MessageActivity.class);
        //отключение ненужных editText



        intent2.putExtra("message", ""); //Добавляем в интенд ключ
        intent2.putExtra("message1", ""); //Добавляем в интенд наш текст
        intent2.putExtra("message2", ""); //Добавляем в интенд наш алфавит
        intent2.putExtra("message3",What); //Добавляем в интенд номер шифра
        intent2.putExtra("message4",Chose); //Добавляем в интенд выбор
        if (Chose==3){
            startActivity(intent2);
            finish();
        }
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                String key = editText.getText().toString();
                intent2.putExtra("message", key); //Добавляем в интенд ключ
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                String m = editText1.getText().toString();
                intent2.putExtra("message1", m); //Добавляем в интенд наш текст
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                String alf = editText2.getText().toString();
                intent2.putExtra("message2", alf); //Добавляем в интенд наш алфавит
                switch (What){
                    case 1:
                        boolean p3 = true;
                        char[] sK = key.toCharArray();
                        for (int i=0;i<key.length();i++){
                            p3 = true;
                            if ((int)sK[i] == 1025 || (int)sK[i] == 1105 || ((int)sK[i]<=1103 && (int)sK[i]>=1040)){
                            } else {
                                p3 = false;
                                Toast toast = Toast.makeText(getApplicationContext(), "Неправильные символы в ключе", Toast.LENGTH_SHORT);toast.show();
                                break;
                            }
                        }
                        if (alf.length()==33 || alf.equals("")) {
                            char[] sA = alf.toCharArray();
                            boolean p1 = true;
                            for (int i=0;i<alf.length();i++){
                                p1 = true;
                                if ((int)sA[i] == 1025 || (int)sA[i] == 1105 || (sA[i]<=1103 && sA[i]>=1040)){
                                } else {
                                    p1 = false;
                                    Toast toast = Toast.makeText(getApplicationContext(), "Неправильные символы в алфавите", Toast.LENGTH_SHORT);toast.show();
                                    break;
                                }
                            }
                            boolean p2 = true;
                            for (int i = 0; i < alf.length(); i++) {
                                p2 = true;
                                for (int j = i + 1; j < alf.length(); j++) {
                                    if (sA[i] == sA[j]) {
                                        p2 = false;
                                        Toast toast = Toast.makeText(getApplicationContext(), "Символы в алфавите повторяются", Toast.LENGTH_SHORT);toast.show();
                                        break;
                                    }
                                }
                                if(!p2) break;
                            }
                            if(p1 && p2 && p3){
                                startActivity(intent2);
                                finish();
                            }
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Длина алфавита должа быть 33 символа!", Toast.LENGTH_SHORT);toast.show();
                        }
                        break;
                    case 2:
                        boolean a1=true;
                        try {
                            Integer.parseInt(key);
                        } catch (NumberFormatException e) {
                            Toast toast = Toast.makeText(getApplicationContext(), "Введите числовое значение для смещения!", Toast.LENGTH_SHORT);toast.show();
                            a1=false;
                        }
                        if (a1){
                            startActivity(intent2);
                            finish();
                        }
                    break;
                    case 3:
                        if (alf.length()==33 || alf.equals("")) {
                            char[] sA = alf.toCharArray();
                            boolean p1 = true;
                            for (int i=0;i<alf.length();i++){
                                p1 = true;
                                if ((int)sA[i] == 1025 || (int)sA[i] == 1105 || (sA[i]<=1103 && sA[i]>=1040)){
                                } else {
                                    p1 = false;
                                    Toast toast = Toast.makeText(getApplicationContext(), "Неправильные символы в алфавите", Toast.LENGTH_SHORT);toast.show();
                                    break;
                                }
                            }
                            boolean p2 = true;
                            for (int i = 0; i < alf.length(); i++) {
                                p2 = true;
                                for (int j = i + 1; j < alf.length(); j++) {
                                    if (sA[i] == sA[j]) {
                                        p2 = false;
                                        Toast toast = Toast.makeText(getApplicationContext(), "Символы в алфавите повторяются", Toast.LENGTH_SHORT);toast.show();
                                        break;
                                    }
                                }
                                if(!p2) break;
                            }
                            if(p1 && p2){
                                startActivity(intent2);
                                finish();
                            }
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Длина алфавита должа быть 33 символа!", Toast.LENGTH_SHORT);toast.show();
                        }
                        break;
                    case 4:
                        boolean p1 = true;
                        m=m.toLowerCase();
                        for(int i=0;i<m.length();i++){
                            if(!((int) m.charAt(i)==45 || (int) m.charAt(i)==32 || ((int) m.charAt(i)>=48 && (int) m.charAt(i)<=57))){
                                p1=false;
                                break;
                            }
                        }
                        if(p1){
                            startActivity(intent2);
                            finish();
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Неправильные символы в сообщении", Toast.LENGTH_SHORT);toast.show();
                        }
                        break;
                    case 5:
                        if (Chose==2){
                            boolean p15 = true;
                            m=m.toLowerCase();
                            for(int i=0;i<m.length();i++){
                                if(!((int) m.charAt(i)==32 || (int) m.charAt(i)==48 || (int) m.charAt(i)==49)){
                                    p15=false;
                                    System.out.println(123);
                                    break;
                                }
                            }
                            if(p15){
                                startActivity(intent2);
                                finish();
                            } else {
                                Toast toast = Toast.makeText(getApplicationContext(), "Неправильные символы в сообщении", Toast.LENGTH_SHORT);toast.show();
                            }
                        } else {
                            startActivity(intent2);
                            finish();
                        }
                        break;
                }
            }
        });
        goTo(What);
    }
    private void goTo(int W) {
        int a=W;
    }
        private void disableEditText(EditText editText) {
        editText.setFocusable(false);
        editText.setEnabled(false);
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        editText.setVisibility(View.INVISIBLE);
    }

    //Сист кнопка назад
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(this, Shell.class);
        startActivity(intent);
        finish();
    }
}