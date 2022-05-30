
package proyecto;

import java.util.*;

/**
 *
 * @author Samuel Hernández Gómez
 */
public class Reloj extends javax.swing.JFrame implements Runnable {
String hora, minutos, segundos, ampm;
Calendar calendario;
Thread h1;

     public Reloj() {
          initComponents();
          h1 = new Thread(this);
          h1.start();
          setTitle("Rejoj de Bakery Hernández");
          setVisible(true);
     }

     
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          lblReloj = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setBackground(new java.awt.Color(0, 0, 0));

          jPanel1.setBackground(new java.awt.Color(0, 0, 0));
          jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(201, 151, 58)));

          lblReloj.setBackground(new java.awt.Color(0, 0, 0));
          lblReloj.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
          lblReloj.setForeground(new java.awt.Color(201, 151, 58));
          lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          lblReloj.setText("jLabel1");
          lblReloj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addContainerGap())
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents


     @Override
     public void run() {
         Thread ct=Thread.currentThread();
         
         while(ct==h1){
          calcula();
          lblReloj.setText(hora+": "+minutos+": "+segundos+" :"+ampm);
          try{
               Thread.sleep(1000); 
          }catch(InterruptedException e){}
     }
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JPanel jPanel1;
     private javax.swing.JLabel lblReloj;
     // End of variables declaration//GEN-END:variables

     private void calcula() {
          Calendar calendario = new GregorianCalendar();
          Date fechaHoraActual = new Date();
          
          calendario.setTime(fechaHoraActual);
          ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
          
          if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
            if(h==00){
                   hora="12";
             }else{
                   hora=h>9?""+h:"0"+h;
             }      
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    
     }
}
