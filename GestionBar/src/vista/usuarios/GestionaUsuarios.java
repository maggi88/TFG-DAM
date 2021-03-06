/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.usuarios;
import controlador.Controlador;
import javax.swing.JOptionPane;
import vista.InterfazJefe;

/**
 *
 * @author alberto
 */
public class GestionaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String usuarioAnterior = "";

    public GestionaUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    GestionaUsuarios(String usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioAnterior = usuario;
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
        lblLogo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        lblFondoAdd = new javax.swing.JLabel();

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 30, 30));

        lblLogo.setBackground(new java.awt.Color(187, 187, 187));
        lblLogo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 290));

        btnAtras.setBackground(new java.awt.Color(102, 102, 255));
        btnAtras.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(204, 204, 204));
        btnAtras.setText("<- Atrás");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        btnAddUser.setBackground(new java.awt.Color(204, 204, 204));
        btnAddUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(0, 0, 0));
        btnAddUser.setText("AÑADIR USUARIO/EMPLEADO");
        btnAddUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 300, 50));

        btnModifica.setBackground(new java.awt.Color(204, 204, 204));
        btnModifica.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModifica.setForeground(new java.awt.Color(0, 0, 0));
        btnModifica.setText("MODIFICAR USUARIO/EMPLEADO");
        btnModifica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 300, 50));

        btnBorrar.setBackground(new java.awt.Color(204, 204, 204));
        btnBorrar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("BORRAR USUARIO/EMPLEADO");
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 300, 50));

        btnVer.setBackground(new java.awt.Color(204, 204, 204));
        btnVer.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnVer.setForeground(new java.awt.Color(0, 0, 0));
        btnVer.setText("VER USUARIO/EMPLEADO");
        btnVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 300, 50));

        lblFondoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        getContentPane().add(lblFondoAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
        InterfazJefe interfazJefe = new InterfazJefe();
        interfazJefe.setVisible(true);
        interfazJefe.ponerNombre(Controlador.nombreBDLimpio);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        AddUser addUser = new AddUser();
        addUser.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        String usuario = JOptionPane.showInputDialog(this, "Nombre de usuario");
        if (!usuario.isEmpty() && Controlador.comprobar(usuario,"usuarios")) {
            AddUser addUser = new AddUser(usuario);
            addUser.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "El usuario no existe");
        }
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        dispose();
        BorrarUser removeUser = new BorrarUser();
        removeUser.setVisible(true);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        dispose();
        VerUser verUser = new VerUser();
        verUser.setVisible(true);
    }//GEN-LAST:event_btnVerActionPerformed

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
            java.util.logging.Logger.getLogger(GestionaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel lblFondoAdd;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables


}
