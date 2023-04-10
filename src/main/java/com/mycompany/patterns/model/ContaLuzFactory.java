/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterns.model;

/**
 *
 * @author fernando.tfernandes
 */
public class ContaLuzFactory {
    
    public ContaLuz getContaLuz(String tipoConta){
        
        if(tipoConta == null){
            return null;
        }
        
        if(tipoConta.equalsIgnoreCase("RESIDENCIAL")){
            return new ContaLuzResidencial();
        }else if(tipoConta.equalsIgnoreCase("COMERCIAL")){
            return new ContaLuzComercial();
        }

        return null;
    }

}
