package Polimorfismo;

public class AnuncioPago extends Anuncio {
    private int diasAnuncio;
    private double valorPagoAnuncio;

    public AnuncioPago(String produto, double valorVenda, String cidade, String estado, int diasAnuncio, double valorPagoAnuncio) {
        super(produto, valorVenda, cidade, estado);
        this.diasAnuncio = diasAnuncio;
        this.valorPagoAnuncio = valorPagoAnuncio;
    }

    @Override
    public String toString() {
        return "AnuncioPago{" +
                "produto='" + produto +
                ", valorVenda=" + valorVenda + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", diasAnuncio='" + diasAnuncio + '\'' +
                ", valorPagoAnuncio=" + valorPagoAnuncio +
                '}';
    }
}
