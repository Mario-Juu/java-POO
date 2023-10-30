package Enumeracao;

public class Pessoa_main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mario", TipoCliente.PESSOA_FISICA, TipoPagamento.EM_DIA);
        System.out.println(pessoa.toString());
    }
}
