package lanchonete.forms;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lanchonete.atendente.Atendente;
import lanchonete.atendente.DadosAtendente;


public class FormAtendentes extends javax.swing.JFrame {

    DadosAtendente dadosAtendente = new DadosAtendente();
    ArrayList<Atendente> listaAtendentes = new ArrayList<>();
    Atendente atentende = new Atendente();

    /**
     * Creates new form FormAtendentes
     */
    public FormAtendentes() {
        initComponents();
        setLocationRelativeTo(null);
        AtualizarAtendentesdoBanconaTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfNomeCozinheiro1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNomeCozinheiro2 = new javax.swing.JTextField();
        jtfNomeCozinheiro3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbCarregarNomes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FUNCIONÁRIOS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NOME ATENDENTE 1:");

        jtfNomeCozinheiro1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("NOME ATENDENTE 2:");

        jtfNomeCozinheiro2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jtfNomeCozinheiro3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("NOME ATENDENTE 3:");

        jbCarregarNomes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbCarregarNomes.setText("CARREGAR NOMES");
        jbCarregarNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarregarNomesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jtfNomeCozinheiro3, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNomeCozinheiro2, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNomeCozinheiro1)
                    .addComponent(jbCarregarNomes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNomeCozinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNomeCozinheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNomeCozinheiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jbCarregarNomes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jbCarregarNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarregarNomesActionPerformed
        // Carrega os nomes da tela para o banco de dados

        int cod_atendente;

        try {
            cod_atendente = 1;
            if (" ".equals(jtfNomeCozinheiro1.getText())) {
                atentende.setNome(" ");              
            } else {
                atentende.setNome(jtfNomeCozinheiro1.getText());
            }
            atentende.setCod(cod_atendente);
            dadosAtendente.inseriAtualizaAtendentes(atentende);
        } catch (Exception ex) {
            Logger.getLogger(FormAtendentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            cod_atendente = 2;
            if (jtfNomeCozinheiro2.getText() == null) {
                atentende.setNome(" ");
            } else {
                atentende.setNome(jtfNomeCozinheiro2.getText());
            }
            atentende.setCod(cod_atendente);
            dadosAtendente.inseriAtualizaAtendentes(atentende);
        } catch (Exception ex) {
            Logger.getLogger(FormAtendentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            cod_atendente = 3;
            if (jtfNomeCozinheiro3.getText() == null) {
                atentende.setNome(" ");
            } else {
                atentende.setNome(jtfNomeCozinheiro3.getText());
            }
            atentende.setCod(cod_atendente);
            dadosAtendente.inseriAtualizaAtendentes(atentende);
        } catch (Exception ex) {
            Logger.getLogger(FormAtendentes.class.getName()).log(Level.SEVERE, null, ex);
        }





    }//GEN-LAST:event_jbCarregarNomesActionPerformed

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
            java.util.logging.Logger.getLogger(FormAtendentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAtendentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAtendentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAtendentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAtendentes().setVisible(true);
            }
        });
    }

    /**
     * Carrega os nomes que estão no banco para a tela.
     */
    public void AtualizarAtendentesdoBanconaTela() {

        try {
            listaAtendentes = dadosAtendente.ListarAtendentes(atentende);
        } catch (Exception ex) {
            Logger.getLogger(FormCardapiodoDia.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (listaAtendentes.isEmpty()) {
            try {
                for (int i = 1; i <= 3; i++) {
                    atentende.setNome("");
                    atentende.setCod(i);
                    dadosAtendente.inseriAtualizaAtendentes(atentende);
                }
            } catch (Exception ex) {
                Logger.getLogger(FormCardapiodoDia.class.getName()).log(Level.SEVERE, null, ex);

            }
        } else {

            try {
                //Atualização na linha 2 do banco na atela          
                jtfNomeCozinheiro1.removeAll();
                if (listaAtendentes.get(0).getNome().isEmpty()) {
                    jtfNomeCozinheiro1.setText(" ");
                } else {
                    jtfNomeCozinheiro1.setText(listaAtendentes.get(0).getNome());
                }
            } catch (Exception e) {
            }

            try {
                //Atualização na linha 2 do banco na atela          
                jtfNomeCozinheiro2.removeAll();
                if (listaAtendentes.get(1).getNome().isEmpty()) {
                    jtfNomeCozinheiro2.setText(" ");
                } else {
                    jtfNomeCozinheiro2.setText(listaAtendentes.get(1).getNome());
                }
            } catch (Exception e) {
            }

            try {
                //Atualização na linha 3 do banco na atela          
                jtfNomeCozinheiro3.removeAll();
                if (listaAtendentes.get(2).getNome().isEmpty()) {
                    jtfNomeCozinheiro3.setText(" ");
                } else {
                    jtfNomeCozinheiro3.setText(listaAtendentes.get(2).getNome());
                }
            } catch (Exception e) {
            }
            
            
            
            

        }
       
        /*
   
        try {
            //Atualização na linha 1 do banco na atela          
            jtfNomeCozinheiro1.removeAll();
            if ((listaAtendentes.isEmpty())) {
                jtfNomeCozinheiro1.setText("");
            } else {
                jtfNomeCozinheiro1.setText(listaAtendentes.get(0).getNome());
            }
        } catch (Exception ex) {
                        Logger.getLogger(FormCardapiodoDia.class.getName()).log(Level.SEVERE, null, ex);

        }

        try {
            //Atualização na linha 2 do banco na atela          
            jtfNomeCozinheiro2.removeAll();
            if (listaAtendentes.get(1).getNome().isEmpty()) {
                jtfNomeCozinheiro2.setText(" ");
            } else {
                jtfNomeCozinheiro2.setText(listaAtendentes.get(1).getNome());
            }
        } catch (Exception e) {
        }

        try {
            //Atualização na linha 3 do banco na atela          
            jtfNomeCozinheiro3.removeAll();
            if (listaAtendentes.get(2).getNome().isEmpty()) {
                jtfNomeCozinheiro3.setText(" ");
            } else {
                jtfNomeCozinheiro3.setText(listaAtendentes.get(2).getNome());
            }
        } catch (Exception e) {
        }
        
        
        
        /*
        
        
        
        
        
        
        
        jtfNomeCozinheiro1.removeAll();
        jtfNomeCozinheiro1.setText(String.valueOf(listaAtendentes.get(0).getNome()));

        jtfNomeCozinheiro2.removeAll();
        jtfNomeCozinheiro2.setText(String.valueOf(listaAtendentes.get(1).getNome()));

        jtfNomeCozinheiro3.removeAll();
        jtfNomeCozinheiro3.setText(String.valueOf(listaAtendentes.get(2).getNome()));
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCarregarNomes;
    private javax.swing.JTextField jtfNomeCozinheiro1;
    private javax.swing.JTextField jtfNomeCozinheiro2;
    private javax.swing.JTextField jtfNomeCozinheiro3;
    // End of variables declaration//GEN-END:variables
}
