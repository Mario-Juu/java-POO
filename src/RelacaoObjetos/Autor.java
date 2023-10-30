package RelacaoObjetos;

public class Autor {
    private String nome;
    private String pseudonimo;

    public Autor(String nome, String pseudonimo) {
        if (!(nome.isBlank()))
            this.nome = nome;
        this.pseudonimo = pseudonimo;
    }

    public String getNome() {
        return nome;
    }

    public boolean setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
        return true;
    }
    public String getPseudonimo() {
        return pseudonimo;
    }
}
