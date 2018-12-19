/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Business;

/*ArrayList<Utilizador> utilizadores;
        utilizadores = cf.getUsers();
        for(int i = 0 ; i < utilizadores.size(); i++){
            
        }
*/
/**
 *
 * @author PedroRibeiro
 */
public class Utilizador {
    
    public int id;
    public String tipo;
    public String nome;
    public String mail;
    public String username;
    public String password;
    public String contacto;
    
    public Utilizador(){
        this.id = 0;
        this.tipo = null;
        this.nome = null;
        this.mail = null;
        this.username = null;
        this.password = null;
        this.contacto = null;
    }
    
    public Utilizador(String tipo, String nome, String mail, String username, String password, String contacto){
        //this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.contacto = contacto;
    }
    
    public Utilizador(Utilizador u){
        this.id = u.getID();
        this.tipo = u.getTipo();
        this.nome = u.getNome();
        this.username = u.getUsername();
        this.mail = u.getMail();
        this.password = u.getPassword();
        this.contacto = u.getContacto();
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getContacto(){
        return this.contacto;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMail(String mail){
        this.mail = mail;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setContacto(String contacto){
        this.contacto = contacto;
    }
    
    /**
     *
     * @param password
     */
    public int verificaPassword(String password) {
        int correctPW = 0;
        if(this.password.equals(password)) correctPW = 1;
        return correctPW;
    }
    
    public Utilizador clone() throws CloneNotSupportedException{
        return new Utilizador();
    }
    
    
}
