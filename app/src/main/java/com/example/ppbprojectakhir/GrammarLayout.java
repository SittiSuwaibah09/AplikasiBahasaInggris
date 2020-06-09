package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(GrammarLayout.this, Pronoun.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(GrammarLayout.this, Noun.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(GrammarLayout.this, Article.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(GrammarLayout.this, PluralSingular.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(GrammarLayout.this, Countable.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(GrammarLayout.this, Adjective.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(GrammarLayout.this, HasHave.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(GrammarLayout.this, Demonstrative.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(GrammarLayout.this, ThisThese.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(GrammarLayout.this, ThatThose.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(GrammarLayout.this, There.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(GrammarLayout.this, NounPhrase.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(GrammarLayout.this, Quantifier.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(GrammarLayout.this, SomeAny.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(GrammarLayout.this, MuchMany.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(GrammarLayout.this, ALittle.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(GrammarLayout.this, Adverbs.class);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(GrammarLayout.this, Verb.class);
                    startActivity(intent);
                }
                if (position == 18) {
                    Intent intent = new Intent(GrammarLayout.this, AuxiliaryVerbs.class);
                    startActivity(intent);
                }
                if (position == 19) {
                    Intent intent = new Intent(GrammarLayout.this, Prepositions.class);
                    startActivity(intent);
                }
                if (position == 20) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarConjunction.class);
                    startActivity(intent);
                }
                if (position == 21) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarInterjection.class);
                    startActivity(intent);
                }
                if (position == 22) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarPassVoice.class);
                    startActivity(intent);
                }
                if (position == 23) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarQuestionTag.class);
                    startActivity(intent);
                }
                if (position == 24) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarDegreeComp.class);
                    startActivity(intent);
                }
                if (position == 25) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarDirectInderect.class);
                    startActivity(intent);
                }
                if (position == 26) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarPreferences.class);
                    startActivity(intent);
                }
                if (position == 27) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarExclamatory.class);
                    startActivity(intent);
                }
                if (position == 28) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarDeterminers.class);
                    startActivity(intent);
                }
                if (position == 29) {
                    Intent intent = new Intent(GrammarLayout.this, GrammarConSentence.class);
                    startActivity(intent);
                }
            }
        });
    }

    private ArrayList<Item> generateItemList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name2);
        String itemDescription[] = {"Grammar bahasa inggris"};
        int rImg[] = {R.drawable.grammar};
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescription[0], rImg[0]));
        }
        return list;
    }
}
