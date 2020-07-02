package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_layout);

        Button petunjuk = findViewById(R.id.petunjuk);
        petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilkanPetunjuk();
            }
        });

        Button toko = findViewById(R.id.toko);
        toko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilkanToko();
            }
        });
    }
    public void TampilkanPetunjuk(){
        KotakDialog kotakDialog = new KotakDialog();
        kotakDialog.show(getSupportFragmentManager(), "kotak dialog");
    }
    public void TampilkanToko(){
        KotakDialog1 kotakDialog1 = new KotakDialog1();
        kotakDialog1.show(getSupportFragmentManager(), "kotak dialog1");
    }
    public void Play(View view){
        Intent intent = new Intent(GameLayout.this, GameActivity.class);
        startActivity(intent);
    }
    public void Tutup(View view){
        Intent intent = new Intent(GameLayout.this, MainActivity.class);
        startActivity(intent);
    }
    public void Kisi(View view){
        Intent intent = new Intent(GameLayout.this, KisiLayout.class);
        startActivity(intent);
    }
}
