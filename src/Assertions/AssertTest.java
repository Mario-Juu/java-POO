package Assertions;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }
    private static void calculaSalario(double salario){
        assert (salario > 0): "O salario não pode ser negativo! O salário veio " + salario; //Deve ser alterada a VM Options para ea (enableassert)
    } //Assert só deve ser utilizado em métodos privados em caso de ter certeza de que, caso o assert falhe, o programa não irá quebrar.
}
