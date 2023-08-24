package FundamentosJava;

import java.util.Scanner;
public class exec3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        for (long i = (int) (n-1); i > 0; i--) n *= i;
        if(n == 0) n = 1;
        System.out.println(n);
    }
}
