// Arthur Ataíde de Melo Saraiva 5070

package entidade;

public class Etiqueta {

    private String marca;
    private String tamanho;

    public Etiqueta(String marca, String tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}