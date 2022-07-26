/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.variaveismetodosestaticos;

/**
 *
 * @author yohan
 */
public class Tesla extends Carro{
    public Tesla(){
        super();
    }
    
    
     private boolean dirigeSozinho;
    // super so vai herdar os atributos da super classe
    
    
    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("Tesla sobrescrita");
        return velocidadeFinal * tempoFinal;
    }
    

    public boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    public void setDirigeSozinho(boolean dirigeSozinho){
        this.dirigeSozinho = dirigeSozinho;
    }
}
