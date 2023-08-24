package FundamentosJava;

import java.util.Scanner;

public class exec5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        s.useDelimiter(";");

        if (s.hasNext()) {

            String letra = s.next();


            if(letra.equals("Q")){
                double numero1 = s.nextDouble();
                System.out.println((String.format("%.2f",areaQuadrado(numero1))));
            }
            else if(letra.equals("C")){
                double numero1 = s.nextDouble();
                System.out.printf((String.format("%.2f", areaCirculo(numero1))));
            }
            else if(letra.equals("R")){
                double numero1 = s.nextDouble();
                double numero2 = s.nextDouble();
                System.out.printf(String.format("%.2f",areaRetangulo(numero1,numero2)));

            }
            else if(letra.equals("T")){
                double numero1 = s.nextDouble();
                double numero2 = s.nextDouble();
                double numero3 = s.nextDouble();
                System.out.println((String.format("%.2f",areaTriangulo(numero1,numero2,numero3))));
            }
        }
    }
    public static double areaQuadrado(double a){
        return (float) (Math.pow(a,2));
    }
    public static double areaRetangulo(double a, double b){
        return (float) (a * b);
    }
    public static double areaCirculo(double a){
        return (float) (Math.PI * (Math.pow(a,2)));
    }
    public static double areaTriangulo(double a, double b, double c){
        double s = (float) ((a+b+c)/2);
        return (float) (Math.sqrt(s*(s-a) * (s-b) * (s-c)));
    }
}


