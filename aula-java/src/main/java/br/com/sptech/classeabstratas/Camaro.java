/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.classeabstratas;

/**
 *
 * @author yohan
 */
public class Camaro extends Carro implements Conversivel, Utilitario{
    
    public Camaro(){
        super();
    }

    @Override
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        System.out.println("Camaro sobrescrita");
        return velocidadeFinal / tempoFinal;
    }

    @Override
    public void piscaAlerta() {
        System.out.println("Camaro piscando alerta ...");
    }

    @Override
    public void acionarTurbo() {
        System.out.println("Acionando Turbo ...");
    }

    @Override
    public void passear() {
        System.out.println("Vamos passear ...");
    }

    @Override
    public void voar() {
        System.out.println("Carro não voa");
    }
}


// Uma interface ela permite multiplas heranças
// ja uma classe abstrata ela não permite multiplas heranças
// Palavras reservadas implements / extends
// Classe abstrata
