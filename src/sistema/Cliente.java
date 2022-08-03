/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import contasBancarias.Conta;

/**
 *
 * @author igorm
 */
public class Cliente {
    String nome;
    String cpf;
    String senha;
    String endereco;
    String telefone;
/**
 * 
 */
    public Cliente() {
    }
/**
 * 
 * @param nome define nome usuario
 * @param cpf define cpf usuario
 * @param senha define senha usuario
 * @param endereco define endereco usuario
 * @param telefone define telefone usuario 
 */
    public Cliente(String nome, String cpf, String senha, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }
/**
 * 
 * @return ler valor
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome atribui valor
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return ler valor
 */
    public String getCpf() {
        return cpf;
    }
/**
 * 
 * @param cpf atribui valor
 */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public String getEndereco() {
        return endereco;
    }
/**
 * 
 * @param endereco atribui valor
 */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
/**
 * 
 * @return ler valor
 */
    public String getTelefone() {
        return telefone;
    }
/**
 * 
 * @param telefone atribui valor
 */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
/**
 * 
 * @return imprime atributos
 */
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", endereço=" + endereco + ", telefone=" + telefone + '}';
    }

}
