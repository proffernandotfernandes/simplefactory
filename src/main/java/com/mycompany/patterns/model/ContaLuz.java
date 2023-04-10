/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patterns.model;

/**
 *
 * @author fernando.fernandes
 */
public interface ContaLuz {

    void setTaxa();
    double getTaxa();

    public void calcularFatura(int unidadesMW);

}
