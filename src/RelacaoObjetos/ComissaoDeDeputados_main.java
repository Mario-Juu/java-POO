package RelacaoObjetos;

public class ComissaoDeDeputados_main {
    public static void main(String[] args) {
        Comissao comissao1 = new Comissao("Comissão de Educação");
        Comissao comissao2 = new Comissao("Comissão de Saúde");
        //Adicione e crie 5 deputados criados as comissoes
        Deputado deputado1 = new Deputado("1", "João", 10, "SP");
        Deputado deputado2 = new Deputado("2", "Maria", 11, "RJ");
        Deputado deputado3 = new Deputado("3", "José", 12, "MG");
        Deputado deputado4 = new Deputado("4", "Ana", 13, "SP");
        Deputado deputado5 = new Deputado("5", "Pedro", 13, "RJ");
        System.out.println(deputado1.toString());
        //Adicione os deputados as comissoes
        comissao1.addDeputado(deputado1);
        comissao1.addDeputado(deputado2);
        comissao1.addDeputado(deputado3);
        comissao2.addDeputado(deputado4);
        comissao2.addDeputado(deputado5);
        //Imprima os deputados da comissão.
        comissao1.imprimeDeputados();
        System.out.println();
        comissao2.imprimeDeputados();
        System.out.println();
        //Imprima os deputados da comissão de um determinado partido.
        comissao1.imprimeDeputados(10);
        System.out.println();
        comissao2.imprimeDeputados(13);
        System.out.println();
        //Imprima os deputados da comissão de um determinado estado.
        comissao1.imprimeDeputados("SP");
        System.out.println();
        comissao2.imprimeDeputados("RJ");
        System.out.println();
        //Imprima a quantidade de deputados por partido.
        comissao1.imprimeQuantidadeDeputadosPorPartido();
        System.out.println();
        comissao2.imprimeQuantidadeDeputadosPorPartido();
    }
}
