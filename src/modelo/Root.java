package modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Root {
    private String nombre;
    private ArrayList<DB> bds = new ArrayList<DB>();
    private ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/runAll.png"));

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<DB> getBds() {
        return bds;
    }

    public void setBds(ArrayList<DB> bds) {
        this.bds = bds;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
    public void addBD(DB estudiante){
        bds.add(estudiante);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
