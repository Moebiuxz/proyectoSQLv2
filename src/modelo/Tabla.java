/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Alvaro
 */
public class Tabla {
    private String nombre;   
    private ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/runAll.png"));

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
