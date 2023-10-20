package src;

public class Pilha {
    private String elemento;
    private int qntd;

    public boolean estaVazia() {
        return (elemento == null);
    }

    public int tamanho() {
        return qntd;
    }

    public void empilha(String elemento) {
        this.elemento = elemento;
        qntd++;
    }

    public String topo() {
        return elemento;
    }
}
