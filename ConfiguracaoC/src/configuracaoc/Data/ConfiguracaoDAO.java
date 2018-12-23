/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Data;

import configuracaoc.Business.Configuracao;

import configuracaoc.Business.Pacote;
import configuracaoc.Business.Utilizador;
import configuracaoc.Presentation.ConfNormal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PedroRibeiro
 */
public class ConfiguracaoDAO implements Map<String, Configuracao>{

    private Connection conn;
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Configuracao get(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Configuracao put(String key, Configuracao value) {
        Configuracao c = null;
        
        try{
            System.out.println("4");
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("insert into Configuracao\n"+
                        "(Utilizadores_id, Clientes_id, Pacotes_id)\n"+
                        "values (?, ?, ?)\n"+
                        "on duplicate key update Utilizadores_id=values(Utilizadores_id), Clientes_id=values(Clientes_id), Pacotes_id=values(Pacotes_id)", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, value.getUtilizador());
            st.setInt(2, value.getCliente());
            Pacote p = value.getPacote();
            st.setInt(3, p.getID());
    
            st.executeUpdate();
            System.out.println("4");
            
            
            
            

            
            

            
            c = value;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConfiguracaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        
        return c;
        
    }

    @Override
    public Configuracao remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map<? extends String, ? extends Configuracao> m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Configuracao> values() {
        ArrayList<Configuracao> configuracoes = new ArrayList<Configuracao>();
        try {
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("select * from Configuracao");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Configuracao c = new Configuracao(rs.getInt("id"), rs.getInt("Utilizadores_id"), rs.getInt("Clientes_id"), rs.getInt("Pacotes_id"));
                configuracoes.add(c);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        return configuracoes;
    }

    @Override
    public Set<Entry<String, Configuracao>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
