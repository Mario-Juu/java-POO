package ClassesAbstratas;

public class Funcionario_main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "11122-2", 2000);
        g.calculaSalario();
        System.out.println(g);
    }
}
