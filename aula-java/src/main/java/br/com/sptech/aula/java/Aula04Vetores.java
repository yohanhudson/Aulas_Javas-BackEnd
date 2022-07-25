/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

/**
 *
 * @author yohan
 */
public class Aula04Vetores {
    public static void main(String[] args) {
        int[] numero = new int[10];
        
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;
        
        for(int contador = 0; contador <= 4; contador++){
            System.out.println(numero[contador]);
        }
        
        String[] jogos = new String[] {"ff14", "Dark Souls", "Minecraft", "League of Legends", "Code Vain"};
        System.out.println(jogos.length);
        
        for(String jogo : jogos){
            System.out.println(jogo);
        }
        
    }
    
}
