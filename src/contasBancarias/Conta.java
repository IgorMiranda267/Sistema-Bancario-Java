/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contasBancarias;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author igorm
 */
public class Conta {

    private static int totalDeContas;
    private String agencia;
    private int numeroConta;
    private String senha;
    private double saldo;
    private String idCliente;

    /**
     *
     */
    public Conta() {

    }

    /**
     *
     * @param idCliente paramentro para funcao
     */
    public Conta(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * *
     *
     * @param agencia paramentro para funcao
     * @param numeroConta paramentro para funcao
     * @param senha paramentro para funcao
     * @param saldo paramentro para funcao
     * @param idCliente paramentro para funcao
     */
    public Conta(String agencia, int numeroConta, String senha, double saldo, String idCliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }

    /**
     *
     * @return ler valor
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     *
     * @param idCliente atribui valor
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     *
     * @return ler valor
     */
    public static int getTotalDeContas() {
        return totalDeContas;
    }

    /**
     *
     * @param totalDeContas atribui valor
     */
    public static void setTotalDeContas(int totalDeContas) {
        Conta.totalDeContas = totalDeContas;
    }

    /**
     *
     * @return ler valor
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     *
     * @param agencia atribui valor
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     *
     * @return ler valor
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     *
     * @param numeroConta atribui valor
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     *
     * @return ler valor
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha atribui valor
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *
     * @return ler valor
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo atribui valor
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @param saldo parametro da funcao
     * @param operacao parametro da funcao
     */
    public void sacar(double saldo, String operacao) {
        JSONObject jsonObject = null;
        JSONParser parser = new JSONParser();

        String saldoArquivo = null;
        double saldoAtual = 0.0;

        try {
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader("./src/arquivos/Cliente.json"));

            //Salva nas variaveis os dados retirados do arquivo
            saldoArquivo = (String) jsonObject.get("saldo");

            System.out.printf("saldo arquivo: %s\n", saldoArquivo);
        } //Trata as exceptions que podem ser lançadas no decorrer do processo
        catch (FileNotFoundException e) {
        } catch (IOException | ParseException e) {
        }
        // TODO Auto-generated catch block
        saldoAtual = Double.parseDouble(saldoArquivo);

        //Verifica se o saldo a sacar ou transdferir e maior ou igual ao saldo presente na conta
        if ((operacao.equals("saque")) || (operacao.equals("transferencia"))) {
            if (saldoAtual >= saldo) {
                saldoAtual = saldoAtual - saldo;
                FileWriter writeFile = null;

                jsonObject.put("saldo", saldoAtual);

                try {
                    writeFile = new FileWriter("./src/arquivos/Cliente.json");
                    //Escreve no arquivo conteudo do Objeto JSON
                    writeFile.write(jsonObject.toString());
                    writeFile.close();// Fecha arquivo.
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                //saldo infuciente
            }
        }

        //Caso o cliente escolha deposito na interface credita o valor na conta.
        if ("deposito".equals(operacao)) {
            saldoAtual = saldoAtual + saldo;
        }
    }

    /**
     *
     * @return imprime valor
     */
    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", numeroConta=" + numeroConta + ", senha=" + senha + ", saldo=" + saldo + ", idCliente=" + idCliente + '}';
    }
}
