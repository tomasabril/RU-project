/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import BancodeDados.Cliente;
import static Interface.Principal.mainInstance;
import javax.swing.JOptionPane;

/**
 *
 * @author Damaris
 */
public class CadastroClientePeloCliente extends javax.swing.JPanel {

    /**
     * Creates new form CadastroClientePeloCliente
     */
    public CadastroClientePeloCliente() {
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
        jLabel16 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        button2 = new java.awt.Button();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField1 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jDialog1.setLocation(new java.awt.Point(500, 250));
        jDialog1.setSize(new java.awt.Dimension(360, 180));
        jDialog1.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel8.setText("Cadastro realizado com sucesso!");
        jDialog1.getContentPane().add(jLabel8);
        jLabel8.setBounds(19, 11, 297, 25);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton3);
        jButton3.setBounds(131, 54, 72, 23);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Untitled-2 - Copia.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 350, 140);

        jDialog3.setLocation(new java.awt.Point(500, 250));
        jDialog3.setSize(new java.awt.Dimension(360, 180));
        jDialog3.getContentPane().setLayout(null);

        button2.setLabel("OK");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jDialog3.getContentPane().add(button2);
        button2.setBounds(140, 60, 80, 24);

        jLabel17.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel17.setText("Os campos * são obrigatórios.");
        jDialog3.getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 20, 300, 25);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Untitled-2 - Copia.png"))); // NOI18N
        jLabel18.setMaximumSize(new java.awt.Dimension(342, 142));
        jLabel18.setMinimumSize(new java.awt.Dimension(342, 142));
        jLabel18.setPreferredSize(new java.awt.Dimension(342, 142));
        jDialog3.getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 420, 140);

        setMinimumSize(new java.awt.Dimension(753, 552));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome*:");
        add(jLabel5);
        jLabel5.setBounds(200, 100, 70, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail*:");
        add(jLabel6);
        jLabel6.setBounds(200, 200, 80, 22);
        add(jPasswordField1);
        jPasswordField1.setBounds(362, 250, 188, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha*:");
        add(jLabel7);
        jLabel7.setBounds(200, 250, 80, 22);
        add(jPasswordField2);
        jPasswordField2.setBounds(362, 300, 188, 25);
        add(textField2);
        textField2.setBounds(362, 100, 188, 25);
        add(textField3);
        textField3.setBounds(362, 200, 188, 25);

        textField1.setEditable(false);
        textField1.setText("321321");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        add(textField1);
        textField1.setBounds(362, 150, 188, 25);

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

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de Clientes");
        add(jLabel2);
        jLabel2.setBounds(238, 11, 241, 33);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");
        add(jLabel3);
        jLabel3.setBounds(200, 150, 80, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Senha*:");
        add(jLabel4);
        jLabel4.setBounds(200, 300, 150, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo Geral.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 560);

        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel9.setText("Nome:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(214, 154, 41, 19);

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel10.setText("E-mail:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(214, 207, 43, 19);

        jPasswordField3.setText("jPasswordField1");
        jPanel1.add(jPasswordField3);
        jPasswordField3.setBounds(362, 253, 188, 20);

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel11.setText("Senha:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(214, 252, 45, 19);

        jPasswordField4.setText("jPasswordField1");
        jPanel1.add(jPasswordField4);
        jPasswordField4.setBounds(362, 305, 188, 20);

        textField4.setText("textField1");
        jPanel1.add(textField4);
        textField4.setBounds(362, 153, 188, 20);

        textField5.setText("textField1");
        jPanel1.add(textField5);
        textField5.setBounds(362, 206, 188, 20);

        textField6.setText("101010101");
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });
        jPanel1.add(textField6);
        textField6.setBounds(362, 106, 188, 20);

        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(214, 422, 116, 37);

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel12.setText("Cadastro de Clientes");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(238, 11, 241, 33);

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(434, 422, 116, 37);

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel13.setText("Código:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(214, 107, 49, 19);

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel14.setText("Confirmar Senha:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(214, 304, 111, 19);

        jLabel15.setText("jLabel1");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 760, 560);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String senha1 = new String(jPasswordField1.getPassword());
        String senha2 = new String(jPasswordField2.getPassword());
        
        if(textField2.getText().length() == 0 || textField3.getText().length() == 0 || senha1.length() == 0 || senha2.length() == 0){
            jDialog3.setVisible(true);
            return;
        }
        
        if (senha1.equals(senha2)) {

            Cliente cliente = new Cliente();
            cliente.setNome(textField2.getText());
            cliente.setSenha(senha1);
            cliente.setEmail(textField3.getText());
            cliente.setRa(Integer.parseInt(textField1.getText()));
            cliente.setSaldo(0.0);

            mainInstance.em.getTransaction().begin();
            mainInstance.em.persist(cliente);
            mainInstance.em.getTransaction().commit();

            jDialog1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Senhas Imcompativeis");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mainInstance.mostrarCarta("card3");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(false);
        mainInstance.mostrarCarta("card3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // quando a janela aparece
        textField1.setText(Integer.toString(mainInstance.carteirinhatmp));
    }//GEN-LAST:event_formComponentShown

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        jDialog3.setVisible(false);
        mainInstance.mostrarCarta("card12");
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
