/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

/**
 *
 * @author yohan
 */
public class Aula06Matriz3Dimensionais {
    public static void main(String[] args) {
                int[][][] matrizTridimensional = new int [3][3][3];
                
                for (int i = 0; i<matrizTridimensional.length; i++){
                    for (int j = 0; j<matrizTridimensional[i].length; j++){
                        for(int k = 0; k<matrizTridimensional[i][j].length; k++){
                            System.out.println("i = " + i + " - j = " + j + " - k = " + k); // ver a matriz como esta sendo feita
                            matrizTridimensional[i][j][k] = i+j+k; //soma
                        }
                    }
                }
             
                 System.out.println();
                
                int somaTotal = 0;
                int somaPares = 0;
                int somaImpares = 0;
                 for (int i = 0; i<matrizTridimensional.length; i++){
                    for (int j = 0; j<matrizTridimensional[i].length; j++){
                        for(int k = 0; k<matrizTridimensional[i][j].length; k++){
                            somaTotal += matrizTridimensional[i][j][k]; //somaTotal
                            
                            if (matrizTridimensional[i][j][k] % 2 == 0){
                                somaPares += matrizTridimensional[i][j][k];
                            }else{
                                somaImpares += matrizTridimensional[i][j][k];
                            }
                        }
                    }
                }
               System.out.println(somaTotal);
               System.out.println(somaPares);
               System.out.println(somaImpares);
    }
}
