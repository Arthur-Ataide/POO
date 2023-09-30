// Arthur Ataíde de Melo Saraiva 5070

package entidade;


public class Texto {

    public int contarVogais(String texto) {
        int cont = 0;
        String vogais = new String("aeiouAEIOU");

        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < vogais.length(); j++) {
                if (texto.charAt(i) == vogais.charAt(j)) {
                    cont++;
                }
            }
        }

        return cont;
    }

    public void conjugarVerbo(String verbo) {

        System.out.println("Verbo: " + verbo);

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.println("Eu " + verbo.substring(0, verbo.length() - 2) + "o");
            } else if (i == 1) {
                System.out.println("Tu " + verbo.substring(0, verbo.length() - 2) + "as");
            } else if (i == 2) {
                System.out.println("Ele " + verbo.substring(0, verbo.length() - 2) + "a");
            } else if (i == 3) {
                System.out.println("Nós " + verbo.substring(0, verbo.length() - 2) + "amos");
            } else if (i == 4) {
                System.out.println("Vós " + verbo.substring(0, verbo.length() - 2) + "ais");
            } else if (i == 5) {
                System.out.println("Eles " + verbo.substring(0, verbo.length() - 2) + "am");
            }
        }

    }

    public String obterInverso(String texto) {
        String inverso = "";

        for (int i = texto.length() - 1; i > -1; i--) {
            
            inverso += texto.charAt(i);
        }

        return inverso;
    }

    public boolean verificarPalindromo(String texto) {
        String inverso = obterInverso(texto);

        if (texto.equalsIgnoreCase(inverso)) {
            return true;
        }

        else {
            return false;
        }
    }

}