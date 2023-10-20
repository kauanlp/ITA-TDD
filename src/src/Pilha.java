package src;

import src.exceptions.PilhaCheiaException;
import src.exceptions.PilhaVaziaException;

public class Pilha {
    private Object[] elementos;
    private int qntd;

    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return qntd == 0;
    }

    public int tamanho() {
        return qntd;
    }

    public void empilha(String elemento) {
        if(qntd == elementos.length) throw new PilhaCheiaException("Não é possivel empilhar mais elementos.");

        this.elementos[qntd] = elemento;
        qntd++;
    }

    public Object topo() {
        return elementos[qntd-1];
    }

    public Object desempilha() {
        if(estaVazia()) throw new PilhaVaziaException("Não é possivel desempilhar.");

        Object topo = topo();
        qntd--;
        return topo;
    }
}
