package RelacaoObjetos;
import java.util.ArrayList;

public class Clube {
    private String nome;
    private int cidade;
    private ArrayList<Socio> socios;


    public Clube(String nome, int cidade) {
        if(!(nome.isBlank()))
            this.nome = nome;
        if(cidade >= 0)
            this.cidade = cidade;
       socios = new ArrayList<Socio>();
    }
    public void addSocio(Socio socio){
        socios.add(socio);
    }
    public void imprimirSocios(){
        System.out.println("Clube: " + nome);
        for (Socio socio : socios) {
            System.out.println("Matricula: " + socio.getMatricula() + " | Nome: " + socio.getNome() + " | Idade: " + socio.getIdade() + " | Valor da Mensalidade: " + socio.getValorMensalidade());
        }
    }
    public void imprimirSociosMenoresDeIdade(){
        System.out.println("Clube: " + nome);
        for (Socio socio : socios) {
            if(socio.getIdade() < 18)
                System.out.println("Matricula: " + socio.getMatricula() + " | Nome: " + socio.getNome() + " | Idade: " + socio.getIdade() + " | Valor da Mensalidade: " + socio.getValorMensalidade());
        }
    }
    public double getIdadeMediaSocios(){
        int soma = 0;
        for(Socio socio: socios){
            soma += socio.getIdade();
        }
        return (double) soma /socios.size();
    }
    public void imprimirSociosIdadeMaiorQueMedia(){
        System.out.println("Clube: " + nome);
        for (Socio socio : socios) {
            if(socio.getIdade() > getIdadeMediaSocios())
                System.out.println("Matricula: " + socio.getMatricula() + " | Nome: " + socio.getNome() + " | Idade: " + socio.getIdade() + " | Valor da Mensalidade: " + socio.getValorMensalidade());
        }
    }
    public double getArrecadacaoMensalidades(){
        double soma = 0;
        for(Socio socio: socios){
            soma += socio.getValorMensalidade();
        }
        return soma;
    }
    public boolean removerSocio(int matricula){
        for(Socio socio: socios){
            if(socio.getMatricula() == matricula){
                socios.remove(socio);
                return true;
            }
        }
        return false;
    }

}
