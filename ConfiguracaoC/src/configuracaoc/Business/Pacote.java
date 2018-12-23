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
public class Pacote {
    
    private int id;
    private String nome;
    private String desconto;
    
    public Pacote(){
        this.id = 0;
        this.nome = null;
        this.desconto = null;
    }
    
    public Pacote(int id, String nome, String desconto){
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDesconto(){
        return this.desconto;
    }
    
}
