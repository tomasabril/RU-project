/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.Principal.mainInstance;

/**
 *
 * @author Damaris
 */
public class CadastroAtendente extends javax.swing.JPanel {

    /**
     * Creates new form CadastroAtendente
     */
    public CadastroAtendente() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jDialog1.setLocation(new java.awt.Point(500, 250));
        jDialog1.setSize(new java.awt.Dimension(360, 180));
        jDialog1.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel8.setText("Cadastro realizado com sucesso!");
        jDialog1.getContentPane().add(jLabel8);
        jLabel8.setBounds(19, 11, 297, 25);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton3);
        jButton3.setBounds(131, 54, 72, 23);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Untitled-2 - Copia.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 360, 140);

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel11.setText("Cadastro de Clientes");

        setPreferredSize(new java.awt.Dimension(753, 552));
        setLayout(null);

        textField1.setText("Joaquim");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        add(textField1);
        textField1.setBounds(362, 100, 188, 25);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel2.setText("Cadastro de Atendentes");
        add(jLabel2);
        jLabel2.setBounds(898, 11, 278, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        add(jLabel3);
        jLabel3.setBounds(200, 100, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Senha:");
        add(jLabel4);
        jLabel4.setBounds(200, 300, 140, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargo:");
        add(jLabel5);
        jLabel5.setBounds(200, 150, 60, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login:");
        add(jLabel6);
        jLabel6.setBounds(200, 200, 50, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha:");
        add(jLabel7);
        jLabel7.setBounds(200, 250, 70, 22);

        textField2.setText("Atendente");
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        add(textField2);
        textField2.setBounds(362, 150, 188, 25);

        textField3.setText("3514680494");
        add(textField3);
        textField3.setBounds(362, 200, 188, 25);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(180, 390, 180, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(400, 390, 180, 40);

        jPasswordField2.setText("jPasswordField1");
        add(jPasswordField2);
        jPasswordField2.setBounds(362, 250, 188, 25);

        jPasswordField3.setText("jPasswordField1");
        add(jPasswordField3);
        jPasswordField3.setBounds(362, 300, 188, 25);
        add(jLabel1);
        jLabel1.setBounds(694, 0, 0, 0);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel10.setText("Cadastro de Atendentes");
        add(jLabel10);
        jLabel10.setBounds(898, 11, 278, 33);

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cadastro de Atendente");
        add(jLabel12);
        jLabel12.setBounds(230, 30, 270, 33);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo Geral.jpg"))); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(0, 0, 880, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainInstance.mostrarCarta("card2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(false);
        mainInstance.mostrarCarta("card2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
