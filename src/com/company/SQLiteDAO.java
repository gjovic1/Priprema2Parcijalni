package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SQLiteDAO implements Baza {
    private static SQLiteDAO dao;
    public static SQLiteDAO getInstance() {
        if(dao == null){
            dao = new SQLiteDAO();
        }
        return dao;
    }
    private static Connection conn;
    private PreparedStatement addKvizStatement;
    private PreparedStatement deleteKvizStatement;
    private PreparedStatement getKvizoviStatement;
    private PreparedStatement deletePitanjeStatement;
    private PreparedStatement deleteOdgovoriStatement;

    private SQLiteDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:baza.db");
            initializeStatements();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                setupDatabase();
                initializeStatements();
            }catch (SQLException ex){}
        }
    }

    private void initializeStatements() throws SQLException {
        addKvizStatement = conn.prepareStatement("insert into kvizovi values(null,?)");
        deleteKvizStatement = conn.prepareStatement("delete from kvizovi where id=?");
        getKvizoviStatement = conn.prepareStatement("select * from kvizovi");
        deletePitanjeStatement = conn.prepareStatement("delete from pitanja where kvizFX = ?");
        deleteOdgovoriStatement = conn.prepareStatement("delete from odgovori where pitanjeFX = ?");
    }
    private void setupDatabase() {
        String sql="";
        URL x = getClass().getResource("/baza.sql");
        FileReader fileReader =
                null;
        try {
            fileReader = new FileReader(x.getFile());

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            Scanner scanner = new Scanner(bufferedReader);
            while(scanner.hasNextLine()){
                sql+=scanner.nextLine();
            }
            try {
                scanner.close();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sql = sql.replace("\n"," ");
        sql = sql.replace(";","\n");
        String[] upiti = sql.split("\n");
        try {
            Statement statement = conn.createStatement();
            for (String upit : upiti){
                statement.execute(upit);
            }
        } catch (SQLException e) {

        }
    }
    @Override
    public void addKviz(Quiz kviz) {

    }

    @Override
    public void deleteKviz(Quiz kviz) {

    }

    @Override
    public ArrayList<Quiz> getKvizovi() {
        return null;
    }
}
