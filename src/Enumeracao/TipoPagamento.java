package Enumeracao;

public enum TipoPagamento {
    ATRASADO(1), EM_DIA(2);
    private int tipo;

    TipoPagamento(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
