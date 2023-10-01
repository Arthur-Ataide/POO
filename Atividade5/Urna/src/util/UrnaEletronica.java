// Arthur Ataíde de Melo Saraiva 5070

package util;

import entidade.Candidato;

public class UrnaEletronica {

    private Candidato[] candidatos;
    private int[] votosCandidatos;
    private int votosBrancos;
    private int votosNulos;
    private boolean liberada;

    public UrnaEletronica() {
        this.candidatos = new Candidato[0];
        this.votosCandidatos = new int[0];
        this.votosBrancos = 0;
        this.votosNulos = 0;
        this.liberada = false;
    }

    public void cadastrarCandidato(Candidato candidato) {
        int len = this.candidatos.length;

        Candidato[] novoCandidatos = new Candidato[len + 1];
        int[] novoVotosCandidatos = new int[len + 1];

        for (int i = 0; i < len; i++) {
            novoCandidatos[i] = this.candidatos[i];
            novoVotosCandidatos[i] = this.votosCandidatos[i];
        }

        novoCandidatos[len] = candidato;
        novoVotosCandidatos[len] = 0;

        this.candidatos = novoCandidatos;
        this.votosCandidatos = novoVotosCandidatos;
    }

    public void autorizarEleitor() {
        this.liberada = true;
    }

    public void naoAutorizarEleitor() {
        this.liberada = false;
    }

    public void votosCandidato(int numVoto) {

        if (this.liberada) {
            int len = this.candidatos.length;
            boolean votoValido = false;

            for (int i = 0; i < len; i++) {
                if (this.candidatos[i].getNumVotacao() == numVoto) {
                    this.votosCandidatos[i]++;
                    votoValido = true;
                    break;
                }
            }

            if (!votoValido) {
                if (numVoto == 0) {
                    votosBrancos();
                } else {
                    votosNulos();
                }
            }
        }
    }

    public void votosBrancos() {
        if (this.liberada) {
            this.votosBrancos++;
        }
    }

    public void votosNulos() {
        if (this.liberada) {
            this.votosNulos++;
        }
    }

    public void relatorio(){
        int len = this.candidatos.length;
        int totalVotos = 0;

        for (int i = 0; i < len; i++) {
            totalVotos += this.votosCandidatos[i];
        }

        System.out.println("\nTotal de votos: " + totalVotos);
        System.out.println("Votos em branco: " + this.votosBrancos);
        System.out.println("Votos nulos: " + this.votosNulos + "\n");

        for (int i = 0; i < len; i++) {
            System.out.println("Votos do candidato " + this.candidatos[i].getNome() + ": " + this.votosCandidatos[i]);
        }

        System.out.println();
    }

    public boolean getLiberada() {
        return this.liberada;
    }

}