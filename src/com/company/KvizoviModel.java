package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class KvizoviModel implements Serializable {
    ArrayList<Quiz> kvizovi = new ArrayList<>();

    public KvizoviModel(ArrayList<Quiz> kvizovi) {
        this.kvizovi = kvizovi;
    }
    public KvizoviModel() {}

    public ArrayList<Quiz> getKvizovi() {
        return kvizovi;
    }

    public void setKvizovi(ArrayList<Quiz> kvizovi) {
        this.kvizovi = kvizovi;
    }

    public void dodajKviz(Quiz kviz){
        kvizovi.add(kviz);
    }

    public void deleteKviz(Quiz kviz){
        kvizovi.remove(kviz);
    }
}
