package ThreadProg;

import java.util.List;

class MoverDados extends Thread {
    //Declaração dos atributos e criação da lista de integers destination
    private int[] vetor;
    private List<Integer> listaEncadeada;
    private int startIndex;
    private int endIndex;

    //Construtor da classe
    public MoverDados(int[] vetor, List<Integer> listaEncadeada, int startIndex, int endIndex) {
        this.vetor = vetor;
        this.listaEncadeada = listaEncadeada;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    //Preenchimento da lista encadeada baseada nos índices
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            synchronized (listaEncadeada) {
                listaEncadeada.add(vetor[i]);
            }
        }
    }
}
