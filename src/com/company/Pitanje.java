package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Pitanje implements Serializable {
    String tekst;
    ArrayList<String> odgovori;
    int indexTacnog;

    public Pitanje() {}

    public Pitanje(String s) {
    }


    public int getIndexTacnog() {
        return indexTacnog;
    }

    public void setIndexTacnog(int indexTacnog) {
        this.indexTacnog = indexTacnog;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public ArrayList<String> getOdgovori() {
        return odgovori;
    }

    public void setOdgovori(ArrayList<String> odgovori) {
        this.odgovori = odgovori;
    }

    @Override
    public String toString() {
        return "Pitanje{" +
                "tekst='" + tekst + '\'' +
                ", odgovori=" + odgovori +
                ", indexTacnog=" + indexTacnog +
                '}';
    }
}
