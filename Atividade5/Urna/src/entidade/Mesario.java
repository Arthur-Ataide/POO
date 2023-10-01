// Arthur Ataíde de Melo Saraiva 5070

package entidade;

import util.UrnaEletronica;

public class Mesario {

    private int zonaEleitoral;
    private UrnaEletronica urna;
    private Eleitor[] eleitores;

    public Mesario(int zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
        iniciaUrna();
        this.eleitores = new Eleitor[0];
    }

    public void cadastraEleitor(Eleitor eleitor) {

        int len = this.eleitores.length;

        Eleitor[] novoEleitores = new Eleitor[len + 1];

        for (int i = 0; i < len; i++) {
            novoEleitores[i] = this.eleitores[i];
        }

        novoEleitores[len] = eleitor;

        this.eleitores = novoEleitores;

    }

    public void cadastrandoCandidato(Candidato candidato) {
        this.urna.cadastrarCandidato(candidato);
    }

    public void iniciaUrna() {
        this.urna = new UrnaEletronica();
    }

    public void autorizaEleitor() {
        this.urna.autorizarEleitor();
    }

    public void naoAutorizaEleitor() {
        this.urna.naoAutorizarEleitor();
    }

    public void votacao() {
        int len = this.eleitores.length;
        int i = 0;

        while (i < len) {

            autorizaEleitor();

            if (this.urna.getLiberada()) {
                this.eleitores[i].votar(this.urna);
            } 

            else {
                System.out.println("Urna não autorizada!");
            }

            naoAutorizaEleitor();
            i++;
        }
    }

    public void relatorioUrna() {
        this.urna.relatorio();
    }

    public int getZonaEleitoral() {
        return zonaEleitoral;
    }

}