/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.cartacomida.GestionaComida;
import controlador.Controlador;
import static controlador.Controlador.nombreBD;
import controlador.DoubleJTextField;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import vista.cartabebida.GestionaBebida;
import vista.postre.GestionaPostre;
import vista.usuarios.GestionaUsuarios;

/**
 *
 * @author alberto
 */
public class InterfazJefe extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public InterfazJefe() {
        initComponents();
        setLocationRelativeTo(null);
        ponerNombre(nombreBD);
        Double precioMenu = Controlador.verPrecioMenu();
        txtPrecioMenu.setText(String.valueOf(precioMenu));
        txtMesas.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txtMesas.getText().length() >= 3) {
                    e.consume();
                }
            }
        });
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
        btnInterfaz = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnGestionaUsuarios = new javax.swing.JButton();
        btnGestionaComida = new javax.swing.JButton();
        btnGestionaBebida = new javax.swing.JButton();
        btnPrecioMenu = new javax.swing.JButton();
        txtPrecioMenu = new DoubleJTextField();
        lblPrecioMenu = new javax.swing.JLabel();
        btnGestionaPostre = new javax.swing.JButton();
        txtMesas = new DoubleJTextField();
        btnMesas = new javax.swing.JButton();
        lblMesas = new javax.swing.JLabel();
        btnFinDia = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 30, 30));

        lblNombre.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        btnInterfaz.setBackground(new java.awt.Color(204, 204, 204));
        btnInterfaz.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInterfaz.setForeground(new java.awt.Color(0, 0, 0));
        btnInterfaz.setText("IR A LA INTERFAZ PRINCIPAL");
        btnInterfaz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterfazActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 300, 50));

        btnAtras.setBackground(new java.awt.Color(102, 102, 255));
        btnAtras.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(204, 204, 204));
        btnAtras.setText("<- desconectar");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        btnGestionaUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnGestionaUsuarios.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGestionaUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionaUsuarios.setText("GESTIONA USUARIOS");
        btnGestionaUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGestionaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionaUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 300, 50));

        btnGestionaComida.setBackground(new java.awt.Color(204, 204, 204));
        btnGestionaComida.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGestionaComida.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionaComida.setText("GESTIONA CARTA COMIDA");
        btnGestionaComida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGestionaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionaComidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 300, 50));

        btnGestionaBebida.setBackground(new java.awt.Color(204, 204, 204));
        btnGestionaBebida.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGestionaBebida.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionaBebida.setText("GESTIONAR CARTA BEBIDA");
        btnGestionaBebida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGestionaBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionaBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionaBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 50));

        btnPrecioMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnPrecioMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnPrecioMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnPrecioMenu.setText("Poner precio");
        btnPrecioMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrecioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrecioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        txtPrecioMenu.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioMenu.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtPrecioMenu.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioMenuFocusGained(evt);
            }
        });
        getContentPane().add(txtPrecioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 150, 30));

        lblPrecioMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblPrecioMenu.setForeground(new java.awt.Color(204, 255, 255));
        lblPrecioMenu.setText("Precio del menú");
        getContentPane().add(lblPrecioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 210, -1));

        btnGestionaPostre.setBackground(new java.awt.Color(204, 204, 204));
        btnGestionaPostre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGestionaPostre.setForeground(new java.awt.Color(0, 0, 0));
        btnGestionaPostre.setText("GESTIONA CARTA POSTRE");
        btnGestionaPostre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGestionaPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionaPostreActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestionaPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 300, 50));

        txtMesas.setBackground(new java.awt.Color(255, 255, 255));
        txtMesas.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtMesas.setForeground(new java.awt.Color(0, 0, 0));
        txtMesas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesasFocusGained(evt);
            }
        });
        getContentPane().add(txtMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 150, 30));

        btnMesas.setBackground(new java.awt.Color(204, 204, 204));
        btnMesas.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnMesas.setForeground(new java.awt.Color(0, 0, 0));
        btnMesas.setText("Poner número");
        btnMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        lblMesas.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblMesas.setForeground(new java.awt.Color(204, 255, 255));
        lblMesas.setText("Número de mesas");
        getContentPane().add(lblMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 210, -1));

        btnFinDia.setBackground(new java.awt.Color(204, 204, 204));
        btnFinDia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnFinDia.setForeground(new java.awt.Color(0, 0, 0));
        btnFinDia.setText("SACAR FIN DE DIA");
        btnFinDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinDiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 300, 50));

        lblFondo.setForeground(new java.awt.Color(0, 0, 0));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterfazActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInterfazActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
        Controlador.usuarioLogeado = "";
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGestionaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionaUsuariosActionPerformed
        GestionaUsuarios gestionaUsuarios = new GestionaUsuarios();
        gestionaUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionaUsuariosActionPerformed

    private void btnGestionaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionaComidaActionPerformed
        GestionaComida gestionaComida = new GestionaComida();
        gestionaComida.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionaComidaActionPerformed

    private void btnGestionaBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionaBebidaActionPerformed
        GestionaBebida gestionaBebida = new GestionaBebida();
        gestionaBebida.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionaBebidaActionPerformed

    private void btnPrecioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioMenuActionPerformed
        if (!txtPrecioMenu.getText().equalsIgnoreCase("")) {
            String resultado = Controlador.insertarPrecioMenu(Double.parseDouble(txtPrecioMenu.getText()));
            JOptionPane.showMessageDialog(this, resultado);
        } else {
            txtPrecioMenu.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "No puedes dejar el campo vacío");
        }
    }//GEN-LAST:event_btnPrecioMenuActionPerformed

    private void txtPrecioMenuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioMenuFocusGained
        txtPrecioMenu.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtPrecioMenuFocusGained

    private void btnGestionaPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionaPostreActionPerformed
        GestionaPostre gestionaPostre = new GestionaPostre();
        gestionaPostre.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGestionaPostreActionPerformed

    private void btnMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro? No lo hagas si tienes mesas ya abiertas, por favor.");
        if (respuesta == JOptionPane.YES_OPTION && !txtMesas.getText().isEmpty()) {
            Controlador.rehacerMesas(Integer.parseInt(txtMesas.getText()));
            RegistroBD.numeroMesas = Integer.parseInt(txtMesas.getText());
        }
    }//GEN-LAST:event_btnMesasActionPerformed

    private void txtMesasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesasFocusGained
        txtMesas.setText("");
        txtMesas.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtMesasFocusGained

    private void btnFinDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinDiaActionPerformed
        String salida = Controlador.verFinDia();
        JOptionPane.showMessageDialog(this, salida);
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar estos datos?","Borrar",JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            Controlador.borrarFinDia();
        }
    }//GEN-LAST:event_btnFinDiaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazJefe().setVisible(true);
            }
        });
    }

    public void ponerNombre(String nombreBD) {
        lblNombre.setText(nombreBD);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFinDia;
    private javax.swing.JButton btnGestionaBebida;
    private javax.swing.JButton btnGestionaComida;
    private javax.swing.JButton btnGestionaPostre;
    private javax.swing.JButton btnGestionaUsuarios;
    private javax.swing.JButton btnInterfaz;
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnPrecioMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioMenu;
    private javax.swing.JTextField txtMesas;
    private javax.swing.JTextField txtPrecioMenu;
    // End of variables declaration//GEN-END:variables
}