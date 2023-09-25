package RelacaoObjetos;

import java.util.ArrayList;

public class Grupo {
    private String nome;
    private ArrayList<Membro> membros;

    public Grupo(String nome){
        this.nome = nome;
        this.membros = new ArrayList<Membro>();
    }

    public void addMembro(Membro membro){
        if(!(membros.contains(membro)))
            membros.add(membro);
        else
            System.out.println("Membro " + membro.getNome() + " já está no grupo.");
    }

    public int getQuantidadeMembros(){
        return membros.size();
    }

    public void imprimirMembros(){
        System.out.println("Grupo: " + nome);
        for (Membro membro : membros) {
            System.out.println("Nome: " + membro.getNome() + " | Número: " + membro.getNumero());
        }
    }
}
