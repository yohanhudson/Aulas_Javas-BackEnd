/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.estruturacontrole;

/**
 *
 * @author yohan
 */
public class ifElse {
    public static void main(String[] args) {
        int idade = 18;
        
        if (idade == 18){
            System.out.println("Maior de Idade por pouco");
        }else if (idade > 18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
        
         if (idade < 18)
            System.out.println("AEEEEEEEEEEEE");
         
            System.out.println("Estou fora do if");
        
//        if (idade == 18)System.out.println("Maior de Idade por pouco");
// quando vc faz um if sem as chaves so vai executar aquelas linhas
// se vc colocar em outra linha o sistema entende que aquilo esta fora do if


      
        
    }
}
