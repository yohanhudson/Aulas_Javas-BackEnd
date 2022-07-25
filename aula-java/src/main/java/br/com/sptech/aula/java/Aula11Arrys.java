/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

/**
 *
 * @author yohan
 */
public class Aula11Arrys {
    public static void main(String[] args) {
         int [] notas = new int[10];
         
         notas[0] = 5;
         notas[3] = 9;
         
         int[][] matriz = new int [5][5];
         
         matriz[0][1] = 5;
         matriz[2][4] = 10;
         matriz[3][2] = 15;
         
         // esse forint quando vc atribui a algo o que tem em outro lugar
         for (int[] m : matriz){
             for (int v: m){
                 System.out.println(v);
             }
         }
         
         String[] meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};
         
         System.out.println(meses.length);
         System.out.println();
         
         System.out.println(notas.length);
         System.out.println();
         
         for (String m : meses){
         System.out.println(m);
         }
         
         System.out.println();
         
         for (int i = 0; i< notas.length; i++){
             System.out.println(notas[i]);
         }
    }
}
