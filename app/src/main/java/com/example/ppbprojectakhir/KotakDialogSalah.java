package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class KotakDialogSalah extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.game_salah, container, false);
        Button button = (Button) view.findViewById(R.id.selesai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kembali();
            }
        });
        return view;
    }
    private void Kembali() {
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
        ((GameActivity)getActivity()).updateQuestion();
    }
}
