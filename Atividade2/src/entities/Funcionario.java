// Arthur Ataíde de Melo Saraiva 5070

package entities;

import java.util.Scanner;
import utils.Data;

public class Funcionario {
    String nome;
    String cargo;
    float salario;
    int filhos_menores;
    int contrato;
    int horas;

    public Data nascimento;
    public Data admissao; 

    Scanner sc = new Scanner(System.in);

    public Funcionario(){

        System.out.println("Digite o nome do funcionário:");
        String nome = sc.nextLine();

        System.out.println("Digite a data de nascimento do funcionário: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();        

        this.nome = nome;

        nascimento = new Data(ano, mes, dia);

    }

    public void printarTudo(){
        System.out.printf("______________________________________________________\n");
        System.out.printf("Dados do funcionário:\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Data de nascimento: ");
        nascimento.printData();
        System.out.printf("Data de admissão: ");
        admissao.printData();
        System.out.printf("Cargo: %s\n", cargo);
        System.out.printf("Salário: %.2f\n", salario);
        System.out.printf("Número de filhos menores de idade: %d\n", filhos_menores);
        if (contrato == 1)
            System.out.printf("Tipo de contrato: Efetivo\n");
        else
            System.out.printf("Tipo de contrato: Horista\n");
        System.out.printf("______________________________________________________\n");
    }

    public void contratar(){
        System.out.printf("Digite o tipo do contrato do funcionário:\n [0] Horista\n [1] Efetivo\n");
        contrato = sc.nextInt();
        
        if (contrato == 1)
            horas = 0;
        else{
            System.out.println("Digite quantas horas ele trabalha por dia: ");
            horas = sc.nextInt();
        }
        
        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextFloat();

        cargo = "Estagiario";


        System.out.println("Digite o número de filhos menores de idade do funcionário: ");
        filhos_menores = sc.nextInt();

        System.out.println("Digite a data de admissão do funcionário: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        admissao = new Data(ano, mes, dia);
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void setFilhosMenores(int filhos_menores){
        this.filhos_menores = filhos_menores;

    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setContrato(int contrato){
        this.contrato = contrato;
    }

    public void setAdmissao(){
        System.out.println("Digite a nova data de admissão do funcionário: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        admissao = new Data(ano, mes, dia);
    }

    public float getSalario(){
        return salario;
    }
    
    public int getFilhosMenores(){
        return filhos_menores;
    }

    public String getCargo(){
        return cargo;
    }

    public int getContrato(){
        return contrato;
    }
    
    public Data getAdimissao(){
        return admissao;
    }

    public Data getNascimento(){
        return nascimento;
    }

    public String getNome(){
        return nome;
    }
    

    public float salarioBruto(int horas){
        if (contrato == 1){
            return salario;
        }

        return salario*horas;
    }

    public float INSS(){
        float salario = salarioBruto(horas);
        float retornar = 0;

        if  (7507.49 < salario)
            return 7507.49f*14/100;
        

        if (0 <= salario)
            retornar = salario*7.5f/100;  

        if (1302 < salario)
            retornar += (salario-1302)*9/100;

        if (2571.29 < salario)
            retornar += (salario-2571.29)*12/100;
        

        if (3856.94 < salario )
            retornar += (salario-3856.94)*14/100;

        return retornar;        
    }

    public float impostoRenda(){
        float salario = salarioBruto(horas);
        float retornar = 0;

        if (0 <= salario)
            retornar = 0;  

        if (1903.98 < salario)
            retornar += (salario-1903.98)*7.5f/100;

        if (2826.65 < salario)
            retornar += (salario-2826.65)*15f/100;
        
        if (3856.94 < salario )
            retornar += (salario-3856.94)*22.5f/100;

        if  (7507.49 < salario)
            retornar += (salario-7507.49)*27.5f/100;

        retornar =  retornar - filhos_menores*189.59f;  

        if (retornar < 0)
            return 0;
        
        return retornar;
    }

    public float salarioLiquido(int horas){
        return salarioBruto(horas) - (INSS() + impostoRenda());
    }

    public void folhaPagamento(){
        System.out.printf("______________________________________________________\n");
        System.out.printf("Folha de pagamento do funcionário:\n");
        System.out.printf("O salário bruto do funcionário é: %.2f\n", salarioBruto(horas));
        System.out.printf("O valor do INSS do funcionário é: %.2f\n", INSS());
        System.out.printf("O salário líquido do funcionário é: %.2f\n", salarioLiquido(horas));
        System.out.printf("______________________________________________________\n");
        
    }
}
