// Arthur Ataíde de Melo Saraiva 5070

package br.ufv.universidade;

public class Atribuicao {

    private Professor professor;
    private Disciplina disciplina;

    public Atribuicao(){
        professor = new Professor("Arthur", 19);
        disciplina = new Disciplina("POO", true);
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public Professor getProfessor(){
        return professor;
    }

    public Disciplina getDisciplina(){
        return disciplina;
    }

    public String toString(){
        return "\nProfessor: " + professor.getNome() + "\tIdade:"+ professor.getIdade() + "\nDisciplina:\n" + disciplina.toString()+"\n";
    }

}
