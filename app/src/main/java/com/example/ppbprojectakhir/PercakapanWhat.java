
package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PercakapanWhat extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan_what);

        pdfView= (PDFView)findViewById(R.id.pdfView2);
        pdfView.fromAsset("Whats your name.pdf")
                .load();
        pdfView.zoomTo((float) 1.7);
        Toast.makeText(this, "Tunggu  beberapa saat. \n Sedang memuat data...", Toast.LENGTH_SHORT).show();

    }
}