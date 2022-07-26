/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.classeabstratas;

/**
 *
 * @author yohan
 */
public abstract class Carro {
    
    private String marca;
    private String modelo;
    private Integer velocidadeMaxima;
    private int taxaAceleracao;
    private double quilometroLitro;
    
    public Carro(){
        System.out.println("Construindo carro");
    }
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void frear(){
        System.out.println("Freando");
    }
    
    public abstract void piscaAlerta();
    
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
    
     public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    
    public void setVelocidadeMaxima (int velocidadeMaxima) throws NegocioException{
        if (velocidadeMaxima < 0) {
            throw new NegocioException ("Valor invalido");
        }else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }
    
    // quando usamos o  throw new Exception  nos referimos a uma execeção
    // lembrando que tem q declarar o throwas Exception logo depois do atgumento
    
     public int getTaxaAceleracao(){
        return taxaAceleracao;
    }
    
    public void setTaxaAceleracao (int aceleracao){
        this.taxaAceleracao = aceleracao;
    }
    
     public double getQuilometroLitro(){
        return quilometroLitro;
    }
    
    public void setQuilometroLitro (double quilometro){
        this.quilometroLitro = quilometro;
    }
    
    
    public static void dirigir(){
        System.out.println("Dirigindo ...");
    }
}
