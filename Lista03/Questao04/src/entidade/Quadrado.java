package entidade;

import java.util.Scanner;

public class Quadrado extends Retangulo{

    public Quadrado(float lado) {
        super(lado, lado);
    }

    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String requisitaDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do quadrado: ");
        float lado = sc.nextFloat();
        super.setLado(lado);
        super.setAltura(lado);
        
        return "Lado: " + lado;
    }
    
}
