package FundamentosJava;

import java.util.Scanner;
public class teste1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int [][] matriz;

        matriz = new int [5][5];

        s.useDelimiter(";");

        for (int lin = 0 ; lin < matriz.length; lin++) {
            int a = 5;
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[lin][col] = s.nextInt();
                a--;
                if (a == 0) {
                    s.nextLine();
                }
            }
        }


    }
}
