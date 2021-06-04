package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().hide();
        Intent intent2 = getIntent();
        String key = intent2.getStringExtra("message");
        String m = intent2.getStringExtra("message1");
        String a = intent2.getStringExtra("message2");
        int Chose = intent2.getIntExtra("message4",3);
        TextView Text1 = (TextView) findViewById(R.id.messageText2);
        TextView Text2 = (TextView) findViewById(R.id.messageText1);
        int W = intent2.getIntExtra("message3",1);
        if (Chose==3){
            Text1.setTextSize(20);
            switch (W){
                case 1:
                    Text1.setTextSize(18);
                    Text2.setText("Шифр Виженера");
                    Text1.setText("Шифр Виженера — это последовательность шифров Цезаря с различными значениями сдвига. То есть к первой букве текста применяется преобразование, например, ROT5, ко второй, например, ROT17, и так далее. Последовательность применяемых преобразований определяется ключевой фразой, в которой каждая буква слова обозначает требуемый сдвиг, например, фраза ГДЕ ОН задает такую последовательность шифров Цезаря: ROT3-ROT4-ROT5-ROT15-ROT14, которая повторяется, пока не будет зашифрован весь текст сообщения. В данном приложении также есть возмажность вводить в разной последовательности русский алфавит.\n" +
                            "\n" +
                            "Как повествует Википедия, шифр Виженера является шифром подстановки, то есть шифром, в котором каждая буква исходного текста заменяется буквой шифр-текста. Для вскрытия подобных шифров используется частотный криптоанализ.\nhttps://clck.ru/9RFbV");
                    break;
                case 2:
                    Text2.setText("Шифр Цезаря");
                    Text1.setText("Шифр Цезаря один из наиболее древнейших известных шифров. Схема шифрования очень проста — используется сдвиг буквы алфавита на фиксированное число позиций. Используемое преобразование обычно обозначают как ROTN, где N — сдвиг, ROT — сокращение от слова ROTATE, в данном случае «циклический сдвиг».\n" +
                            "\n" +
                            "Шифр является крайне слабым и исходный текст можно восстановить просто проверив все возможные преобразования.\n" +
                            "\n" +
                            "Неалфавитные символы — знаки препинания, пробелы, цифры — не меняются.\nhttps://clck.ru/9KE6e");
                    break;
                case 3:
                    Text2.setText("Шифр Атбаш");
                    Text1.setText("Правило шифрования Атбаш состоит в замене n-й буквы алфавита буквой с номером m − n + 1, где m — число букв в алфавите. Пример для русского алфавита выглядит так:\n" +
                            "абвгдеёжзийклмнопрстуфхцчшщъыьэюя (исходный текст)\n" +
                            "яюэьыъщшчцхфутсрпонмлкйизжёедгвба (зашифрованный текст)\nhttps://clck.ru/V83C2");
                    break;
                case 4:
                    Text2.setText("Шифр А1Я33");
                    Text1.setText("Шифр подстановки — это метод шифрования, в котором элементы исходного открытого текста заменяются зашифрованным текстом в соответствии с некоторым правилом. Элементами текста могут быть отдельные символы (самый распространённый случай), пары букв, тройки букв, комбинирование этих случаев и так далее. В классической криптографии различают четыре типа шифра подстановки\n" +
                            "\nВсе буквы приводятся к нижнему регистру, зашифровывается/расшифровывается русский алфавит, все не-алфавитные символы не преобразуются. При расшифровке учтите, что числа (от 1 до 33) должны быть отделены друг от друга (чертой)."+
                            "\nhttps://clck.ru/V83Du");
                    break;
                case 5:
                    Text2.setText("Бинарный Шифр");
                    Text1.setText("Двоичный код представляет собой текст , инструкцию , процессор компьютера , или любую другую информацию , используя систему из двух символов. Часто используется двухсимвольная система «0» и «1» из двоичной системы счисления . Двоичный код присваивает шаблон двоичных цифр, также известный как биты , каждому символу, команде и т. Д. Например, двоичная строка из восьми битов может представлять любое из 256 возможных значений и, следовательно, может представлять широкий спектр различных предметов.\nhttps://clck.ru/VGhbh");
                    break;
            }
        } else {
            class goC {
                public void BINAR(String m1){
                    m1=m1.toLowerCase();
                    switch (Chose){
                        case 1:
                            Text1.setTextSize(15);
                            StringBuilder answer = new StringBuilder();
                            char[] m = new char[m1.length()*2];
                            for(int i=0;i<m1.length();i++){
                                answer.append(Integer.toBinaryString(m1.charAt(i))).append(' ');
                            }
                            Text1.setText(answer.toString());
                            break;
                        case 2:
                            int lM=m1.length(),q=0,lDM=1,i1=0,q1=0;
                            long umnoz=10000000000L,sum=0;
                            if (m1.charAt(m1.length()-1)!=' ') {
                                lM++;
                            }
                            for (int i=0;i<m1.length();i++){
                                if (m1.charAt(i)==' ') lDM++;
                            }
                            char[] SpLt = new char[m1.length()+1];
                            for (int i=0;i<m1.length();i++){
                                SpLt[i]=m1.charAt(i);
                            }
                            SpLt[m1.length()]=' ';
                            char[] splM = new char [lDM];
                            char[] SpL = new char[11];
                            while (q<lM){
                                if (SpLt[q]!=' ') {
                                    SpL[q1]=SpLt[q];
                                    q1++;
                                } else {
                                    q1=0;
                                    String inf = new String (SpL);
                                    int charCode = Integer.parseInt(inf, 2);
                                    splM[i1] = (char) charCode;
                                    i1++;
                                }
                                q++;
                            }
                            String Ndm = new String (splM);
                            Text1.setText(Ndm);
                            break;
                        case 3:
                            break;
                    }
                    // String m = "10000111111 10001000000 10000111000 10000110010 10000110101 10001000010 100000 10000110000 10000111101 10000110100 10001000000 10000110101 10000111001 ";

                }
                public void A1IA33(String m1){
                    String a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                    m1=m1.toLowerCase();
                    char[] a = a1.toCharArray();
                    char[] m = new char[m1.length()];
                    for(int i=0;i<m1.length();i++){
                        m[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                    }
                    int lMF=0;
                    for (int i = 0; i < m1.length(); i++){
                        if (m[i]=='-' || i==m1.length()-1) lMF++;
                        if (m[i]==' ') lMF+=2;
                    }
                    char[] mF = new char[lMF];
                    int q = 1, i123 = 0, sum=0, z=lMF-1;
                    for (int i = m1.length()-1; i >= 0; i--){
                        if(m[i]==' '){
                            mF[z]=a[sum-1];
                            sum=0;
                            q=1;
                            z--;
                            mF[z]=m[i];
                            z--;
                        } else {
                            if (m[i]=='-'){
                                q=1;
                                mF[z]=a[sum-1];
                                z--;
                                sum=0;
                            } else {
                                i123 = (m[i] - '0')*q;
                                //System.out.print(m[i]-'0');
                                sum+=i123;
                                q*=10;
                                if (i==0) mF[z]=a[sum-1];
                            }
                        }
                    }
                    for (int i = 0; i<lMF; i++){
                        if (mF[i]==' ') System.out.print('!');
                        System.out.println(mF[i]);
                    }
                    String Nm = new String (mF);

                    Text1.setText(Nm);
                }
                public void Atbash(String m1, String a1){
                    if (a1.equals("") || a1.length() != 33) a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                    m1=m1.toLowerCase();
                    a1=a1.toLowerCase();
                    char[] a = a1.toCharArray();
                    char[] m = new char[m1.length()];
                    char[] mF = new char[m1.length()];
                    for(int i=0;i<m1.length();i++){
                        m[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                    }
                    for (int i = 0; i < m1.length(); i++){
                        if ((int)m[i] == 1025 || (int)m[i] == 1105 || ((int)m[i]<=1103 && (int)m[i]>=1040)) { //проверка на символы
                            for (int j = 0; j < 33; j++) {
                                if(m[i]==a[j]) mF[i]=a[32-j];
                            }
                        } else {
                            mF[i]=m[i];
                        }
                    }
                    String Nm = new String (mF);
                    Text1.setText(Nm);
                    if (Chose==1){
                        Text2.setText("Зашифрованный текст:");
                    } else {
                        Text2.setText("Расшифрованный текст:");
                    }
                }
                public void Cesar(int s1, String m1){
                    s1%=33;
                    String a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя",s12=String.valueOf(s1);
                    m1=m1.toLowerCase();
                    a1=a1.toLowerCase();
                    //messageText.setText(s12);
                    char[] a = a1.toCharArray();
                    char[] m = new char[m1.length()];
                    char[] mF = new char[m1.length()];
                    for(int i=0;i<m1.length();i++){
                        m[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                    }
                    switch (Chose){
                        case 1:
                            //Шифруем
                            for (int i = 0; i < m1.length(); i++){
                                for (int j = 0; j < 33; j++){
                                    if ((int)m[i] == 1025 || (int)m[i] == 1105 || ((int)m[i]<=1103 && (int)m[i]>=1040)) { //проверка на символы
                                        if (m[i]==a[j]) mF[i]=a[(j+s1)%32];
                                    } else {
                                        mF[i]=m[i];
                                    }
                                }
                            }
                            Text2.setText("Зашифрованный текст:");
                            String Nm = new String (mF);
                            Text1.setText(Nm);
                            break;
                        case 2:
                            //Расшифровываем
                            int n=0;
                            for (int i = 0; i < m1.length(); i++){
                                if ((int)m[i] == 1025 || (int)m[i] == 1105 || ((int)m[i]<=1103 && (int)m[i]>=1040)) { //проверка на символы
                                    for (int j = 0; j < 33; j++) {
                                        if (m[i] == a[j]) {
                                            n = j - s1;
                                            if (n < 0) n += 32;
                                            mF[i] = a[n];
                                        }
                                    }
                                } else {
                                    mF[i]=m[i];
                                }
                            }
                            Text2.setText("Расшифрованный текст:");
                            String Ndm = new String (mF);
                            Text1.setText(Ndm);
                            break;
                        case 3:
                            break;
                    }
                }
                public void Viginer(String key1, String m1, String a1) {
                    if (a1.equals("")) a1="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                    key1=key1.toLowerCase();
                    m1=m1.toLowerCase();
                    a1=a1.toLowerCase();
                    char splitM[] = new char[m1.length()];
                    for(int i=0;i<m1.length();i++){
                        splitM[i]=m1.charAt(i); //пререводим наше сообщение из Str в Char
                    }
                    char t[][] = new char[34][34];
                    char[] splitA;
                    splitA = a1.toCharArray();
                    int shift=0;
                    for (int i=0; i<=33; i++){
                        for (int j=0; j<=33; j++){
                            if(i==0 && j==0) {
                                t[i][j]=' ';
                            } else {
                                shift=(j+i-1)%33;
                                t[i][j]=splitA[shift];
                            }
                        }
                    }
                    char[] K;
                    char splitK[] = new char[m1.length()];
                    K = key1.toCharArray();//пререводим наш ключ из Str в Char
                    for (int i=0; i<m1.length(); i++){
                        splitK[i]=K[i%key1.length()];//подгоняем ключ
                    }
                    String Nkey = new String (splitK);
                    //messageText.setText(Nkey);
                    char nm[] = new char[m1.length()];
                    int n1=0,n2=0,q=0;
                    switch (Chose){
                        case 1:
                            //Шифруем
                            for (int a=0; a<m1.length(); a++) {//перебор сообщения и ключа
                                if ((int)splitM[a] == 1025 || (int)splitM[a] == 1105 || ((int)splitM[a]<=1103 && (int)splitM[a]>=1040)){ //проверка на символы
                                    for (int i = 0; i < 33; i++) {
                                        if (splitM[a]==splitA[i]) n1=i+1; //поиск буквы в таблице
                                    }
                                    for (int j = 0; j < 33; j++) {
                                        if (splitK[q]==splitA[j]) n2=j; //поиск буквы в таблице
                                    }
                                    nm[a]=t[n1][n2];
                                } else {
                                    nm[a]=splitM[a];
                                    q--;
                                }
                                q++;
                            }
                            String Nm = new String (nm);
                            Text1.setText(Nm);
                            Text2.setText("Расшифрованный текст:");
                            break;
                        case 2:
                            //Расшифровываем
                            q=0;
                            for (int a=0; a<m1.length(); a++) {
                                if ((int)splitM[a] == 1025 || (int)splitM[a] == 1105 || ((int)splitM[a]<=1103 && (int)splitM[a]>=1040)) { //проверка на символы
                                    for (int i = 0; i < 33; i++) {
                                        if (splitK[q]==splitA[i]) n1=i+1; //поиск буквы в таблице
                                    }

                                    for (int j = 0; j < 33; j++) {
                                        if (splitM[a]==t[n1][j]) {
                                            n2=j+1;
                                        }  //поиск буквы в таблице}
                                    }
                                    nm[a]=t[0][n2];
                                } else {
                                    nm[a]=splitM[a];
                                    q--;
                                }
                                q++;
                            }
                            String Ndm = new String (nm);
                            Text1.setText(Ndm);
                            Text2.setText("Расшифрованный текст:");
                            break;
                        case 3:
                            break;
                    }


                    //messageText5.setText(Ndm);
                }
            }

            goC g = new goC();
            switch (W){
                case 1:
                    g.Viginer(key,m,a);
                    break;
                case 2:
                    int Ikey=Integer.parseInt(key.trim());
                    g.Cesar(Ikey,m);
                    break;
                case 3:
                    g.Atbash(m,a);
                    break;
                case 4:
                    g.A1IA33(m);
                    break;
                case 5:
                    g.BINAR(m);
                    break;
            }
        }


    }


    public void back(View view) {
        Intent intent = new Intent(this, Shell.class);
        startActivity(intent);
        finish();
    }
    //Сист кнопка назад
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(this, Shell.class);
        startActivity(intent);
        finish();
    }
}