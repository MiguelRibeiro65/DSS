/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Business;


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
    
    public ConfiguraFacil(){
        
        this.utilizadoresDAO = new UtilizadorDAO();
        this.sessao = null;
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
           
        }
        return tipo;
    }
    
    public Utilizador getDados(String mail){
        Utilizador u;
        u = utilizadoresDAO.get(mail);
        return u;
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
    
    public Item getItem(String nome){
        Item i = itemDAO.get(nome);
        return i;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
