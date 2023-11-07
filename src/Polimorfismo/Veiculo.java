package Polimorfismo;

public abstract class Veiculo {
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;

    public Veiculo(String modelo, int ano, String placa, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public abstract float calculoIPVA();

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", placa='" + placa + '\'' +
                ", valor=" + valor +
                '}';
    }
}
