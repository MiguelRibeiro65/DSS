/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Business;

/**
 *
 * @author PedroRibeiro
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String morada;
    private String nif;
    private String contacto;
    
    public Cliente(){
        this.nome = null;
        this.morada = null;
        this.nif = null;
        this.contacto = null;
    }
    
    public Cliente(String nome, String morada, String nif, String contacto){
        this.nome = nome;
        this.morada = morada;
        this.nif= nif;
        this.contacto = contacto;
    }
    
    public Cliente(int id, String nome, String morada, String nif, String contacto){
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.nif= nif;
        this.contacto = contacto;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public String getNif(){
        return this.nif;
    }
    
    public String getContacto(){
        return this.contacto;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMorada(String morada){
        this.morada = morada;
    }
    
    public void setNif(String nif){
        this.nif = nif;
    }
    
    public void setContacto(String contacto){
        this.contacto = contacto;
    }
    
}
