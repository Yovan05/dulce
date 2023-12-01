/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.itson.dulceria.ui;

/**
 *
 * @author ADRIANA
 */
public class JDAdministrador extends javax.swing.JDialog {

    /**
     * Creates new form JDAdministrador
     */
    public JDAdministrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txfContrasena = new javax.swing.JTextField();
        txfUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdmin.setText("Login into a user");
        jPanel1.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 382, -1, -1));

        lblRegister.setText("Register");
        jPanel1.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 426, -1, -1));

        jLabel1.setText("or");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 404, -1, -1));

        btnLogin.setBackground(new java.awt.Color(239, 162, 230));
        btnLogin.setText("Login");
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 353, 157, -1));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombre.setText("Username");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 171, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblContraseña.setText("Contraseña");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 271, -1, -1));
        jPanel1.add(txfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 305, 224, 30));
        jPanel1.add(txfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 211, 224, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JDAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAdministrador dialog = new JDAdministrador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JTextField txfContrasena;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
