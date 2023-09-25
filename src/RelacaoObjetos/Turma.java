package RelacaoObjetos;
import java.util.ArrayList;
public class Turma {
    private String nomeDisciplina;
    private String nomeProfessor;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeDisciplina, String nomeProfessor){
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno aluno){
        if(!(alunos.contains(aluno)))
            alunos.add(aluno);
        else
            System.out.println("O aluno " + aluno.getNome() + " já está na turma.");
    }

    public int getQuantidadeAlunos(){
        return alunos.size();
    }

    public void imprimeAlunos(){
        System.out.println("Nome da disciplina: " + nomeDisciplina);
        System.out.println("Nome do professor: " + nomeProfessor);

        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula());
        }
    }

}
