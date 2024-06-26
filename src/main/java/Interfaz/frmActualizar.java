
package Interfaz;
import entidades.Usuario;
import javax.swing.JOptionPane;
import negocio.Usuarios;

/**
 *
 * @author yalam
 */
public class frmActualizar extends javax.swing.JFrame {

    private Usuario usuario;
    private frmProducto ventanaProducto;
    /**
     * Creates new form frmActualizar
     */
    public frmActualizar() {
        initComponents();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    /**
     * Constructor de frmActualizar para actualizar los datos del usuario que recibe como parametro
     * un usuario para actualizarle los datos
     * @param usuario el usuario al que se le actualizarán los datos
     */
    public frmActualizar(Usuario usuario, frmProducto ventanaProducto) {
        initComponents();
        
        this.usuario = usuario;
        this.ventanaProducto = ventanaProducto;
        
        campoTextoNombre.setText(this.usuario.getNombre());
        campoTextoEmail.setText(this.usuario.getEmail());
        campoTextoDireccion.setText(this.usuario.getDireccion());
        campoTextoTelefono.setText(this.usuario.getTelefono());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTextoNombre = new javax.swing.JTextField();
        campoTextoEmail = new javax.swing.JTextField();
        campoTextoTelefono = new javax.swing.JTextField();
        campoTextoDireccion = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        campoTextoContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Usuario");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Dirección");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Contraseña");

        btnVolver.setBackground(new java.awt.Color(51, 255, 51));
        btnVolver.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnVaciar.setBackground(new java.awt.Color(0, 0, 0));
        btnVaciar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(255, 255, 255));
        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 51, 255));
        btnActualizar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addComponent(jLabel6))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnVaciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTextoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(campoTextoEmail)
                            .addComponent(campoTextoTelefono)
                            .addComponent(campoTextoDireccion)
                            .addComponent(campoTextoContrasena))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTextoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnVaciar)
                    .addComponent(btnActualizar))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        // TODO add your handling code here:
         campoTextoNombre.setText("");
        campoTextoEmail.setText("");
        campoTextoContrasena.setText("");
        campoTextoTelefono.setText("");
        campoTextoDireccion.setText("");
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Usuarios negocioUsuarios = new Usuarios();
        char[] contrasenaCaracter = campoTextoContrasena.getPassword();
        String contrasenaString = new String(contrasenaCaracter);
         
        
        if (campoTextoNombre.getText().trim().isEmpty() || campoTextoEmail.getText().trim().isEmpty()
                    || contrasenaString.trim().isEmpty() || campoTextoTelefono.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: campos vacíos, ingrese valores en los campos de texto", "Error de registro de usuario", HEIGHT);

            } else {
                if (negocioUsuarios.validarContrasena(contrasenaString)) {
                    this.usuario.setNombre(campoTextoNombre.getText());
                    this.usuario.setEmail(campoTextoEmail.getText());
                    this.usuario.setContrasena(contrasenaString);
                    this.usuario.setDireccion(campoTextoDireccion.getText());
                    this.usuario.setTelefono(campoTextoTelefono.getText());
                    
                    if(negocioUsuarios.actualizarUsuario(this.usuario)){
                        JOptionPane.showMessageDialog(null, "Se actualizaron los datos del usuario correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE); 
                        this.dispose();
                        frmLogin ventanaLogin = new frmLogin();
                        frmProducto ventanaProducto = new frmProducto();
                        this.ventanaProducto.dispose();
                        ventanaLogin.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error: No se ha podido actualizar los datos del usuario o los campos son los mismos ya registrados", "Error de actualización de datos del usuario", HEIGHT);
                    }
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Error: La contraseña debe de contener almenos una letra mayuscula, almenos un digito [0-9], \ndebe contener almenos un caracter que no sea ni letra ni digito\n y por último debe tener de 8 a 10 caracteres", "Error de ingreso de contraseña", HEIGHT);
                }
            }      
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPasswordField campoTextoContrasena;
    private javax.swing.JTextField campoTextoDireccion;
    private javax.swing.JTextField campoTextoEmail;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JTextField campoTextoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
