/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete.forms;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import lanchonete.atendente.DadosAtendente;
import lanchonete.pedido.Pedido;



public class FormLanchonete1 extends javax.swing.JFrame {


    

    private static void addRow(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form FormLanchonete
     */
    public FormLanchonete1(){ 
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jCardapio = new javax.swing.JLabel();
        jCafe = new javax.swing.JLabel();
        jAgua = new javax.swing.JLabel();
        jCocaCola = new javax.swing.JLabel();
        jBaguete = new javax.swing.JLabel();
        jCuscuz = new javax.swing.JLabel();
        jHamburguer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jBtnNovoPedido = new javax.swing.JButton();
        jBtnConsultarCancelar = new javax.swing.JButton();
        jLabelCafe = new javax.swing.JLabel();
        jLabelAgua = new javax.swing.JLabel();
        jLabelCocaCola = new javax.swing.JLabel();
        jLabelBaguete = new javax.swing.JLabel();
        jLabelCuscuz = new javax.swing.JLabel();
        jLabelHamburguer = new javax.swing.JLabel();
        jNovoPedido = new javax.swing.JLabel();
        jConsultarCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 18, 19));

        jTitulo.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 48)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo.setText("LANCHONETE");

        jCardapio.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jCardapio.setForeground(new java.awt.Color(255, 255, 255));
        jCardapio.setText("CARDÁPIO");

        jCafe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCafe.setForeground(new java.awt.Color(255, 255, 255));
        jCafe.setText("Café");

        jAgua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAgua.setForeground(new java.awt.Color(255, 255, 255));
        jAgua.setText("Água");

        jCocaCola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCocaCola.setForeground(new java.awt.Color(255, 255, 255));
        jCocaCola.setText("Coca-Cola");

        jBaguete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBaguete.setForeground(new java.awt.Color(255, 255, 255));
        jBaguete.setText("Baguete");

        jCuscuz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCuscuz.setForeground(new java.awt.Color(255, 255, 255));
        jCuscuz.setText("Cuscuz");

        jHamburguer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jHamburguer.setForeground(new java.awt.Color(255, 255, 255));
        jHamburguer.setText("Hambúrguer");

        jTablePedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID/Nº", "NOME", "COMIDA", "BEBIDA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);

        jBtnNovoPedido.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jBtnNovoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-adicionar-o-carrinho-de-compras-96.png"))); // NOI18N

        jBtnConsultarCancelar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jBtnConsultarCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-excluir-propriedade-96.png"))); // NOI18N

        jLabelCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/tea-cup.png"))); // NOI18N

        jLabelAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/water.png"))); // NOI18N

        jLabelCocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/can.png"))); // NOI18N

        jLabelBaguete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/bread.png"))); // NOI18N

        jLabelCuscuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/couscous.png"))); // NOI18N

        jLabelHamburguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/burger.png"))); // NOI18N

        jNovoPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jNovoPedido.setForeground(new java.awt.Color(255, 255, 255));
        jNovoPedido.setText("Novo Pedido");

        jConsultarCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jConsultarCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jConsultarCancelar.setText("Consultar/Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCafe)
                            .addComponent(jLabelCafe)
                            .addComponent(jAgua)
                            .addComponent(jLabelAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCocaCola)
                            .addComponent(jCocaCola))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jHamburguer)
                            .addComponent(jLabelHamburguer)
                            .addComponent(jLabelCuscuz)
                            .addComponent(jBaguete)
                            .addComponent(jLabelBaguete)
                            .addComponent(jCuscuz)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jCardapio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNovoPedido)
                    .addComponent(jConsultarCancelar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnNovoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConsultarCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCardapio)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCafe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBaguete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCafe)
                                    .addComponent(jBaguete))
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jNovoPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnNovoPedido)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCuscuz)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCuscuz))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelAgua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAgua)))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCocaCola)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCocaCola))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelHamburguer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jHamburguer))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jConsultarCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConsultarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormLanchonete1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLanchonete1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLanchonete1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLanchonete1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                    new FormLanchonete1().setVisible(true);
        
               
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAgua;
    private javax.swing.JLabel jBaguete;
    private javax.swing.JButton jBtnConsultarCancelar;
    private javax.swing.JButton jBtnNovoPedido;
    private javax.swing.JLabel jCafe;
    private javax.swing.JLabel jCardapio;
    private javax.swing.JLabel jCocaCola;
    private javax.swing.JLabel jConsultarCancelar;
    private javax.swing.JLabel jCuscuz;
    private javax.swing.JLabel jHamburguer;
    private javax.swing.JLabel jLabelAgua;
    private javax.swing.JLabel jLabelBaguete;
    private javax.swing.JLabel jLabelCafe;
    private javax.swing.JLabel jLabelCocaCola;
    private javax.swing.JLabel jLabelCuscuz;
    private javax.swing.JLabel jLabelHamburguer;
    private javax.swing.JLabel jNovoPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
