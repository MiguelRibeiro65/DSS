/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Presentation;

import configuracaoc.Business.ConfiguraFacil;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author PedroRibeiro
 */
public class ConfiguracaoC {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException {
        ConfiguraFacil cf = new ConfiguraFacil();
        Login login = new Login(cf);
        login.setVisible(true);
    }
    
}
