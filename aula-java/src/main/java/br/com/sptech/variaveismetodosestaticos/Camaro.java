/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.variaveismetodosestaticos;

/**
 *
 * @author yohan
 */
public class Camaro extends Carro{
      public Camaro(){
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("Camaro sobrescrita");
        return velocidadeFinal / tempoFinal;
    }
    
    

}
