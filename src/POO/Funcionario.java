package POO;

import java.text.DecimalFormat;

public class Funcionario extends DecimalFormat {
    private String nome;
    private double horasTrabalhadas;
    private double salarioHora;
    private int dependentes;
    public static DecimalFormat df = new DecimalFormat();

    public Funcionario(String nome, double horasTrabalhadas, double salarioHora, int dependentes){
        if(nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.dependentes = dependentes;
    }
    public Funcionario(String nome){
        this.nome = nome;
        horasTrabalhadas = 0;
        salarioHora = 0;
        dependentes = 0;
    }
    public Funcionario(){
        horasTrabalhadas = 0;
        salarioHora = 0;
        dependentes = 0;
    }

    public void setNome(String nome){
        if(nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public boolean setHorasTrabalhadas(double horas){
        if(horas > 0 && horas < 730){
            this.horasTrabalhadas = horas;
            return true;
        }
        return false;
    }
    public boolean setSalarioHora(double salarioHora){
        if(salarioHora > 0){
            this.salarioHora = salarioHora;
            return true;
        }
        return false;
    }

    public boolean setDependentes(int dependentes){
        if(dependentes >= 0){
            this.dependentes = dependentes;
            return true;
        }
        return false;
    }

    public String getNome(){
        return nome;
    }
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public double getSalarioHora(){
        return salarioHora;
    }

    public int getDependentes(){
        return dependentes;
    }


    public double salarioBruto(){
        return (double) (horasTrabalhadas * salarioHora + (50 * dependentes));
    }

    public double descontoINSS(){
        if(salarioBruto() <= 1000)
            return (double) (salarioBruto() * 0.085);
        return (double) (salarioBruto() * 0.09);
    }

    public double descontoIR(){
        if(salarioBruto() <= 500)
            return 0;
        else if(salarioBruto() <= 1000)
            return (double) (salarioBruto() * 0.05);
        return (double) (salarioBruto() * 0.07);
    }

    public double salarioliquido(){
        return (double) (salarioBruto() - descontoINSS() - descontoIR());
    }

    public String toString(){

        df.applyPattern("R$ #,##0.00");
        return "Nome: " + getNome() + ", Dependentes: " + getDependentes() + ", Sal. Hora: " + df.format(getSalarioHora()) + ", Qtd. Horas Trab: " + getHorasTrabalhadas() +
                ", Sal. Bruto: " + df.format(salarioBruto()) + ", INSS: " + df.format(descontoINSS()) + ", IR: " + df.format(descontoIR()) + ", Sal. Liquido: " + df.format(salarioliquido());
    }
}
