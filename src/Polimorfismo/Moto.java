package Polimorfismo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String modelo, int ano, String placa, double valor, int cilindradas) {
        super(modelo, ano, placa, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public float calculoIPVA(){
        float ipva = 0;
        if(cilindradas >= 200)
            ipva = (float) (valor * 0.02);
        return ipva;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + modelo +
                ", ano=" + ano + '\'' +
                ", placa='" + placa + '\'' +
                ", valor=" + valor + '\'' +
                ", ipva=" + calculoIPVA() + '\'' +
                ", cilindradas=" + cilindradas +
                '}';
    }
}
