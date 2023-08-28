package ThreadProg;


import java.util.concurrent.CyclicBarrier;

public class Exercicio2_main {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5);

        Lebres lebre1 = new Lebres("Lebre 1");
        Lebres lebre2 = new Lebres("Lebre 2");
        Lebres lebre3 = new Lebres("Lebre 3");
        Lebres lebre4 = new Lebres("Lebre 4");
        Lebres lebre5 = new Lebres("Lebre 5");

    }
}
