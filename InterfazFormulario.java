/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import Negocio.Control.Persona;
import Negocio.Modelo.Agenda;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author windows
 */
public class InterfazFormulario extends javax.swing.JFrame {
javax.swing.ImageIcon icono= new javax.swing.ImageIcon (getClass().getResource("/Presentacion/Imagenes/Aprobado.png"));
Agenda agenda = new Agenda(); 
    /**
     * Creates new form InterfazFormulario
     */
    public InterfazFormulario() {
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

        JLTitulo = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        JLApellidos = new javax.swing.JLabel();
        JLCedula = new javax.swing.JLabel();
        JLEmail = new javax.swing.JLabel();
        JLTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        JLImagenNombre = new javax.swing.JLabel();
        JLImagenApellidos = new javax.swing.JLabel();
        JLImagenCedula = new javax.swing.JLabel();
        JLImagenEmail = new javax.swing.JLabel();
        JLImagenTelefono = new javax.swing.JLabel();
        BotonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLTitulo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 0));
        JLTitulo.setText("Formulario de datos ");

        JLNombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JLNombre.setForeground(new java.awt.Color(255, 255, 0));
        JLNombre.setText("Nombre");

        JLApellidos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JLApellidos.setForeground(new java.awt.Color(255, 255, 0));
        JLApellidos.setText("Apellidos");

        JLCedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JLCedula.setForeground(new java.awt.Color(255, 255, 0));
        JLCedula.setText("Cedula");

        JLEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JLEmail.setForeground(new java.awt.Color(255, 255, 0));
        JLEmail.setText("email");

        JLTelefono.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JLTelefono.setForeground(new java.awt.Color(255, 255, 0));
        JLTelefono.setText("Telefono");

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        JLImagenNombre.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenNombre.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenNombre.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenApellidos.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenApellidos.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenApellidos.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenCedula.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenCedula.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenCedula.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenEmail.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenEmail.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenEmail.setPreferredSize(new java.awt.Dimension(30, 30));

        JLImagenTelefono.setMaximumSize(new java.awt.Dimension(30, 30));
        JLImagenTelefono.setMinimumSize(new java.awt.Dimension(30, 30));
        JLImagenTelefono.setPreferredSize(new java.awt.Dimension(30, 30));

        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(JLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JLApellidos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtApellidos))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(JLNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLEmail)
                                            .addComponent(JLCedula))
                                        .addComponent(JLTelefono))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCedula)
                                        .addComponent(txtEmail)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonMostrar)
                                .addGap(25, 25, 25)
                                .addComponent(BotonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonLimpiar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(BotonSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLImagenCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLImagenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLImagenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLApellidos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLImagenNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLImagenApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLImagenCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JLImagenEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLImagenTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonLimpiar)
                    .addComponent(BotonSalir)
                    .addComponent(BotonMostrar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        FondoFormulario AplicarFondo=new FondoFormulario();
        
        this.add(AplicarFondo , BorderLayout.SOUTH );
        AplicarFondo.repaint();
    }//GEN-LAST:event_formWindowOpened

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        // TODO add your handling code here:
        txtNombre.setText( "" ) ;
        txtApellidos.setText( "" );
        txtCedula.setText( "" );
        txtEmail.setText( "" );
        txtTelefono.setText( "" ) ;
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        if(txtNombre.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingrese el nombre");
        }
        if(txtApellidos.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingrese los apellidos");
        }
        if(txtCedula.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingrese numero de Cedula");
        }
        if(txtEmail.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingrese el email");
        }
        if(txtTelefono.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Por favor ingrese el telefono");
        return;
        }
        //Limpiaremos un poco el codigo haciendo a variables nuevas
        String Nombre, Apellidos, Cedula, Email, Telefono;
        //Los llenaremos con las artbles
        Nombre=txtNombre.getText();
        Apellidos=txtApellidos.getText();
        Cedula=txtCedula.getText();
        Email=txtEmail.getText();
        Telefono=txtTelefono.getText();
        
        // y aqui nuestra respuesta de los datos bien agregados
        Persona persona=new Persona(Nombre,Apellidos,Cedula,Email,Telefono);
        
        agenda.GuardarPersona(persona);
        
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if(txtNombre.getText().length()>=12){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        if(txtApellidos.getText().length()>=12){
            evt.consume();
        }
        char TipoDeTecla = evt.getKeyChar();
        if(Character.isDigit(TipoDeTecla)){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char TipoDeTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        if (txtNombre.getText().length() >=2) {
            JLImagenNombre.setIcon (icono);
        } else {
            JLImagenNombre.setIcon (null);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        // TODO add your handling code here:
        if (txtApellidos.getText().length() >=2) {
            JLImagenApellidos.setIcon (icono);
        } else {
            JLImagenApellidos.setIcon (null);
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        // TODO add your handling code here:
        if (txtCedula.getText().length() >=2) {
            JLImagenCedula.setIcon (icono);
        } else {
            JLImagenCedula.setIcon (null);
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (txtEmail.getText().length() >=2) {
            JLImagenEmail.setIcon (icono);
        } else {
            JLImagenEmail.setIcon (null);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        // TODO add your handling code here:
        if (txtTelefono.getText().length() >=2) {
            JLImagenTelefono.setIcon (icono);
        } else {
            JLImagenTelefono.setIcon (null);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        // TODO add your handling code here:
         
        JOptionPane.showMessageDialog(null,agenda.MostrarAgenda());
    }//GEN-LAST:event_BotonMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel JLApellidos;
    private javax.swing.JLabel JLCedula;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLImagenApellidos;
    private javax.swing.JLabel JLImagenCedula;
    private javax.swing.JLabel JLImagenEmail;
    private javax.swing.JLabel JLImagenNombre;
    private javax.swing.JLabel JLImagenTelefono;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLTelefono;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
