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
public class Configuracao {
    
    public int id;
    
    public String modelo;
    public String pintura;
    public String motor;
    public String jantes;
    public String pneus;
    public String estofos;
    public String frisos;
    public ArrayList<String> extras;
    public double preco;
    public String pacoteString;
    
    
    public int utilizadorID;
    public int clienteID;
    public Pacote pacote;
    
    public int pacoteID;
    

    
    public Configuracao(){
        
        this.modelo = null;
        this.pintura = null;
        this.motor = null;
        this.jantes = null;
        this.pneus = null;
        this.estofos = null;
        this.frisos = null;
        this.pacote = null;
        this.extras = new ArrayList<>();
        this.preco = 0.0;
        this.pacoteString = null;
        
        
        
    }
    
    public Configuracao(int utilizador, int cliente, Pacote pacote){
        this.utilizadorID = utilizador;
        this.clienteID = cliente;
        this.pacote = pacote;
    }
    
    public Configuracao(int id, int utilizador, int cliente, int pacoteID){
        this.id = id;
        this.utilizadorID = utilizador;
        this.clienteID = cliente;
        this.pacoteID = pacoteID;
    }
    
    public int getID(){
        return this.id;
    }
    
    public int getUtilizador(){
        return this.utilizadorID;
    }
    
    public int getCliente(){
        return this.clienteID;
    }
    
    public Pacote getPacote(){
        return this.pacote;
    }
    
    public int getPacoteID(){
        return this.pacoteID;
    }
    
    public Configuracao(String modelo, String pintura, String motor, String jantes, String pneus, String estofos, String frisos, Pacote pacote, ArrayList<String> extras, double preco, String pacoteString){
        this.modelo = modelo;
        this.pintura = pintura;
        this.motor = motor;
        this.jantes = jantes;
        this.pneus = pneus;
        this.estofos = estofos;
        this.frisos = frisos;
        this.pacote = pacote;
        this.extras = extras;
        this.preco = preco;
        this.pacoteString = pacoteString;
    }
    
    public Configuracao(Configuracao c){
        this.modelo = c.getModelo();
        this.pintura = c.getPintura();
        this.motor = c.getMotor();
        this.jantes = c.getJantes();
        this.pneus = c.getPneus();
        this.estofos = c.getEstofos();
        this.frisos = c.getFrisos();
        this.extras = c.getExtras();
        this.preco = c.getPreco();
    }
    
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getPintura(){
        return this.pintura;
    }
    
    public String getMotor(){
        return this.motor;
    }
    
    
    
    public String getJantes(){
        return this.jantes;
    }
    
    public String getPneus(){
        return this.pneus;
    }
    
    public String getEstofos(){
        return this.estofos;
    }
    
    public String getFrisos(){
        return this.frisos;
    }
    
    public ArrayList<String> getExtras(){
        return this.extras;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPintura(String pintura){
        this.pintura = pintura;
    }
    
    public void setMotor(String motor){
        this.motor = motor;
    }
    
    public void setJantes(String jantes){
        this.jantes = jantes;
    }
    
    public void setPneus(String pneus){
        this.pneus = pneus;
    }
    
    public void setEstofos(String estofos){
        this.estofos = estofos;
    }
    
    public void setFrisos(String frisos){
        this.frisos = frisos;
    }
    
    public void setExtras(ArrayList<String> extras){
        this.extras = extras;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setPacoteString(String pacote){
        this.pacoteString = pacote;
    }
}
