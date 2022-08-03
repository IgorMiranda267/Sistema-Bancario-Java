/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.cliente;


import interfaces.Login;
import javax.swing.JOptionPane;


/**
 *
 * @author igorm
 */
public class InterfaceCliente extends javax.swing.JFrame  {
    
    //Instanciando as telas da tela principal.
    private String idLogado, senhaLogado;
    Saque telaSaque = new Saque();
    Deposito telaDeposito = new Deposito();
    Transferencia telaTransferencia  = new Transferencia();
 
    /**
     * Creates new form InterfaceCliente
     */
    public InterfaceCliente() {
        initComponents();
        
    }
/**
 * 
 * @return
 * asd
 */
    public String getIdLogado() {
        return idLogado;
    }
/**
 * 
 * @param idLogado 
 adssad
 */
    public void setIdLogado(String idLogado) {
        this.idLogado = idLogado;
    }
/**
 * 
 * @return Função
 * 
 */
    public String getSenhaLogado() {
        return senhaLogado;
    }
/**
 * 
 * @param senhaLogado  Função
 */
    public void setSenhaLogado(String senhaLogado) {
        this.senhaLogado = senhaLogado;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Depositar = new javax.swing.JButton();
        Tranferir = new javax.swing.JButton();
        Sacar = new javax.swing.JButton();
        Extrato = new javax.swing.JButton();
        Saldo = new javax.swing.JButton();
        Dados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Depositar.setText("Depositar");
        Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarActionPerformed(evt);
            }
        });

        Tranferir.setText("Tranferir");
        Tranferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranferirActionPerformed(evt);
            }
        });

        Sacar.setText("Sacar");
        Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacarActionPerformed(evt);
            }
        });

        Extrato.setText("Extrato");

        Saldo.setText("Saldo");
        Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoActionPerformed(evt);
            }
        });

        Dados.setText("Dados");
        Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 271, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(Sacar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(Depositar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(Tranferir, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(Extrato, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(Dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(Sacar)
                .addGap(13, 13, 13)
                .addComponent(Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Tranferir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dados)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * @param evt  Função
 */
    private void SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "R$500,00","Saldo Atual",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_SaldoActionPerformed
/**
 * 
 * @param evt  Função
 */
    private void SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacarActionPerformed
        telaSaque.setVisible(true);
    }//GEN-LAST:event_SacarActionPerformed
/**
 * 
 * @param evt  Função
 */
    private void TranferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranferirActionPerformed
        telaTransferencia.setVisible(true);
    }//GEN-LAST:event_TranferirActionPerformed
/**
 * 
 * @param evt Função
 */
    private void DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarActionPerformed
        telaDeposito.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_DepositarActionPerformed
/**
 * 
 * @param evt Função
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * 
 * @param evt Função
 */
    private void DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosActionPerformed
        
    }//GEN-LAST:event_DadosActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dados;
    private javax.swing.JButton Depositar;
    private javax.swing.JButton Extrato;
    private javax.swing.JButton Sacar;
    private javax.swing.JButton Saldo;
    private javax.swing.JButton Tranferir;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
