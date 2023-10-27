package TryCatch;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {

    }

    public static void lerArquivoNew(){
        try (Reader reader = new BufferedReader(new FileReader("text.txt"))){ //O try with resources fecha o reader automaticamente.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }        public static void lerArquivoOld(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
