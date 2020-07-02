package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class KotakDialogLanjut extends DialogFragment {
    private int a = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.game_lanjut, container, false);
        Button button = (Button) view.findViewById(R.id.lanjut);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lanjut();
            }
        });
        return view;
    }
    public void Lanjut() {
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
        ((GameActivity)getActivity()).updateQuestion();
    }
}
