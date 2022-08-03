/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contasBancarias;

/**
 *
 * @author igorm
 */
public class ContaCorrente extends Conta {

    private double taxaManutencao;

    /**
     *
     * @param taxaManutencao paramentro para funcao
     * @param agencia paramentro para funcao
     * @param numeroConta paramentro para funcao
     * @param senha paramentro para funcao
     * @param saldo paramentro para funcao
     * @param idCliente paramentro para funcao
     */
    public ContaCorrente(double taxaManutencao, String agencia, int numeroConta, String senha, double saldo, String idCliente) {
        super(agencia, numeroConta, senha, saldo, idCliente);
        this.taxaManutencao = taxaManutencao;
    }

    /**
     *
     * @return ler valor
     */
    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    /**
     *
     * @param taxaManutencao atribui valor
     */
    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    /**
     *
     * @return imprime valor
     */
    @Override
    public String toString() {
        return "ContaCorrente{" + "taxaManutencao=" + taxaManutencao + '}';
    }

}
