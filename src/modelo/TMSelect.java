package modelo;

import bd.Data;
import bd.DatosConexion;
import java.sql.SQLException;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMSelect implements TableModel{
    
    private Data d;
    private List<String[]> listaSelect;
    private String[] nombreColumna;

    public TMSelect(List<String[]> lista, DatosConexion datos, String[] nombreColumna) throws SQLException {
        listaSelect = lista;
        d = new Data(datos);
        this.nombreColumna = nombreColumna;
    }
    
    @Override
    public int getRowCount() {
        return listaSelect.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumna.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        
        if (columnIndex == 0) {
            titulo = nombreColumna[0];
        } else if (columnIndex == 1) {
            titulo = nombreColumna[1];
        } else if (columnIndex == 2) {
            titulo = nombreColumna[2];
        } else if (columnIndex == 3) {
            titulo = nombreColumna[3];
        } else if (columnIndex == 4) {
            titulo = nombreColumna[4];
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] select = listaSelect.get(rowIndex);
        for(int i =0; i<nombreColumna.length; i++){
            if(columnIndex == i){
                return select[i];
            }
        }
//        if(columnIndex == 0){
//            return select[0];
//        }else if(columnIndex == 1){
//            return select[1];
//        }else if(columnIndex == 2){
//            return select[2];
//        }else if(columnIndex == 3){
//            return select[3];
//        }else if(columnIndex == 4){
//            return select[4];
//        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
