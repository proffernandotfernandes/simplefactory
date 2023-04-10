/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.patterns.model;

import com.mycompany.patterns.model.ContaLuz;
import com.mycompany.patterns.model.ContaLuzFactory;
import java.util.Scanner;

/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaLuzFactory contaFactory = new ContaLuzFactory();
        String tipoPlano = "";
        Scanner entrada = new Scanner(System.in);

        do{
        System.out.println("\nDigite o tipo de conta(Comercial/Residencial) ou q para sair: ");

        tipoPlano = entrada.next();


        if(!tipoPlano.trim().equalsIgnoreCase("q"))  {
            System.out.println("Digite a quantidade de MegaWatts: ");
            int unidadesMW = entrada.nextInt();

            ContaLuz conta = contaFactory.getContaLuz(tipoPlano);
            conta.setTaxa();
        
            System.out.println("\nTotal da Conta para o plano: " + tipoPlano + "\n");
            
            System.out.println("Tarifa: R$" + conta.getTaxa());
            System.out.println("Valor total (em reais):");
            conta.calcularFatura(unidadesMW);
            
        }

        }while(!tipoPlano.trim().equalsIgnoreCase("q"));

        System.out.println("Obrigado por usar nosso sistema!");

    }
    
}
