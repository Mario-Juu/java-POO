package Polimorfismo;

public enum TipoCarro {
    PARTICULAR(1),ALUGADO(2);
    private int tipo;

    TipoCarro(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

}
