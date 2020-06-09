
package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class SomeAny extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_any);

        pdfView= (PDFView)findViewById(R.id.pdfView13);
        pdfView.fromAsset("Some and Any.pdf")
                .load();
        pdfView.zoomTo((float) 3.5);
        Toast.makeText(this, "Tunggu  beberapa saat. \n Sedang memuat data...", Toast.LENGTH_SHORT).show();

    }
}