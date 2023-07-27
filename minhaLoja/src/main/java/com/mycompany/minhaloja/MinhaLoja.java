/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minhaloja;

/**
 *
 * @author senai
 */
public class MinhaLoja {

    public static void main(String[] args) {
        
        CamisaPolo myCamisa = new CamisaPolo ("1", "Camisa de Urso", 500.0, 3, "Lacost");
        
        myCamisa.mostrarDetalhes();
        myCamisa.reabastecer(3);
        myCamisa.mostrarDetalhes();
        myCamisa.vender(1);
        myCamisa.mostrarDetalhes();
        
    }
}
