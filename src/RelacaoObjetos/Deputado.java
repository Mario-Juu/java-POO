package RelacaoObjetos;

public class Deputado {
    private String matricula;
    private String nome;
    private int partido;
    private String estado;

    public Deputado(String matricula, String nome, int partido, String estado){
        this.matricula = matricula;
        this.nome = nome;
        if(partido >= 10 && partido <= 99)
            this.partido = partido;
        this.estado = estado;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getPartido() {
        return partido;
    }

    public String getEstado() {
        return estado;
    }

    public boolean setPartido(int partido){
        if(partido >= 10 && partido <= 99){
            this.partido = partido;
            return true;
        }
        return false;
    }
    public String toString(){
        return "Nome: " + nome + ", Matricula: " + matricula + ", Partido: " + partido + ", Estado: " + estado;
    }
}
