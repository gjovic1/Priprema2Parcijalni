package com.company;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Main {

    private static Baza baza;

    public static void main(String[] args) {
        Quiz kviz = new Quiz ("NekiKviz");
        Pitanje pitanje = new Pitanje("Koji je glavni grad Jamajke?");
        ArrayList<String> odgovori = new ArrayList<String>();
        odgovori.add("Sarajevo");
        odgovori.add("Kingston");
        odgovori.add("Zenica");
        odgovori.add("Tarčin");
        odgovori.add("Banja Luka");
        pitanje.setOdgovori(odgovori);
        pitanje.setIndexTacnog(1);
        ArrayList<Pitanje> pitanja = new ArrayList<Pitanje>();
        pitanja.add(pitanje);
        kviz.setPitanja(pitanja);

        baza = SQLiteDAO.getInstance();
        baza.addKviz(kviz);
        baza.addKviz(kviz);
        baza.addKviz(kviz);
        baza.addKviz(kviz);

        System.out.println(baza.getKvizovi());
    }
}
