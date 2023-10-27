package RelacaoObjetos;

public class Socio {
    private int matricula;
    private String nome;
    private int idade;
    private double valorMensalidade;

    public Socio(int matricula, String nome, int idade, double valorMensalidade){
        this.matricula = matricula;
        if(!nome.isBlank())
            this.nome = nome;
        if(idade >= 0)
            this.idade = idade;
        if(valorMensalidade >= 0)
            this.valorMensalidade = valorMensalidade;
    }
    public boolean setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
            return true;
        }
        return false;
    }
    public boolean setValorMensalidade(double valorMensalidade){
        if(valorMensalidade >= 0){
            this.valorMensalidade = valorMensalidade;
            return true;
        }
        return false;
    }
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getValorMensalidade(){
        return valorMensalidade;
    }
    public String toString(){
        return "Matricula: " + matricula + "\nNome: " + nome + "\nIdade: " + idade + "\nValor da Mensalidade: " + valorMensalidade;
    }
}
