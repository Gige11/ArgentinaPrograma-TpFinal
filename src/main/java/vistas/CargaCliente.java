/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import com.argentinaprograma.tpfinal.dominio.Categoria;
import com.argentinaprograma.tpfinal.dominio.Cliente;
import com.argentinaprograma.tpfinal.dominio.Incidencia;
import com.argentinaprograma.tpfinal.dominio.Tecnico;
import com.argentinaprograma.tpfinal.servicios.CategoriaServicio;
import com.argentinaprograma.tpfinal.servicios.ClienteServicio;
import com.argentinaprograma.tpfinal.servicios.IncidenciaServicio;
import com.argentinaprograma.tpfinal.servicios.TecnicoServicio;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class CargaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaIncidencia
     */
    public CargaCliente(JDesktopPane escritorio) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbGuardarCliente = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfDniCliente = new javax.swing.JTextField();
        jtfMail = new javax.swing.JTextField();
        jbCerrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Carga de cliente");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel5.setText("Dni Cliente");

        jLabel6.setText("Mail");

        jbGuardarCliente.setText("Guardar Cliente");
        jbGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarClienteActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfDniCliente)
                        .addComponent(jtfDireccion)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(jtfMail)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCerrar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jbGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jbCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 447, 394);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarClienteActionPerformed

        try {
            String nombre = jtfNombre.getText();
        
            String direccion = jtfDireccion.getText();

            int dni = Integer.parseInt(jtfDniCliente.getText());

            String mail = jtfMail.getText();

            List<Incidencia> incidencias;


            Cliente clienteNuevo = new Cliente();

            clienteNuevo.setNombre_cliente(nombre);
            clienteNuevo.setDireccion_cliente(direccion);
            clienteNuevo.setDni_cliente(dni);     
            clienteNuevo.setMail_cliente(mail);

            ClienteServicio cs = new ClienteServicio();
            
            Cliente cliente = cs.obtenerClientePorDNI(dni);
            
            //controlamos que no exista un cliente con el mismo DNI
            if(cliente != null){
                JOptionPane.showMessageDialog(null, "Existe un cliente con el mismo DNI");
            }else{
                clienteNuevo.setDni_cliente(dni);
                cs.guardarCliente(clienteNuevo);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Ingrese datos validos");
            
        }
              
        
    }//GEN-LAST:event_jbGuardarClienteActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
//        Principal p = new Principal();
//        p.setVisible(true);
    }//GEN-LAST:event_jbCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardarCliente;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDniCliente;
    private javax.swing.JTextField jtfMail;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
