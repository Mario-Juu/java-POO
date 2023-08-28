package Threads;

public class Teste_main_2{
//criacao e start das threads
public static void main(String args[]) {
    System.out.println("Main: IniciodaThreadmain()\n");

    //Declaracao de quatro objetos do tipo Exemplo_3
    Exemplo_3 thread1,thread2,thread3,thread4;

    //criacao de quatro objetos do tipo Exemplo_3
    thread1=new Exemplo_3("thread1");
    thread2=new Exemplo_3("thread2");
    thread3=new Exemplo_3("thread3");
    thread4=new Exemplo_3("thread4");
    System.err.println("\nMain: Disparando as threads");
    thread1.getReferenciaThread(thread2);

    //start de execucao das quadro Threads
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    System.err.println("Main: Threads Basicas iniciadas \n");

    try{
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }catch(InterruptedException x) { }

    System.out.println("Main: Fim da Thread main() \n");
    }// fim do metodo main()
} //fim da classe Teste_main_2
