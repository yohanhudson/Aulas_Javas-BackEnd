/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.java;

public class Aula05Matriz {

    public static void main(String[] args) {
        double[][] notasAlunos = new double[30][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 5;
        notasAlunos[1][1] = 2;
        notasAlunos[1][2] = 0;
        notasAlunos[1][3] = 10;

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
                //para cada vetor dentro de uma matriz tenho que rodar um for para percorrer aquele vetor

                // print escreve um do lado do outro ja println pula linha
            }
            System.out.println(); //quebra de linha
        }

        System.out.println("Calculando a media de cada aluno");

        double soma;
        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }

            System.out.println("A media do aluno " + i + " é = " + (soma / 4));
        }

        double[][] notasAlunos2 = {{10, 5, 6, 4}, {0, 2, 3, 10}}; // inserindo ja os valores dentro da matriz

    }
}
