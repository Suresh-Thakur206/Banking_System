package com.onlineBankingSystem.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class DatabaseConnection {
    public static Connection provideConnection(){
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        String url="jdbc:mysql://localhost:3306/bankingsystem";
        try{
            con= DriverManager.getConnection(url,"root","9821771258@999");
        }catch(Exception e){
            System.out.println("Exception occur in database");

        }

        return con;
    }
}
