/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.Controlador;
import controlador.Detalle;
import controlador.DoubleJTextField;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alberto
 */
public class Principal extends javax.swing.JFrame {

    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subCategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    static int nMesa = 1;

    public void cargaTabla() {
        ArrayList<Object> nombreColumna = new ArrayList<>();
        nombreColumna.add("Nombre");
        nombreColumna.add("Cantidad");
        nombreColumna.add("Precio");
        nombreColumna.add("Total");

        for (Object columna : nombreColumna) {
            modelo.addColumn(columna);
        }
        tabla.setModel(modelo);

    }

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ponerNombre(Controlador.nombreBDLimpio);
        Double precioMenu = Controlador.verPrecioMenu();
        lblPrecioMenu.setText("Precio del menú: " + String.valueOf(precioMenu));
        cargaTabla();
        cargarCombos("bebida");
        cargarCombos("comida");
        cargarCombos("postre");
        cargaComboMesa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lblPrecioMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblBebida = new javax.swing.JLabel();
        cmbBebida = new javax.swing.JComboBox<>();
        lblComida = new javax.swing.JLabel();
        cmbComida = new javax.swing.JComboBox<>();
        lblPostre = new javax.swing.JLabel();
        cmbPostre = new javax.swing.JComboBox<>();
        txtCantidadB = new DoubleJTextField();
        lblCantidad = new javax.swing.JLabel();
        lblCantidad1 = new javax.swing.JLabel();
        txtCantidadC = new DoubleJTextField();
        lblCantidad2 = new javax.swing.JLabel();
        txtCantidadP = new DoubleJTextField();
        btnAddBebida = new javax.swing.JButton();
        btnAddComida = new javax.swing.JButton();
        btnAddPostre = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        cmbMesas = new javax.swing.JComboBox<>();
        lblMesas = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 30, 30));

        lblNombre.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        btnAtras.setBackground(new java.awt.Color(102, 102, 255));
        btnAtras.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(204, 204, 204));
        btnAtras.setText("<- ");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        lblPrecioMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblPrecioMenu.setForeground(new java.awt.Color(204, 255, 255));
        lblPrecioMenu.setText("Precio del menú");
        getContentPane().add(lblPrecioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, 340, -1));

        tabla.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setMaxWidth(40);
            tabla.getColumnModel().getColumn(2).setMaxWidth(40);
            tabla.getColumnModel().getColumn(3).setMaxWidth(40);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 750, 510));

        lblBebida.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblBebida.setForeground(new java.awt.Color(0, 0, 0));
        lblBebida.setText("BEBIDA");
        getContentPane().add(lblBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        cmbBebida.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(cmbBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        lblComida.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblComida.setForeground(new java.awt.Color(0, 0, 0));
        lblComida.setText("COMIDA");
        getContentPane().add(lblComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        cmbComida.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(cmbComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        lblPostre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPostre.setForeground(new java.awt.Color(0, 0, 0));
        lblPostre.setText("POSTRE");
        getContentPane().add(lblPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, -1, -1));

        cmbPostre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(cmbPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, -1, -1));

        txtCantidadB.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCantidadB.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadBFocusGained(evt);
            }
        });
        txtCantidadB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadBKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadB, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 50, -1));

        lblCantidad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        lblCantidad1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCantidad1.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad1.setText("Cantidad");
        getContentPane().add(lblCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, -1));

        txtCantidadC.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCantidadC.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadCFocusGained(evt);
            }
        });
        txtCantidadC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadCKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadC, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 50, -1));

        lblCantidad2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCantidad2.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad2.setText("Cantidad");
        getContentPane().add(lblCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, -1, -1));

        txtCantidadP.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCantidadP.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadPFocusGained(evt);
            }
        });
        txtCantidadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadPKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 50, -1));

        btnAddBebida.setText("Añadir");
        btnAddBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, -1, -1));

        btnAddComida.setText("Añadir");
        btnAddComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddComidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, -1, -1));

        btnAddPostre.setText("Añadir");
        btnAddPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPostreActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, -1, -1));

        lblResultado.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 340, 40));

        btnBorrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Limpiar Comanda");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        btnPDF.setText("IMPRIMIR");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, -1, -1));

        cmbMesas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cmbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 70, 40));

        lblMesas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblMesas.setForeground(new java.awt.Color(0, 0, 0));
        lblMesas.setText("Mesa Nº");
        getContentPane().add(lblMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 190, 80, 40));

        lblMesa.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblMesa.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 290, 40));

        lblFondo.setForeground(new java.awt.Color(0, 0, 0));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos de las mesas?", "Selecciona", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            Controlador.limpiaDetalles();
        }
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
        Controlador.usuarioLogeado = "";
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAddBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBebidaActionPerformed
        addRow("bebida");
    }//GEN-LAST:event_btnAddBebidaActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getButton() == 3) {
            int seleccionado = 0;
            for (int i = 0; i < tabla.getRowCount(); i++) {
                seleccionado = tabla.getSelectedRowCount();
            }
            if (seleccionado != 0) {
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Borrar esta línea?");
                if (respuesta == JOptionPane.YES_OPTION) {
                    String nombre = (String) tabla.getValueAt(tabla.getSelectedRow(), 0);
                    int cantidad = (int) tabla.getValueAt(tabla.getSelectedRow(), 1);
                    Controlador.removeLineaDetalle(nombre, cantidad, cmbMesas.getSelectedItem());
                    modelo.removeRow(tabla.getSelectedRow());
                    sacarTotal();
                }
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnAddComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddComidaActionPerformed
        addRow("comida");
    }//GEN-LAST:event_btnAddComidaActionPerformed

    private void btnAddPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPostreActionPerformed
        addRow("postre");
    }//GEN-LAST:event_btnAddPostreActionPerformed

    private void txtCantidadBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBKeyPressed
        if (evt.getKeyCode() == 46) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadBKeyPressed

    private void txtCantidadCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCKeyPressed
        if (evt.getKeyCode() == 46) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadCKeyPressed

    private void txtCantidadPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadPKeyPressed
        if (evt.getKeyCode() == 46) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadPKeyPressed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro?", "¿Borrar?", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            modelo.setRowCount(0);
            sacarTotal();
            Controlador.borrarTodoDetalle(cmbMesas.getSelectedItem());
            lblResultado.setText("");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtCantidadBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadBFocusGained
        txtCantidadB.setText("");
    }//GEN-LAST:event_txtCantidadBFocusGained

    private void txtCantidadCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadCFocusGained
        txtCantidadC.setText("");
    }//GEN-LAST:event_txtCantidadCFocusGained

    private void txtCantidadPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadPFocusGained
        txtCantidadP.setText("");
    }//GEN-LAST:event_txtCantidadPFocusGained

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        try {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                String nombre = (String) tabla.getValueAt(i, 0);
                int cantidad = (int) tabla.getValueAt(i, 1);
                double totalASumar = (double) tabla.getValueAt(i, 3);
                Controlador.insertarDetalleTotal(nombre, cantidad, totalASumar);
            }
            double total = sacarTotal();
            Object[] linea = {"---", "---", "---", "---"};
            for (int i = 0; i < 2; i++) {
                modelo.addRow(linea);
            }
            total = Math.round(total * 100);
            total = total / 100;

            Object[] lineaTotal = {"TOTAL: ", "", "", total};
            modelo.addRow(lineaTotal);
            String desktopPath = System.getProperty("user.home") + "\\Desktop";
            File salida = new File(desktopPath+"\\facturaMesa" + nMesa + ".pdf");
            utilJTableToPdf(tabla, salida, "factura");
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos de la mesa?", "¿Borrar?", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                modelo.setRowCount(0);
                sacarTotal();
                Controlador.borrarTodoDetalle(cmbMesas.getSelectedItem());
                lblResultado.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Puedes borrarlo desde el botón 'Limpiar Comanda'");
            }
        } catch (DocumentException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void cmbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesasActionPerformed
        nMesa = Integer.parseInt(cmbMesas.getSelectedItem().toString());
        verCosasDeMesa(cmbMesas.getSelectedItem());
    }//GEN-LAST:event_cmbMesasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void ponerNombre(String nombreBD) {
        lblNombre.setText(nombreBD);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBebida;
    private javax.swing.JButton btnAddComida;
    private javax.swing.JButton btnAddPostre;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbBebida;
    private javax.swing.JComboBox<String> cmbComida;
    private javax.swing.JComboBox<String> cmbMesas;
    private javax.swing.JComboBox<String> cmbPostre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBebida;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidad1;
    private javax.swing.JLabel lblCantidad2;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPostre;
    private javax.swing.JLabel lblPrecioMenu;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCantidadB;
    private javax.swing.JTextField txtCantidadC;
    private javax.swing.JTextField txtCantidadP;
    // End of variables declaration//GEN-END:variables

    private void cargarCombos(String tabla) {
        ArrayList<String> dato;
        dato = Controlador.obtenerNombres(tabla);

        if (tabla.equalsIgnoreCase("bebida")) {
            for (String bebida : dato) {
                cmbBebida.addItem(bebida);
            }
        } else if (tabla.equalsIgnoreCase("comida")) {
            for (String comida : dato) {
                cmbComida.addItem(comida);
            }
        } else if (tabla.equalsIgnoreCase("postre")) {
            for (String postre : dato) {
                cmbPostre.addItem(postre);
            }
        }
    }

    private void addRow(String nombreTabla) {

        String nombre = "";
        int cantidad = 0;

        if (nombreTabla.equalsIgnoreCase("bebida")) {
            nombre = cmbBebida.getSelectedItem().toString();
            if (txtCantidadB.equals("")) {
                cantidad = 1;
            } else {
                cantidad = Integer.parseInt(txtCantidadB.getText());
            }
        } else if (nombreTabla.equalsIgnoreCase("comida")) {
            nombre = cmbComida.getSelectedItem().toString();
            if (txtCantidadC.equals("")) {
                cantidad = 1;
            } else {
                cantidad = Integer.parseInt(txtCantidadC.getText());
            }
        } else if (nombreTabla.equalsIgnoreCase("postre")) {
            nombre = cmbPostre.getSelectedItem().toString();
            if (txtCantidadP.equals("")) {
                cantidad = 1;
            } else {
                cantidad = Integer.parseInt(txtCantidadP.getText());
            }
        }
        Double precio = Controlador.damePrecio(nombreTabla, nombre);
        double total = precio * cantidad;
        total = Math.round(total * 100);
        total = total / 100;
        Object[] linea = {nombre, cantidad, precio, total};
        Controlador.addRowADetalle(nombre, cantidad, precio, total, Integer.parseInt(cmbMesas.getSelectedItem().toString()));
        modelo.addRow(linea);
        sacarTotal();
    }

    private double sacarTotal() {
        double valorSuma = 0.00;
        double valorFila = 0;

        for (int i = 0; i < tabla.getRowCount(); i++) {
            valorFila = Double.parseDouble(tabla.getValueAt(i, 3).toString());
            valorSuma += valorFila;
        }
        valorSuma = Math.round(valorSuma * 100);
        valorSuma = valorSuma / 100;

        lblResultado.setText("TOTAL: " + valorSuma + "€");
        return valorSuma;
    }

    public void utilJTableToPdf(JTable tabla, File pdfNewFile, String title) throws DocumentException {
        // We create the document and set the file name.        
        // Creamos el documento e indicamos el nombre del fichero.
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("No such file was found to generate the PDF (No se encontró el fichero para generar el pdf)" + fileNotFoundException);
        }
        document.open();
        // We add metadata to PDF
        // Añadimos los metadatos del PDF
        document.addTitle(Controlador.nombreBDLimpio + "\t               FACTURA");
        document.addSubject(Controlador.nombreBDLimpio);
        document.addKeywords("Factura");
        document.addAuthor("Código Alberto Zapardiel Fernández");
        document.addCreator("Código Alberto Zapardiel Fernández");
        // First page (Primera página)
        Anchor anchor = new Anchor(Controlador.nombreBDLimpio + "\t                       FACTURA", categoryFont);
        anchor.setName(Controlador.nombreBDLimpio + "\t                           FACTURA");
        // Second parameter is the number of the chapter (El segundo parámetro es el número del capítulo).
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);
        //Para poner más líneas
        Paragraph subPara = new Paragraph("Gracias por confiar en nosotros\n\n", subCategoryFont);
        Section subCatPart = catPart.addSection(subPara);
        //subCatPart.add(new Paragraph("This is a simple example (Este es un ejemplo sencillo)"));
        // Create the table (Creamos la tabla)
        PdfPTable table = new PdfPTable(tabla.getColumnCount());
        // Now we fill the rows of the PdfPTable (Ahora llenamos las filas de PdfPTable)
        PdfPCell columnHeader;
        // Fill table columns header
        // Rellenamos las cabeceras de las columnas de la tabla.
        for (int column = 0; column < tabla.getColumnCount(); column++) {
            columnHeader = new PdfPCell(new Phrase(tabla.getColumnName(column)));
            columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(columnHeader);
        }
        table.setHeaderRows(1);
        // Fill table rows (rellenamos las filas de la tabla).
        for (int row = 0; row < tabla.getRowCount(); row++) {
            for (int column = 0; column < tabla.getColumnCount(); column++) {
                table.addCell(tabla.getValueAt(row, column).toString());
            }
        }
        subCatPart.add(table);
        document.add(catPart);
        document.close();
        JOptionPane.showMessageDialog(this, "Factura generada",
                "RESULTADO", JOptionPane.INFORMATION_MESSAGE);

    }

    private void cargaComboMesa() {
        ArrayList<Integer> dato;
        dato = Controlador.obtenerNumeros();
        for (int numero : dato) {
            cmbMesas.addItem(String.valueOf(numero));
        }
    }

    private void verCosasDeMesa(Object selectedItem) {
        lblMesa.setText("MESA Nº " + selectedItem);
        modelo.setRowCount(0);
        ArrayList<Detalle> lineas = new ArrayList<>();
        lineas = Controlador.traeLineasMesa(selectedItem);
        for (Detalle detalle : lineas) {
            Object[] linea = {detalle.getNombre(), detalle.getCantidad(), detalle.getPrecio(), detalle.getTotal(), detalle.getNumero()};
            modelo.addRow(linea);
        }
        sacarTotal();
    }

}
