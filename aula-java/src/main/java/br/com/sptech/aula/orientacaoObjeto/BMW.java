/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.orientacaoObjeto;

/**
 *
 * @author yohan
 */
public class BMW extends carro{
    
    public BMW(){
        this.setMarca("BMW");
    }
    
    public String acelerar(){
        return "A BMW pode fazer de 0 " + this.getVelocidade() + " em 5s";
    }
}
