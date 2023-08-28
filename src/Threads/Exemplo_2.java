package Threads;

public class Exemplo_2 implements Runnable {

    private String nome;
    private int tempo;
    public Exemplo_2(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        //Thread thread = new Thread(this);
        //thread.start();
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(nome + ": Contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(nome + ": Thread Terminou!");
    }
}
