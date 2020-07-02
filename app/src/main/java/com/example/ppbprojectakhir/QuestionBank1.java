package com.example.ppbprojectakhir;

public class QuestionBank1 {

    private String textQuestions [] = {
            "We .... our dog. (to call)",
            "Emma .... in the lessons. (to dream)",
            "They..... at birds. (to look)",
            "John.....home from school. (to come)",
            "I .... my friends. (to meet)",
            "He....the laptop. (to repair)",
            "Walter and Frank....hello. (to say)",
            "The cat.....under the tree. (to sit)",
            "You.....water. (to drink)",
            "She.....the lunchbox. (to forget)"
    };

    private String mCorrectAnswers [] = {"call", "dreams", "look", "comes", "meet", "repairs", "say", "sits", "drink", "forgets"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}