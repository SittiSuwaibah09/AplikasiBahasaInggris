
package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Quantifier extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantifier);

        pdfView= (PDFView)findViewById(R.id.pdfView12);
        pdfView.fromAsset("Quantifier.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu  beberapa saat. \n Sedang memuat data...", Toast.LENGTH_SHORT).show();

    }
}