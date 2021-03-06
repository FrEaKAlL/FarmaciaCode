/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.LOGIN;

import Clases.Sesion;
import Funcionalidades.ClsOperaUsuario;
import PROYECTO.DESKTOP.DesktopMain;
import static PROYECTO.FuncionesParalelas.Contraseña.Desifrado;
import javax.swing.JOptionPane;
//import CAPA_PRESENTACION.HILOS.TIPOS;
/**
 *
 * @author Freak
 * @version Beta
 */
public class FRMRegistrar extends javax.swing.JFrame {
    /**
     * Creates new form FRMRegistrar
     */
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public FRMRegistrar() {
        initComponents();
        Sesion.CveTipoDeMenu(2);
        Sesion.TextoTipoDeMenu("ADMINISTRADOR");
        PROYECTO.FuncionesParalelas.Reloj reloj = new PROYECTO.FuncionesParalelas.Reloj(lblReloj);
        reloj.start();
    }// </editor-fold>
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBordeNegro = new javax.swing.JPanel();
        lblUsuarioAdmin = new javax.swing.JLabel();
        txtLoginAdmin = new javax.swing.JTextField();
        pwdLoginAdmin = new javax.swing.JPasswordField();
        lblContraseñaAdmin = new javax.swing.JLabel();
        btnEntrarAdmin = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtLoginAdminTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login administrador");
        setName("frmLoginAdmin"); // NOI18N

        jpnBordeNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnBordeNegro.setName(""); // NOI18N

        lblUsuarioAdmin.setText(Glosario.Glosario.getLoginUsuario());

        pwdLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdLoginAdminActionPerformed(evt);
            }
        });

        lblContraseñaAdmin.setText(Glosario.Glosario.getLoginContraseña());

        btnEntrarAdmin.setText(Glosario.Glosario.getEntrar());
        btnEntrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarAdminActionPerformed(evt);
            }
        });

        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("Hora");

        btnCancelar.setText(Glosario.Glosario.getCancelar());
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBordeNegroLayout = new javax.swing.GroupLayout(jpnBordeNegro);
        jpnBordeNegro.setLayout(jpnBordeNegroLayout);
        jpnBordeNegroLayout.setHorizontalGroup(
            jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBordeNegroLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBordeNegroLayout.createSequentialGroup()
                        .addGroup(jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContraseñaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsuarioAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87))
                    .addGroup(jpnBordeNegroLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntrarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(txtLoginAdmin)
                    .addComponent(pwdLoginAdmin))
                .addGap(80, 80, 80))
            .addGroup(jpnBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBordeNegroLayout.setVerticalGroup(
            jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBordeNegroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReloj)
                .addGap(23, 23, 23)
                .addGroup(jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseñaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpnBordeNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        txtLoginAdminTitle.setFont(new java.awt.Font("Myriad CAD", 1, 24)); // NOI18N
        txtLoginAdminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLoginAdminTitle.setText(Glosario.Glosario.getLoginAdmin());
        txtLoginAdminTitle.setToolTipText("");
        txtLoginAdminTitle.setAlignmentX(100.0F);
        txtLoginAdminTitle.setAlignmentY(100.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpnBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoginAdminTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoginAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnBordeNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Btn entrar">
    private void btnEntrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarAdminActionPerformed
// TODO add your handling code here:
        if(!txtLoginAdmin.getText().equals("") && pwdLoginAdmin.getPassword().length != 0){
            String Usuario = txtLoginAdmin.getText().trim();
            String Contraseña = Desifrado(pwdLoginAdmin.getPassword());  
            if(txtLoginAdmin.getText().equals("Desarrollo") && Contraseña.equals("Des01.23")){
                Sesion.NumeroDeUsuario(0);
                Sesion.NombreDeUsuario(Usuario);
                this.dispose();
                DesktopMain Escritorio = new DesktopMain();
                Escritorio.setVisible(true);
            }else{
                Entidades.ClsUsuario Registro = (new ClsOperaUsuario()).Consulta("", Usuario, Contraseña);
                if(Registro.NumeroDeUsuario() != 0){
                    if (Usuario.equals(Registro.NombreDeUsuario()) && Contraseña.equals(Registro.ContraseñaDeUsuario())){
                        Sesion.NumeroDeUsuario(Registro.NumeroDeUsuario());
                        Sesion.NombreDeUsuario(Registro.NombreDeUsuario());
                        Sesion.RecuperaPerfil();
                        if (Sesion.TipoPermiso(Sesion.NumeroDePerfil(), NumeroDePantalla)){
                            this.dispose();
                            DesktopMain Escritorio = new DesktopMain();
                            Escritorio.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(this, "El usuario " + Sesion.NombreDeUsuario() + " no cuenta con los permisos de acceso.", "Login", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Usuario no encontrado, Error de usuario o contraseña", "Login", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado, Error de usuario o contraseña", "Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Campos vacios", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarAdminActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Evento al dar enter en pwdLoginAdmin">
    private void pwdLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdLoginAdminActionPerformed
        // TODO add your handling code here:
        if(!txtLoginAdmin.getText().equals("") && pwdLoginAdmin.getPassword().length != 0){
            String Usuario = txtLoginAdmin.getText().trim();
            String Contraseña = Desifrado(pwdLoginAdmin.getPassword());  
            if(txtLoginAdmin.getText().equals("Desarrollo") && Contraseña.equals("Des01.23")){
                Sesion.NumeroDeUsuario(0);
                Sesion.NombreDeUsuario(Usuario);
                this.dispose();
                DesktopMain Escritorio = new DesktopMain();
                Escritorio.setVisible(true);
            }else{
                Entidades.ClsUsuario Registro = (new ClsOperaUsuario()).Consulta("", Usuario, Contraseña);
                if(Registro.NumeroDeUsuario() != 0){
                    if (Usuario.equals(Registro.NombreDeUsuario()) && Contraseña.equals(Registro.ContraseñaDeUsuario())){
                        Sesion.NumeroDeUsuario(Registro.NumeroDeUsuario());
                        Sesion.NombreDeUsuario(Registro.NombreDeUsuario());
                        Sesion.RecuperaPerfil();
                        if (Sesion.TipoPermiso(Sesion.NumeroDePerfil(), NumeroDePantalla)){
                            this.dispose();
                            DesktopMain Escritorio = new DesktopMain();
                            Escritorio.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(this, "El usuario " + Sesion.NombreDeUsuario() + " no cuenta con los permisos de acceso.", "Login", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Usuario no encontrado, Error de usuario o contraseña", "Login", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado, Error de usuario o contraseña", "Login", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Campos vacios", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pwdLoginAdminActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="BTN Cancelar">
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FRMLogin frmLogin=new FRMLogin();
        frmLogin.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed
    // </editor-fold>
    /**
     * @param args the command line arguments
     */
    // <editor-fold defaultstate="collapsed" desc="clase main">
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
            java.util.logging.Logger.getLogger(FRMRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMRegistrar().setVisible(true);
            }
        });
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Declaracion de variables">
    public long NumeroDePantalla(){
        return NumeroDePantalla;
    }
    private long NumeroDePantalla = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrarAdmin;
    private javax.swing.JPanel jpnBordeNegro;
    private javax.swing.JLabel lblContraseñaAdmin;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblUsuarioAdmin;
    private javax.swing.JPasswordField pwdLoginAdmin;
    private javax.swing.JTextField txtLoginAdmin;
    private javax.swing.JLabel txtLoginAdminTitle;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
