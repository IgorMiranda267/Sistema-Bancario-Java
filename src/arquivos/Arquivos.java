/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arquivos;

import com.google.gson.Gson;
import contasBancarias.Agencia;
import contasBancarias.ContaCorrente;
import contasBancarias.ContaPoupanca;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sistema.Administrador;
import sistema.Funcionario;
import sistema.Cliente;

/**
 *
 * @author igorm
 */
public class Arquivos {

    private static final String endArqCliente = "./src/arquivos/Cliente.json";
    private static final String endArqAdm = "./src/arquivos/Administrador.json";
    private static final String endArqFuncionario = "./src/arquivos/Funcionario.json";
    private static final String endArqContaPoupanca = "./src/arquivos/ContaPoupanca.json";
    private static final String endArqContaCorrente = "./src/arquivos/ContaCorrente.json";
    private static final String endArqAgencia = "./src/arquivos/Agencia.json";
    private static final JSONParser parser = new JSONParser();
    private static JSONObject jsonObject = new JSONObject();
    private static JSONArray array = new JSONArray();
    private static String stringJSON;

    /**
     *
     */
    public Arquivos() {

    }

    /**
     *
     * @param caminho leitura
     */
    public static void lerArquivo(String caminho) {

        try (FileReader leitura = new FileReader(caminho)) {
            try {

                array = (JSONArray) parser.parse(leitura);

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Data processing error!");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not found!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "unknown error!");
        }
    }

    /**
     *
     * @param caminho lanca excecao
     * @throws IOException lanca excecao
     */
    public static void escreveNoArquivo(String caminho) throws IOException {

        try (FileWriter escrita = new FileWriter(caminho)) {
            try {

                escrita.write(array.toJSONString());

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "unknown error!");
            } finally {
                array = new JSONArray();
                jsonObject = new JSONObject();
                System.gc();
            }
        }
    }

    /**
     *
     * @param cPoupanca lana excecao
     * @throws IOException lçanca excecao
     */
    public static void criaArquivoContaPoupanca(List<ContaPoupanca> cPoupanca) throws IOException {
        array = new JSONArray();
        for (ContaPoupanca cP : cPoupanca) {
            jsonObject.put("limiteSaque", cP.getLimiteSaque());
            jsonObject.put("agencia", cP.getAgencia());
            jsonObject.put("saldo", cP.getSaldo());
            jsonObject.put("idCliente", cP.getIdCliente());
            jsonObject.put("numeroConta", cP.getNumeroConta());
            array.add(jsonObject);
            jsonObject = new JSONObject();
        }
        escreveNoArquivo(endArqContaPoupanca);
    }

    /**
     *
     * @param cCorrente lanca excecao
     * @throws IOException lanca excecao
     */
    public static void criaArquivoContaCorrente(List<ContaCorrente> cCorrente) throws IOException {
        array = new JSONArray();
        for (ContaCorrente cC : cCorrente) {
            jsonObject.put("taxaManutencao", cC.getTaxaManutencao());
            jsonObject.put("agencia", cC.getAgencia());
            jsonObject.put("saldo", cC.getSaldo());
            jsonObject.put("idCliente", cC.getIdCliente());
            jsonObject.put("numeroConta", cC.getNumeroConta());
            array.add(jsonObject);
            jsonObject = new JSONObject();
        }
        escreveNoArquivo(endArqContaCorrente);
    }

    /**
     *
     * @param clientes lanca excecao
     * @throws IOException lanca excecao
     */
    public static void criaAquivoCliente(List<Cliente> clientes) throws IOException {
        array = new JSONArray();//Cria um arry sem objetos para evitar repetição de informação.
        for (Cliente i : clientes) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("cpf", i.getCpf());
            jsonObject.put("senha", i.getSenha());
            jsonObject.put("nome", i.getNome());
            jsonObject.put("endereco", i.getEndereco());
            jsonObject.put("telefone", i.getTelefone());

            array.add(jsonObject);
            jsonObject = new JSONObject();
        }

