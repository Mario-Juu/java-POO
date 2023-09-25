package RelacaoObjetos;
public class Membro {
    private String nome;
    private int numero;

    public Membro(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    }

