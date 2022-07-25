/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

/**
 *
 * @author yohan
 */
public class Variaveis {
    public static void main(String[] args) {
       byte numByte = -128; //-128 a 127 (8bits) 
       short numShort = 12321; //-32768 a 32767 (16bits)
       int numInt = 2147483647; //-2.147.483.648 a 2.147.483.647 (32bits)
       long numlog = 897997888; //-9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64bits)
       long numlogInt = 2147483647l; // tem que colocar a letra l quando o numero excede o int vc coloca a variavel long com a letra l depois dos numeros
        
       System.out.println(numByte);
        System.out.println(numShort);
        System.out.println(numInt);
        
        float numFloat = 10.000f; // tem que colocar f no final para declarar como float
        double numDouble = 100000000000000.00; //
        
        char varChar = 'F'; // 0 a 65535 (16bit)
        
        boolean varBoolean = true; // verdadeiro ou false (1bit)
        
        String texto = "Ola Mundo";
        Integer numeroConta = 4000;
        Long numeroLongo = 1213123L;
    }
}
