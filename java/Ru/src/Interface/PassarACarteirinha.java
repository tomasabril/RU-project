/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import BandodeDados.*;
import static Interface.Principal.mainInstance;
import ru.*;

/**
 *
 * @author Tomás Abril
 */

public class PassarACarteirinha extends javax.swing.JPanel {

    /**
     * Creates new form Panel3
     */
    public PassarACarteirinha() {
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("10159842");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 146, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 98, 50));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Passe a Carteirinha no leitor");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ou digite o codigo da carteirinha:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagen-animada-Codigo-de-Barras-08.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 198, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo Geral.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 820, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        mainInstance.mostrarCarta("card6");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainInstance.mostrarCarta("card2");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
