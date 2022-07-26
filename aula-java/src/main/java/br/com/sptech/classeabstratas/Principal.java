/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.classeabstratas;

/**
 *
 * @author yohan
 */
public class Principal {

    static int valor = 10;

    static void print() {
        System.out.println(valor);
    }

    public static void main(String[] args) {
        valor = 10;
        print();

        Camaro camaro = new Camaro();
        camaro.piscaAlerta();
        camaro.passear();
        camaro.voar();
        camaro.acionarTurbo();

        Tesla teslaUm = new Tesla();
        teslaUm.piscaAlerta();
        teslaUm.setDirigeSozinho(true);
        System.out.println(teslaUm.isDirigeSozinho());

        Carro mercedes = new Mercedes();
        mercedes.piscaAlerta();
        
        try {
            mercedes.setVelocidadeMaxima(-10);
        }catch (NegocioException e){
            System.out.println(e);
        }finally {
            System.out.println("Passou aqui");
        }
        
        // try voce esta tratando o dado que esta vindo, quando voce faz esse try vc esta emitindo a mensagem de erro e mostrando o a mensagem que estava la na nossa exception
        
        // finally vai saer lido em todas as situações se deu erro ou não

        
        Camaro camoroDois = null;
        // estou declarando que o camaro tem um valor nulo, mas ele tem esse valor
        
        // ISSO NAO É UMA INSTANCIA
        
//        camoroDois.acelerar();
        
        
    }
}
