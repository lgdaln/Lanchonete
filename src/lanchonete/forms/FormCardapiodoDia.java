/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.forms;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lanchonete.cardapio.Cardapio;
import lanchonete.cardapio.DadosCardapio;
import lanchonete.cliente.Cliente;
import lanchonete.cliente.DadosCliente;
import lanchonete.pedido.DadosPedido;
import lanchonete.pedido.Pedido;
import lanchonete.produto.DadosProduto;
import lanchonete.produto.Produto;

/**
 *
 * @author lgdal
 */
public class FormCardapiodoDia extends javax.swing.JFrame {
    
    Cardapio cardapio = new Cardapio();
    ArrayList<Cardapio> modelCardapio = new ArrayList<>();
    DadosCardapio dadosCardapio = new DadosCardapio();
    
    Cliente modelCliente = new Cliente();
    DadosCliente dadosCliente = new DadosCliente();
    
    Produto modelProduto = new Produto();
    DadosProduto dadosProduto = new DadosProduto();
    
    Pedido modelPedido = new Pedido();
    DadosPedido dadosPedido = new DadosPedido();

    /**
     * Creates new form FormCardapiodoDia
     */
    public FormCardapiodoDia() {
        initComponents();
        setLocationRelativeTo(null);
        AtualizarCardapiodoBanconaTela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtf2 = new javax.swing.JTextField();
        jtf1 = new javax.swing.JTextField();
        jtf9 = new javax.swing.JTextField();
        jtf3 = new javax.swing.JTextField();
        jtf4 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jtf6 = new javax.swing.JTextField();
        jtf7 = new javax.swing.JTextField();
        jtf8 = new javax.swing.JTextField();
        jbCarregarCardapio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfValor1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfValor2 = new javax.swing.JTextField();
        jtfValor9 = new javax.swing.JTextField();
        jtfValor3 = new javax.swing.JTextField();
        jtfValor4 = new javax.swing.JTextField();
        jtfValor5 = new javax.swing.JTextField();
        jtfValor6 = new javax.swing.JTextField();
        jtfValor7 = new javax.swing.JTextField();
        jtfValor8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/water.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA DO CARDÁPIO DO DIA");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jtf2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtf1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf1ActionPerformed(evt);
            }
        });

        jtf9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtf3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf3ActionPerformed(evt);
            }
        });

        jtf4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtf5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtf6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtf7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtf8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jbCarregarCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-actualizar-40.png"))); // NOI18N
        jbCarregarCardapio.setText("CARREGAR NOVO CARDÁPIO");
        jbCarregarCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarregarCardapioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALOR (R$)");

        jtfValor1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESCRIÇÃO");

        jtfValor2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtfValor9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtfValor3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtfValor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValor3ActionPerformed(evt);
            }
        });

        jtfValor4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtfValor5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtfValor6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtfValor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValor6ActionPerformed(evt);
            }
        });

        jtfValor7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtfValor8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/water.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/tea-cup.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/can.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/couscous.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/couscous.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/couscous.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/bread.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/bread.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/bread.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCarregarCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addComponent(jtf7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jtf1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(jtf2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13)
                        .addComponent(jtf3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(jtf4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(13, 13, 13)
                        .addComponent(jtf5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf9)
                            .addComponent(jtf8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf1)
                    .addComponent(jtfValor1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfValor2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jtfValor3))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jtfValor5))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfValor6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtf6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtf7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jtfValor7))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValor8, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfValor9, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jbCarregarCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf1ActionPerformed

    private void jtf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf3ActionPerformed

    private void jbCarregarCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarregarCardapioActionPerformed
        
        //Atualização da linha 1 do cardápio
        try {           

            cardapio.setNome_cardapio(jtf1.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor1.getText()));
            int cod_cardapio = 1;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 2 do cardápio
            cardapio.setNome_cardapio(jtf2.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor2.getText()));
            cod_cardapio = 2;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 3 do cardápio
            cardapio.setNome_cardapio(jtf3.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor3.getText()));
            cod_cardapio = 3;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 4 do cardápio
            cardapio.setNome_cardapio(jtf4.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor4.getText()));
            cod_cardapio = 4;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 5 do cardápio
            cardapio.setNome_cardapio(jtf5.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor5.getText()));
            cod_cardapio = 5;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 6 do cardápio
            cardapio.setNome_cardapio(jtf6.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor6.getText()));
            cod_cardapio = 6;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 7 do cardápio
            cardapio.setNome_cardapio(jtf7.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor7.getText()));
            cod_cardapio = 7;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 8 do cardápio
            cardapio.setNome_cardapio(jtf8.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor8.getText()));
            cod_cardapio = 8;
            atualizarCardapio(cod_cardapio);

            //Atualização da linha 9 do cardápio
            cardapio.setNome_cardapio(jtf9.getText());
            cardapio.setValor_cardapio(Double.parseDouble(jtfValor9.getText()));
            cod_cardapio = 9;
            atualizarCardapio(cod_cardapio);
            
            JOptionPane.showMessageDialog(this,"Cardápio atualizado com sucesso", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

        
        } catch (Exception ex) {
                Logger.getLogger(FormCozinha.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao atulizar o cardápio!", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        


    }//GEN-LAST:event_jbCarregarCardapioActionPerformed

    private void jtfValor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValor6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValor6ActionPerformed

    private void jtfValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValor3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormCardapiodoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCardapiodoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCardapiodoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCardapiodoDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCardapiodoDia().setVisible(true);
            }
        });
    }
    
    /**
     * Atualiza os dados do cardapio de acordo com oq for escrito na tela
     * Chamado pelo botão jbCarregarCardapio.
     * @param cod_cardapio 
     */
    public void atualizarCardapio(int cod_cardapio){
        try {
            dadosCardapio.atualizarCardapio(cardapio, cod_cardapio);
        } catch (Exception ex) {
            Logger.getLogger(FormCardapiodoDia.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    /**
     * Atualiza os dados do cardapio na tela de acordo com oq está no banco
     * Chamado pela inicialização da tela.
     */
    public void AtualizarCardapiodoBanconaTela(){
        try {
            modelCardapio = dadosCardapio.ListarCardapio(cardapio);

        jtf1.removeAll();
        jtf1.setText(modelCardapio.get(0).getNome_cardapio());
        jtfValor1.removeAll();
        jtfValor1.setText(String.valueOf(modelCardapio.get(0).getValor_cardapio()));
        
        jtf2.removeAll();
        jtf2.setText(modelCardapio.get(1).getNome_cardapio());
        jtfValor2.removeAll();
        jtfValor2.setText(String.valueOf(modelCardapio.get(1).getValor_cardapio()));       
        
        jtf3.removeAll();
        jtf3.setText(modelCardapio.get(2).getNome_cardapio());
        jtfValor3.removeAll();
        jtfValor3.setText(String.valueOf(modelCardapio.get(2).getValor_cardapio()));
        
        jtf4.removeAll();
        jtf4.setText(modelCardapio.get(3).getNome_cardapio());
        jtfValor4.removeAll();
        jtfValor4.setText(String.valueOf(modelCardapio.get(3).getValor_cardapio()));
        
        jtf5.removeAll();
        jtf5.setText(modelCardapio.get(4).getNome_cardapio());
        jtfValor5.removeAll();
        jtfValor5.setText(String.valueOf(modelCardapio.get(4).getValor_cardapio()));
        
        jtf6.removeAll();
        jtf6.setText(modelCardapio.get(5).getNome_cardapio());
        jtfValor6.removeAll();
        jtfValor6.setText(String.valueOf(modelCardapio.get(5).getValor_cardapio()));
        
        jtf7.removeAll();
        jtf7.setText(modelCardapio.get(6).getNome_cardapio());
        jtfValor7.removeAll();
        jtfValor7.setText(String.valueOf(modelCardapio.get(6).getValor_cardapio()));
        
        jtf8.removeAll();
        jtf8.setText(modelCardapio.get(7).getNome_cardapio());
        jtfValor8.removeAll();
        jtfValor8.setText(String.valueOf(modelCardapio.get(7).getValor_cardapio()));
        
        jtf9.removeAll();
        jtf9.setText(modelCardapio.get(8).getNome_cardapio());
        jtfValor9.removeAll();
        jtfValor9.setText(String.valueOf(modelCardapio.get(8).getValor_cardapio()));
        
                } catch (Exception ex) {
            Logger.getLogger(FormCardapiodoDia.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCarregarCardapio;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    private javax.swing.JTextField jtf4;
    private javax.swing.JTextField jtf5;
    private javax.swing.JTextField jtf6;
    private javax.swing.JTextField jtf7;
    private javax.swing.JTextField jtf8;
    private javax.swing.JTextField jtf9;
    private javax.swing.JTextField jtfValor1;
    private javax.swing.JTextField jtfValor2;
    private javax.swing.JTextField jtfValor3;
    private javax.swing.JTextField jtfValor4;
    private javax.swing.JTextField jtfValor5;
    private javax.swing.JTextField jtfValor6;
    private javax.swing.JTextField jtfValor7;
    private javax.swing.JTextField jtfValor8;
    private javax.swing.JTextField jtfValor9;
    // End of variables declaration//GEN-END:variables
}
