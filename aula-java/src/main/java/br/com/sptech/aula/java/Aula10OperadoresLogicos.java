/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

/**
 *
 * @author yohan
 */
public class Aula10OperadoresLogicos {
    public static void main(String[] args) {
        
        // AND
        // V and F => F
        // V and V => V
        // F and V => F
        // F and F => F
        
        
        // OR
        // V and F => V
        // V and V => V
        // F and V => V
        // F and F => F
        
        
        // XOR
        // V and F => V
        // V and V => F
        // F and V => V
        // F and F => F
        
        // Negação Logica
        //!V => F
        //!F => V
        
        
        boolean v = true;
        boolean f = false;
        
        // and é representado pelo && ou &
        // or  e representado peo|| ou |
        // xor é representado pelo !=
        // negação é representado pelo !
        
        int nota = 7;
        System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");
        
    }
}
