// Arthur Ataíde de Melo Saraiva 5070

package br.ufv.universidade;

public class Disciplina {

    private String nome;
    private boolean pratica;

    public Disciplina(String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPratica(boolean pratica){
        this.pratica = pratica;
    }

    public String getNome(){
        return nome;
    }

    public boolean getPratica(){
        return pratica;
    }

    public String toString(){
        return "\tNome: " + nome + "\n\tPratica: " + pratica;
    }

}
