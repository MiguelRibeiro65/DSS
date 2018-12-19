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
    private ArrayList<String> itemsIncompativeis; 
    private ArrayList<String> itemsObrigatorios;

    public Item() {
        this.id = 0;
        this.tipo = null;
        this.nome = null;
        this.quantidade = 0;
        this.itemsIncompativeis = new ArrayList<String>();
        this.itemsObrigatorios = new ArrayList<String>();
        
    }
    
    public Item(int id, String tipo, String nome, double preco, int quantidade){
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        //this.itemsIncompativeis = itemsIncompativeis;
        //this.itemsObrigatorios = itemsObrigatorios;
    }
    
    
    
    
}
