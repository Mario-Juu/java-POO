import java.util.Scanner;
public class Exec1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float raio = s.nextFloat();
        float altura = s.nextFloat();
        volume = Math.PI * (Math.pow(raio, 2)) * altura;
        System.out.printf("%s%%.2f%n", volume);
    }
}