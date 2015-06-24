package bd;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private DatosConexion datos;
    private final Conexion c;

    public Data(DatosConexion datos) throws SQLException {
        this.datos = datos; 
        c = new Conexion(
                this.datos.getServer(), 
                this.datos.getBd(), 
                this.datos.getUser(), 
                this.datos.getPass()
        );
    }

    public List<String> mostrarBD() throws SQLException {
        List<String> listaBD = new ArrayList<>();
        String show = "SHOW DATABASES;";
        c.resultado = c.ejecutarSelect(show);
        while (c.resultado.next()) {
            listaBD.add(c.resultado.getString(1));
        }
        return listaBD;
    }
    
    public List<String> showTablas(String l) throws SQLException{
        List<String> listaTablas = new ArrayList<>();
        String bd = "USE "+l+";";
        c.ejecutar(bd);
        String show = "SHOW TABLES;";
        c.resultado = c.ejecutarSelect(show);
        while (c.resultado.next()) {
            listaTablas.add(c.resultado.getString(1));
        }
        return listaTablas;
    }

    public List<Object> mostrarBDObj() throws SQLException {
        List<Object> listaBD = new ArrayList<>();
        String show = "SHOW DATABASES;";
        c.resultado = c.ejecutarSelect(show);
        while (c.resultado.next()) {
            listaBD.add(c.resultado.getObject(1));
        }
        return listaBD;
    }

    public void seleccionarBDLista(String BD) throws SQLException {
        String use = "use " + BD + ";";
        c.ejecutar(use);
    }
    
    public void usarBDLista(String BD) throws SQLException {
        c.ejecutar(BD);
    }

    /*Crear tabla*/
    public void crearTabla(String cadena) throws SQLException {
        c.ejecutar(cadena);
    }

    /*Select*/
    public List<String[]> selectBD(String select) throws SQLException {
        List<String[]> listaSelect = new ArrayList<>();
        c.resultado = c.ejecutarSelect(select);        
        String[] nombreColumnas =  new String[c.resultado.getMetaData().getColumnCount()];
        for (int x=1;x<=c.resultado.getMetaData().getColumnCount();x++){
            nombreColumnas[x-1] = c.resultado.getMetaData().getColumnName(x);
        }
        listaSelect.add(nombreColumnas);
        while (c.resultado.next()) {
            String cadena[] = new String[c.resultado.getMetaData().getColumnCount()];
            for (int x = 1; x <= c.resultado.getMetaData().getColumnCount(); x++) {
                cadena[x-1] = c.resultado.getString(x);
            }
            listaSelect.add(cadena);
        }
        return listaSelect;
    }
    
    /*Mostrar tablas de la bd en uso*/
    public String mostrarTablas(String cadena) throws SQLException{
        String tablas = "";
        c.resultado = c.ejecutarSelect(cadena);
        while (c.resultado.next()) {
            tablas = tablas + c.resultado.getString(1)+"\n";
        }
        return tablas;
    }
    
    public void insertarDatos(String cadena) throws SQLException{
        c.ejecutar(cadena);
    }
    
    public void eliminarDatos(String cadena) throws SQLException{
        c.ejecutar(cadena);
    }
    
    public void actualizarDatos(String cadena) throws SQLException{
        c.ejecutar(cadena);
    }
    
    public void eliminarBD(String BD) throws SQLException {
        String drop = "drop database " + BD + ";";
        c.ejecutar(drop);
    }
}
