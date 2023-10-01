// Arthur Ataíde de Melo Saraiva 5070

package program;

import entidade.Candidato;
import entidade.Eleitor;
import entidade.Mesario;

public class Teste {

    public static void main(String[] args) {

        Mesario mesario = new Mesario(1);

        Candidato candidato1 = new Candidato("Rodrigo", "PT", "Presidente", 1);
        Candidato candidato2 = new Candidato("João", "PSDB", "Presidente", 2);
        Candidato candidato3 = new Candidato("Maria", "PSOL", "Presidente", 3);

        Eleitor eleitor1 = new Eleitor("Arthur", "123", 2); // valido
        Eleitor eleitor2 = new Eleitor("Thais", "456", 0); // branco
        Eleitor eleitor3 = new Eleitor("Clara", "789", 4); // nulo
        

        mesario.cadastrandoCandidato(candidato1);
        mesario.cadastrandoCandidato(candidato2);
        mesario.cadastrandoCandidato(candidato3);

        mesario.cadastraEleitor(eleitor1);
        mesario.cadastraEleitor(eleitor2);
        mesario.cadastraEleitor(eleitor3);

        mesario.votacao();

        mesario.relatorioUrna();
    }

}
