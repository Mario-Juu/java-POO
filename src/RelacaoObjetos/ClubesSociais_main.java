package RelacaoObjetos;

public class ClubesSociais_main {
    public static void main(String[] args) {
        //Crie dois clubes e membros sócios do clube
        Clube clube1 = new Clube("Clube 1", 1);
        Clube clube2 = new Clube("Clube 2", 2);
        Socio socio1 = new Socio(1, "Socio 1", 18, 200);
        Socio socio2 = new Socio(2, "Socio 2", 19, 300);
        Socio socio3 = new Socio(3, "Socio 3", 20, 400);
        Socio socio4 = new Socio(4, "Socio 4", 21, 500);
        Socio socio5 = new Socio(5, "Socio 5", 22, 600);
        Socio socio6 = new Socio(6, "Socio 6", 23, 700);
        Socio socio7 = new Socio(7, "Socio 7", 24, 800);
        Socio socio8 = new Socio(8, "Socio 8", 16, 230);
        Socio socio9 = new Socio(9, "Socio 9", 17, 340);
        Socio socio10 = new Socio(10, "Socio 10", 18, 450);
        //Associe os socios a determinados clubes
        clube1.addSocio(socio1);
        clube1.addSocio(socio2);
        clube1.addSocio(socio3);
        clube1.addSocio(socio4);
        clube1.addSocio(socio5);
        clube2.addSocio(socio6);
        clube2.addSocio(socio7);
        clube2.addSocio(socio8);
        clube2.addSocio(socio9);
        clube2.addSocio(socio10);
        //Execute os métodos dos clubes
        clube1.imprimirSocios();
        System.out.println("=====");
        clube2.imprimirSocios();
        System.out.println("==========");
        clube1.imprimirSociosMenoresDeIdade();
        System.out.println("=====");
        clube2.imprimirSociosMenoresDeIdade();
        System.out.println("==========");
        System.out.println(clube1.getIdadeMediaSocios());
        clube1.imprimirSociosIdadeMaiorQueMedia();
        System.out.println("=====");
        System.out.println(clube2.getIdadeMediaSocios());
        clube2.imprimirSociosIdadeMaiorQueMedia();
        System.out.println("==========");
        System.out.println(clube1.getArrecadacaoMensalidades());
        System.out.println("=====");
        System.out.println(clube2.getArrecadacaoMensalidades());
        //Altere a idade e o valor da mensalidade de alguns sócios
        socio1.setIdade(30);
        socio1.setValorMensalidade(100);
        socio2.setIdade(31);
        socio2.setValorMensalidade(200);
        socio4.setIdade(32);
        socio4.setValorMensalidade(300);
        socio5.setIdade(33);
        socio5.setValorMensalidade(400);
        socio8.setIdade(34);
        socio8.setValorMensalidade(500);
        socio9.setIdade(35);
        socio9.setValorMensalidade(600);
        //Impressão dos novos dados
        System.out.println("==========");
        clube1.imprimirSocios();
        System.out.println("=====");
        clube2.imprimirSocios();
        System.out.println("==========");
        clube1.imprimirSociosMenoresDeIdade();
        System.out.println("=====");
        clube2.imprimirSociosMenoresDeIdade();
        System.out.println("==========");
        System.out.println(clube1.getIdadeMediaSocios());
        clube1.imprimirSociosIdadeMaiorQueMedia();
        System.out.println("=====");
        System.out.println(clube2.getIdadeMediaSocios());
        clube2.imprimirSociosIdadeMaiorQueMedia();
        System.out.println("==========");
        System.out.println(clube1.getArrecadacaoMensalidades());
        System.out.println("=====");
        System.out.println(clube2.getArrecadacaoMensalidades());
        //Remova 2 sócios aleatórios de cada clube
        clube1.removerSocio(1);
        clube1.removerSocio(3);
        clube2.removerSocio(6);
        clube2.removerSocio(8);
        //Impressão dos novos dados
        System.out.println("==========");
        clube1.imprimirSocios();
        System.out.println("=====");
        clube2.imprimirSocios();
        System.out.println("==========");
        clube1.imprimirSociosMenoresDeIdade();
        System.out.println("=====");
        clube2.imprimirSociosMenoresDeIdade();
        System.out.println("==========");
        System.out.println(clube1.getIdadeMediaSocios());
        clube1.imprimirSociosIdadeMaiorQueMedia();
        System.out.println("=====");
        System.out.println(clube2.getIdadeMediaSocios());
        clube2.imprimirSociosIdadeMaiorQueMedia();
        System.out.println("==========");
        System.out.println(clube1.getArrecadacaoMensalidades());
        System.out.println("=====");
        System.out.println(clube2.getArrecadacaoMensalidades());
    }
}
