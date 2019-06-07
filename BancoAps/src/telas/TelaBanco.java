/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controls.entity.Banco;
import controls.entity.ContaBancaria;
import controls.entity.ContaCorrente;
import java.util.Scanner;
import app.App;

/**
 *
 * @author joseo
 */
public class TelaBanco extends javax.swing.JFrame {    
//Constante   
    

    public void ligaTela(){
        this.setVisible(true);
    }
    
    public TelaBanco() {
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuCriar = new javax.swing.JCheckBoxMenuItem();
        menuMovimentar = new javax.swing.JCheckBoxMenuItem();
        menuRemover = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("*********MENU DE OPÇÕES***********");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu2.setText("Conta");
        jMenu2.setComponentPopupMenu(jPopupMenu2);

        menuCriar.setText("Criar");
        menuCriar.setToolTipText("");
        menuCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCriarActionPerformed(evt);
            }
        });
        jMenu2.add(menuCriar);

        menuMovimentar.setText("Movimentar");
        menuMovimentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMovimentarMouseClicked(evt);
            }
        });
        menuMovimentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMovimentarActionPerformed(evt);
            }
        });
        jMenu2.add(menuMovimentar);

        menuRemover.setText("Remover");
        menuRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoverActionPerformed(evt);
            }
        });
        jMenu2.add(menuRemover);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");
        jMenu3.setComponentPopupMenu(jPopupMenu2);
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Finalizar");
        jMenu1.setComponentPopupMenu(jPopupMenu2);
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCriarActionPerformed
        Criar c = new Criar();
        c.setEnabled(true);
        c.setVisible(true);
        c.toFront();
        dispose();
    }//GEN-LAST:event_menuCriarActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Relatorio r = new Relatorio();
        r.setEnabled(true);
        r.setVisible(true);
        r.toFront();
        dispose();       
    }//GEN-LAST:event_jMenu3MouseClicked

    private void menuMovimentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMovimentarMouseClicked
        Movimentar m = new Movimentar();
        m.setEnabled(true);
        m.setVisible(true);
        m.toFront();
        dispose();
    }//GEN-LAST:event_menuMovimentarMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void menuMovimentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMovimentarActionPerformed
        Movimentar m = new Movimentar(this);
        m.setEnabled(true);
        m.setVisible(true);
        m.toFront();
        //dispose();
        this.setVisible(false);
    }//GEN-LAST:event_menuMovimentarActionPerformed

    private void menuRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoverActionPerformed
        Remover d = new Remover();
        d.setEnabled(true);
        d.setVisible(true);
        d.toFront();
        dispose();
    }//GEN-LAST:event_menuRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JCheckBoxMenuItem menuCriar;
    private javax.swing.JCheckBoxMenuItem menuMovimentar;
    private javax.swing.JCheckBoxMenuItem menuRemover;
    // End of variables declaration//GEN-END:variables
}
