package com.company;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class XMLDAO implements Baza {
    private static XMLDAO dao = null;
    private XMLDAO(){}

    public static XMLDAO getInstance(){
        if(dao == null){
            dao = new XMLDAO();
        }
        return dao;
    }

    private final String BAZA_NAME = "baza.xml";
    @Override
    public void addKviz(Quiz kviz) {
        KvizoviModel model = null;
        model = getKvizoviModel(model);
        if(model==null){
            model= new KvizoviModel();
        }

        model.dodajKviz(kviz);
        setKvizoviModel(model);

    }

    private void setKvizoviModel(KvizoviModel model) {
        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("BAZA_NAME")));
            encoder.writeObject(model);
            encoder.close();
        }catch(FileNotFoundException fileNotFound){
            System.out.println("Ne more upisat");
        }
    }

    private KvizoviModel getKvizoviModel(KvizoviModel model) {
        XMLDecoder decoder=null;
        try{
            decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("BAZA_NAME")));
            model = (KvizoviModel) decoder.readObject();

        }catch(FileNotFoundException fileNotFound){
            System.out.println("Nema nista brate u xml bazi");
        }
        return model;
    }

    @Override
    public void deleteKviz(Quiz kviz) {
        KvizoviModel model = null;
        model = getKvizoviModel(model);
        model.deleteKviz(kviz);
        setKvizoviModel(model);
    }

    @Override
    public ArrayList<Quiz> getKvizovi() {
        KvizoviModel model = null;
        model = getKvizoviModel(model);

        return model.getKvizovi();
    }
}
