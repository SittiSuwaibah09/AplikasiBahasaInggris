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

public class TensesLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenses_layout);

        ListView listView = (ListView) findViewById(R.id.listView3);

        CustomListAdapter adapter = new CustomListAdapter(this, generateItemList());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(TensesLayout.this, TensesSimplePresent.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(TensesLayout.this, TensesPresentContinuous.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(TensesLayout.this, TensesPresentPerfect.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(TensesLayout.this, TensesPresentPerCon.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(TensesLayout.this, TensesSimplePast.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastContinuous.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastPerfect.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastPerCon.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(TensesLayout.this, TensesSimpleFuture.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(TensesLayout.this, TensesFutureContinuous.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(TensesLayout.this, TensesFuturePerfect.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(TensesLayout.this, TensesFuturePerCon.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastFuture.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastFuCon.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastFuPer.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(TensesLayout.this, TensesPastFuPerCon.class);
                    startActivity(intent);
                }
            }
        });
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name3);
        String itemDescription[] = {"Belajar Tenses"};
        int rImg[] = {R.drawable.tenses};

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescription[0], rImg[0]));
        }
        return list;
    }
}
