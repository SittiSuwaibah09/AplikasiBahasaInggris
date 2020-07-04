package com.example.ppbprojectakhir;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.util.ArrayUtils;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GameActivity extends AppCompatActivity {

    private TextView mScoreView;
    private TextView mQuestionView;
    private TextView mQuestionView1;
    private TextView level;
    private int mQuestionNumber = 0;
    private String mAnswer;
    private int mScore = 0;
    private int r = 1;
    private int mPanjang;
    private Button button;
    private Button a;
    private static int q = 0;
    private String jawab = "";
    FirebaseDatabase database;
    DatabaseReference myRef;

    mySQLiteDB db = new mySQLiteDB(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mScoreView = (TextView)findViewById(R.id.score_game);
        mQuestionView = (TextView) findViewById(R.id.question);
        mQuestionView1 = (TextView) findViewById(R.id.question1);

        level = (TextView) findViewById(R.id.level);

        updateQuestion();
        updateScore(mScore);
    }

    public void updateQuestion(){
        myRef = FirebaseDatabase.getInstance().getReference().child("Games").child(String.valueOf(mQuestionNumber));

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.jawab);
                String tanya = dataSnapshot.child("pertanyaan").getValue().toString();
                String tanya1 = dataSnapshot.child("pertanyaan1").getValue().toString();
                String jawabb = dataSnapshot.child("jawaban").getValue().toString();
                int panjangjawab = Integer.parseInt(dataSnapshot.child("panjangjawaban").getValue().toString());

                mQuestionView.setText(tanya);
                mQuestionView1.setText(tanya1);
                mAnswer = jawabb;
                mPanjang = panjangjawab;

                Random randNum = new Random();
                final int[] buttons = {R.id.tombol1, R.id.tombol2, R.id.tombol3, R.id.tombol4, R.id.tombol5, R.id.tombol6, R.id.tombol7, R.id.tombol8, R.id.tombol9, R.id.tombol10, R.id.tombol11, R.id.tombol12, R.id.tombol13, R.id.tombol14, R.id.tombol15, R.id.tombol16, R.id.tombol17, R.id.tombol18};
                String[] character_trial = new String[18];

                Set<Integer> setHuruf = new LinkedHashSet<Integer>();
                while (setHuruf.size() < 18) {
                    setHuruf.add(randNum.nextInt(26)+65);
                }
                int chr_i = 0;
                for (int huruf: setHuruf)
                {
                    character_trial[chr_i++] = String.valueOf((char) huruf);
                }

                Set<Integer> setNumber = new LinkedHashSet<Integer>();
                while (setNumber.size() < mAnswer.length()) {
                    setNumber.add(randNum.nextInt(18));
                }

                int x = 0;
                for (int posAns: setNumber){
                    String chr = String.valueOf(mAnswer.charAt(x));
                    x++;
                    character_trial[posAns] = chr;
                }

                // Convert to final data character
                final String[] character = character_trial;

                final ArrayList list = new ArrayList();
                for (int a = 0; a < mPanjang; a++) {
                    button = new Button(GameActivity.this);
                    list.add(button);
                    int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, getResources().getDisplayMetrics());
                    int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
                    button.setLayoutParams(new LinearLayout.LayoutParams(width, height));
                    button.setBackgroundResource(R.drawable.borderbg);
                    linearLayout.addView(button);
                }
                for (int j = 0; j < 18; j++) {
                    final Button tombol = (Button) findViewById(buttons[j]);
                    tombol.setText(character[j]);
                    final int finalJ = j;
                    tombol.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            a = (Button) list.get(q);
                            a.setText(character[finalJ]);
                            tombol.setVisibility(View.INVISIBLE);
                            jawab += a.getText();
                            q += 1;
                            if (q == list.size()) {
                                if (mAnswer.equals(jawab)) {
                                    KotakDialogLanjut kotakDialog = new KotakDialogLanjut();
                                    kotakDialog.show(getSupportFragmentManager(), "kotak dialog lanjut");
                                    mScore += 3;
                                    updateScore(mScore);
                                    level.setText("Level" + " " + r);
                                    mQuestionNumber++;
                                } else {
                                    KotakDialogSalah kotakDialog = new KotakDialogSalah();
                                    kotakDialog.show(getSupportFragmentManager(), "kotak dialog salah");
                                    mScore -= 1;
                                    updateScore(mScore);
                                }
                                jawab = "";
                                q = 0;
                                for (int e = 0; e < list.size(); e++) {
                                    Button b = (Button) list.get(e);
                                    b.setVisibility(View.GONE);
                                }
                            }
                        }
                    });
                    tombol.setVisibility(View.VISIBLE);
                }
                r++;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
    public void Piala(View view){
        Intent intent = new Intent(GameActivity.this, KoleksiPiala.class);
        startActivity(intent);
    }
    public void Lampu(View view){
        KotakDialog2 kotakDialog = new KotakDialog2();
        kotakDialog.show(getSupportFragmentManager(), "kotak dialog2");
    }
    public void Toko(View view){
        KotakDialog1 kotakDialog = new KotakDialog1();
        kotakDialog.show(getSupportFragmentManager(), "kotak dialog1");
    }
    public void Huruf(View view){
        KotakDialog3 kotakDialog = new KotakDialog3();
        kotakDialog.show(getSupportFragmentManager(), "kotak dialog3");
    }
    public void Bom(View view){
        KotakDialog4 kotakDialog = new KotakDialog4();
        kotakDialog.show(getSupportFragmentManager(), "kotak dialog4");
    }
    public void Kembali(View view){
        Intent intent = new Intent(GameActivity.this, GameLayout.class);
        startActivity(intent);
    }
}