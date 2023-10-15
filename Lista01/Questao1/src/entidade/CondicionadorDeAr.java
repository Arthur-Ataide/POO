// Arthur Ataíde de Melo Saraiva 5070

package entidade;

import utilidade.Termostato;

public class CondicionadorDeAr {

    public Termostato termostato;
    boolean ligado; // false = desligado | true = ligado

    public CondicionadorDeAr() {
        termostato = new Termostato();
        ligado = false;
    }

    public void setLigar() {
        ligado = true;
    }

    public void setDesligar() {
        ligado = false;
    }

    public void aumentarTemperatura(int valor) {

        int atual = termostato.getTemperatura();

        for (int i = atual; i < valor; i++) {

            if (termostato.getTemperatura() < 28 && ligado == true)
                termostato.setTemperatura(termostato.getTemperatura() + 1);

            else if (ligado == true) {
                System.out.printf("\n\nErro a temperatura excede o maximo\n\n");
                break;
            }
        }
    }

    public void diminuirTemperatura(int valor) {

        int atual = termostato.getTemperatura();

        for (int i = valor; i < atual; i++) {
            if (termostato.getTemperatura() > 15 && ligado == true)
                termostato.setTemperatura(termostato.getTemperatura() - 1);

            else if (ligado == true) {
                System.out.printf("\nErro a temperatura excede o minimo\n\n");
                break;
            }
        }
    }

    public void printarTudo() {
        System.out.printf("______________________________________________________\n\n");
        System.out.printf("Dados do condicionador de ar:\n");
        if (ligado == true)
            System.out.printf("Temperatura: %d\n", termostato.getTemperatura());
        else
            System.out.printf("Está desligado\n");
        System.out.printf("______________________________________________________\n\n");
    }

}
