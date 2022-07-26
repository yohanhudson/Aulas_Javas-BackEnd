/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.orientacaoObjeto1;


/**
 *
 * @author yohan
 */
public class Principal {

    public static void main(String[] args) {

        Carro bmw = new Carro();

        bmw.setMarca("BMW");
        bmw.setModelo("M33");
        bmw.setVelocidade(280);
        bmw.setAceleracao(50);
        bmw.setQuilometro(7.5);

        Carro tesla = new Carro("Tesla", "T452");

        Camaro camaro = new Camaro();
        System.out.println(camaro.calcularTaxaAceleracao(100.5, 10.5));
        
        
        Tesla teslaUm = new Tesla();
        teslaUm.isDirigeSozinho();

        Carro teslaDois = new Tesla();
        
        ((Tesla) teslaDois).setDirigeSozinho(true); // serve para pegar atributos de outras classe que não sao herdados
        ((Tesla) teslaDois).isDirigeSozinho();
        System.out.println(((Tesla) teslaDois).isDirigeSozinho());
        
        
        Carro[] carros = new Carro[] {bmw, camaro, teslaUm, teslaDois};
        
        for ( Carro carro : carros){
            if(carro instanceof Tesla){
                System.out.println(((Tesla) carro).isDirigeSozinho());
            }
        }
        
        camaro.calcularTaxaAceleracao(100.50, 10);
        teslaUm.calcularTaxaAceleracao(100.50, 10);
        
         // for vai imprimir na tela apenas 2 valores pois bmw e camaro não tem o atributo booleano
         
         
//        System.out.println(tesla.getMarca());
//        System.out.println(tesla.getModelo());
//
//        System.out.println(bmw.getMarca());
//        System.out.println(bmw.getModelo());
//        System.out.println(bmw.getVelocidade());
//        System.out.println(bmw.getAceleracao());
//        System.out.println(bmw.getQuilometro());
//
//        bmw.acelerar();
//        bmw.frear();
//
//        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidade(), 0, 10, 0));
//        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidade(), 5));
//        System.out.println(bmw.calcularTaxaAceleracao(100, 5));
    }

}
