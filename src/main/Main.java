package main;

import bd.Data;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            Data d = new Data();
            d.mostrarBD();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
