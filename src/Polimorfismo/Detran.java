package Polimorfismo;

import java.util.ArrayList;

public class Detran {
    private String estado;
    private ArrayList<Veiculo> veiculos;

    public Detran(String estado) {
        this.estado = estado;
        this.veiculos = new ArrayList<>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void addVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    @Override
    public String toString() {
       StringBuilder retorno = new StringBuilder("Estado: " + estado);
         retorno.append("\nVeiculos: ");
            for (Veiculo veiculo : veiculos) {
                retorno.append("\n").append(veiculo);
            }
            return retorno.toString();
    }
}
