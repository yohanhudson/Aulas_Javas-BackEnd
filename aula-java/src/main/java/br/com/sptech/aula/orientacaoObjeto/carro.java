/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sptech.aula.orientacaoObjeto;

/**
 *
 * @author yohan
 */
public class carro {

   // public String marca;
   // public String modelo;
   // public int chassi;
   // public String placa;
   // public int roda;
   // public int banco;

    //Aqui estou criando um objeto chamado carro onde ele ira possuir esses atributos e 
    //vai ser importado para ou pacote para ser executado mas para essa informações estarem visiveis ele precisara estar como esse public antes de cada atributo
    // ELA DEIXA A INFORMAÇÃO SER ACESSADA POR TODOS
    //Dfool ter acesso na propria class e todas as classe que estao dentro do pacote e todo resto n tem acesso
    // ja protected ele vai ter ascesso na propria classe e as classe que estao no mesmo pacote e subclass
    
    
    
    
    // default => não tem um palavra chave, Acessivel a propria classe, classes do mesmo pacote
    // public => Acessivel propria classe, classe mesmo pacote, subclasse (extends), todas as demais classes
    // private => Acessivel propria classe
    // protected => Acessivel propria classe, classe mesmo pacote, subclasses (extends)
    
    private String marca;
    private String modelo;
    private int chassi;
    private String placa;
    private int roda;
    private int banco;
    private int velocidade;
    
    
    public carro(){
        System.out.println("Construindo Carro");
        
        //isso é um construtor ele que constroi o metodo para criar a instacia que a gente de clara
        // se voce ja criar o jva automaticamente ja cria um vazio para voce
        // construtor tem que ter o mesmo nome da class
    }
    
    public carro(String marca){
        this.marca = marca;
        // outro construtor mas essse possui uma assinatura que é o argumento/parametro que estou estou passando
        // quando temos mais de 1 construtor chamos de sobre carga
    }
    
    
    public String acelerar(){
        return velocidade + "km/s";
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public String getMarca(){
        return this.marca;
        // to dizendo que é uma informação do tipo String
        // e o que é get?
        // ele quer obter o valor de marca
    }
    
    public void setMarca(String marca){
        this.marca = marca;
        // como es estou inserindo e nao to devolvendo é void e set
        //Lembrando que to passando por paramentro o argumento do tipo String
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
   
   public int getChassi(){
        return this.chassi;
    }
    
    public void setChassi(int chassi){
        this.chassi = chassi;
    } 
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    } 
    
    public int getRoda(){
        return this.roda;
    }
    
    public void setRoda(int roda){
        this.roda = roda;
    }
    
    public int getBanco(){
        return this.banco;
    }
    
    public void setBanco(int banco){
        this.banco = banco;
    } 
}
