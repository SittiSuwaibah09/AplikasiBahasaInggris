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

public class VocabularyLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_layout);

        ListView listView = (ListView) findViewById(R.id.listView);

        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyPronoun.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyNoun.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyVerb.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyAdjective.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyAdverb.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyPreposition.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyConjunction.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyInterjection.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyFruitName.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyAnimalName.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyProfession.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyLyLess.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyNumber.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyWeather.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyBody.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(VocabularyLayout.this, VocabularyColor.class);
                    startActivity(intent);
                }
            }
        });
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescription[] = getResources().getStringArray(R.array.items_description);
        int rImg[] = {R.drawable.kosakata};
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescription[i], rImg[0]));
        }
        return list;
    }
}
