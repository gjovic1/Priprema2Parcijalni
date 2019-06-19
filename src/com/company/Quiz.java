package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Quiz implements Serializable {
    String naziv;
    ArrayList<Pitanje> pitanja;
    public Quiz(){}

    public ArrayList<Pitanje> getPitanja() {
        return pitanja;
    }

    public void setPitanja(ArrayList<Pitanje> pitanja) {
        this.pitanja = pitanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "naziv='" + naziv + '\'' +
                ", pitanja=" + pitanja +
                '}';
    }
}
