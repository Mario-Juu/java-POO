package Interfaces;

public class Produto_main {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);

    }
}
