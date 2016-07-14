/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Encapsulamiento.EncapsulamientoEstudiantes;
import Negocios.NegociosEstudiantes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class Editar extends javax.swing.JFrame {

    /**
     * Creates new form Editar
     */
    public Editar() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido P", "Apellido M", "Direccion", "Telefono", "Edad", "Correo", "Carrera"
            }
        ));
        tablaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEstudiantes);

        lblID.setText("jLabel1");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(360, 360, 360))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Mostrar();
    }//GEN-LAST:event_formWindowOpened

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        // Si la Seleccion de la Tabla es igual 0 significa que no hay alguna fila seleccionada
        if(tablaEstudiantes.getSelectedRowCount() == 0)
        {
            JOptionPane.showMessageDialog(this, "Selecione un Registro en la Tabla");
            return;
        }
        
        EncapsulamientoEstudiantes estudiante = new EncapsulamientoEstudiantes();
        
        // Obtenemos los datos de los txt
        estudiante.id(Integer.parseInt(lblID.getText()));
        estudiante.nombre(txtNombre.getText());
        estudiante.apellidoPaterno(txtApellidoP.getText());
        estudiante.apellidoMaterno(txtApellidoM.getText());
        estudiante.direccion(txtDireccion.getText());
        estudiante.edad(Integer.parseInt(txtEdad.getText()));
        estudiante.telefono(Integer.parseInt(txtTelefono.getText()));
        estudiante.correo(txtCorreo.getText());
        estudiante.idCarrera(Integer.parseInt(txtCarrera.getText()));
        
        try {
            // El metodo actualiar persona retorna un valor booleano
            if(NegociosEstudiantes.actualizarEstudiante(estudiante))
            {
                JOptionPane.showMessageDialog(this, "Estudiante actualizado corectamente");
                
                LimpiarTablar();
                try
                {
                    Mostrar();
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(this, "Se ha presentado un Error al Mostrar los Datos");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Se ha presentado un error");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEstudiantesMouseClicked
        // TODO add your handling code here:
        
        // Obtenemos el numero de fila de la tablas
        // Si Es -1 Es porque se ha clikeado fuera de la fila pero dentro de la tabla,
        // Si, no, devuelve el indice de la fila que se ha clikeado
        int NoFila = tablaEstudiantes.rowAtPoint(evt.getPoint());
        
        // Asignamos los datos a los elementos del form
        lblID.setText(tablaEstudiantes.getValueAt(NoFila, 0).toString());
        txtNombre.setText(tablaEstudiantes.getValueAt(NoFila, 1).toString());
        txtApellidoP.setText(tablaEstudiantes.getValueAt(NoFila, 2).toString());
        txtApellidoM.setText(tablaEstudiantes.getValueAt(NoFila, 3).toString());
        txtDireccion.setText(tablaEstudiantes.getValueAt(NoFila, 4).toString());
        txtTelefono.setText(tablaEstudiantes.getValueAt(NoFila, 5).toString());
        txtEdad.setText(tablaEstudiantes.getValueAt(NoFila, 6).toString());
        txtCorreo.setText(tablaEstudiantes.getValueAt(NoFila, 7).toString());
        txtCarrera.setText(tablaEstudiantes.getValueAt(NoFila, 8).toString());
    }//GEN-LAST:event_tablaEstudiantesMouseClicked

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
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar().setVisible(true);
            }
        });
    }
    
    public void LimpiarTablar()
    {
        DefaultTableModel ModeloTabla = (DefaultTableModel)tablaEstudiantes.getModel();

        for(int i = 0; i<tablaEstudiantes.getRowCount(); i++)
        {
            ModeloTabla.removeRow(i);
            i -=1;
        }
    }
    
    public void Mostrar()
    {
        List<EncapsulamientoEstudiantes> listaEstudiantes = null;
        
        try {
            listaEstudiantes = NegociosEstudiantes.mostrarEstudiantes();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
        }
        
        DefaultTableModel ModeloTabla = (DefaultTableModel)tablaEstudiantes.getModel();
       
        for(EncapsulamientoEstudiantes enEstudiante : listaEstudiantes)
        {
            // Asignamos a un Tipo Object
            Object[] DatosFila =
            {
                enEstudiante.id(),
                enEstudiante.nombre(),
                enEstudiante.apellidoPaterno(),
                enEstudiante.apellidoMaterno(),
                enEstudiante.direccion(),
                enEstudiante.telefono(),
                enEstudiante.edad(),
                enEstudiante.correo(),
                enEstudiante.idCarrera(),
            };
            
            // La propiedad .addRow(Object), requiere un objeto
            ModeloTabla.addRow(DatosFila);
        }
        
        tablaEstudiantes.setModel(ModeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
