
package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class TensesPastFuPerCon extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenses_past_fu_per_con);

        pdfView= (PDFView)findViewById(R.id.pdfView15);
        pdfView.fromAsset("Past Future Perfect Continuous.pdf")
                .load();
        pdfView.zoomTo((float) 1.7);
        Toast.makeText(this, "Tunggu  beberapa saat. \n Sedang memuat data...", Toast.LENGTH_SHORT).show();

    }
}