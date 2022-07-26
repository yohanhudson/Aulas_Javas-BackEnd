/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.lambdaestream;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

/**
 *
 * @author yohan
 */
public class LambdsStream {

    static int gerarIdade(int min, int max) {
        return new SplittableRandom().nextInt(min, max);
    }
    
    //gerdor de numero aleatorio

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "João", "Maria", "Pedro", "Raquel", "Samuel");

        //aqui estou craindo um Array com nomes de pessoas
        nomes.forEach((n) -> System.out.println(n));

        System.out.println("");
        
        
        System.out.println("Lista de pessoas");

        List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15, 30))).collect(Collectors.toList());

        // aqui to juntando os nomes com idades que iram gerar aleatorias montando eles como objeto
        pessoas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));

        // aqui to fazendo um for simples que ta rodando esse ibjeto e colocando na tela
        
        System.out.println("Lista de pessoas maiores de idade");
        List<Pessoa> pessoasMaioresIdade = pessoas.stream().filter((p) -> p.getIdade() >= 18).collect(Collectors.toList());
        
        // aqui to criando uma lista que vai ter o que vier na lista pessoas e filtrando o que veio para trazer pessoas com idade maior ou igual a 18 e armazenando nessa lista
        
        pessoasMaioresIdade.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
        // aqui to rodando a lista e pegando as informações que eu passei para ele pegar
        
        System.out.println("Pessoas Ordenadas por idade");
        
        List<Pessoa> pessoasFiltradas = pessoasMaioresIdade.stream().sorted((p1, p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
        // to fazendo a mesma coisa so que ordenando elas do menor para o menor
        pessoasFiltradas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
        //aqui estou exibindo minha lista ordenada
        
        // SE EU QUISER INVERTER A ORDEM É SO TROCAR DE LUGAR OS PARAMETROS P1.GETIDADE E P2.GETIDADE   
        
        System.out.println("Soma das Idades");
        Integer totalIdade = pessoasFiltradas.stream().map(p -> p.getIdade()).reduce(0, (somaIdade, idade) -> somaIdade += idade);
        System.out.println("Total " + totalIdade + " anos");
        
        //map transforma o array em stream so de inteiros
    }
}
