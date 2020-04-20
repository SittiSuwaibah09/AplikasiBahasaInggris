package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ppbprojectakhir.adapter.CustomListAdapter;
import com.example.ppbprojectakhir.model.Item;

import java.util.ArrayList;

public class HafalanLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafalan_layout);

        ListView listView = (ListView) findViewById(R.id.listView1);

        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());

        listView.setAdapter(adapter);
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name1);
        String itemDescription[] = getResources().getStringArray(R.array.items_description1);
        int rImg[] = {R.drawable.hafalan};
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescription[i], rImg[0]));
        }
        return list;
    }
}
