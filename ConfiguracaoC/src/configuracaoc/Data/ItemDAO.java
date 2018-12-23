/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Data;

import configuracaoc.Business.Item;
import configuracaoc.Business.Utilizador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class ItemDAO implements Map<String, Item> {

    Connection conn;
    
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
    public Item get(Object key) {
        System.out.println("cheguei ao data");
        Item item = null;
        try{
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("select * from Items where nome=?");
            System.out.println("cheguei ao data");
            st.setString(1, (String) key);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                item = new Item(rs.getInt("id"), rs.getString("tipo"), rs.getString("nome"), rs.getDouble("preco"), rs.getInt("quantidade"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        return item;
    }
    
    

    @Override
    public Item put(String key, Item value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map<? extends String, ? extends Item> m) {
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
    public Collection<Item> values() {
        ArrayList<Item> items = new ArrayList<Item>();
        try {
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("select * from Items");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Item i = new Item(rs.getInt("id"), rs.getString("tipo"), rs.getString("nome"), rs.getDouble("preco"), rs.getInt("quantidade"));
                items.add(i);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        return items;
    }

    @Override
    public Set<Entry<String, Item>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void updateItem(String nome, int quantidade){
        try{
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("update Items set quantidade = quantidade+? where nome=?");
            st.setInt(1, quantidade);
            st.setString(2, nome);
            st.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
    }
    
}
