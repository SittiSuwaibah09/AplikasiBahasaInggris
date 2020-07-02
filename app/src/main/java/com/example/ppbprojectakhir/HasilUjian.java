package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HasilUjian extends AppCompatActivity {

    public static int a;
    private TextView levell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_ujian);

        TextView benar = (TextView) findViewById(R.id.jawabbenar);
        TextView salah = (TextView) findViewById(R.id.jawabsalah);
        TextView nilai = (TextView) findViewById(R.id.jawabnilai);
        TextView ket = (TextView) findViewById(R.id.jawabket);
        TextView txt = (TextView) findViewById(R.id.keterangan);
        levell = (TextView) findViewById(R.id.jawablevel);

        ImageView gambar = (ImageView) findViewById(R.id.gambar);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int level = intent.getExtras().getInt("level");
        if(level == 1){
            levell.setText("Level 1");
        }
        if(level == 2){
            levell.setText("Level 2");
        }
        if(level == 3){
            levell.setText("Level 3");
        }
        if(level == 4){
            levell.setText("Level 4");
        }
        if(level == 5){
            levell.setText("Level 5");
        }
        if(level == 6){
            levell.setText("Level 6");
        }
        if(level == 7){
            levell.setText("Level 7");
        }
        if(level == 8){
            levell.setText("Level 8");
        }
        if(level == 9){
            levell.setText("Level 9");
        }
        if(level == 10){
            levell.setText("Level 10");
        }
        if(level == 11){
            levell.setText("Level 11");
        }
        if(level == 12){
            levell.setText("Level 12");
        }
        benar.setText(Integer.toString(score));
        salah.setText(Integer.toString(10-score));
        nilai.setText(Integer.toString(score*10));

        if(score >= 6){
            gambar.setImageResource(R.drawable.menang);
            txt.setText("Kamu Berhasil");
            ket.setText("Berhasil");
            a = 1;
        }
        else{
            gambar.setImageResource(R.drawable.kalah1);
            txt.setText("Kamu Gagal");
            ket.setText("Gagal");
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HasilUjian.this, UjianActivity.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(HasilUjian.this, UjianLayout.class);
        startActivity(intent);
    }
}

