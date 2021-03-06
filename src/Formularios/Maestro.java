/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import java.awt.HeadlessException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author manuelalejandro
 */
public class Maestro extends javax.swing.JFrame {


   
    /**
     * Creates new form Maestro
     */
    public Maestro() {
        initComponents();
        Reloj hilo=new Reloj(hora2);
        hilo.start();
        hora();
    }
     public void hora(){
        Calendar Cal = new GregorianCalendar();
// Calendar Cal= new Calendar.getInstance();
        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+
        "/"+Cal.get(Cal.YEAR);
        hora1.setText(fec);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel6 = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();
        hora2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuregistroyconsulta = new javax.swing.JMenu();
        menupaciente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menufacturacion = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menureportedia = new javax.swing.JMenuItem();
        menureportemes = new javax.swing.JMenuItem();
        menureportecitas = new javax.swing.JMenuItem();
        mnuSistema = new javax.swing.JMenu();
        menuusuarios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha");

        hora1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hora1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hora2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hora2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hora");

        menuregistroyconsulta.setText("Registro y Consulta");
        menuregistroyconsulta.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        menupaciente.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menupaciente.setText("Estudiantes");
        menupaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupacienteActionPerformed(evt);
            }
        });
        menuregistroyconsulta.add(menupaciente);

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem2.setText("Personal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuregistroyconsulta.add(jMenuItem2);

        jMenuItem7.setText("Representantes");
        menuregistroyconsulta.add(jMenuItem7);

        jMenuBar1.add(menuregistroyconsulta);

        jMenu4.setText("Carga");
        jMenu4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        menufacturacion.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menufacturacion.setText("Notas");
        menufacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menufacturacionActionPerformed(evt);
            }
        });
        jMenu4.add(menufacturacion);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        menureportedia.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menureportedia.setText("Boletines");
        menureportedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menureportediaActionPerformed(evt);
            }
        });
        jMenu5.add(menureportedia);

        menureportemes.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menureportemes.setText("Formas para el personal");
        menureportemes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menureportemesActionPerformed(evt);
            }
        });
        jMenu5.add(menureportemes);

        menureportecitas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menureportecitas.setText("Formas para los estudiantes");
        menureportecitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menureportecitasActionPerformed(evt);
            }
        });
        jMenu5.add(menureportecitas);

        jMenuBar1.add(jMenu5);

        mnuSistema.setText("Sistema");
        mnuSistema.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        mnuSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSistemaActionPerformed(evt);
            }
        });

        menuusuarios.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menuusuarios.setText("Registro y Consulta de Usuario");
        menuusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuusuariosActionPerformed(evt);
            }
        });
        mnuSistema.add(menuusuarios);

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem1.setText("Bitacora");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuSistema.add(jMenuItem1);

        jMenuItem4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem4.setText("Datos de la institucion");
        mnuSistema.add(jMenuItem4);

        jMenuBar1.add(mnuSistema);

        jMenu7.setText("Ayuda");
        jMenu7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem5.setText("Manual de usuario");
        jMenu7.add(jMenuItem5);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Salir");
        jMenu8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem3.setText("Cerrar Sesion...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuItem6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem6.setText("Salir del sistema");
        jMenu8.add(jMenuItem6);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menupacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupacienteActionPerformed
        //new Paciente().setVisible(true);
//        mostarUnavez(desktopPane, new Paciente());
    }//GEN-LAST:event_menupacienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
      /*  Historial histo = new Historial();
        mostarUnavez(desktopPane, histo);*/
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menufacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menufacturacionActionPerformed
        //new factura().setVisible(true);
       // mostarUnavez(desktopPane, new factura());
    }//GEN-LAST:event_menufacturacionActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void menureportediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menureportediaActionPerformed
        // TODO add your handling code here:
      //  mostarUnavez(desktopPane, new ReporteDia());
    }//GEN-LAST:event_menureportediaActionPerformed

    private void menureportemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menureportemesActionPerformed
       // mostarUnavez(desktopPane, new ReporteMes());
    }//GEN-LAST:event_menureportemesActionPerformed

    private void menureportecitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menureportecitasActionPerformed
    //    mostarUnavez(desktopPane, new ReporteCita());
    }//GEN-LAST:event_menureportecitasActionPerformed

    private void menuusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuusuariosActionPerformed
        //  new Usuarios().setVisible(true);
//        mostarUnavez(desktopPane, new Usuarios());
    }//GEN-LAST:event_menuusuariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      //  new Bitacora().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSistemaActionPerformed

    }//GEN-LAST:event_mnuSistemaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       // int opc=JOptionPane.showOptionDialog(this, "Cambiar de Usuario", "¿Desea cambiar de Usuario?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Si", "No"}, "Si");

        //          (this, "¿Desea cambiar de Usuario?");
      //  if (JOptionPane.OK_OPTION == opc){
       /*     this.dispose();
            Acceso FrmAcceso = new Acceso();
            FrmAcceso.setLocationRelativeTo(null);
            FrmAcceso.setVisible(true);
        }*/
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

    }//GEN-LAST:event_jMenu8ActionPerformed

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
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hora1;
    private javax.swing.JLabel hora2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem menufacturacion;
    private javax.swing.JMenuItem menupaciente;
    private javax.swing.JMenu menuregistroyconsulta;
    private javax.swing.JMenuItem menureportecitas;
    private javax.swing.JMenuItem menureportedia;
    private javax.swing.JMenuItem menureportemes;
    private javax.swing.JMenuItem menuusuarios;
    private javax.swing.JMenu mnuSistema;
    // End of variables declaration//GEN-END:variables
}
