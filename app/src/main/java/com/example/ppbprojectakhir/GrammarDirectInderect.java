
package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class GrammarDirectInderect extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_direct_inderect);

        pdfView= (PDFView)findViewById(R.id.pdfView25);
        pdfView.fromAsset("Direct and Indirect Speech.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu  beberapa saat. \n Sedang memuat data...", Toast.LENGTH_SHORT).show();

    }
}