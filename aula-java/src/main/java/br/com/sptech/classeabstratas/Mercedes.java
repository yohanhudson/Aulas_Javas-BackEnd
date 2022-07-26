/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.classeabstratas;

/**
 *
 * @author yohan
 */
public class Mercedes extends Carro{
    
   public Mercedes(){
       super();
   }
   
    private boolean dirigeSozinho;
    // super so vai herdar os atributos da super classe
    
    
    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("Mercedes sobrescrita");
        return velocidadeFinal * tempoFinal;
    }
    

    public boolean isDirigeSozinho() {
        return dirigeSozinho;
    }

    public void setDirigeSozinho(boolean dirigeSozinho){
        this.dirigeSozinho = dirigeSozinho;
    }

    @Override
    public void piscaAlerta() {
       System.out.println("Mercedes piscando alerta ...");
    }
    
}
