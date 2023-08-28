package ThreadProg;
import Threads.Exemplo_1;

import java.util.Scanner;

public class Exercicio1_main {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o valor das linhas da matriz:");
        int linha = s.nextInt();
        System.out.println("Insira o valor das colunas da matriz:");
        int coluna = s.nextInt();

        int [][]matriz = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Insira os valores da matriz:");
                matriz[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            SomaMatriz somaLinhas = new SomaMatriz("Thread #0"+i, matriz, i);
        }


    }
}
