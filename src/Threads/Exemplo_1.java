package Threads;

public class Exemplo_1 extends Thread
{
    private String nome;
    private int tempo;
    public Exemplo_1(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run(){
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