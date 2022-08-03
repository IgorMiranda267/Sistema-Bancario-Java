/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contasBancarias;

/**
 *
 * @author igorm
 */
public class Agencia extends Conta {

    private String cidade;
    private String idAgencia;

    /**
     *
     * @param cidade parametro de argumento
     * @param idAgencia parametro de argumento
     */
    public Agencia(String cidade, String idAgencia) {
        this.cidade = cidade;
        this.idAgencia = idAgencia;
    }

    /**
     *
     * @param cidade paramentro para funcao
     * @param idAgencia paramentro para funcao
     * @param idCliente paramentro para funcao
     */
    public Agencia(String cidade, String idAgencia, String idCliente) {
        super(idCliente);
        this.cidade = cidade;
        this.idAgencia = idAgencia;
    }

    /**
     *
     * @param cidade paramentro para funcao
     * @param idAgencia paramentro para funcao
     * @param agencia paramentro para funcao
     * @param numeroConta paramentro para funcao
     * @param senha paramentro para funcao
     * @param saldo paramentro para funcao
     * @param idCliente paramentro para funcao
     */
    public Agencia(String cidade, String idAgencia, String agencia, int numeroConta, String senha, double saldo, String idCliente) {
        super(agencia, numeroConta, senha, saldo, idCliente);
        this.cidade = cidade;
        this.idAgencia = idAgencia;
    }

    /**
     *
     * @return leitura de atributo
     */
    public String getCidade() {
        return cidade;
    }

    /**
     *
     * @param cidade atrubui valor
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     *
     * @return ler valor
     */
    public String getIdAgencia() {
        return idAgencia;
    }

    /**
     *
     * @param idAgencia atrubui valor
     */
    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;
    }

    /**
     *
     * @return imprime valor
     */
    @Override
    public String toString() {
        return "Agencia{" + "cidade=" + cidade + ", idAgencia=" + idAgencia + '}';
    }

}
