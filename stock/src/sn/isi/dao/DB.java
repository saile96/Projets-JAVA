package sn.isi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    //Pour la connexion
    private Connection connect;
    //Pour les resultats des requetes de type SELECT
    private ResultSet rs;
    //Pour les requetes preparees
    private PreparedStatement pstm;
    //Pour les requetes de type màj(INSERT, UPDATE,DELETE)
    private int ok;

    private void getConnection()
    {
        String url ="jdbc:mysql://localhost:3306/stock";
        String user ="root";
        String password ="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url, user,password);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //Fonction qui permet d'initialiser les requetes sql
    //PRepareStatement permet de sauvegarder les donnees
    public  void initPrepa(String sql)
    {
        try {
            getConnection();
            pstm = connect.prepareStatement(sql);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //Fonction qui permet de'executer les requetes
    public ResultSet executeSelect()
    {
        try {
            rs = pstm.executeQuery();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return  rs;
    }
    public  int executeMaj()
    {
        try {
            ok = pstm.executeUpdate();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ok;
    }
    public  void closeConnection()
    {
        try{
            if (connect != null)
            {
                connect.close();
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public PreparedStatement getPstm() {
        return pstm;
    }
}
