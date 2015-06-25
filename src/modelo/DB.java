/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Alvaro
 */
public class DB {
    private String nombre;
    private ArrayList<Tabla> tablas = new ArrayList<Tabla>();
    private ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/runAll.png"));

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
    public void addTabla(Tabla tabla){
        tablas.add(tabla);
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
