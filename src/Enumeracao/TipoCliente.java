package Enumeracao;

public enum TipoCliente {
    //constant specific class body
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){public String getID(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }
    public String getID(){
        return "A";
    }

    public String getNome() {
        return nome;
    }

    TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
