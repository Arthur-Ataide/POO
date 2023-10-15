// Arthur Ataíde de Melo Saraiva 5070

package br.ufv.universidade;

public class Professor {

    private String nome;
    private int idade;
    
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }



}
