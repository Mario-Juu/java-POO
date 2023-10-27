package Strings;

public class StringPerformanceTest {
    public static void main(String[] args) {
        //Teste de desempenho sem StringBuilder
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto = " + (fim - inicio) + " ms");

        //Teste de desempenho com StringBuilder
        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto = " + (fim - inicio) + " ms");

        //Teste de desempenho com StringBuffer
        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto = " + (fim - inicio) + " ms");

        //StringBuilder utiliza de multithreading, já StringBuffer não, pois é totalmente syncronized. StringBuilder é mais rápido,
        // mas não é thread safe.

    }
    private static void concatString(int tam){
        String string = "";
        for(int i = 0; i < tam; i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for(int i = 0; i < tam; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for(int i = 0; i < tam; i++){
            sb.append(i);
        }
    }
}
