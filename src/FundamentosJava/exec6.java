package FundamentosJava;

import java.util.Scanner;
public class exec6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String operador = s.nextLine();

        double resultado;
        double segundoTermo;
        double primeiroTermo = s.nextDouble();


        switch (operador) {
            case "sum":
                 segundoTermo = s.nextDouble();
                resultado = primeiroTermo + segundoTermo;
                break;
            case "sub":
                 segundoTermo = s.nextDouble();
                resultado = primeiroTermo - segundoTermo;
                break;
            case "mult":
                 segundoTermo = s.nextDouble();
                resultado = primeiroTermo * segundoTermo;
                break;
            case "div":
                 segundoTermo = s.nextDouble();
                if (segundoTermo == 0) {
                    System.out.println("Divisão por zero");
                    return;
                }
                resultado = primeiroTermo / segundoTermo;
                break;
            case "abs":
                resultado = Math.abs(primeiroTermo);
                break;

            default:
                System.out.println("Operador inválido");
                s.close();
                return;
        }

        System.out.println(resultado);
    }
}