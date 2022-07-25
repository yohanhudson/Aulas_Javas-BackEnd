/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.orientacaoObjeto.executor;

import br.com.sptech.aula.orientacaoObjeto.BMW;
import br.com.sptech.aula.orientacaoObjeto.carro;
import br.com.sptech.aula.orientacaoObjeto.ferrari;

/**
 *
 * @author yohan
 */
public class executor {

    public static void main(String[] args) {
        carro carro1 = new carro();
        carro1.setMarca("BMW");
        carro1.setModelo("54258551");
        carro1.setPlaca("ASD5555");
        carro1.setChassi(42);
        carro1.setRoda(4);
        carro1.setBanco(5);
        carro1.setVelocidade(280);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getPlaca());
        System.out.println(carro1.getChassi());
        System.out.println(carro1.getRoda());
        System.out.println(carro1.getBanco());

        System.out.println(carro1.acelerar());

        carro carro2 = new carro("Ferrari");
        System.out.println(carro2.getMarca());

//       carro1.marca = "BMW";
//       carro1.modelo = "3201";
//       carro1.chassi = 9999;
//       carro1.placa = "AAA9999";
//       carro1.banco = 5;
//       carro1.roda = 4;
//       
//        System.out.println(carro1.marca);
//        System.out.println(carro1.modelo);
//        System.out.println(carro1.chassi);
//        System.out.println(carro1.placa);
//        System.out.println(carro1.banco);
//        System.out.println(carro1.roda);

        System.out.println(soma(10,5));
        System.out.println(soma(15, 100, 15));
        
        BMW bmw = new BMW();
        bmw.setVelocidade(466);
        System.out.println(bmw.acelerar());
        
        
        ferrari Ferrari = new ferrari();
        Ferrari.setVelocidade(1000);
        System.out.println(Ferrari.acelerar());
        
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
    
    // esta tendo uma sobre carga aqui tambem mas alem disso polifomismo que ocorre quando vc tem varias funções iguais mas que realizam coisas diferentes por assim dizer elas tem sua propria assinatura
}

