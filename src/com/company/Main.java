package com.company;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class Main {

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

        XMLDecoder decoder=null;
        try{
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("kvizasdaa.xml")));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File kvizfsa.xml");
        }
        Quiz kviz2 = (Quiz) decoder.readObject();
        System.out.println(kviz);
        System.out.println(kviz2);
    }
}
