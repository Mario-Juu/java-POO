package Polimorfismo;

public class Anuncio {
    protected String produto;
    protected double valorVenda;
    protected String cidade;
    protected String estado;

    public Anuncio(String produto, double valorVenda, String cidade, String estado) {
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "produto='" + produto + '\'' +
                ", valorVenda=" + valorVenda +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
