package ThreadProg;

public class Exercicio2_main {
    public static void main(String[] args) throws InterruptedException {
        //Declaração das threads
        Lebres[] lebres = new Lebres[5];
        lebres[0] = new Lebres("Lebre #1");
        lebres[1] = new Lebres("Lebre #2");
        lebres[2] = new Lebres("Lebre #3");
        lebres[3] = new Lebres("Lebre #4");
        lebres[4] = new Lebres("Lebre #5");


        for (Lebres lebre : lebres) { //Garante que a thread main aguarde o término de todas as threads para realizar o cálculo dos resultados depois
            try {
                lebre.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ordenarLebres(lebres);

        //Imprime o resultado da corrida
        System.out.println("Resultado da corrida:");
        for (Lebres lebre : lebres) {
            System.out.println("Posição " + lebre.getPosicaoLebre() + ": " + lebre.getNome() +
                    " - Pulos: " + lebre.getPulosTotais());
        }

    }

    public static void ordenarLebres(Lebres[] lebres){
        //Aplicação de uma ordenação simples em ordem crescente da posição das lebres
        for (int i = 0; i < lebres.length - 1; i++) {
            for (int j = i + 1; j < lebres.length; j++) {
                if (lebres[i].getPosicaoLebre() > lebres[j].getPosicaoLebre()) {
                    Lebres temp = lebres[i];
                    lebres[i] = lebres[j];
                    lebres[j] = temp;
                }
            }
        }
    }
}

