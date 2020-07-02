package com.example.ppbprojectakhir;

public class QuestionUjian1 {

    private String textQuestions [] = {
            "Fungsi TO BE adalah sebagai .......",
            "We ..... From Bandung",
            "You ..... Happy yesterday",
            "Gagal",
            "Menangis",
            "I ..... to school everyday",
            "Soni ..... drink coffee but he drinks tea",
            "She ..... now",
            "He is not waiting for the bus ......",
            "Silvia ..... to music at present"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Kata kerja (Verb)", "Kata bantu (Auxiliary)", "Kata kerja dan Kata bantu", "Kata keterangan (Adverb)"},
            {"Am", "Is", "Are", "Was"},
            {"Is", "Are", "Was", "Were"},
            {"Fear", "Fasten", "Fail", "Fix"},
            {"Cry", "Dance", "Confess", "Consider"},
            {"Go","Goes","Am","Is"},
            {"Do not","Is not","Are not","Does not"},
            {"Am sleep","Am sleeping","Is sleeping","Sleeps"},
            {"At present","Yesterday","Last month","Last Week"},
            {"Is not listening","Are not listens","Are not listening","Not listens"}
    };

    private String mCorrectAnswers[] = {"Kata kerja dan Kata bantu", "Are", "Were", "Fail", "Cry","Go","Does not","Is sleeping","At present","Is not listening"};

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