package TryCatch;
import java.io.File;
import java.io.IOException;
public class CheckedExceptionTest {
    public static void main(String[] args) {
       abrirArquivo();
    }

    public static void criarArquivo() throws IOException { //O método que chama o método que lança a exceção deve tratar a exceção.
        File file = new File("Teste.txt");
        try{
            file.createNewFile();
            System.out.println("Arquivo criado.");
        } catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static void abrirArquivo() {
        File file = new File("Teste.txt");
        try{ //Tentativa de rodar o código.
            file.createNewFile();
            System.out.println("Abrindo arquivo.");
            System.out.println("Lendo arquivo.");
            //throw new Exception(); //Forçando uma exceção.
            System.out.println("Escrevendo no arquivo.");
        } catch(Exception e){ //Caso haja uma exceção, o código dentro do catch será executado.
            System.out.println("Dentro do catch.");
            e.printStackTrace();
        } finally{ //Finally sempre será executado, até mesmo no caso de haver um retorno antes dele.
            System.out.println("Fechando arquivo.");
        }
    }
}
