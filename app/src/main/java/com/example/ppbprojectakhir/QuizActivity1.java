package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.ppbprojectakhir.R.id.soal;

public class QuizActivity1 extends AppCompatActivity {

    private QuestionBank1 mQuestionLibrary = new QuestionBank1();
    //private TextView mScoreView;
    private TextView mQuestionView;
    private TextView mQuestionView1;
    private TextView mQuestionView2;
    private TextView mQuestionView3;
    private TextView mQuestionView4;
    private TextView mQuestionView5;
    private TextView mQuestionView6;
    private TextView mQuestionView7;
    private TextView mQuestionView8;
    private TextView mQuestionView9;

    private String mAnswer;
    private String mAnswer1;
    private String mAnswer2;
    private String mAnswer3;
    private String mAnswer4;
    private String mAnswer5;
    private String mAnswer6;
    private String mAnswer7;
    private String mAnswer8;
    private String mAnswer9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        mQuestionView = (TextView)findViewById(soal);
        mQuestionView1 = (TextView)findViewById(R.id.soal2);
        mQuestionView2 = (TextView) findViewById(R.id.soal3);
        mQuestionView3 = (TextView) findViewById(R.id.soal4);
        mQuestionView4 = (TextView) findViewById(R.id.soal5);
        mQuestionView5 = (TextView) findViewById(R.id.soal6);
        mQuestionView6 = (TextView) findViewById(R.id.soal7);
        mQuestionView7 = (TextView) findViewById(R.id.soal8);
        mQuestionView8 = (TextView) findViewById(R.id.soal9);
        mQuestionView9 = (TextView) findViewById(R.id.soal10);

