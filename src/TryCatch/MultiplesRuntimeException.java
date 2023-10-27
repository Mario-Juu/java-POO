package TryCatch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplesRuntimeException {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try{
            maybeThrowException();
        } catch (Exception e)  { //Captura as exceções necessárias e lançadas pelo método, não todas.
            e.printStackTrace();
        }
    }
    public static void maybeThrowException() throws SQLException, FileNotFoundException {
    }
}
