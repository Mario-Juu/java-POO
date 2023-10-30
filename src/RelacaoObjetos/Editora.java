package RelacaoObjetos;

public class Editora {
    private String nome;
    private String cidade;

    public Editora(String nome, String cidade){
        if(!(nome.isBlank() || cidade.isBlank())){
            this.nome = nome;
            this.cidade = cidade;
        }
    }
    public String getNome(){
        return nome;
    }
    public String getCidade(){
        return cidade;
    }
}
