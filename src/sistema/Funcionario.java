/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author igorm
 */
public class Funcionario extends Cliente {
    String idFuncionario;
    String dataAdmissao;
    String dataDemissao;
    /**
     * 
     */
    public Funcionario(){  
        super();
    }
/**
 * 
 * @param dataAdmissao define data de admissao usuario
 * @param nome define nome usuario
 * @param cpf define cpf usuario
 * @param senha define senha usuario
 * @param endereco define endereco usuario
 * @param telefone define telefone usuario
 */
    public Funcionario(String dataAdmissao, String nome, String cpf, String senha, String endereco, String telefone) {
       this.idFuncionario = cpf;
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataAdmissao = dataAdmissao;
    }
/**
 * 
 * @return leitura do atributo id funcionario
 */
    public String getIdFuncionario() {
        return idFuncionario;
    }
/**
 * 
 * @param idFuncionario atribuição do valor ao atributo
 */
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
/**
 * 
 * @return leitura do atributo data de admissão 
 */
    public String getDataAdmissao() {
        return dataAdmissao;
    }
/**
 * 
 * @param dataAdmissao atribuicao do valor
 */
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
/**
 * 
 * @return ler valor
 */
    public String getDataDemissao() {
        return dataDemissao;
    }
/**
 * 
 * @param dataDemissao atribui valor
 */
    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
/**
 * 
 * @return imprime atributos
 */
    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao +
                ", " + getNome()+ '}';
    }
   
}
