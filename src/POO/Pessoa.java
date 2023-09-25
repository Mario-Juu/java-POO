package POO;

public class Pessoa {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private Pessoa conjuge;

    public Pessoa(int anoNascimento){
        this.anoNascimento = anoNascimento;
        this.nome = "";
        this.altura = 0;
        this.peso = 0;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public boolean setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
            return true;
        }
        return false;
    }
    public double getPeso(){
        return this.peso;
    }
    public boolean setAltura(double altura){
        if(altura > 0){
            this.altura = altura;
            return true;
        }
        return false;
    }
    public double getAltura(){
        return this.altura;
    }
    public void casar(Pessoa outraPessoa){
        if(this.conjuge == null && outraPessoa.conjuge == null){
        outraPessoa.conjuge = this;
        this.conjuge = outraPessoa;
        } else{
            System.out.println("Você não pode casar com alguém casado.");
        }
    }
    public boolean ehCasado(){
        return this.conjuge != null;
    }
    public String getNomeConjuge(){
        return conjuge.nome;
    }


    public static void main(String[] args) {
        Pessoa maria = new Pessoa(1990);
        Pessoa jose = new Pessoa(1985);
        maria.setNome("Maria");
        maria.setPeso(60.5);
        maria.setAltura(1.75);

        jose.setNome("José");
        jose.setPeso(80.0);
        jose.setAltura(1.85);

        maria.casar(jose);
        maria.ehCasado();
        jose.ehCasado();
        System.out.println(maria.getNomeConjuge() + " " + jose.getNomeConjuge());
    }
}
