package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UjianLayout extends AppCompatActivity {

    private ImageView kunci1;
    private ImageView kunci2;
    private ImageView kunci3;
    private ImageView kunci4;
    private ImageView kunci5;
    private ImageView kunci6;
    private ImageView kunci7;
    private ImageView kunci8;
    private ImageView kunci9;
    private ImageView kunci10;
    private ImageView kunci11;

    private static int v;
    private static int v1;
    private static int v2;
    private static int v3;
    private static int v4;
    private static int v5;
    private static int v6;
    private static int v7;
    private static int v8;
    private static int v9;
    private static int v10;
    private static int v11;
    private int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujian_layout);
        final UjianActivity activity = new UjianActivity();
        final HasilUjian hasilUjian = new HasilUjian();
        v = activity.a;
        x = hasilUjian.a;
        if (v == 1 && x == 1){
            kunci1 = (ImageView) findViewById(R.id.kunci1);
            kunci1.setImageResource(R.drawable.gembokbuka);
            kunci1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v1 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity1.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v1 == 1 && x == 1){
            kunci2 = (ImageView) findViewById(R.id.kunci2);
            kunci2.setImageResource(R.drawable.gembokbuka);
            kunci2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v2 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity2.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v2 == 1 && x == 1){
            kunci3 = (ImageView) findViewById(R.id.kunci3);
            kunci3.setImageResource(R.drawable.gembokbuka);
            kunci3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v3 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v3 == 1 && x == 1){
            kunci4 = (ImageView) findViewById(R.id.kunci4);
            kunci4.setImageResource(R.drawable.gembokbuka);
            kunci4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v4 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v4 == 1 && x == 1){
            kunci5 = (ImageView) findViewById(R.id.kunci5);
            kunci5.setImageResource(R.drawable.gembokbuka);
            kunci5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v5 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v5 == 1 && x == 1){
            kunci6 = (ImageView) findViewById(R.id.kunci6);
            kunci6.setImageResource(R.drawable.gembokbuka);
            kunci6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v6 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v6 == 1 && x == 1){
            kunci7 = (ImageView) findViewById(R.id.kunci7);
            kunci7.setImageResource(R.drawable.gembokbuka);
            kunci7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v7 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v7 == 1 && x == 1){
            kunci8 = (ImageView) findViewById(R.id.kunci8);
            kunci8.setImageResource(R.drawable.gembokbuka);
            kunci8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v8 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v8 == 1 && x == 1){
            kunci9 = (ImageView) findViewById(R.id.kunci9);
            kunci9.setImageResource(R.drawable.gembokbuka);
            kunci9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v9 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v9 == 1 && x == 1){
            kunci10 = (ImageView) findViewById(R.id.kunci10);
            kunci10.setImageResource(R.drawable.gembokbuka);
            kunci10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v10 = 1;
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}

        if (v10 == 1 && x == 1){
            kunci11 = (ImageView) findViewById(R.id.kunci11);
            kunci11.setImageResource(R.drawable.gembokbuka);
            kunci11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
                    startActivity(intent);
                }
            });
        }
        else {}
    }

    public void Pindah(View view) {
        Intent intent = new Intent(UjianLayout.this, UjianActivity.class);
        startActivity(intent);
    }
}
