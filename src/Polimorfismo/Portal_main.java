package Polimorfismo;

public class Portal_main {
    public static void main(String[] args) {
        Portal portal = new Portal("Mercado Livre", "www.mercadolivre.com.br");
        Anuncio anuncio = new Anuncio("Carro", 10000, "São Paulo", "SP");
        AnuncioPago anuncioPago = new AnuncioPago("Carro", 10000, "São Paulo", "SP", 30, 100);
        portal.addAnuncio(anuncio);
        portal.addAnuncio(anuncioPago);
        System.out.println(portal);
    }
}
