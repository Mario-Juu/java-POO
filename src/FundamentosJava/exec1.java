package FundamentosJava;

import java.util.Scanner;
public class exec1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float raio = s.nextFloat();
        float altura = s.nextFloat();
        float volume = (float) (Math.PI * (Math.pow(raio, 2)) * altura);
        System.out.printf(String.format("%.2f", volume));
        //Teste FundamentosJava.teste
    }
}
