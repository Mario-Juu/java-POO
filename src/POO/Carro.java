package POO;

public class Carro {
    private String modelo;
    private double potencia;
    private double combustivel;
    private int hodometro;

    public Carro(String modelo, double potencia, double combustivel, int hodometro){
        if(!modelo.isBlank())
            this.modelo = modelo;
        if(potencia > 0)
            this.potencia = potencia;
        if(combustivel <= 50 && combustivel >= 0)
            this.combustivel = combustivel;
        if(hodometro >= 0)
            this.hodometro = hodometro;
    }
    public boolean setPotencia(double potencia){
        if(potencia > 0){
            this.potencia = potencia;
            return true;
        }
        return false;
    }
    public double getPotencia(){
        return potencia;
    }
    public boolean addGasolina(double addGasolina){
        if(combustivel + addGasolina <= 50 && addGasolina > 0){
            combustivel += addGasolina;
            return true;
        }
        return false;
    }
    public double getCombustivel(){
        return combustivel;
    }
    public int getHodometro(){
        return hodometro;
    }
    public String getModelo(){
        return modelo;
    }
    public double viajar(double quilometrosPercorridos){
        if (quilometrosPercorridos == 0)
            return 0;
        double consumoPorLitro = 15.0/potencia;
        double consumoTotal = quilometrosPercorridos / consumoPorLitro;
        if(consumoTotal <= getCombustivel()){
            combustivel -= consumoTotal;
            hodometro += (int) quilometrosPercorridos;
            return consumoTotal;
        }
        return 0;
    }
    public String toString(){
        return "Veículo: " + modelo + ", Potencia: " + potencia + ", Hodômetro: "
                + hodometro + ", Combustível no tanque: " + combustivel + ".";
    }
}
