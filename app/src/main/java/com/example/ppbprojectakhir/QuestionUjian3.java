package com.example.ppbprojectakhir;

public class QuestionUjian3 {

    private String textQuestions [] = {
            "Kata kerja yang dipakai pada past perfect continuous tense adalah .....",
            "We ..... Her ring for two hours and the we found it in the bathroom",
            "Don't worry. I ..... help you",
            "Marvin ..... throw a party next week",
            "We ..... him tomorrow",
            "He ..... tomorrow morning",
            "I ..... By six",
            "How long ..... in this company when you retire ?",
            "Kata kerja yang digunakan pada future perfect continuous tense ?",
            "By 2005 will ..... in London for 14 years"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"V1", "V2", "V1-ing", "V2-ing"},
            {"Had been for looking", "Had been looking for", "Had looking been for", "Looking"},
            {"Will", "Am going to", "Are", "Is"},
            {"Am going to", "Is going to", "Are", "Am"},
            {"Will be meeting", "Will be meet", "Meet", "Will"},
            {"Will be not drawing","Will not be drawing","Will","Drawing"},
            {"Will have left","Will have leave","Will","Have"},
            {"Will you have been","Will you have be","Are","Am"},
            {"Verb III","Verb I + Ing","Verb II + Ing","Verb III + Ing"},
            {"Have been living","Living","Have","Been"}
    };

    private String mCorrectAnswers[] = {"V1-ing", "Had been looking for", "Will", "Is going to", "Will be meeting", "Will not be drawing", "Will have left", "Will you have been", "Verb I + ing", "Have been living"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}