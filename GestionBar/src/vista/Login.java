/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Color;

/**
 *
 * @author alberto
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblBienvenido.setText("Bienvenid@ a "+Controlador.reemplazarGuiones(Controlador.nombreBD));
    }

    public Login(String nombreLimpio) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        lblBienvenido.setText("Bienvenid@ a "+nombreLimpio);
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
        lblUsuario = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtPassLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblResultadoLogin = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblFondoLogin = new javax.swing.JLabel();

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

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 370, 80, 30));

        txtUsuarioLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioLogin.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtUsuarioLogin.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuarioLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioLoginFocusGained(evt);
            }
        });
        txtUsuarioLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 300, 30));

        lblPass.setBackground(new java.awt.Color(255, 255, 255));
        lblPass.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Password");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 100, 20));

        txtPassLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtPassLogin.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtPassLogin.setForeground(new java.awt.Color(0, 0, 0));
        txtPassLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassLoginFocusGained(evt);
            }
        });
        txtPassLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassLoginKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 300, 30));

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOGEARSE");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 560, 80, 40));

        lblResultadoLogin.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblResultadoLogin.setForeground(Color.WHITE);
        getContentPane().add(lblResultadoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 160, 30));

        lblBienvenido.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 290, 50));

        lblFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        getContentPane().add(lblFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        comprueba();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassLoginFocusGained
        txtPassLogin.setBackground(Color.WHITE);
        lblResultadoLogin.setText("");
    }//GEN-LAST:event_txtPassLoginFocusGained

    private void txtUsuarioLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioLoginFocusGained
        txtUsuarioLogin.setBackground(Color.WHITE);
        lblResultadoLogin.setText("");
    }//GEN-LAST:event_txtUsuarioLoginFocusGained

    private void txtUsuarioLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioLoginKeyPressed
        if (evt.getKeyCode() == 10) {
            comprueba();
        }
    }//GEN-LAST:event_txtUsuarioLoginKeyPressed

    private void txtPassLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassLoginKeyPressed
        if (evt.getKeyCode() == 10) {
            comprueba();
        }
    }//GEN-LAST:event_txtPassLoginKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblFondoLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblResultadoLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables

    private void comprueba() {
        if (!txtUsuarioLogin.getText().isEmpty() && !txtPassLogin.getText().isEmpty()) {

            String usuario = txtUsuarioLogin.getText().trim();
            String pass = txtPassLogin.getText().trim();
            if (Controlador.comprobarUser(usuario, pass)) {
                Controlador.seguirLogeado(usuario, pass);
                dispose();
            } else {
                txtPassLogin.setBackground(Color.RED);
                txtUsuarioLogin.setBackground(Color.RED);
                lblResultadoLogin.setText("Campos incorrectos");
            }
        } else if (txtPassLogin.getText().isEmpty() && txtUsuarioLogin.getText().isEmpty()) {
            txtPassLogin.setBackground(Color.RED);
            txtUsuarioLogin.setBackground(Color.RED);
            lblResultadoLogin.setText("Campos vacios");
        } else if (txtUsuarioLogin.getText().isEmpty()) {
            txtUsuarioLogin.setBackground(Color.RED);
            lblResultadoLogin.setText("Usuario vacio");
        } else if (txtPassLogin.getText().isEmpty()) {
            txtPassLogin.setBackground(Color.RED);
            lblResultadoLogin.setText("Contraseña vacia");
        }
    }

}