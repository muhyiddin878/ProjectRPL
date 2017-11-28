package com.example.muhyiddin878.gastricdiseasediagnosis;

/**
 * Created by muhyiddin878 on 11/8/17.
 */


public class Soal {

    int id;
    double jawaban;



    private String soal;

    public Soal(){
        soal = "";
        jawaban=0;

    }

    public void setSoal(String soal){
        this.soal = soal;
    }

    public String getSoal(){
        return soal;
    }


    public double getJawaban(){
        return jawaban;
    }

    public int getIdsoal() {
        return id;
    }

    public void setIdsoal(int id) {
        this.id = id;
    }

    public void setJawaban(double jawaban) {
        this.jawaban = jawaban;
    }
}
