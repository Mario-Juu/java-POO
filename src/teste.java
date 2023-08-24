import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mes = s.nextInt();
        switch (mes) {
            case 2:{
                System.out.printf("28 dias");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.printf("30 dias");
                break;
            }
            default:{
                System.out.printf("31 dias");
            }
        }
    }
}
