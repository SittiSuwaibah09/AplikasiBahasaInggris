package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(Latihan1Layout.this, QuizActivity.class);
                    startActivity(intent);
                }
            }
        });
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
