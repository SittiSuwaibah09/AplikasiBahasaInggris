package com.example.ppbprojectakhir;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ppbprojectakhir.adapter.CustomListAdapter1;
import com.example.ppbprojectakhir.model.Item1;

import java.util.ArrayList;

public class Latihan1Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1_layout);

        ListView listView = (ListView) findViewById(R.id.listView4);

        CustomListAdapter1 adapter1 = new CustomListAdapter1(this, generateItemList());
        listView.setAdapter(adapter1);
    }

    private ArrayList<Item1> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name4);
        String itemDescription[] = {"0"};
        ArrayList<Item1> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item1(Integer.toString(i+1), itemNames[i], itemDescription[0]));
        }
        return list;
    }
}
