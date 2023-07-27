/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.minhaloja;

/**
 *
 * @author senai
 */
public interface GerenciamentoDeProdutos {
    
    //metodo usado para reabaster o estoque.
    boolean reabastecer(int quantidade);
    
    //metodo usado para realizar venda.
    boolean vender(int quantidade);
    
    //metodo que calcula umvalor.
    double calcularValor();
    
    
    
}
