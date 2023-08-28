package Threads;

import java.util.concurrent.CyclicBarrier;

public class CorridaDeLebres {
    private static final int NUM_LEBRES = 5;

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(NUM_LEBRES + 1); // +1 para a thread principal

        Lebre[] lebres = new Lebre[NUM_LEBRES];
        for (int i = 0; i < NUM_LEBRES; i++) {
            lebres[i] = new Lebre(i + 1, barrier);
            lebres[i].start();
        }

        try {
            barrier.await(); // Aguarda todas as lebres terminarem
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Determinar a colocação das lebres
        Lebre vencedora = null;
        for (Lebre lebre : lebres) {
            if (vencedora == null || lebre.getDistanciaPercorrida() > vencedora.getDistanciaPercorrida()) {
                vencedora = lebre;
            }
        }

        // Exibir resultados
        for (int i = 0; i < NUM_LEBRES; i++) {
            System.out.println("Lebre " + (i + 1) + ": Distância: " + lebres[i].getDistanciaPercorrida() +
                    " metros, Total de pulos: " + lebres[i].getTotalPulos());
        }

        System.out.println("Lebre vencedora: " + vencedora.getName() +
                " (Distância: " + vencedora.getDistanciaPercorrida() +
                " metros, Total de pulos: " + vencedora.getTotalPulos() + ")");
    }
}
