package com.company;

import java.util.ArrayList;

public interface Baza {
    public void addKviz(Quiz kviz);
    public void deleteKviz(Quiz kviz);
    public ArrayList<Quiz> getKvizovi();
}
