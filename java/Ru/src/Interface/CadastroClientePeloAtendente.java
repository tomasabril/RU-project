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
 * @author Damaris Tomás Mateus
 */
public class CadastroClientePeloAtendente extends javax.swing.JPanel {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroClientePeloAtendente(Janela instance) {
        initComponents();
        
        mainInstance = instance;
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
        jLabel9 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        button2 = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField1 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Untitled-2 - Copia.png"))); // NOI18N
        jDialog1.getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 340, 140);

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

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel12.setText("Os campos * são obrigatórios.");
        jDialog3.getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 20, 300, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Untitled-2 - Copia.png"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(342, 142));
        jLabel10.setMinimumSize(new java.awt.Dimension(342, 142));
        jLabel10.setPreferredSize(new java.awt.Dimension(342, 142));
        jDialog3.getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 420, 140);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail*:");
        add(jLabel6);
        jLabel6.setBounds(200, 200, 70, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha*:");
        add(jLabel7);
        jLabel7.setBounds(200, 250, 80, 22);

        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        add(textField2);
        textField2.setBounds(362, 100, 188, 25);
        add(textField3);
        textField3.setBounds(362, 200, 188, 25);

        textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField1.setEditable(false);
        textField1.setText("101010101");
        textField1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                textField1ComponentShown(evt);
            }
        });
        textField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textField1MouseMoved(evt);
            }
        });
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
        jLabel3.setBounds(200, 150, 70, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar Senha*:");
        add(jLabel4);
        jLabel4.setBounds(200, 300, 150, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome*:");
        add(jLabel5);
        jLabel5.setBounds(200, 100, 70, 22);
        add(jPasswordField1);
        jPasswordField1.setBounds(362, 250, 188, 25);
        add(jPasswordField2);
        jPasswordField2.setBounds(362, 300, 188, 25);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo Geral.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //textField1.setText(Integer.toString(mainInstance.carteirinhatmp));
        String senha1 = new String(jPasswordField1.getPassword());
        String senha2 = new String(jPasswordField2.getPassword());
        
        if(textField2.getText().length() == 0 || textField3.getText().length() == 0 || senha1.length() == 0 || senha2.length() == 0){
            jDialog3.setVisible(true);
        }
        
        
        if (senha1.equals(senha2)) {
            
            Cliente cliente = new Cliente();
            cliente.setNome(textField2.getText());
            cliente.setSenha(senha1);
            cliente.setEmail(textField3.getText());
            cliente.setRa(mainInstance.carteirinhatmp);
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
        mainInstance.mostrarCarta("card2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(false);
        mainInstance.mostrarCarta("card2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textField1ComponentShown
        // TODO add your handling code here:
        //textField1.setText(Integer.toString(mainInstance.carteirinhatmp));
    }//GEN-LAST:event_textField1ComponentShown

    private void textField1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textField1MouseMoved

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseMoved

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        textField1.setText(Integer.toString(mainInstance.carteirinhatmp));
    }//GEN-LAST:event_formComponentShown

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        jDialog3.setVisible(false);
        mainInstance.mostrarCarta("card6");
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
