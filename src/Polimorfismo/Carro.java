package Polimorfismo;

public class Carro extends Veiculo{
    private int portas;
    private TipoCarro tipoCarro;

    public Carro(String modelo, int ano, String placa, double valor, int portas, TipoCarro tipoCarro) {
        super(modelo, ano, placa, valor);
        this.portas = portas;
        this.tipoCarro = tipoCarro;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public float calculoIPVA(){
        float ipva = 0;
        if (tipoCarro.getTipo() == 1) {
            ipva = (float) (valor * 0.02);
        } else if (tipoCarro.getTipo() == 2) {
            ipva = (float) (valor * 0.01);
        }
        return ipva;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo +
                ", ano=" + ano + '\'' +
                ", placa='" + placa + '\'' +
                ", valor=" + valor + '\'' +
                ", ipva=" + calculoIPVA() + '\'' +
                ", portas=" + portas +
                '}';
    }
}
