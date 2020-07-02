package com.example.ppbprojectakhir;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    public TextView text;
    private CountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
    private final long startTime = 30 * 1000;
    private final long interval = 1 * 1000;

    private QuestionBank mQuestionLibrary = new QuestionBank();
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
        setContentView(R.layout.activity_quiz);
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
        timerHasStarted = true;
        if(timerHasStarted == false) {
            countDownTimer.cancel();
            timerHasStarted = false;
        }
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
            Toast.makeText(QuizActivity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuizActivity.this, HighestScoreActivity.class);
            intent.putExtra("score", mScore);
            startActivity(intent);
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        Button answer = (Button) view;

        if (answer.getText() == mAnswer){
            answer.setBackgroundColor(R.drawable.play);
            mScore = mScore + 1;
            Toast.makeText(QuizActivity.this, "Benar!", Toast.LENGTH_SHORT).show();
        }else {
            answer.setBackgroundColor(R.drawable.toko);
            Toast.makeText(QuizActivity.this, "Salah!", Toast.LENGTH_SHORT).show();
        }
        answer.setBackgroundColor(R.drawable.borderbg);
        updateScore(mScore);
        updateQuestion();
    }

    class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @Override
        public void onFinish() {
            Toast.makeText(QuizActivity.this, "Time's up!", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("" + millisUntilFinished / 1000);
        }
    }
}