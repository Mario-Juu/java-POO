package Enumeracao;

public class Pessoa {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Pessoa(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoPagamento=" + tipoPagamento.getTipo() +
                '}';
    }

    public Pessoa(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
