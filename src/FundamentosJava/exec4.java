package FundamentosJava;

import java.util.Scanner;

public class exec4 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        Scanner s = new Scanner(System.in);
        s.useDelimiter(";|\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (s.hasNextInt()) {
                    matriz[i][j] = s.nextInt();
                } else {
                    s.nextLine();
                    j--;
                }
            }
        }

        //Soma Quarta Linha
        int somQuarta = 0;
        for (int col = 0; col < matriz.length; col++) {
            somQuarta += matriz[3][col];
        }

        //Soma Segunda Coluna
        int somSegunda = 0;
        for (int[] item : matriz) {
            somSegunda += item[1];
        }

        //Soma Diagonal Principal
        int diagPrincipal = 0;
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                if(lin == col)
                    diagPrincipal += matriz[lin][col];
            }
        }

        //Soma Diagonal Secundária
        int colDiag = matriz.length-1;
        int diagSecund = 0;
        for (int[] value : matriz) {
            diagSecund += value[colDiag];
            colDiag--;
        }

        //Soma Todos os Elementos
        int somTotal = 0;
        for (int[] ints : matriz) {
            for (int col = 0; col < matriz[0].length; col++) somTotal += ints[col];
        }

        System.out.println(somQuarta);
        System.out.println(somSegunda);
        System.out.println(diagPrincipal);
        System.out.println(diagSecund);
        System.out.println(somTotal);

    }
}
