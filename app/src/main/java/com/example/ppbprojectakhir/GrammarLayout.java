package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ppbprojectakhir.model.Item;

import com.example.ppbprojectakhir.adapter.CustomListAdapter;

import java.util.ArrayList;

public class GrammarLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_layout);

        ListView listView = (ListView) findViewById(R.id.listView2);

        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());
        listView.setAdapter(adapter);
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name2);
        String itemDescription[] = getResources().getStringArray(R.array.items_description2);
        int rImg[] = {R.drawable.grammar};
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescription[i], rImg[0]));
        }
        return list;
    }
}
