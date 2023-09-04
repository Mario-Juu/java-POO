package ThreadProg;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercicio3_main {

    public static void main(String[] args) {
        int n = 20; // Tamanho do vetor
        int[] vetor = new int[n];

        // Preencha o vetor com valores de exemplo
        for (int i = 0; i < n; i++) {
            vetor[i] = i;
        }

        LinkedList<Integer> lista = new LinkedList<>();
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Crie e inicie threads para adicionar elementos à lista
        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                synchronized (lista) {
                    lista.add(vetor[index]);
                }
            });
            threads[i].start();
        }

        // Aguarde até que todas as threads tenham concluído
        for (int i = 0; i < n; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprima a lista encadeada na mesma ordem do vetor
        for (Integer item : lista) {
            System.out.print(item + " ");
        }
    }
}