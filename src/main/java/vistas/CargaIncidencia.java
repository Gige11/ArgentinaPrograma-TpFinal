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
public class CargaIncidencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaIncidencia
     */
    private final JDesktopPane escritorio;

    public CargaIncidencia(JDesktopPane escritorio) {
        this.escritorio = escritorio;
        initComponents();
        
        cargarComboCategoria();
        cargarComboTecnico();
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
        jLabel7 = new javax.swing.JLabel();
        jbGuardarIncidencia = new javax.swing.JButton();
        jtfDescripcion = new javax.swing.JTextField();
        jtfCosto = new javax.swing.JTextField();
        jtfDniCliente = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jbCerrar = new javax.swing.JButton();
        jbNuevoCliente = new javax.swing.JButton();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbTecnico = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Carga de incidencia");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Costo");

        jLabel4.setText("Estado");

        jLabel5.setText("Dni Cliente");

        jLabel6.setText("Categoria");

        jLabel7.setText("Tecnico");

        jbGuardarIncidencia.setText("Guardar Incidencia");
        jbGuardarIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarIncidenciaActionPerformed(evt);
            }
        });

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finalizado", "En proceso", "Sin atender" }));

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbNuevoCliente.setText("Nuevo Cliente");
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfDniCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE)
                                .addComponent(jtfCosto, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbTecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNuevoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbGuardarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCerrar)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevoCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbGuardarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jbCerrar)
                .addGap(16, 16, 16))
        );

        setBounds(0, 0, 498, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarIncidenciaActionPerformed
       
        try {
            
            String descripcion = jtfDescripcion.getText();

            double costo = Double.parseDouble(jtfCosto.getText());

            String estado = jcbEstado.getSelectedItem().toString();

            int dni = Integer.parseInt(jtfDniCliente.getText());

            /////////
            Categoria categoriaSeleccionada = (Categoria) jcbCategoria.getSelectedItem();
            long id_categoria = (categoriaSeleccionada.getId_categoria());
            /////////

            Tecnico tecnicoSeleccionado = (Tecnico) jcbTecnico.getSelectedItem();
            long id_tecnico = (tecnicoSeleccionado.getId_tecnico());
            
            ClienteServicio clienteServicio = new ClienteServicio();

            Cliente clienteEncontrado = clienteServicio.obtenerClientePorDNI(dni);

            CategoriaServicio categoriaServicio = new CategoriaServicio();

            Categoria categoriaEncontrada = categoriaServicio.obtenerCategoriaPorID(id_categoria);

            TecnicoServicio tecnicoServicio = new TecnicoServicio();

            Tecnico tecnicoEncontrado = tecnicoServicio.obtenerTecnicoPorID(id_tecnico);

            Incidencia nuevaIncidencia = new Incidencia(id_categoria, descripcion, costo, estado, clienteEncontrado, categoriaEncontrada, tecnicoEncontrado);

            IncidenciaServicio incidenciaServicio = new IncidenciaServicio();

            incidenciaServicio.guardarIncidencia(nuevaIncidencia);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Ingrese datos validos");
            
        }
        


    }//GEN-LAST:event_jbGuardarIncidenciaActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
//        Principal p = new Principal();
//        p.setVisible(true);
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        // TODO add your handling code here:
        CargaCliente cc = new CargaCliente(escritorio);
        escritorio.add(cc);
        

        cc.setVisible(true);

    }//GEN-LAST:event_jbNuevoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardarIncidencia;
    private javax.swing.JButton jbNuevoCliente;
    private javax.swing.JComboBox<Categoria> jcbCategoria;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<Tecnico> jcbTecnico;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfDniCliente;
    // End of variables declaration//GEN-END:variables

    public void cargarComboCategoria() {
        CategoriaServicio categoriaServicio = new CategoriaServicio();
        List<Categoria> listaCategoria = categoriaServicio.obtenerTodasLasCategorias();

        for (Categoria categoria : listaCategoria) {
            jcbCategoria.addItem(categoria);
        }
    }
    
    public void cargarComboTecnico() {
        TecnicoServicio tecnicoServicio = new TecnicoServicio();
        List<Tecnico> listaTecnicos = tecnicoServicio.obtenerTodosLosTecnicos();

        for (Tecnico tecnico : listaTecnicos) {
            jcbTecnico.addItem(tecnico);
        }
    }
    
}
