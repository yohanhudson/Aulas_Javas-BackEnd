/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

/**
 *
 * @author yohan
 */
public class Aula08Operadores {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        b += a; //adição
        System.out.println(a);
        System.out.println(b);
        b -= a; //sibtração
        System.out.println(a);
        System.out.println(b);
        b *= a; //multiplicação
        System.out.println(a);
        System.out.println(b);
        b /= a; //divisão
        System.out.println(a);
        System.out.println(b);
        b %= a; //modular pega o resto da divisão realizada
        System.out.println(a);
        System.out.println(b);
        
        //toda vez que faz essa contas ele faz a conta e coloca o resultado no b
        // Sempre que usar int e o valor de quebrado ele arredonda para baixo

       // b++; aumenta 1, postfix   
        //++b; aumentar 1, prefix
        System.out.println(++b == 11);
        //System.out.println(b++ == 11);

        System.out.println(b);

    }
}
