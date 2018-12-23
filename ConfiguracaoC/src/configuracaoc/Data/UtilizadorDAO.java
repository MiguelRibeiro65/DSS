/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Data;



import configuracaoc.Business.Utilizador;
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
public class UtilizadorDAO implements Map<String, Utilizador> {

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
        boolean r = false;
       
       try{
           conn = Connect.connect();
           String sql = "select * from Utilizadores where mail=?";
           PreparedStatement st  = conn.prepareStatement(sql);
           st.setString(1, key.toString());
           ResultSet rs = st.executeQuery();
           r = rs.next();
       } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
            Connect.close(conn);
       }
       return r;
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Utilizador get(Object key) {
        Utilizador u = null;
        try {
            conn = Connect.connect();
            PreparedStatement stm = conn.prepareStatement("select * from Utilizadores where mail=?");
            stm.setString(1, (String)key);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                u = new Utilizador(rs.getInt("id"), rs.getString("tipo"), rs.getString("nome"), rs.getString("mail"), rs.getString("username"), rs.getString("password"), rs.getString("contacto"));
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Connect.close(conn);
        }
        
        return u;
    }

    @Override
    public Utilizador put(String key, Utilizador value) {
        Utilizador u = null;
        
        try{
            System.out.println("4");
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("insert into Utilizadores\n"+
                        "(tipo, nome, mail, username, password, contacto)\n"+
                        "values (?, ?, ?, ?, ?, ?)\n"+
                        "on duplicate key update tipo=values(tipo), nome=values(nome), username=values(username), password=values(password), contacto=values(contacto)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, value.getTipo());
            st.setString(2, value.getNome());
            st.setString(3, value.getMail());
            st.setString(4, value.getUsername());
            st.setString(5, value.getPassword());
            st.setString(6, value.getContacto());
            st.executeUpdate();
            System.out.println("4");

            u = value;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        
        return u;
        
    }

    //@Override
    public Utilizador remove(Object key) {
        Utilizador usr = this.get(key);
        try {
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("delete from Utilizadores where username=?");
            st.setString(1,(String) key);
            st.executeUpdate();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        } 
        return usr;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Utilizador> m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        try{
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("delete from Utilizadores where id>0");
            st.executeUpdate();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
    }

    @Override
    public Set<String> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Utilizador> values() {
        ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();
        try {
            conn = Connect.connect();
            PreparedStatement st = conn.prepareStatement("select * from Utilizadores");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Utilizador u = new Utilizador(rs.getInt("id"), rs.getString("tipo"), rs.getString("nome"), rs.getString("mail"), rs.getString("username"), rs.getString("password"), rs.getString("contacto"));
                utilizadores.add(u);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Connect.close(conn);
        }
        return utilizadores;
        
    }

    @Override
    public Set<Entry<String, Utilizador>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
    
    

    
    

