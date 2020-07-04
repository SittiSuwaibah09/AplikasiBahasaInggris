package com.example.ppbprojectakhir;

public class GameQuestion{

    String pertanyaan;
    String pertanyaan1;
    String jawaban;
    int panjangjawaban;

    public GameQuestion() {

    }
    public GameQuestion (String pertanyaan, String pertanyaan1, String jawaban, int panjangjawaban){
        this.pertanyaan = pertanyaan;
        this.pertanyaan1 = pertanyaan1;
        this.jawaban = jawaban;
        this.panjangjawaban = panjangjawaban;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getPertanyaan1() {
        return pertanyaan1;
    }

    public void setPertanyaan1(String pertanyaan1) {
        this.pertanyaan1 = pertanyaan1;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public int getPanjangjawaban() {
        return panjangjawaban;
    }

    public void setPanjangjawaban(int panjangjawaban) {
        this.panjangjawaban = panjangjawaban;
    }

}