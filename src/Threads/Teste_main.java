package Threads;

public class Teste_main {

    public static void  main(String[] args) throws InterruptedException {
        //COM EXTENDS THREAD

        Exemplo_1 thread_1 = new Exemplo_1("Thread #01", 500);
        //thread.start();

        Exemplo_1 thread_2 = new Exemplo_1("Thread #02", 1000);

        // COM IMPLEMENTS RUNNABLE

        Exemplo_2 thread_3 = new Exemplo_2("Thread #03", 600);
        Thread t1 = new Thread(thread_3);
        t1.start();

        Exemplo_2 thread_4 = new Exemplo_2("Thread #04", 800);
        Thread t2 = new Thread(thread_4);
        t2.start();

        for (int i=5; i<=9; i++){
            Exemplo_1 conj_threads = new Exemplo_1("Thread #0"+i, 400);
        }

        for (int i=10; i<=15; i++){
            Exemplo_1 conj_threads_2 = new Exemplo_1("Thread #"+i, 900);
            conj_threads_2.join();
        }

        for (int i=16; i<=20; i++){
            Exemplo_1 conj_threads_3 = new Exemplo_1("Thread #"+i, 700);
            if(i == 16){
                conj_threads_3.setPriority(1);
            }else if(i == 17){
                conj_threads_3.setPriority(9);
            }else{
                conj_threads_3.setPriority(5);
            }
        }

    }
}
