
package proyecto;

import java.awt.Desktop;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel Hernández
 */
public class Menu extends javax.swing.JFrame implements Runnable{
    

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
      
    }


    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jDesktopPane1 = new javax.swing.JDesktopPane();
          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jButton1 = new javax.swing.JButton();
          jMenuBar1 = new javax.swing.JMenuBar();
          jMenu1 = new javax.swing.JMenu();
          jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
          jMenu3 = new javax.swing.JMenu();
          jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem9 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem10 = new javax.swing.JCheckBoxMenuItem();
          jMenu4 = new javax.swing.JMenu();
          jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem11 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem12 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem13 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem15 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
          jCheckBoxMenuItem16 = new javax.swing.JCheckBoxMenuItem();
          jMenu2 = new javax.swing.JMenu();
          jCheckBoxMenuItem14 = new javax.swing.JCheckBoxMenuItem();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(0, 0, 0));
          jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

          jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(255, 255, 255));
          jLabel1.setText("Bienvenidos a panadería Hernández´s");
          jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(201, 151, 58)));

          jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo (3).jpg"))); // NOI18N
          jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(201, 151, 58)));

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backward_47774.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addGap(184, 184, 184))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(30, 30, 30))))
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(277, 277, 277)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

          javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
          jDesktopPane1.setLayout(jDesktopPane1Layout);
          jDesktopPane1Layout.setHorizontalGroup(
               jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );
          jDesktopPane1Layout.setVerticalGroup(
               jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );

          jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
          jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(201, 151, 58), null));

          jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_pixel_icon_123657.png"))); // NOI18N
          jMenu1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenu1ActionPerformed(evt);
               }
          });

          jCheckBoxMenuItem1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem1.setSelected(true);
          jCheckBoxMenuItem1.setText("Pan dulce");
          jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.png"))); // NOI18N
          jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem1ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem1);

          jCheckBoxMenuItem2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem2.setSelected(true);
          jCheckBoxMenuItem2.setText("Pasteles");
          jCheckBoxMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pasteles.png"))); // NOI18N
          jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem2ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem2);

          jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/especiales (1).jpg"))); // NOI18N
          jMenu3.setText("Especiales");
          jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

          jCheckBoxMenuItem7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem7.setSelected(true);
          jCheckBoxMenuItem7.setText("Pizzas");
          jCheckBoxMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pizza.png"))); // NOI18N
          jCheckBoxMenuItem7.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem7ActionPerformed(evt);
               }
          });
          jMenu3.add(jCheckBoxMenuItem7);

          jCheckBoxMenuItem8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem8.setSelected(true);
          jCheckBoxMenuItem8.setText("Volovanes");
          jCheckBoxMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volovan.png"))); // NOI18N
          jCheckBoxMenuItem8.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem8ActionPerformed(evt);
               }
          });
          jMenu3.add(jCheckBoxMenuItem8);

          jCheckBoxMenuItem9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem9.setSelected(true);
          jCheckBoxMenuItem9.setText("Baguette");
          jCheckBoxMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bagget (1).png"))); // NOI18N
          jCheckBoxMenuItem9.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem9ActionPerformed(evt);
               }
          });
          jMenu3.add(jCheckBoxMenuItem9);

          jCheckBoxMenuItem10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem10.setSelected(true);
          jCheckBoxMenuItem10.setText("Hot dog´s horneados");
          jCheckBoxMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hot dog (1).png"))); // NOI18N
          jCheckBoxMenuItem10.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem10ActionPerformed(evt);
               }
          });
          jMenu3.add(jCheckBoxMenuItem10);

          jMenu1.add(jMenu3);

          jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan de caja2 (1).jpg"))); // NOI18N
          jMenu4.setText("Pan de caja");
          jMenu4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

          jCheckBoxMenuItem3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem3.setSelected(true);
          jCheckBoxMenuItem3.setText("Pambazos");
          jCheckBoxMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pambazo loco ok.png"))); // NOI18N
          jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem3ActionPerformed(evt);
               }
          });
          jMenu4.add(jCheckBoxMenuItem3);

          jCheckBoxMenuItem4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem4.setSelected(true);
          jCheckBoxMenuItem4.setText("Bolillos");
          jCheckBoxMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolillo.png"))); // NOI18N
          jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem4ActionPerformed(evt);
               }
          });
          jMenu4.add(jCheckBoxMenuItem4);

          jCheckBoxMenuItem11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem11.setSelected(true);
          jCheckBoxMenuItem11.setText("Teleras");
          jCheckBoxMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telera.png"))); // NOI18N
          jCheckBoxMenuItem11.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem11ActionPerformed(evt);
               }
          });
          jMenu4.add(jCheckBoxMenuItem11);

          jCheckBoxMenuItem12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem12.setSelected(true);
          jCheckBoxMenuItem12.setText("Pan de hamburguesa");
          jCheckBoxMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan de ham 2.png"))); // NOI18N
          jCheckBoxMenuItem12.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem12ActionPerformed(evt);
               }
          });
          jMenu4.add(jCheckBoxMenuItem12);

          jCheckBoxMenuItem13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem13.setSelected(true);
          jCheckBoxMenuItem13.setText("Baguette sin relleno");
          jCheckBoxMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bagget (1).png"))); // NOI18N
          jCheckBoxMenuItem13.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem13ActionPerformed(evt);
               }
          });
          jMenu4.add(jCheckBoxMenuItem13);

          jCheckBoxMenuItem15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem15.setSelected(true);
          jCheckBoxMenuItem15.setText("Pan japones");
          jCheckBoxMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan japones (1).png"))); // NOI18N
          jCheckBoxMenuItem15.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem15ActionPerformed(evt);
               }
          });
          jMenu4.add(jCheckBoxMenuItem15);

          jMenu1.add(jMenu4);

          jCheckBoxMenuItem5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem5.setSelected(true);
          jCheckBoxMenuItem5.setText("Contacto");
          jCheckBoxMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whatsapp_socialnetwork_17360.png"))); // NOI18N
          jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem5ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem5);

          jCheckBoxMenuItem6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem6.setSelected(true);
          jCheckBoxMenuItem6.setText("Visitanos");
          jCheckBoxMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Map_1135px_1195280_42272.png"))); // NOI18N
          jCheckBoxMenuItem6.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem6ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem6);

          jCheckBoxMenuItem16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
          jCheckBoxMenuItem16.setSelected(true);
          jCheckBoxMenuItem16.setText("Base de datos (Propietario)");
          jCheckBoxMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono bd.png"))); // NOI18N
          jCheckBoxMenuItem16.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem16ActionPerformed(evt);
               }
          });
          jMenu1.add(jCheckBoxMenuItem16);

          jMenuBar1.add(jMenu1);

          jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook_icon-icons.com_53612.png"))); // NOI18N
          jMenu2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenu2ActionPerformed(evt);
               }
          });

          jCheckBoxMenuItem14.setSelected(true);
          jCheckBoxMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook_icon-icons.com_53612.png"))); // NOI18N
          jCheckBoxMenuItem14.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem14ActionPerformed(evt);
               }
          });
          jMenu2.add(jCheckBoxMenuItem14);

          jMenuBar1.add(jMenu2);

          setJMenuBar(jMenuBar1);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jDesktopPane1)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
             // Pan dulce
             PanDulce panDulce=new PanDulce();
               panDulce.setVisible(true); 
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // Pasteles
         Pasteles pasteles=new Pasteles();
         pasteles.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem6ActionPerformed
        // Visitanos
        Visitanos visitanos=new Visitanos();
        visitanos.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem6ActionPerformed

    private void jCheckBoxMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem8ActionPerformed
        // volovanes
        Especiales especiales=new Especiales();
          especiales.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem8ActionPerformed

    private void jCheckBoxMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem9ActionPerformed
        // baguet
        Especiales especiales=new Especiales();
          especiales.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem9ActionPerformed

    private void jCheckBoxMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem13ActionPerformed
        // pan de caja baguet sin relleno
        PanDeCaja caja=new PanDeCaja();
          caja.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem13ActionPerformed

     private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
          //Contacto
          Contacto contacto=new Contacto();
          contacto.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

     private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

     }//GEN-LAST:event_jMenu1ActionPerformed

     private void jCheckBoxMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7ActionPerformed
          // pizza
        Especiales especiales=new Especiales();
          especiales.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem7ActionPerformed

     private void jCheckBoxMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem10ActionPerformed
          // hot dog
          Especiales especiales=new Especiales();
          especiales.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem10ActionPerformed

     private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
          // pan de caja/ pambazo
          PanDeCaja caja=new PanDeCaja();
          caja.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

     private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
          // pan de caja bolillo
          PanDeCaja caja=new PanDeCaja();
          caja.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

     private void jCheckBoxMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem11ActionPerformed
          //pan de caja telera
          PanDeCaja caja=new PanDeCaja();
          caja.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem11ActionPerformed

     private void jCheckBoxMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem12ActionPerformed
          //pan de caja pan hamburgesa
          PanDeCaja caja=new PanDeCaja();
          caja.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem12ActionPerformed

     private void jCheckBoxMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem15ActionPerformed
          //pan de caja japones
          PanDeCaja caja=new PanDeCaja();
          caja.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem15ActionPerformed

     private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
          // opcion 2 del menu
          Contacto contacto=new Contacto();
          contacto.setVisible(true);
     }//GEN-LAST:event_jMenu2ActionPerformed

     private void jCheckBoxMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem14ActionPerformed
          // redes sociales
         if(java.awt.Desktop.isDesktopSupported()){
              java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
              
              if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                   try{
                    java.net.URI uri = new java.net.URI("https://www.facebook.com/samuel.hernandezgomez2");
                    desktop.browse(uri);
                   }catch(URISyntaxException | IOException ex){ }
              }
         }
     }//GEN-LAST:event_jCheckBoxMenuItem14ActionPerformed

     private void libBotonColores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libBotonColores1ActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_libBotonColores1ActionPerformed

     private void jCheckBoxMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem16ActionPerformed
          // TODO add your handling code here:
          Interfaz_Bd itf=new Interfaz_Bd();
          itf.setVisible(true);
     }//GEN-LAST:event_jCheckBoxMenuItem16ActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          System.exit(WIDTH);
     }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
               
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
             
            public void run() {
                new Menu().setVisible(true);
               new Reloj();
            }
        });
    }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton1;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem10;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem11;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem12;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem13;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem14;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem15;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem16;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem9;
     private javax.swing.JDesktopPane jDesktopPane1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenu jMenu2;
     private javax.swing.JMenu jMenu3;
     private javax.swing.JMenu jMenu4;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JPanel jPanel1;
     // End of variables declaration//GEN-END:variables

     @Override
     public void run() {
          
     }

}
