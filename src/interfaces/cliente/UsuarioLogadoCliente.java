/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.cliente;

/**
 *
 * @author igorm
 */
public class UsuarioLogadoCliente {
    /**
     * 
     */
    public String idLogado, senhaLogado;
    /**
     * 
     */
     public UsuarioLogadoCliente(){
         
     }
/**
 * 
 * @param idLogado
 * @param senhaLogado 
 */
    public UsuarioLogadoCliente(String idLogado, String senhaLogado) {
        this.idLogado = idLogado;
        this.senhaLogado = senhaLogado;
    }
/**
 * 
 * @return 
 */
    public String getIdLogado() {
        return idLogado;
    }
/**
 * 
 * @param idLogado 
 */
    public void setIdLogado(String idLogado) {
        this.idLogado = idLogado;
    }
/**
 * 
 * @return 
 */
    public String getSenhaLogado() {
        return senhaLogado;
    }
/**
 * 
 * @param senhaLogado 
 */
    public void setSenhaLogado(String senhaLogado) {
        this.senhaLogado = senhaLogado;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return "UsuarioLogadoCliente{" + "idLogado=" + idLogado + ", senhaLogado=" + senhaLogado + '}';
    }
     
}
