package ThreadProg;
import java.util.Random;


public class Lebres extends Thread {
    private static final Object lock = new Object();
    private static int posicao = 1;
    private int posicaoLebre = 0;
    private String nome;
    private int distanciaPercorrida = 0;
    private int DISTANCIA_TOTAL = 20;

    public Lebres(String nome){
        this.nome = nome;
        start();
    }

    public String getNome(){
        return this.nome;
    }

    public void setPosicao(){
        posicaoLebre += posicao;
        System.out.println(nome + " Posição: " + posicaoLebre);
    }



    public int getDistanciaPercorrida(){
        return distanciaPercorrida;
    }
    public int getPosicaoLebre(){
        return posicaoLebre;
    }

    public void run(){
        Random r = new Random();
        do {
            int tamanhoPulo = r.nextInt(3) + 1;
            if (distanciaPercorrida <= DISTANCIA_TOTAL) {
                distanciaPercorrida += tamanhoPulo;
                //System.out.println(nome + ": " + distanciaPercorrida);
                //System.out.println(nome + " Tamanho do pulo: " + tamanhoPulo);
                try {
                    Thread.sleep(200); // Simulação do tempo de pulo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        while(distanciaPercorrida < DISTANCIA_TOTAL);
        setPosicao();
        synchronized (lock) {
            posicao++; // Atualiza a posição quando a lebre termina
        }

    }

}
