package RelacaoObjetos;

public class GrupoWhats_main {
    public static void main(String[] args) {
        Grupo grupo1 = new Grupo("Grupo 1");
        Grupo grupo2 = new Grupo("Grupo 2");
        Membro membro1 = new Membro("Membro 1", 11);
        Membro membro2 = new Membro("Membro 2", 12);
        Membro membro3 = new Membro("Membro 3", 13);
        Membro membro4 = new Membro("Membro 4", 14);
        Membro membro5 = new Membro("Membro 5", 15);

        grupo1.addMembro(membro1);
        grupo1.addMembro(membro2);
        grupo1.addMembro(membro3);
        grupo2.addMembro(membro3);
        grupo2.addMembro(membro4);
        grupo2.addMembro(membro5);

        grupo1.imprimirMembros();
        System.out.println("=====");
        grupo2.imprimirMembros();

    }
}
