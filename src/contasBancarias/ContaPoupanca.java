/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contasBancarias;

/**
 *
 * @author igorm
 */
public class ContaPoupanca extends Conta {

    private double limiteSaque;

    /**
     *
     * @param limiteSaque paramentro para funcao
     * @param agencia paramentro para funcao
     * @param numeroConta paramentro para funcao
     * @param senha paramentro para funcao
     * @param saldo paramentro para funcao
     * @param idCliente paramentro para funcao
     */
    public ContaPoupanca(double limiteSaque, String agencia, int numeroConta, String senha, double saldo, String idCliente) {
        super(agencia, numeroConta, senha, saldo, idCliente);
        this.limiteSaque = limiteSaque;
    }

    /**
     *
     * @return ler valor
     */
    public double getLimiteSaque() {
        return limiteSaque;
    }

    /**
     *
     * @param limiteSaque atribui valor
     */
    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    /**
     *
     * @return imprime valor
     */
    @Override
    public String toString() {
        return "ContaPoupanca{" + "limiteSaque=" + limiteSaque + '}';
    }

}
