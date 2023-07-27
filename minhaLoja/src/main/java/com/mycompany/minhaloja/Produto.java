/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minhaloja;

/**
 *
 * @author senai
 */
public abstract class Produto implements GerenciamentoDeProdutos {
    
    //VARIAVEIs DA INTERFACE
    protected String id;
    protected String nome;
    protected double preco;
    protected int quantidade;
    
    
    //meu metodo construtor
    public Produto(String id, String nome, double preco, int quantidade){
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
   
    }
    
    
    @Override
    public boolean reabastecer (int quantidade){
        if(quantidade > 0){
                this.quantidade += quantidade;
                return true;
        }
    return false;
    }
    
    @Override
    public boolean vender( int quantidade){
        if(quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
            return true;
        }
    return false;
    }
    
    
    @Override
    public double calcularValor(){
        return this.preco * this.quantidade;
    }
    
    public abstract void mostrarDetalhes(); 
    
}