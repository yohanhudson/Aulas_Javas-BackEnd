/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

import java.util.Scanner;


        
public class Aula07MatrizInrregulares {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //scan serve como uma input ejuda a informa num ou text
        
        System.out.println("Entre com o numero de pesssoas entrevistadas");
        int numEntrevistados = scan.nextInt(); // scan next vai tem que infroma o numero para dar seguimento para o resto lembrando que o numero de nomes vai depender da quantidades de filhos que voce colocou na input.
        
        String[][] nomesFilhos = new String[numEntrevistados][];
        
        for (int i = 0; i<nomesFilhos.length; i++){
            System.err.println("Entre com a quantidade de filhos");
            int qtdFilhos = scan.nextInt();
            
            nomesFilhos[i] = new String[qtdFilhos];
            
            for (int j=0; j<nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j+1));
                
                nomesFilhos[i][j] = scan.next();
            }
        }
        for (int i=0; i<nomesFilhos.length; i++){
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j<nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}