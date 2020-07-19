package Principal;

import Excluir.*;
import Cadastrar.*;
import Alterar.*;
        
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btCriarPedido = new javax.swing.JButton();
        btAlterarPedido = new javax.swing.JButton();
        btExcluirPedido = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastrarItem = new javax.swing.JButton();
        btAlterarItem = new javax.swing.JButton();
        btExcluirItem = new javax.swing.JButton();
        btCadastrarFuncionario = new javax.swing.JButton();
        btAlterarFuncionario = new javax.swing.JButton();
        btExcluirFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Menu principal");
        jInternalFrame1.setVisible(true);

        btCriarPedido.setText("Criar pedido");
        btCriarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarPedidoActionPerformed(evt);
            }
        });

        btAlterarPedido.setText("Alterar pedido");
        btAlterarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarPedidoActionPerformed(evt);
            }
        });

        btExcluirPedido.setText("Excluir pedido");
        btExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirPedidoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrarItem.setText("Cadastrar item");
        btCadastrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarItemActionPerformed(evt);
            }
        });

        btAlterarItem.setText("Alterar item");
        btAlterarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarItemActionPerformed(evt);
            }
        });

        btExcluirItem.setText("Excluir item");
        btExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirItemActionPerformed(evt);
            }
        });

        btCadastrarFuncionario.setText("Cadastrar funcionario");
        btCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btAlterarFuncionario.setText("Alterar funcionario");
        btAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarFuncionarioActionPerformed(evt);
            }
        });

        btExcluirFuncionario.setText("Excluir funcionario");
        btExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAlterarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCriarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluirPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btExcluirItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterarItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrarItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btExcluirFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadastrarFuncionario))
                            .addComponent(btAlterarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btSair)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCriarPedido)
                    .addComponent(btCadastrarItem)
                    .addComponent(btCadastrarFuncionario))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarPedido)
                    .addComponent(btAlterarItem)
                    .addComponent(btAlterarFuncionario))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluirPedido)
                    .addComponent(btExcluirItem)
                    .addComponent(btExcluirFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btCriarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarPedidoActionPerformed
new CadastrarPedido().setVisible(true);
    }//GEN-LAST:event_btCriarPedidoActionPerformed

    private void btAlterarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPedidoActionPerformed
new AlterarPedido().setVisible(true);
    }//GEN-LAST:event_btAlterarPedidoActionPerformed

    private void btExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirPedidoActionPerformed
new ExcluirPedido().setVisible(true);
    }//GEN-LAST:event_btExcluirPedidoActionPerformed

    private void btCadastrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarItemActionPerformed
new CadastrarItem().setVisible(true);
    }//GEN-LAST:event_btCadastrarItemActionPerformed

    private void btAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarItemActionPerformed
new AlterarItem().setVisible(true);
    }//GEN-LAST:event_btAlterarItemActionPerformed

    private void btExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirItemActionPerformed
new ExcluirItem().setVisible(true);
    }//GEN-LAST:event_btExcluirItemActionPerformed

    private void btCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncionarioActionPerformed
new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_btCadastrarFuncionarioActionPerformed

    private void btAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarFuncionarioActionPerformed
new AlterarFuncionario().setVisible(true);
    }//GEN-LAST:event_btAlterarFuncionarioActionPerformed

    private void btExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFuncionarioActionPerformed
new ExcluirFuncionario().setVisible(true);
    }//GEN-LAST:event_btExcluirFuncionarioActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarFuncionario;
    private javax.swing.JButton btAlterarItem;
    private javax.swing.JButton btAlterarPedido;
    private javax.swing.JButton btCadastrarFuncionario;
    private javax.swing.JButton btCadastrarItem;
    private javax.swing.JButton btCriarPedido;
    private javax.swing.JButton btExcluirFuncionario;
    private javax.swing.JButton btExcluirItem;
    private javax.swing.JButton btExcluirPedido;
    private javax.swing.JButton btSair;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables
}
