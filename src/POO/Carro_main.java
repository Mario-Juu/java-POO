package POO;

public class Carro_main {
    public static void main(String[] args) {
        /*POO.Carro veiculo1 = new POO.Carro("Fusca", 1.0, 30, 150000);
        veiculo1.viajar(100);
        System.out.println("Viagem 100: "+ veiculo1.toString());
        veiculo1.viajar(150);
        System.out.println("Viagem 150: "+ veiculo1.toString());
        veiculo1.viajar(300);
        System.out.println("Viagem 300: " + veiculo1.toString());
        veiculo1.addGasolina(50);
        System.out.println("Add 50: "+veiculo1.toString());
        veiculo1.addGasolina(30);
        System.out.println("Add 30: "+veiculo1.toString());
        veiculo1.viajar(300);
        System.out.println(veiculo1.toString());
        veiculo1.viajar(45);
        System.out.println(veiculo1.toString());*/
        Carro veiculo2 = new Carro("Gol", 1.6, 10, 75000);
        veiculo2.viajar(50);
        System.out.println(veiculo2.toString());
        veiculo2.setPotencia(2.0);
        veiculo2.viajar(50);
        System.out.println(veiculo2.toString());
        veiculo2.viajar(15);
        veiculo2.addGasolina(45);
        veiculo2.viajar(100);
        System.out.println(veiculo2.toString());
    }
}
