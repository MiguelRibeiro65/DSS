/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Data;

import configuracaoc.Business.Cliente;
import configuracaoc.Business.Item;
import configuracaoc.Business.Utilizador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PedroRibeiro
 */
public class ClienteDAO implements Map<String, Cliente> {

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
    public Cliente get(Object key) {
        System.out.println("cheguei ao data");
        Cliente cliente = null;
        try{
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("select * from Clientes where nome=?");
            System.out.println("cheguei ao data");
            st.setString(1, (String) key);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                cliente = new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("morada"), rs.getString("nif"), rs.getString("contacto"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        return cliente;
    }

    @Override
    public Cliente put(String key, Cliente value) {
        Cliente c = null;
        
        
        try{
            System.out.println("44444444");
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("insert into Clientes\n"+
                        "(nome, morada, nif, contacto)\n"+
                        "values (?, ?, ?, ?)\n"+
                        "on duplicate key update nome=values(nome), morada=values(morada), nif=values(nif), contacto=values(contacto)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, value.getNome());
            
            st.setString(2, value.getMorada());
            st.setString(3, value.getNif());
            st.setString(4, value.getContacto());
            
            st.executeUpdate();
            System.out.println("4");
            
            
            
            

            
            

            
            c = value;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        
        return c;
    }

    @Override
    public Cliente remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map<? extends String, ? extends Cliente> m) {
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
    public Collection<Cliente> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Entry<String, Cliente>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
