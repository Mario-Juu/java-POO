package Strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Mario";
         StringBuilder sb = new StringBuilder(nome);
        sb.append(" Junior");
        System.out.println(sb); //StringBuilder não cria um novo objeto, ele apenas modifica o objeto já existente na
        // String Pool, por isso é mais rápido.
        //System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2)); //Assim como o substring, o delete começa do índice 0 no start, porém
        //o end é exclusivo (então se deleta end-1), ou seja, ele não deleta o índice 2, apenas o 0 e o 1.
        System.out.println(sb.insert(2,"##")); //Insere na posição 2 o que está entre aspas (começa do 1 e adiciona, não substitui).
    }
}
