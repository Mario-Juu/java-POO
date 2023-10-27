package RelacaoObjetos;

public class TurmasComAlunos_main {
    public static void main(String[] args) {
        Turma turma1 = new Turma("Matemática", "Paolo");
        Turma turma2 = new Turma("Programação", "Fernando");
        Aluno aluno1 = new Aluno(100, "Mario");
        Aluno aluno2 = new Aluno(101, "Lucas");
        Aluno aluno3 = new Aluno(102, "Clara");
        Aluno aluno4 = new Aluno(103, "Thaiane");
        Aluno aluno5 = new Aluno(104, "Henrique");
        Aluno aluno6 = new Aluno(105, "Taiani");

        turma1.addAluno(aluno1);
        turma1.addAluno(aluno2);
        turma1.addAluno(aluno3);
        turma2.addAluno(aluno4);
        turma2.addAluno(aluno5);
        turma2.addAluno(aluno6);

        System.out.println("Alunos turma 1: " + turma1.getQuantidadeAlunos());
        turma1.imprimeAlunos();

        System.out.println("Alunos turma 2: " + turma2.getQuantidadeAlunos());
        turma2.imprimeAlunos();
    }
}
