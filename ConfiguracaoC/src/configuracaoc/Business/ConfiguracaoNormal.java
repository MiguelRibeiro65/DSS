/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Business;

import java.util.ArrayList;

/**
 *
 * @author PedroRibeiro
 */
public class ConfiguracaoNormal extends Configuracao {
    
    
    public String nomeCliente;
    public String moradaCliente;
    public String nifCliente;
    public String contactoCliente;
    
    public ConfiguracaoNormal(){
        super(null, null, null, null, null, null, null, null, null, 0.0);
        
    }
    
    public ConfiguracaoNormal(String modelo, String pintura, String motor, String pacote, String jantes, String pneus, String estofos, String frisos, ArrayList<String> extras, double preco) {
        super(modelo, pintura, motor, pacote, jantes, pneus, estofos, frisos, extras, preco);
        
       
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    
    public String getMoradaCliente(){
        return this.moradaCliente;
    }
    
    public String getNifCliente(){
        return this.nifCliente;
    }
    
    public String getContactoCliente(){
        return this.contactoCliente;
    }
    
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    
    public void setMoradaCliente(String morada){
        this.moradaCliente = morada;
    }
    
    public void setNifCliente(String nif){
        this.nifCliente = nif;
    }
    
    public void setContactoCliente(String contacto){
        this.contactoCliente = contacto;
    }
    
    
    
    public ConfiguracaoNormal clone(){
        return new ConfiguracaoNormal();
    }
    
    
}