        escreveNoArquivo(endArqCliente);
        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    /**
     *
     * @param funcionario lanca excecao
     * @throws IOException lanca excecao
     */
    public static void criaAquivoFuncionario(Funcionario[] funcionario) throws IOException {
        array = new JSONArray();//Cria um arry sem objetos para evitar repetição de informação.
        for (Funcionario f : funcionario) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("idFuncionario", f.getIdFuncionario());
            jsonObject.put("senha", f.getSenha());
            jsonObject.put("nome", f.getNome());
            jsonObject.put("endereco", f.getEndereco());
            jsonObject.put("telefone", f.getTelefone());
            jsonObject.put("dataAdmissao", f.getDataAdmissao());
            jsonObject.put("dataDemissao", f.getDataDemissao());

            array.add(jsonObject);
            jsonObject = new JSONObject();
            System.gc();

        }
        escreveNoArquivo(endArqFuncionario);

        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject.toJSONString());
    }

    /**
     *
     * @param administrador lanca excecao
     * @throws IOException lanca excecao
     */
    public static void criaArquivoAdministrador(List<Administrador> administrador) throws IOException {
        array = new JSONArray();//Cria um arry sem objetos para evitar repetição de informação.
        for (Administrador a : administrador) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("id", "007");
            jsonObject.put("senha", "789");
            jsonObject.put("nome", "");
            jsonObject.put("endereco", "");
            jsonObject.put("telefone", "");

            array.add(jsonObject);
            jsonObject = new JSONObject();
        }
        escreveNoArquivo(endArqFuncionario);
        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    /**
     *
     * @param agencia lanca excecao
     * @throws IOException lanca excecao
     */
    public static void criaArquivoAgencia(List<Agencia> agencia) throws IOException {
        array = new JSONArray();//Cria um arry sem objetos para evitar repetição de informação.
        for (Agencia aG : agencia) {
            //Armazena dados em um Objeto JSON
            jsonObject.put("cidade", aG.getCidade());
            jsonObject.put("idAgencia", aG.getIdAgencia());

            array.add(jsonObject);
            jsonObject = new JSONObject();
        }
        escreveNoArquivo(endArqAgencia);
        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
    }

    /**
     *dsdsd
     * @return throws lanca excecao
     * @throws java.io.FileNotFoundException 
     * @throws IOException lanca excecao
     * @throws ParseException lanca excecao
     * 
     */
    public static Funcionario[] leituraArquivoFuncionario() throws FileNotFoundException, IOException, ParseException {

        lerArquivo(endArqFuncionario);

        Funcionario[] vetFuncionario = new Funcionario[array.size()];

        //Pega o os Objetos do array Json e coloca no vetor vetFuncionarios
        for (int i = 0; i < array.size(); i++) {
            stringJSON = array.get(i).toString();
            vetFuncionario[i] = new Gson().fromJson(stringJSON, Funcionario.class);
        }

        return vetFuncionario;
    }

    /**
     *
     * @return retorna lista de cliente
     */
    public static List<Cliente> leituraArquivoCliente() {

        lerArquivo(endArqCliente);
        List<Cliente> listaCliente = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            stringJSON = array.get(i).toString();
            Cliente novoCliente = new Gson().fromJson(stringJSON, Cliente.class);
            listaCliente.add(novoCliente);
        }
        return listaCliente;
    }

    /**
     *
     * @return retorna lista de conta poupanca
     */
    public static List<ContaPoupanca> lerAquivoContaPoupanca() {
        lerArquivo(endArqContaPoupanca);
        List<ContaPoupanca> cPoupanca = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            stringJSON = array.get(i).toString();
            ContaPoupanca novoConta = new Gson().fromJson(stringJSON, ContaPoupanca.class);
            cPoupanca.add(novoConta);
        }
        return cPoupanca;
    }

    /**
     *
     * @return retorna lista de conta corrente
     */
    public static List<ContaCorrente> lerArquivoContaCorrente() {
        lerArquivo(endArqContaCorrente);
        List<ContaCorrente> cCorrente = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            stringJSON = array.get(i).toString();
            ContaCorrente novoConta = new Gson().fromJson(stringJSON, ContaCorrente.class);
            cCorrente.add(novoConta);
        }
        return cCorrente;
    }

    /**
     *
     * @return retorna lista de arquivo agencia
     */
    public static List<Agencia> lerArquivoAgencia() {
        lerArquivo(endArqAgencia);
        List<Agencia> agencia = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            stringJSON = array.get(i).toString();
            Agencia novaAgencia = new Gson().fromJson(stringJSON, Agencia.class);
            agencia.add(novaAgencia);
        }
        return agencia;
    }
}
