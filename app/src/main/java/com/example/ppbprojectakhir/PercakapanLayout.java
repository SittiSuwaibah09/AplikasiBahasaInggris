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

public class PercakapanLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan_layout);

        ListView listView = (ListView) findViewById(R.id.listView7);

        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanWhere.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanDo.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanWhat.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanAre.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanAsking.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanIam.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanParty.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(PercakapanLayout.this, PercakapanForGre.class);
                    startActivity(intent);
                }
            }
        });
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name7);
        String itemDescription[] = getResources().getStringArray(R.array.items_description7);
        int rImg[] = {R.drawable.percakapan};
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescription[i], rImg[0]));
        }
        return list;
    }
}
