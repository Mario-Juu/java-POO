package ThreadProg;
import java.util.Random;


public class Lebres extends Thread {

    //Declara um objeto do estilo final para servir como sincronização para os objetos lebre
    private static final Object lock = new Object();
    private static int posicao = 1;
    private int posicaoLebre = 0;
    private String nome;
    private int distanciaPercorrida = 0;
    private int DISTANCIA_TOTAL = 20;
    private int pulosTotais = 0;

    //Construtor da classe
    public Lebres(String nome){
        this.nome = nome;
        start();
    }

    public String getNome(){
        return this.nome;
    }

    //Seta a posição da lebre com base na variável globao 'posicao'
    public void setPosicao(){
        posicaoLebre += posicao;
        System.out.println("=========== " + nome + " Chegou a linha de chegada na posição: " + posicaoLebre + " ===========");
    }


    public int getDistanciaPercorrida(){
        return distanciaPercorrida;
    }
    public int getPosicaoLebre(){
        return posicaoLebre;
    }
    public int getPulosTotais(){ return pulosTotais;}


    public void run(){
        Random r = new Random();
        do {
            int tamanhoPulo = r.nextInt(3) + 1; //Randomiza entre 1 e 3 o range do pulo da lebre
            if (distanciaPercorrida <= DISTANCIA_TOTAL) {
                distanciaPercorrida += tamanhoPulo;
                pulosTotais++;
                //Soma o tamanho do pulo a distância total e acrescenta no total de pulos
                System.out.println(nome + ": " + distanciaPercorrida);
                System.out.println(nome + " Tamanho do pulo: " + tamanhoPulo);
                try {
                    Thread.sleep(350); // Simulação do tempo de pulo, diminui as chances de duas lebres chegarem simultaneamente
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            Thread.yield(); //A thread concede a execução para outro thread que esteja pronto para ser executado
        }
        while(distanciaPercorrida < DISTANCIA_TOTAL);
        setPosicao();
        synchronized (lock) {
            posicao++; // Atualiza a posição quando a lebre termina
        }

    }

}