        mQuestionView.setText(mQuestionLibrary.getQuestion(0));
        mQuestionView1.setText(mQuestionLibrary.getQuestion(1));
        mQuestionView2.setText(mQuestionLibrary.getQuestion(2));
        mQuestionView3.setText(mQuestionLibrary.getQuestion(3));
        mQuestionView4.setText(mQuestionLibrary.getQuestion(4));
        mQuestionView5.setText(mQuestionLibrary.getQuestion(5));
        mQuestionView6.setText(mQuestionLibrary.getQuestion(6));
        mQuestionView7.setText(mQuestionLibrary.getQuestion(7));
        mQuestionView8.setText(mQuestionLibrary.getQuestion(8));
        mQuestionView9.setText(mQuestionLibrary.getQuestion(9));
    }

    public void onClick(View view) {
        int benar = 0;

        mAnswer = mQuestionLibrary.getCorrectAnswer(0);
        mAnswer1 = mQuestionLibrary.getCorrectAnswer(1);
        mAnswer2 = mQuestionLibrary.getCorrectAnswer(2);
        mAnswer3 = mQuestionLibrary.getCorrectAnswer(3);
        mAnswer4 = mQuestionLibrary.getCorrectAnswer(4);
        mAnswer5 = mQuestionLibrary.getCorrectAnswer(5);
        mAnswer6 = mQuestionLibrary.getCorrectAnswer(6);
        mAnswer7 = mQuestionLibrary.getCorrectAnswer(7);
        mAnswer8 = mQuestionLibrary.getCorrectAnswer(8);
        mAnswer9 = mQuestionLibrary.getCorrectAnswer(9);

        EditText edit = (EditText)findViewById(R.id.inp);
        EditText edit1 = (EditText)findViewById(R.id.inp2);
        EditText edit2 = (EditText)findViewById(R.id.inp3);
        EditText edit3 = (EditText)findViewById(R.id.inp4);
        EditText edit4 = (EditText)findViewById(R.id.inp5);
        EditText edit5 = (EditText)findViewById(R.id.inp6);
        EditText edit6 = (EditText)findViewById(R.id.inp7);
        EditText edit7 = (EditText)findViewById(R.id.inp8);
        EditText edit8 = (EditText)findViewById(R.id.inp9);
        EditText edit9 = (EditText)findViewById(R.id.inp10);

        TextView salah = (TextView) findViewById(R.id.salah);
        TextView salah1 = (TextView) findViewById(R.id.salah2);
        TextView salah2 = (TextView) findViewById(R.id.salah3);
        TextView salah3 = (TextView) findViewById(R.id.salah4);
        TextView salah4 = (TextView) findViewById(R.id.salah5);
        TextView salah5 = (TextView) findViewById(R.id.salah6);
        TextView salah6 = (TextView) findViewById(R.id.salah7);
        TextView salah7 = (TextView) findViewById(R.id.salah8);
        TextView salah8 = (TextView) findViewById(R.id.salah9);
        TextView salah9 = (TextView) findViewById(R.id.salah10);

        ImageView gambar = (ImageView) findViewById(R.id.gambar);
        ImageView gambar1 = (ImageView) findViewById(R.id.gambar2);
        ImageView gambar2 = (ImageView) findViewById(R.id.gambar3);
        ImageView gambar3 = (ImageView) findViewById(R.id.gambar4);
        ImageView gambar4 = (ImageView) findViewById(R.id.gambar5);
        ImageView gambar5 = (ImageView) findViewById(R.id.gambar6);
        ImageView gambar6 = (ImageView) findViewById(R.id.gambar7);
        ImageView gambar7 = (ImageView) findViewById(R.id.gambar8);
        ImageView gambar8 = (ImageView) findViewById(R.id.gambar9);
        ImageView gambar9 = (ImageView) findViewById(R.id.gambar10);

        TextView a = (TextView) findViewById(R.id.benar);
        TextView b = (TextView) findViewById(R.id.salahh);
        TextView c = (TextView) findViewById(R.id.nilai);

        LinearLayout mainLayout = (LinearLayout)this.findViewById(R.id.hasil);

        Button button = (Button)findViewById(R.id.cek);
        if (edit.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 1 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit1.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 2 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit2.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 3 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit3.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 4 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit4.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 5 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit5.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 6 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit6.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 7 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit7.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 8 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit8.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 9 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else if (edit9.getText().toString().equals("")){
            Toast.makeText(QuizActivity1.this, "Soal nomer 10 belum diisi", Toast.LENGTH_SHORT).show();
        }
        else {
            if (edit.getText().toString() != ""){
                if (edit.getText().toString().equals(mAnswer)) {
                    gambar.setImageResource(R.drawable.centang1);
                    gambar.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar.setImageResource(R.drawable.silang);
                    gambar.setVisibility(ImageView.VISIBLE);
                    salah.setText(mAnswer);
                }
            }
            if (edit1.getText().toString() != ""){
                if (edit1.getText().toString().equals(mAnswer1)) {
                    gambar1.setImageResource(R.drawable.centang1);
                    gambar1.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar1.setImageResource(R.drawable.silang);
                    gambar1.setVisibility(ImageView.VISIBLE);
                    salah1.setText(mAnswer1);
                }
            }
            if (edit2.getText().toString() != ""){
                if (edit2.getText().toString().equals(mAnswer2)) {
                    gambar2.setImageResource(R.drawable.centang1);
                    gambar2.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar2.setImageResource(R.drawable.silang);
                    gambar2.setVisibility(ImageView.VISIBLE);
                    salah2.setText(mAnswer2);
                }
            }
            if (edit3.getText().toString() != ""){
                if (edit3.getText().toString().equals(mAnswer3)) {
                    gambar3.setImageResource(R.drawable.centang1);
                    gambar3.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar3.setImageResource(R.drawable.silang);
                    gambar3.setVisibility(ImageView.VISIBLE);
                    salah3.setText(mAnswer3);
                }
            }
            if (edit4.getText().toString() != ""){
                if (edit4.getText().toString().equals(mAnswer4)) {
                    gambar4.setImageResource(R.drawable.centang1);
                    gambar4.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar4.setImageResource(R.drawable.silang);
                    gambar4.setVisibility(ImageView.VISIBLE);
                    salah4.setText(mAnswer4);
                }
            }
            if (edit5.getText().toString() != ""){
                if (edit5.getText().toString().equals(mAnswer5)) {
                    gambar5.setImageResource(R.drawable.centang1);
                    gambar5.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar5.setImageResource(R.drawable.silang);
                    gambar5.setVisibility(ImageView.VISIBLE);
                    salah5.setText(mAnswer5);
                }
            }
            if (edit6.getText().toString() != ""){
                if (edit6.getText().toString().equals(mAnswer6)) {
                    gambar6.setImageResource(R.drawable.centang1);
                    gambar6.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar6.setImageResource(R.drawable.silang);
                    gambar6.setVisibility(ImageView.VISIBLE);
                    salah6.setText(mAnswer6);
                }
            }
            if (edit7.getText().toString() != ""){
                if (edit7.getText().toString().equals(mAnswer7)) {
                    gambar7.setImageResource(R.drawable.centang1);
                    gambar7.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar7.setImageResource(R.drawable.silang);
                    gambar7.setVisibility(ImageView.VISIBLE);
                    salah7.setText(mAnswer7);
                }
            }
            if (edit8.getText().toString() != ""){
                if (edit8.getText().toString().equals(mAnswer8)) {
                    gambar8.setImageResource(R.drawable.centang1);
                    gambar8.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar8.setImageResource(R.drawable.silang);
                    gambar8.setVisibility(ImageView.VISIBLE);
                    salah8.setText(mAnswer8);
                }
            }
            if (edit9.getText().toString() != ""){
                if (edit9.getText().toString().equals(mAnswer9)) {
                    gambar9.setImageResource(R.drawable.centang1);
                    gambar9.setVisibility(ImageView.VISIBLE);
                    benar = benar + 1;
                } else {
                    gambar9.setImageResource(R.drawable.silang);
                    gambar9.setVisibility(ImageView.VISIBLE);
                    salah9.setText(mAnswer9);
                }
            }
            int salahhh = 10 - benar;
            int nilai = benar * 10;
            a.setText(Integer.toString(benar));
            b.setText(Integer.toString(salahhh));
            c.setText(Integer.toString(nilai));
            mainLayout.setVisibility(LinearLayout.VISIBLE);
            button.setText("Kembali Ke Menu");
            button.setBackgroundColor(getResources().getColor(R.color.merah));
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuizActivity1.this, Latihan2Layout.class);
                    startActivity(intent);
                }
            });
        }
    }
}