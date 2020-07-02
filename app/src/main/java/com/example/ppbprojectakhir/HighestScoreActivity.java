package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        TextView benar = (TextView) findViewById(R.id.jawabbenar);
        TextView salah = (TextView) findViewById(R.id.jawabsalah);
        TextView nilai = (TextView) findViewById(R.id.jawabnilai);
        TextView txt = (TextView) findViewById(R.id.keterangan);

        ImageView gambar = (ImageView) findViewById(R.id.gambar);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        benar.setText(Integer.toString(score));
        salah.setText(Integer.toString(10-score));
        nilai.setText(Integer.toString(score*10));

        if(score >= 6){
            gambar.setImageResource(R.drawable.menang);
            txt.setText("Kamu Berhasil");
        }
        else{
            gambar.setImageResource(R.drawable.kalah1);
            txt.setText("Kamu Gagal");
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighestScoreActivity.this, QuizActivity.class);
        startActivity(intent);
    }
    public void onClick1(View view) {
        Intent intent = new Intent(HighestScoreActivity.this, Latihan1Layout.class);
        startActivity(intent);
    }
}

