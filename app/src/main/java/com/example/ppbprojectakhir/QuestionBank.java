package com.example.ppbprojectakhir;

public class QuestionBank {

    private String textQuestions [] = {
            "1. She .... sick",
            "2. He always ..... to the mosque",
            "3. The sun.... from the east",
            "4. I ..... to school everyday",
            "5. Soni .... drink coffee but he drinks tea",
            "6. You .... rice every morning",
            "7. Susan ... not a doctor",
            "8. We always....coffee",
            "9. You .... sleep in the classroom",
            "10. The Students always....Hard"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Does", "Is", "Am", "Are"},
            {"Go", "Does", "Goes", "Do"},
            {"Is", "Are", "Rise", "Rises"},
            {"Go", "Goes", "Am", "Is"},
            {"Do not", "Is not", "Are not", "Does not"},
            {"Eat","Eats","Is","Are"},
            {"Do","Am","Is","Are"},
            {"Are","Is","Drink","Drinks"},
            {"Are","Is not","Do not","Does not"},
            {"Are","Is","Am","Study"}
    };

    private String mCorrectAnswers[] = {"Is", "Goes", "Rises", "Go", "Does not","eat","Is","Drink","Do not","Study"};

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