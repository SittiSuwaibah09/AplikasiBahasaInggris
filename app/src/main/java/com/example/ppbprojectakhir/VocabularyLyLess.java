package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ppbprojectakhir.adapter.CustomListAdapter2;
import com.example.ppbprojectakhir.model.Item2;

import java.util.ArrayList;

public class VocabularyLyLess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_ly_less);

        ListView listView = (ListView) findViewById(R.id.listVocabulary11);

        CustomListAdapter2 adapter1 = new CustomListAdapter2(this, generateItemList());
        listView.setAdapter(adapter1);
    }

    private ArrayList<Item2> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.name_vocab11);
        String itemDescription[] = getResources().getStringArray(R.array.description_vocab11);
        ArrayList<Item2> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item2(Integer.toString(i+1), itemNames[i], itemDescription[i]));
        }
        return list;
    }
}
