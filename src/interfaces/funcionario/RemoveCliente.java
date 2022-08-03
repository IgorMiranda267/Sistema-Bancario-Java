/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.funcionario;

import arquivos.Arquivos;
import com.google.gson.Gson;
import contasBancarias.Agencia;
import contasBancarias.ContaCorrente;
import contasBancarias.ContaPoupanca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.Cliente;

/**
 *
 * @author igorm
 */
public class RemoveCliente extends javax.swing.JFrame {

    String cpfExcluir;
/**
 * 
 */
    public RemoveCliente() {
        initComponents();
    }
/**
 * 
 * @throws IOException 
 */
    public void removerCliente() throws IOException {

        List<Agencia> agencia = new ArrayList<>();
        List<ContaPoupanca> cPoupanca = new ArrayList<>();
        List<ContaCorrente> cCorrente = new ArrayList<>();
        List<Cliente> lis = new ArrayList<>();//Lista com Novos Clientes e Antigos clientes.

        List<Cliente> listaClienteArquivo = Arquivos.leituraArquivoCliente();//Recupera os dados no Arquivo
        int tam = listaClienteArquivo.size();
        List<ContaPoupanca> listaClientePoupanca = Arquivos.lerAquivoContaPoupanca();
        List<ContaCorrente> listaClienteCorrente = Arquivos.lerArquivoContaCorrente();

        //Laço para Cliente
        for (int i = 0; i < tam; i++) {
            String cpfAux = null;
            Gson gson = new Gson(); // conversor
            String js = gson.toJson(listaClienteArquivo.get(i));
            Cliente objCliente = new Gson().fromJson(js, Cliente.class);
            cpfAux = objCliente.getCpf();
            System.out.printf("CPF para excluir:  ", cpfAux);
            System.out.println();

            if (!(cpfAux.equals(cpfExcluir))) {
                System.out.println(objCliente);
                lis.add(objCliente);
            }
        }

        //Laco para Conta Poupanca
        for (int i = 0; i < tam; i++) {
            String cpfAux = null;
            Gson gson = new Gson(); // conversor
            String js = gson.toJson(listaClientePoupanca.get(i));
            ContaPoupanca objContaPoupanca = new Gson().fromJson(js, ContaPoupanca.class);
            cpfAux = objContaPoupanca.getIdCliente();

            if (!(cpfAux.equals(cpfExcluir))) {
                System.out.println(objContaPoupanca);
                cPoupanca.add(objContaPoupanca);
            }
        }

        //Laço para Conta Corrente
        for (int i = 0; i < tam; i++) {
            String cpfAux = null;
            Gson gson = new Gson(); // conversor
            String js = gson.toJson(listaClienteCorrente.get(i));
            ContaCorrente objContaCorrente = new Gson().fromJson(js, ContaCorrente.class);
            cpfAux = objContaCorrente.getIdCliente();
            

            if (!(cpfAux.equals(cpfExcluir))) {
                System.out.println(objContaCorrente);
                cCorrente.add(objContaCorrente);
            }
        }

        JOptionPane.showMessageDialog(null, "Cliente Removido com Sucesso!");
        Arquivos.criaAquivoCliente(lis);
        Arquivos.criaArquivoContaPoupanca(cPoupanca);
        Arquivos.criaArquivoContaCorrente(cCorrente);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CPF:");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * 
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        cpfExcluir = txt_cpf.getText();
        try {
            removerCliente();
        } catch (IOException ex) {
            Logger.getLogger(RemoveCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_cpf;
    // End of variables declaration//GEN-END:variables
}
