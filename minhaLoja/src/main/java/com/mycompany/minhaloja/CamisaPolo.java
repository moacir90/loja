/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minhaloja;

/**
 *
 * @author senai
 */
public class CamisaPolo extends Produto{
    private String marca;
    
    public CamisaPolo(String id, String nome, double preco, int quantidade, String marca){
        super(id, nome, preco, quantidade);
        this.marca=marca;
    }
    
    
    public void mostrarDetalhes(){
        System.out.println("Id do Produto: " + id);
        System.out.println("Nome da camisa: " + nome);
        System.out.println("Preço:" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Marca: " + marca);
    }
}
