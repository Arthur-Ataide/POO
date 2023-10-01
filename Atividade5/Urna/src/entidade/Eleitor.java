// Arthur Ataíde de Melo Saraiva 5070

package entidade;

import util.UrnaEletronica;

public class Eleitor {

        private String nome;
        private String Titulo;
        private int intencaoVoto;

        public Eleitor(String nome, String Titulo, int intencaoVoto) {
            this.nome = nome;
            this.Titulo = Titulo;
            this.intencaoVoto = intencaoVoto;
        }

        public String getNome() {
            return nome;
        }

        public String getTitulo() {
            return Titulo;
        }

        public int getIntencaoVoto() {
            return intencaoVoto;
        }

        public void setIntencaoVoto(int intencaoVoto) {
            this.intencaoVoto = intencaoVoto;
        }

        public void votar(UrnaEletronica urna) {
            urna.votosCandidato(getIntencaoVoto());

            System.out.println("Voto confirmado!");
        }

}