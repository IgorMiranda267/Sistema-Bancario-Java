/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author igorm
 */
public class Administrador extends Funcionario{
    String idAdministrador;
    /**
     * 
     */
    public Administrador(){
        super();
    }
/**
 * 
 * @param nome define o nome usuario
 * @param cpf define o cpf usuario
 * @param senha define senha usuario
 * @param endereço define endereco usuario
 * @param telefone define telefone usuario
 */
    public Administrador( String nome, String cpf, String senha, String endereço, String telefone) {
        this.idAdministrador = cpf;
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereço;
        this.telefone = telefone;
    }
    
/**
 * 
 * @return leitura de atributo
 */
    public String getIdAdministrador() {
        return idAdministrador;
    }
/**
 * 
 * @param idAdministrador atribui valor a variavel
 */
    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
/**
 * 
 * @return imprime o valor dos atributos
 */
    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + '}';
    }
      
}
