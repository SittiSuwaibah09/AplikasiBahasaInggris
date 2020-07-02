package com.example.ppbprojectakhir;

public class QuestionUjian2 {

    private String textQuestions [] = {
            "He ..... A bone",
            "He ..... Washed the car",
            "He ..... in this company since 1985",
            "Why is he so tired ? He ..... tennis for five hours",
            "Last year I ..... to England on holiday",
            "I ..... hungry",
            "It started to rain while she ..... the flowers in her garden",
            "What ..... Whe I called",
            "The storm destroyed the house that we .....",
            "Before he sang a song he ..... the guitar"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Has break", "Have break", "Has broken", "Have broken"},
            {"Has", "Have", "Is", "Are"},
            {"Has been working", "Has working", "Has been work", "Have been working"},
            {"Has been play", "Have been play", "Has been playing", "Have been playing"},
            {"Went", "Gone", "Go", "Am"},
            {"Was","Were","Are","Is"},
            {"Were watering","Watering","Was water","Was watering"},
            {"You doing","Was you doing","Were you doing","Were you do"},
            {"Had build","Had built","Do","Am"},
            {"Have play","Had played","Am","Are"}
    };

    private String mCorrectAnswers[] = {"Has broken", "Has", "Has been working", "Has been playing", "Went", "Was", "Was watering", "Were you doing", "Had built", "Had played"};

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