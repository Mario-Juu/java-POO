package POO;
import java.text.DecimalFormat;

public class Funcionarios_main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        Funcionario fun1 = new Funcionario("Bob", 160, 6.15, 2);
        System.out.println(df.format(fun1.salarioBruto()));
        System.out.println(df.format(fun1.descontoINSS()));
        System.out.println(df.format(fun1.descontoIR()));
        System.out.println(df.format(fun1.salarioliquido()));
        fun1.setSalarioHora(8);
        System.out.println(df.format(fun1.salarioliquido()));
        System.out.println(fun1.toString());

        System.out.println("\n =============================================== \n");

        Funcionario fun2 = new Funcionario("Bia", 200, 12.50, 0);
        System.out.println(fun2.toString());
        System.out.println(fun2.setDependentes(-2));
        System.out.println(fun2.setNome("Bianca"));
        System.out.println(fun2.toString());
        fun2.setDependentes(1);
        fun2.setSalarioHora(15);
        fun2.setHorasTrabalhadas(750);
        System.out.println(fun2.toString());
    }
}
