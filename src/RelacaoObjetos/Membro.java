package RelacaoObjetos;
public class Membro {
    private String nomeMembro;
    private int numero;

    public Membro(String nomeMembro, int numero){
        this.nomeMembro = nomeMembro;
        this.numero = numero;
    }

    public String getNomeMembro(){
        return nomeMembro;
    }
    public int getNumero(){
        return numero;
    }
    }

