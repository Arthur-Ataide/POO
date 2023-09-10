package entities;

import java.util.Scanner;

import utils.Data;

public class Funcionario {
    String nome;
    String cargo;
    int salario;
    int filhos_menores;
    public Data nascimento;
    public Data admissao; 
    public enum contrato{
        efetivo, horista;
    }
    Scanner sc = new Scanner(System.in);

    public void iniFuncionario(){
        
        String nome = sc.nextLine();
        int ano = sc.nextInt();
        int mes = sc.nextInt();
        int dia = sc.nextInt();        

        this.nome = nome;
        nascimento = new Data(ano, mes, dia);

        

    }
}
