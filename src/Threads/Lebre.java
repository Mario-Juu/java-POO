package Threads;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

class Lebre extends Thread {
    private static final int MIN_JUMP = 1;
    private static final int MAX_JUMP = 3;
    private static final int DISTANCIA_TOTAL = 20;

    private final int lebreNumero;;
    private int distanciaPercorrida = 0;
    private int totalPulos = 0;
    private final CyclicBarrier barrier;

    public Lebre(int lebreNumero, CyclicBarrier barrier) {
        this.lebreNumero = lebreNumero;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (distanciaPercorrida < DISTANCIA_TOTAL) {
            int salto = random.nextInt(MAX_JUMP - MIN_JUMP + 1) + MIN_JUMP;
            distanciaPercorrida += salto;
            totalPulos++;
        }
        try {
            barrier.await(); // Espera pelas outras lebres terminarem
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getTotalPulos() {
        return totalPulos;
    }
}

