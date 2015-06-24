/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bd.Data;
import bd.DatosConexion;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import modelo.TMSelect;
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;
/**
 *
 * @author Alvaro
 */
public class Aplicacion extends javax.swing.JFrame {

    private DatosConexion datos;
    private Data d;
    private List<String> listaBD;
    private List<Object> listaBDObj;
    private static final long serialVersionUID = 1L;
    public RSyntaxTextArea txtSentencia;
    
    public Aplicacion() {
        initComponents();
        this.setVisible(false);
        montarInterfaz();
        txtSentencia = new RSyntaxTextArea(20, 60);
        txtSentencia.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_SQL);
        txtSentencia.setCodeFoldingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(txtSentencia);
        panelSyntax.add(sp);
        
        txtSentencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSentenciaKeyReleased(evt);
            }
        });
        
        jInicioSesion.setLocationRelativeTo(null);
        jPortada.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabla = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabSelect = new javax.swing.JTable();
        jPortada = new javax.swing.JFrame();
        btnMySQL = new javax.swing.JButton();
        btnSQLServer = new javax.swing.JButton();
        jInicioSesion = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeBD = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnIniciarSeleccionScript = new javax.swing.JButton();
        btnIniciarScriptCompleto = new javax.swing.JButton();
        btnUsarBD = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cboBD = new javax.swing.JComboBox();
        lblContarCaracteres = new javax.swing.JLabel();
        panelSyntax = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jTabla.setMinimumSize(new java.awt.Dimension(451, 192));

        tabSelect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tabSelect);

        javax.swing.GroupLayout jTablaLayout = new javax.swing.GroupLayout(jTabla.getContentPane());
        jTabla.getContentPane().setLayout(jTablaLayout);
        jTablaLayout.setHorizontalGroup(
            jTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTablaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jTablaLayout.setVerticalGroup(
            jTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTablaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPortada.setMinimumSize(new java.awt.Dimension(502, 373));

        btnMySQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MySQL.png.png"))); // NOI18N
        btnMySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMySQLActionPerformed(evt);
            }
        });

        btnSQLServer.setText("SQLSERVER");

        javax.swing.GroupLayout jPortadaLayout = new javax.swing.GroupLayout(jPortada.getContentPane());
        jPortada.getContentPane().setLayout(jPortadaLayout);
        jPortadaLayout.setHorizontalGroup(
            jPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPortadaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnMySQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnSQLServer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPortadaLayout.setVerticalGroup(
            jPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPortadaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSQLServer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMySQL))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jInicioSesion.setMinimumSize(new java.awt.Dimension(284, 188));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Iniciar sesión"));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        txtUsuario.setText("root");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(txtClave))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jInicioSesionLayout = new javax.swing.GroupLayout(jInicioSesion.getContentPane());
        jInicioSesion.getContentPane().setLayout(jInicioSesionLayout);
        jInicioSesionLayout.setHorizontalGroup(
            jInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicioSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInicioSesionLayout.setVerticalGroup(
            jInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicioSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        treeBD.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeBDValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(treeBD);

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        btnIniciarSeleccionScript.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/runSeleccion.png"))); // NOI18N
        btnIniciarSeleccionScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSeleccionScriptActionPerformed(evt);
            }
        });

        btnIniciarScriptCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/runAll.png"))); // NOI18N
        btnIniciarScriptCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarScriptCompletoActionPerformed(evt);
            }
        });

        btnUsarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usarBD.png"))); // NOI18N
        btnUsarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarBDActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarBD.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cboBD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBDActionPerformed(evt);
            }
        });

        lblContarCaracteres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContarCaracteres.setText("0");

        panelSyntax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelSyntaxKeyReleased(evt);
            }
        });
        panelSyntax.setLayout(new java.awt.BorderLayout());

        jMenu1.setText("File");
        menuBar.add(jMenu1);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboBD, 0, 159, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUsarBD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciarScriptCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciarSeleccionScript, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblContarCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelSyntax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIniciarSeleccionScript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIniciarScriptCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUsarBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cboBD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSyntax, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContarCaracteres)
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSeleccionScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSeleccionScriptActionPerformed
        revisarCadena();
        cargarArbol();
        cargarComboBDDespues();
    }//GEN-LAST:event_btnIniciarSeleccionScriptActionPerformed

    private void btnUsarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarBDActionPerformed
        seleccionarBD();
    }//GEN-LAST:event_btnUsarBDActionPerformed

    private void btnIniciarScriptCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarScriptCompletoActionPerformed
        scriptCompleto();
        cargarArbol();
        cargarComboBDDespues();
    }//GEN-LAST:event_btnIniciarScriptCompletoActionPerformed

    private void treeBDValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeBDValueChanged
        activacionBtnSeleccionarBD();
    }//GEN-LAST:event_treeBDValueChanged

    private void cboBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBDActionPerformed
        seleccionarBDPorCombo();
    }//GEN-LAST:event_cboBDActionPerformed

    private void btnMySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMySQLActionPerformed
        jInicioSesion.setVisible(true);
    }//GEN-LAST:event_btnMySQLActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String pass = "";
            for (char c : txtClave.getPassword()) {
                pass = pass + c;
            }
            datos = new DatosConexion("localhost", "mysql", txtUsuario.getText(), pass);
            d = new Data(datos);
            cargarMySQL();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarBD();
        reiniciarArbolYCombo();
        cargarArbol();
        cargarComboBDDespues();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void panelSyntaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelSyntaxKeyReleased

    }//GEN-LAST:event_panelSyntaxKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Aplicacion().setVisible(false);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIniciarScriptCompleto;
    private javax.swing.JButton btnIniciarSeleccionScript;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMySQL;
    private javax.swing.JButton btnSQLServer;
    private javax.swing.JButton btnUsarBD;
    private javax.swing.JComboBox cboBD;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFrame jInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFrame jPortada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JFrame jTabla;
    private javax.swing.JLabel lblContarCaracteres;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panelSyntax;
    private javax.swing.JTable tabSelect;
    private javax.swing.JTree treeBD;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarArbol() {
        try {
            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("MySQL");
            d = new Data(datos);
            listaBD = d.mostrarBD();
            for (String l : listaBD) {
                //DefaultMutableTreeNode bd = new DefaultMutableTreeNode();
                DefaultMutableTreeNode bd = new DefaultMutableTreeNode(l);
                //bd.setUserObject(l);
                raiz.add(bd);
                List<String> listaTablas = d.showTablas(l);
                DefaultMutableTreeNode tab = null;
                for(String lis : listaTablas){
                    tab = new DefaultMutableTreeNode(lis);
                    bd.add(tab);
                }
            }
            
            DefaultTreeModel modeloArbol = new DefaultTreeModel(raiz);
            this.treeBD.setModel(modeloArbol);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void cargarComboBD() {
        try {
            cboBD.removeAllItems();

            d = new Data(datos);
            listaBDObj = d.mostrarBDObj();
            for (Object l : listaBDObj) {
                cboBD.addItem(l);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String consultaSeleccionada() {
        /*Método para utilizar solo el texto seleccionado del JTextArea*/
        String consulta = txtSentencia.getSelectedText();
        System.out.println(consulta);
        return consulta;
    }

    private void seleccionarBD() {
        try {
            d = new Data(datos);
            DefaultMutableTreeNode BDSeleccionada = (DefaultMutableTreeNode) treeBD.getLastSelectedPathComponent();
            String seleccion = BDSeleccionada.getUserObject().toString();

            cboBD.getModel().setSelectedItem(seleccion);
            datos.setBd(seleccion);
            //d.seleccionarBDLista(seleccion);
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void revisarCadena() {
        try {
            String cadena = consultaSeleccionada();
            String[] consulta = cadena.split("\\s+");
            d = new Data(datos);
            if (consulta[0].equalsIgnoreCase("create") /*&& consulta[1].equalsIgnoreCase("table")*/) {
                d.crearTabla(cadena);
                txtResultado.setText("Operación realizada .");
            } else if (consulta[0].equalsIgnoreCase("select")) {
                List<String[]> listaSelect = d.selectBD(cadena);
                String[] nombreColumna = listaSelect.get(0);
                listaSelect.remove(0);
                TMSelect modelo = new TMSelect(listaSelect, datos, nombreColumna);
                tabSelect.setModel(modelo);
                jTabla.setVisible(true);
            } else if (consulta[0].equalsIgnoreCase("show") && consulta[1].equalsIgnoreCase("tables;")) {
                String tablas = d.mostrarTablas(cadena);
                txtResultado.setText(tablas);
            } else if (consulta[0].equalsIgnoreCase("insert")) {
                d.insertarDatos(cadena);
                txtResultado.setText("Dato(s) ingresado(s) ok.");
            } else if (consulta[0].equalsIgnoreCase("delete")) {
                d.eliminarDatos(cadena);
                txtResultado.setText("Dato(s) eliminado(s) ok.");
            } else if (consulta[0].equalsIgnoreCase("update")) {
                d.actualizarDatos(cadena);
                txtResultado.setText("Dato(s) actualizado(s) ok.");
            } else if (consulta[0].equalsIgnoreCase("use")) {
                d.usarBDLista(cadena);
                cboBD.getModel().setSelectedItem(consulta[1]);
                txtResultado.setText("BD cambiada..");
            }
        } catch (SQLException ex) {
            txtResultado.setText(ex.getMessage());
        }
    }

    private void activacionBtnIniciarScriptSeleccionado() {
        if (txtSentencia.getText().equals("")) {
            btnIniciarSeleccionScript.setEnabled(false);
        }
    }

    private void activarBtnIniciarScriptSeleccionado() {
        btnIniciarSeleccionScript.setEnabled(true);

        activacionBtnIniciarScriptSeleccionado();
    }

    private void scriptCompleto() {
        /*Método para ejecutar el JTextArea Completo*/
        try {
            String cadena = txtSentencia.getText();
            String[] consulta = cadena.split("\\s+");
            d = new Data(datos);
            if (consulta[0].equalsIgnoreCase("create") /*&& consulta[1].equalsIgnoreCase("table")*/) {
                d.crearTabla(cadena);
                txtResultado.setText("Tabla creada.");
            } else if (consulta[0].equalsIgnoreCase("select")) {
                List<String[]> listaSelect = d.selectBD(cadena);
                String[] nombreColumna = listaSelect.get(0);
                listaSelect.remove(0);
                TMSelect modelo = new TMSelect(listaSelect, datos, nombreColumna);
                tabSelect.setModel(modelo);
                jTabla.setVisible(true);
            } else if (consulta[0].equalsIgnoreCase("show") && consulta[1].equalsIgnoreCase("tables;")) {
                String tablas = d.mostrarTablas(cadena);
                txtResultado.setText(tablas);
            } else if (consulta[0].equalsIgnoreCase("insert")) {
                d.insertarDatos(cadena);
                txtResultado.setText("Dato(s) ingresado(s) ok.");
            } else if (consulta[0].equalsIgnoreCase("delete")) {
                d.eliminarDatos(cadena);
                txtResultado.setText("Dato(s) eliminado(s) ok.");
            } else if (consulta[0].equalsIgnoreCase("update")) {
                d.actualizarDatos(cadena);
                txtResultado.setText("Dato(s) actualizado(s) ok.");
            }
        } catch (SQLException ex) {
            txtResultado.setText(ex.getMessage());
        }
    }

    private void activacionBtnSeleccionarBD() {
        DefaultMutableTreeNode BDSeleccionada = (DefaultMutableTreeNode) treeBD.getLastSelectedPathComponent();

        try {
            if (!BDSeleccionada.isRoot()) {
                btnUsarBD.setEnabled(true);
            } else {
                btnUsarBD.setEnabled(false);
            }
        }catch(NullPointerException ex){
            
        }

    }

    private void activarDesactivarBotones() {
        activacionBtnIniciarScriptSeleccionado();
        btnUsarBD.setEnabled(false);
    }

    private void montarInterfaz() {
        this.setVisible(false);
        jPortada.setVisible(true);
    }

    private void cargarMySQL() {
        this.setVisible(true);
        jInicioSesion.setVisible(false);
        jPortada.setVisible(false);
        cargarArbol();
        cargarComboBD();
        activarDesactivarBotones();
    }

    private void eliminarBD() {
        try {
            String BDSeleccionada = cboBD.getModel().getSelectedItem().toString();

            d.eliminarBD(BDSeleccionada);
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reiniciarArbolYCombo() {
        cboBD.setSelectedIndex(0);
        treeBD.setSelectionRow(0);
    }

    private void cargarComboBDDespues() {
        try {
            String BDSeleccionada = cboBD.getSelectedItem().toString();
            cboBD.removeAllItems();

            d = new Data(datos);
            listaBDObj = d.mostrarBDObj();
            for (Object l : listaBDObj) {
                cboBD.addItem(l);
            }
            cboBD.getModel().setSelectedItem(BDSeleccionada);
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void contarCaracteres() {
//        System.out.println(txtSentencia.getText().length());
        lblContarCaracteres.setText(Integer.toString(txtSentencia.getText().length()));
    }

    private void seleccionarBDPorCombo() {
        try {
            String BDSeleccionada = cboBD.getModel().getSelectedItem().toString();

            datos.setBd(BDSeleccionada);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void txtSentenciaKeyReleased(java.awt.event.KeyEvent evt) {                                         
        activarBtnIniciarScriptSeleccionado();
    } 
}
