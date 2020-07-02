package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UjianActivity9 extends AppCompatActivity {

    public TextView text;
    public static int a;
    private CountDownTimer countDownTimer;
    private final long startTime = 30 * 1000;
    private final long interval = 1 * 1000;

    private QuestionUjian3 mQuestionLibrary = new QuestionUjian3();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujian9);
        text = (TextView) this.findViewById(R.id.waktu);
        countDownTimer = new MyCountDownTimer(startTime, interval);
        text.setText(text.getText() + String.valueOf(startTime / 1000));
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        updateQuestion();

        updateScore(mScore);
        countDownTimer.start();
    }

    private void updateQuestion(){
        if(mQuestionNumber<mQuestionLibrary.getLength() ){
            TextView nomer = (TextView) findViewById(R.id.angka);
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
            nomer.setText(Integer.toString(mQuestionNumber));
        }
        else {
            a = 1;
            Toast.makeText(UjianActivity9.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(UjianActivity9.this, HasilUjian.class);
            intent.putExtra("score", mScore);
            intent.putExtra("level",10);
            startActivity(intent);
            countDownTimer.cancel();
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        Button answer = (Button) view;

        if (answer.getText() == mAnswer){
            mScore = mScore + 1;
            Toast.makeText(UjianActivity9.this, "Benar!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(UjianActivity9.this, "Salah!", Toast.LENGTH_SHORT).show();

        updateScore(mScore);
        updateQuestion();
    }

    class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @Override
        public void onFinish() {
            Toast.makeText(UjianActivity9.this, "Time's up!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("" + millisUntilFinished / 1000);
        }
    }
}