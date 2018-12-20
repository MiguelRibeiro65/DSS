/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Business;


import configuracaoc.Data.ClienteDAO;
import configuracaoc.Data.ConfiguracaoDAO;
import configuracaoc.Data.ItemDAO;
import configuracaoc.Data.UtilizadorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author PedroRibeiro
 */
public class ConfiguraFacil {
    
    private Utilizador sessao;
    private ConfiguracaoDAO configuracaoDAO;
    private UtilizadorDAO utilizadoresDAO;
    private ItemDAO itemDAO;
    private ClienteDAO clientesDAO;
    
    
    public ConfiguraFacil(){
        
        this.utilizadoresDAO = new UtilizadorDAO();
        this.itemDAO = new ItemDAO();
        this.sessao = null;
        this.clientesDAO = new ClienteDAO();
        this.configuracaoDAO = new ConfiguracaoDAO();
    }
    
    public Utilizador getSessao(){
        return sessao;
    }
    
    public String iniciarSessao2(String mail, String password) {
        Utilizador u;
        String tipo = null;
        if(utilizadoresDAO.containsKey(mail)) {
            u = utilizadoresDAO.get(mail);
            int isPW = u.verificaPassword(password);
            if(isPW == 1){
                 tipo = u.getTipo();
            }
        sessao = u;    
        }
        return tipo;
    }
    
    public Utilizador getDados(String mail){
        Utilizador u;
        
        u = utilizadoresDAO.get(mail);
        return u;
    }
    
    public Cliente getCliente(String mail){
        Cliente c;
        
        c = clientesDAO.get(mail);
        return c;
    }
    
    public int getUserID(String mail){
        Utilizador u = utilizadoresDAO.get(mail);
        return u.getID();
    }
    
    public ArrayList<Utilizador> getUsers(){
        return (ArrayList<Utilizador>) utilizadoresDAO.values();
    }
    
    
    
    
    
    public void removerUtilizador(String username){
        System.out.println("estou no business");
        utilizadoresDAO.remove(username);
        
    }
    
    public void adicionarUtilizador(String tipo, String nome, String mail, String username, String password, String contacto) {
        Utilizador u = new Utilizador(tipo, nome, mail, username, password, contacto);
        //String newID = Integer.toString(id);
        //String username = u.getUsername();
        System.out.println("4");
        utilizadoresDAO.put(username, u);
        
    }
    
    public void adicionarConfiguracao(int utilizador, Cliente cliente){
        Configuracao c = new Configuracao(utilizador, getClienteID(cliente.getNif()));
        System.out.println("adicionarConfiguracao");
        configuracaoDAO.put(cliente.getNome(), c);
    }

    
    public int getItem(String nome){
        
        Item item = itemDAO.get(nome);
        int itemID = item.getID();

        return itemID;
        
    }
    
    public int getClienteID(String nif){
        
        Cliente cliente = clientesDAO.get(nif);
        int clienteID = cliente.getID();

        return clienteID;
        
    }
    
    public void adicionarCliente(String nome, String morada, String nif, String contacto) {
        Cliente c = new Cliente(nome, morada, nif, contacto);
        //String newID = Integer.toString(id);
        //String username = u.getUsername();
        System.out.println("4");
        clientesDAO.put(nome, c);
        
    }  
    
}
