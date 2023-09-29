// Arthur Ataíde de Melo Saraiva 5070

package br.ufv.teste;

import br.ufv.universidade.Atribuicao;
import br.ufv.universidade.Disciplina;
import br.ufv.universidade.Professor;

public class TesteAtribuicao {
    public static void main(String[] args) throws Exception {

        Atribuicao atribuicao = new Atribuicao();
        System.out.println(atribuicao.toString());

        Professor professor = new Professor("Felipe", 25);
        atribuicao.setProfessor(professor);

        Disciplina disciplina = new Disciplina("Prog", false);
        atribuicao.setDisciplina(disciplina);

        System.out.println(atribuicao.toString());

    }

}
