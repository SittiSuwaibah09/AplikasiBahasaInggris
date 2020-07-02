package com.example.ppbprojectakhir;

import androidx.appcompat.app.AppCompatActivity;

public class GameQuestion extends AppCompatActivity{

    mySQLiteDB db = new mySQLiteDB(this);

    public void Question(){
        String textQuestions [] = {
                "I remember now. I met him before",
                "Don't worry. We can go tomorrow morning it opens at 8.00",
                "I think the supermarket is opened now",
                "She lives in san Francisco",
                "My Father will go to England for two days",
                "Where are you going on vacation",
                "I am sorry, I forget with you",
                "My mother cook rice in the kitchen",
                "She's at school",
                "Not good. I lost my wallet"
        };

        String textQuestions1 [] = {
                "Apa arti kata REMEMBER pada kalimat diatas",
                "Apa arti kata TOMORROW pada kalimat diatas",
                "Apa arti kata OPENED pada kalimat diatas",
                "Apa arti kata LIVES pada kalimat diatas",
                "Apa arti kata GO pada kalimat diatas",
                "Apa arti kata VACATION pada kalimat diatas",
                "Apa arti kata FORGET pada kalimat diatas",
                "Apa arti kata MOTHER pada kalimat diatas",
                "Apa arti kata SCHOOL pada kalimat diatas",
                "Apa arti kata WALLET pada kalimat diatas"
        };

        String mCorrectAnswers[] = {"INGAT", "BESOK", "BUKA", "HIDUP", "PERGI", "LIBURAN", "LUPA", "IBU", "SEKOLAH", "DOMPET"};

        int pangjangAnswer[] = {5, 5, 4, 5, 5, 7, 4, 3, 7, 6};

        for (int a = 0; a < textQuestions.length; a++){
            db.insertData(textQuestions[a], textQuestions1[a], mCorrectAnswers[a], pangjangAnswer[a]);
        }
    }
}