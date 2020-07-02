package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class KotakDialog2 extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.lampu_layout, container, false);
        Button button = (Button) view.findViewById(R.id.btn_close);
        Button button1 = (Button) view.findViewById(R.id.tambah_jawab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tutup();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tambah();
            }
        });
        return view;
    }
    private void Tutup() {
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
    private void Tambah(){
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}
