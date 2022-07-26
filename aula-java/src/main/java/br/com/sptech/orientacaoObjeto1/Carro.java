/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.orientacaoObjeto1;

/**
 *
 * @author yohan
 */
public class Carro {
    
    public Carro(){
        System.out.println("Construindo carro");
    }
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    private String marca;
    private String modelo;
    private int velocidade;
    private int aceleracao;
    private double quilometro;
    
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    
    public void frear(){
        System.out.println("Freando...");
    }
    
    public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial){
        return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
    }
    
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal){
        return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }
    
    public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal){
        return "" + (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    
     public int getVelocidade(){
        return velocidade;
    }
    
    public void setVelocidade (int velocidade){
        this.velocidade = velocidade;
    }
    
     public int getAceleracao(){
        return aceleracao;
    }
    
    public void setAceleracao (int aceleracao){
        this.aceleracao = aceleracao;
    }
    
     public double getQuilometro(){
        return quilometro;
    }
    
    public void setQuilometro (double quilometro){
        this.quilometro = quilometro;
    }
}
