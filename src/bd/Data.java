package bd;

import java.sql.SQLException;

public class Data {
    private final Conexion C;
    
    public Data() throws SQLException {
        C = new Conexion(
                DatosConexion.SERVER,
                DatosConexion.BD,
                DatosConexion.USER,
                DatosConexion.PASS
        );
    }
    
    public void mostrarBD() throws SQLException{
        String show = "SHOW DATABASES;";
        C.resultado = C.ejecutarSelect(show);
        while(C.resultado.next()){
            System.out.println(C.resultado.getString(1));
        }
    }
}
