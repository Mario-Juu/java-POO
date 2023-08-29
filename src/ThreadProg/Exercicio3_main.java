package ThreadProg;
import java.util.LinkedList;
import java.util.List;


public class Exercicio3_main {
    public static void main(String[] args) {
        int n = 10; // Tamanho do vetor
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = i;
        }

        List<Integer> listaEncadeada = new LinkedList<>();

        int numThreads = n; // Uma thread para cada elemento do vetor
        Thread[] threads = new Thread[numThreads];

        int elementsPerThread = n / numThreads;
        int remainingElements = n % numThreads;

        int startIndex = 0;
        for (int i = 0; i < numThreads; i++) {
            int endIndex = startIndex + elementsPerThread - 1;
            if (i == numThreads - 1) {
                endIndex += remainingElements;
            }

            threads[i] = new MoverDados(vetor, listaEncadeada, startIndex, endIndex);
            threads[i].start();

            startIndex = endIndex + 1;
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Lista encadeada resultante: " + listaEncadeada);
    }
}
