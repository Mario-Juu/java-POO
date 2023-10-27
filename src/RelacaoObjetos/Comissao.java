package RelacaoObjetos;
import java.util.ArrayList;

public class Comissao {
    private String titulo;
    private ArrayList<Deputado> deputados;

    public Comissao(String titulo){
        this.titulo = titulo;
        this.deputados = new ArrayList<Deputado>();
    }
    public void addDeputado(Deputado deputado){
        if(!(deputados.contains(deputado)))
            deputados.add(deputado);
        else
            System.out.println("O deputado " + deputado.getNome() + " já está na comissão.");
    }

    public void imprimeDeputados(){
        System.out.println("Título da comissão: " + titulo);
        for (Deputado deputado : deputados) {
            System.out.println("Deputado: " + deputado.getNome());
        }
    }
    public void imprimeDeputados(int partido){
        System.out.println("Título da comissão: " + titulo);
        System.out.println("Deputados do partido " + partido);
        for (Deputado deputado : deputados) {
            if(deputado.getPartido() == partido)
                System.out.println("Deputado: " + deputado.getNome());
        }
    }
    public void imprimeDeputados(String estado){
    System.out.println("Título da comissão: " + titulo);
    System.out.println("Deputados de " + estado);
        for (Deputado deputado : deputados) {
            if(deputado.getEstado().equals(estado))
                System.out.println("Deputado: " + deputado.getNome());
        }
    }
    public int contagemDeputadosPorPartido(Deputado deputado){
        int quantidadePartido = 1;
        for (Deputado value : deputados) {
            if (value.getPartido() == deputado.getPartido() && value != deputado) {
                quantidadePartido++;
            }
        }
        return quantidadePartido;
    }
    public void imprimeQuantidadeDeputadosPorPartido(){
        System.out.println("Título da comissão: " + titulo);
        ArrayList<Integer> partidos = new ArrayList<Integer>();
        for (Deputado deputado : deputados) {
            if (!(partidos.contains(deputado.getPartido()))){
                System.out.println("Partido: " + deputado.getPartido() + " | Quantidade: " + contagemDeputadosPorPartido(deputado));
                partidos.add(deputado.getPartido());
            }
        }
    }
}
