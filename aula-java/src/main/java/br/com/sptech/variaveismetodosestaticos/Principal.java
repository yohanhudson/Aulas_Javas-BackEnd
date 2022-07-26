/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.variaveismetodosestaticos;

/**
 *
 * @author yohan
 */
public class Principal {

    public static void main(String[] args) {

        Camaro camaro = new Camaro();

        Camaro camaroDois = new Camaro();

        Camaro camaroTres = new Camaro();
        camaro.setMarca("Ferrari");

        Tesla teslaUm = new Tesla();
        teslaUm.setDirigeSozinho(true);
        System.out.println(teslaUm.isDirigeSozinho());

        Carro[] carros = new Carro[]{camaro, camaroDois, camaroTres, teslaUm};

        for (Carro carro : carros) {
            if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
                System.out.println("Carro de marca Famosa");
            }
            if (carro instanceof Tesla) {
                System.out.println(teslaUm.isDirigeSozinho());
            }
        }

        Calcular.soma(10, 5);
        System.out.println(Calcular.soma(10, 5));
    }

}
