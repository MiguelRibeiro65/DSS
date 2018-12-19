/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Data;

import configuracaoc.Business.Configuracao;
import configuracaoc.Business.ConfiguracaoNormal;
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
public class ConfiguracaoDAO implements Map<String, ConfiguracaoNormal>{

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
    public ConfiguracaoNormal get(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConfiguracaoNormal put(String key, ConfiguracaoNormal value) {
        return null;
        
    }

    @Override
    public ConfiguracaoNormal remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map<? extends String, ? extends ConfiguracaoNormal> m) {
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
    public Collection<ConfiguracaoNormal> values() {
        return null;
        /*ArrayList<ConfiguracaoNormal> listaConfiguracoes = new ArrayList<ConfiguracaoNormal>();
        try{
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("select * from Configuracoes");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ConfiguracaoNormal confN = new ConfNormal(rs.getString("tipo"), rs.getString("nome"), rs.getDouble("preco"), rs.getInt("quantidade"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConfiguracaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        
        return listaConfiguracoes;
*/
    }

    @Override
    public Set<Entry<String, ConfiguracaoNormal>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
