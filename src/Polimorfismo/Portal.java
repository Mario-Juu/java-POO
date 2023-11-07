package Polimorfismo;

import java.util.ArrayList;

public class Portal {
    private String nome;
    private String url;
    private ArrayList<Anuncio> anuncios;

    public Portal(String nome, String url) {
        this.nome = nome;
        this.url = url;
        this.anuncios = new ArrayList<>();
    }

    public void addAnuncio(Anuncio anuncio){
        anuncios.add(anuncio);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("Portal: " + nome + "\n URL: " + url);
        retorno.append("\nAnuncios: ");
        for(Anuncio anuncio : anuncios){
            retorno.append("\n").append(anuncio);
        }
        return retorno.toString();
    }
}
