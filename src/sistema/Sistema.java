/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import arquivos.Arquivos;
import contasBancarias.Conta;
import interfaces.Login;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.parser.ParseException;
/**
 *
 * @author igorm
 */
public class Sistema {
/**
 * 
 * @param args argumento passado para funcao main
 * @throws IOException excecao lancada pela abetura de arquivos
 * @throws ParseException excecao lancada pela abetura de arquivos 
 */
    public static void main(String args[]) throws IOException, ParseException {

        Funcionario[] dadosArquivoFuncionario = Arquivos.leituraArquivoFuncionario(); //Passa todos os Objetos do Json para o vetor de Funcionarios.
        Funcionario[] vetFuncionario = new Funcionario[25];
        List<Conta> listConta = new ArrayList<>();
        List<Funcionario> listFuncionario = new ArrayList<>();
        List<Cliente> listCliente = new ArrayList<>();

        //Adicionando os 25 Colaboarados na Lista.
        for (int i = 0; i < dadosArquivoFuncionario.length; i++) {
            vetFuncionario[i] = dadosArquivoFuncionario[i];
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
           /**
            * 
            */
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

}
