package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Quiz implements Serializable {
    String naziv;
    ArrayList<Pitanje> pitanja;
    public Quiz(){}

    public Quiz(String nekiKviz) {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return Objects.equals(naziv, quiz.naziv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naziv);
    }
}
