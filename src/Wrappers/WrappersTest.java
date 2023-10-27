package Wrappers;

public class WrappersTest {
    public static void main(String[] args) {
        byte byteprimitivo = 1;
        short shortprimitivo = 1;
        int intprimitivo = 1;
        long longprimitivo = 1;
        float floatprimitivo = 1;
        double doubleprimitivo = 1;
        char charprimitivo = 'a';
        boolean booleanprimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1;
        Long longWrapper = 1L;
        Float floatWrapper = 1F;
        Double doubleWrapper = 1D;
        Character chatWrapper = 'a';
        Boolean booleanWrapper = true;
        //Todos os wrappers, exceto o character, quando colocados como argumento uma String, converte automaticamente
        //para seu tipo.

        int i = intWrapper;
        String valor = "10";
        Float f = Float.parseFloat(valor);

        Character.isDigit('7'); //Verifica se é um dígito.
        Character.isLetter('7'); //Verifica se é uma letra.

    }
}
