package Threads;

//Classe Exemplo_3 estende a classe Thread
//Cada objeto desta classe ira dormir aleatoriamente entre 0 e 5 segundos.
class Exemplo_3 extends Thread {
    private int tempo_de_sono;
    private Exemplo_3 namorada = null;
    // construtor recebe o nome da thread
    // ele chama o construtor da classe pai (super)
    public Exemplo_3(String nome){
        super(nome); // construtor da classe pai
        // determina o tempo do sono aleatoriamente entre 0 e 5s
        tempo_de_sono = (int) (Math.random() * 5000);
        //metodo estatico da classe Math

        // escreve o nome da thread e seu tempo de sono
        System.err.println("Nome: " + getName() + " -- Tempo do sono: " + tempo_de_sono);
    }
    void getReferenciaThread(Thread t1){
        namorada = (Exemplo_3) t1;
    }

    //metodo que ira fazer a execucao da thread
    public void run(){
        // escreve que a thread ira dormir
        try {
            System.err.println(getName()  + ": vai comecar a dormir");
            //Thread.sleep(tempo_de_sono);
            sleep(tempo_de_sono);
            //this.sleep(tempo_de_sono);
        }catch(InterruptedException interruptedException ){
            //tratamento de erro caso haja algum erro durante o processo de sono da thread
            System.err.println(interruptedException.toString());
        }
        if(namorada != null){
            try{
                namorada.join();
            } catch(InterruptedException x) { }
        }
        // escreve o nome da thread apos o termino de seu sono
        System.err.println( getName() + ": acordou e agora vai morrer");
    }
} //fim da classe Exemplo_3