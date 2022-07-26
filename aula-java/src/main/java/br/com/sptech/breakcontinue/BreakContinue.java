/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.breakcontinue;

/**
 *
 * @author yohan
 */
public class BreakContinue {
     public static void main(String[] args) {
        String[] carros = new String[]{"BMW 1320", "Mercedes c100", "BMW M3", "Mercedes AMG", "Tesla"};

        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == "BMW 1320") {
                System.out.println(carros[i]);
                break;
                
                // break vai interroper o for
                // coninue mesmo entrando no if ele vai mandar o rodar o for denovo so que ele n vai ler as outras linhas
            }
            System.out.println("Quero esse carro");
            System.out.println(carros[i]);
        }
        
        
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == "BMW 1320") {
                System.out.println(carros[i]);
                continue;
                
                // break vai interroper o for
                // coninue mesmo entrando no if ele vai mandar o rodar o for denovo so que ele n vai ler as outras linhas
            }
            System.out.println("Quero esse carro");
            System.out.println(carros[i]);
        }

    }
}
