package POO;

public class Estudante {
    private String nome;
    private int matricula;
    private int creditos;

    public Estudante(int matricula){
        this.matricula = matricula;
        this.creditos = 0;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public boolean addCreditos(int creditosAdicionados){
        if(this.creditos + creditosAdicionados >= 0){
            this.creditos += creditosAdicionados;
            return true;
        }
        return false;
    }
    public int getCreditos(){
        return this.creditos;
    }

    public String setLogin(){
        String matriculaLogin = Integer.toString(matricula);
        return nome.substring(0,3) + matriculaLogin.substring(3,6);
    }
    public String representacaoAluno(){
        return "Nome: " + nome + ", Matricula: " + matricula + ", Login: " + setLogin() + ", Creditos: " + creditos;
    }


    public static void main(String[] args) {
        //Primeiro estudante
        Estudante est1 = new Estudante(556644);
        est1.setNome("Fernando");
        est1.addCreditos(35);

        //Segundo estudante
        Estudante est2 = new Estudante(579035);
        est2.setNome("Beth");
        est2.addCreditos(80);

        //Est1:
        System.out.println(est1.setLogin());
        System.out.println(est1.representacaoAluno());
        est1.addCreditos(4);
        System.out.println(est1.representacaoAluno());
        est1.setNome("Fernando Santos");
        System.out.println(est1.setLogin());
        System.out.println(est1.representacaoAluno());

        System.out.println();
        //Est2:
        System.out.println(est2.representacaoAluno());
        est2.addCreditos(-8);
        System.out.println(est2.representacaoAluno());
        est2.setNome("Elizabeth");
        System.out.println(est2.setLogin());

    }
}
