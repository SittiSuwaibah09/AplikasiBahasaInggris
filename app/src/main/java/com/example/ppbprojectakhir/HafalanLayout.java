package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan1.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan2.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan3.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan4.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan5.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan6.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan7.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan8.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan9.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan10.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan11.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan12.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan13.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan14.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan15.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(HafalanLayout.this, Hafalan16.class);
                    startActivity(intent);
                }

            }
        });
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
