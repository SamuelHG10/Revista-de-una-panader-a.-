
package proyecto;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sietema.panaderiaDAL.conexion;
import sistema.panaderiaBL.panaderiaBL;
/**
 *
 * @author Samuel
 */
//Enlace a base de dato sql lite de manera local.
public class Interfaz_Bd extends javax.swing.JFrame {
     DefaultTableModel modelo;
   
     public Interfaz_Bd() {
          initComponents();
          setLocationRelativeTo(null);
          
          String[] titulos= {"Tipo" , "Nombre"}; 
          modelo= new DefaultTableModel(null, titulos);
          tblPanes.setModel(modelo);
          
          mostrarDatos();
          
     }

  
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          txtTipo = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          txtNombre = new javax.swing.JTextField();
          jScrollPane1 = new javax.swing.JScrollPane();
          tblPanes = new javax.swing.JTable();
          btnEditar = new javax.swing.JButton();
          btnAgregar = new javax.swing.JButton();
          jButton1 = new javax.swing.JButton();
          btnBorrar = new javax.swing.JButton();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(0, 0, 0));

          jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(255, 255, 255));
          jLabel1.setText("Listado de panes");

          tblPanes.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
               },
               new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
               }
          ));
          tblPanes.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tblPanesMouseClicked(evt);
               }
          });
          jScrollPane1.setViewportView(tblPanes);

          btnEditar.setText("Editar");
          btnEditar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEditarActionPerformed(evt);
               }
          });

          btnAgregar.setText("Agregar");
          btnAgregar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAgregarActionPerformed(evt);
               }
          });

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backward_47774.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          btnBorrar.setText("Borrar");
          btnBorrar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBorrarActionPerformed(evt);
               }
          });

          jLabel2.setForeground(new java.awt.Color(255, 255, 255));
          jLabel2.setText("Tipo de pan");

          jLabel3.setForeground(new java.awt.Color(255, 255, 255));
          jLabel3.setText("Nombre de pan");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addGap(130, 130, 130))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addGap(127, 127, 127)
                                        .addComponent(btnEditar)
                                        .addGap(134, 134, 134)
                                        .addComponent(btnBorrar))
                                   .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                  .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel2)
                                                  .addComponent(jLabel3)))))
                              .addGap(50, 50, 50))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addComponent(jButton1)
                              .addGap(232, 232, 232))))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel1)
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(64, 64, 64)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btnEditar)
                         .addComponent(btnAgregar)
                         .addComponent(btnBorrar))
                    .addGap(45, 45, 45)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2))
                    .addGap(17, 17, 17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(29, 29, 29))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
          // TODO add your handling code here:
          conexion objConexion=new conexion();
          
          panaderiaBL oPanaderia= recuperarDatosGUI();
          
          String strSentenciaInsert= String.format("INSERT INTO Panes(Tipo, Nombre) "
                  + "VALUES('%s', '%s')",oPanaderia.getTipoPan(),  oPanaderia.getNombrePan());
          
          objConexion.ejecutarSetenciaSQL(strSentenciaInsert);

           this.mostrarDatos();          
     }//GEN-LAST:event_btnAgregarActionPerformed

     private void tblPanesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPanesMouseClicked
          
          if(evt.getClickCount()==1){
               
               JTable receptor= (JTable)evt.getSource();
               
               txtTipo.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(),0) .toString());
               txtNombre.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(),1) .toString());
               
          }
          
     }//GEN-LAST:event_tblPanesMouseClicked

     private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
      
          
          conexion objConexion=new conexion();
          
          panaderiaBL oPanaderia= recuperarDatosGUI();
          
          String strSentenciaInsert= String.format("DELETE FROM Panes WHERE Tipo=%d" ,oPanaderia.getTipoPan());
          
          objConexion.ejecutarSetenciaSQL(strSentenciaInsert); 
          this.mostrarDatos();
     }//GEN-LAST:event_btnBorrarActionPerformed

     private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          // TODO add your handling code here:
          
          conexion objConexion=new conexion();
          
          panaderiaBL oPanaderia= recuperarDatosGUI();
          
          String strSentenciaInsert= String.format("UPDATE Panes SET Nombre='%s' WHERE Tipo='%s'  ", oPanaderia.getNombrePan(), oPanaderia.getTipoPan());
          
          objConexion.ejecutarSetenciaSQL(strSentenciaInsert);

           this.mostrarDatos();  
          
     }//GEN-LAST:event_btnEditarActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          // TODO add your handling code here:
          Menu menu=new Menu();
          menu.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_jButton1ActionPerformed

     public void mostrarDatos(){
                    while(modelo.getRowCount()>0){
                         modelo.removeRow(0);     
                    }
           conexion objConexion=new conexion();
           
                         try {
                    ResultSet resultado= objConexion.consultarRegistros("SELECT  * FROM Panes");
                    
                    while (resultado.next()) {
                           System.out.println(resultado.getString("Tipo"));
                           System.out.println(resultado.getString("Nombre"));
                         
                           Object [] oUsuario={resultado.getString("Tipo") , resultado.getString("Nombre") };
                           
                           modelo.addRow(oUsuario);
                    }
          } catch (Exception e) {
               System.out.println(e);
          }
          
     }
     
     public panaderiaBL recuperarDatosGUI(){
          panaderiaBL oPanaderia=new panaderiaBL();
          
          int Tipo= (txtTipo.getText() .isEmpty() )?0: Integer.parseInt(txtTipo.getText());
          
          oPanaderia.setTipoPan(Tipo);
          oPanaderia.setNombrePan(txtNombre.getText());
          
          return oPanaderia;
     }
     

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
               java.util.logging.Logger.getLogger(Interfaz_Bd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(Interfaz_Bd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(Interfaz_Bd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(Interfaz_Bd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new Interfaz_Bd().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btnAgregar;
     private javax.swing.JButton btnBorrar;
     private javax.swing.JButton btnEditar;
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable tblPanes;
     private javax.swing.JTextField txtNombre;
     private javax.swing.JTextField txtTipo;
     // End of variables declaration//GEN-END:variables
}
