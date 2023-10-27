package RelacaoObjetos;

import java.util.ArrayList;

public class Grupo {
    private String nomeGrupo;
    private ArrayList<Membro> membros;

    public Grupo(String nomeGrupo){
        this.nomeGrupo = nomeGrupo;
        this.membros = new ArrayList<Membro>();
    }

    public void addMembro(Membro membro){
        if(!(membros.contains(membro)))
            membros.add(membro);
        else
            System.out.println("Membro " + membro.getNomeMembro() + " já está no grupo.");
    }

    public int getQuantidadeMembros(){
        return membros.size();
    }

    public void imprimirMembros(){
        System.out.println("Grupo: " + nomeGrupo);
        for (Membro membro : membros) {
            System.out.println("Nome: " + membro.getNomeMembro() + " | Número: " + membro.getNumero());
        }
    }
}
