/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterns.model;

/**
 *
 * @author fernando.fernandes
 */
public class ContaLuzComercial implements ContaLuz{
    
    double taxa;
    
    @Override
    public void setTaxa(){
        taxa = 20.00;
    }

    @Override
    public double getTaxa(){
        return this.taxa;
    }
    
    @Override
    public void calcularFatura(int unidadesMW){
        System.out.println(this.taxa * unidadesMW);
    }
    
}
