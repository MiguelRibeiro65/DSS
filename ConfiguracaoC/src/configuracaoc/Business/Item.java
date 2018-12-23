/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracaoc.Business;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author PedroRibeiro
 */
public class Item {
    
    private int id;
    private String tipo;
    private String nome;
    private int quantidade;
    private double preco;

    public Item() {
        this.id = 0;
        this.tipo = null;
        this.nome = null;
        this.quantidade = 0;  
    }
    
    public Item(int id, String tipo, String nome, double preco, int quantidade){
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
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
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    
    
    
}
