package Polimorfismo;

public class Detran_main {
    public static void main(String[] args) { Detran detran1 = new Detran("SC");
        Detran detran2 = new Detran("PR");
        Veiculo veiculo1 = new Carro("Fiat", 2010, "ABC-1234", 20000, 4, TipoCarro.ALUGADO);
        Veiculo veiculo2 = new Carro("Ford", 2015, "DEF-5678", 30000, 4, TipoCarro.COMPRADO);
        Veiculo veiculo3 = new Moto("Honda", 2018, "GHI-9012", 10000, 150);
        Veiculo veiculo4 = new Moto("Yamaha", 2019, "JKL-3456", 12000, 150);
        Veiculo veiculo5 = new Carro("Chevrolet", 2017, "MNO-7890", 40000, 4, TipoCarro.COMPRADO);
        Veiculo veiculo6 = new Carro("Volkswagen", 2016, "PQR-1234", 35000, 4, TipoCarro.ALUGADO);
        detran1.addVeiculos(veiculo1);
        detran1.addVeiculos(veiculo2);
        detran1.addVeiculos(veiculo3);
        detran2.addVeiculos(veiculo4);
        detran2.addVeiculos(veiculo5);
        detran2.addVeiculos(veiculo6);
        System.out.println(detran1);
        System.out.println("=========================");
        System.out.println(detran2);


    }



}
