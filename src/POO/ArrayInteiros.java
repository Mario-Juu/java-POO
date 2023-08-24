package POO;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayInteiros {
    //Atributos da classe
    Scanner s = new Scanner(System.in);
    private int tamanhoArray;
    private int [] array;

    //Método construtor
    public ArrayInteiros(int tamanhoArray){
        if(tamanhoArray > 0){
            this.tamanhoArray = tamanhoArray;
            this.array = new int[tamanhoArray];
        }
    }

    //Método para preencher o array
    public void preencherArray(){
        for (int i = 0; i < array.length; i++) {
               array[i] = s.nextInt();
        }
    }

    //Método para imprimir o array
    public String imprimirArray(){
        StringBuilder arrayCompleto = new StringBuilder();
        for (int i = 0; i < array.length-1; i++) {
            arrayCompleto.append(array[i]).append(", ");
        }
        return arrayCompleto.toString() + array[array.length-1];
    }

    //Método para ver se algum valor existe no array
    public boolean existeNoArray(int valor){
        for (int j : array) {
            if (j == valor)
                return true;
        }
        return false;
    }

    //Método para conferir qual o maior valor do array
    public void maiorValor(){
        int maiorValor = array[0];
        int posicao = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] > maiorValor){
            maiorValor = array[i];
            posicao = i;}
        }
        System.out.println("O maior valor é " + maiorValor + " que está na posição de índice: " + posicao);
    }


    //Método para conferir a frequência absoluta
    public void frequenciaAbsoluta() {
        int[] frequencyArray = new int[101];
        for (int value : array) {
            if (value >= 0 && value <= 100) {
                frequencyArray[value]++;
            }
        }
        System.out.println("valor   frequência absoluta");
        for (int i = 0; i <= 100; i++) {
            System.out.printf("%-7d %d%n", i, frequencyArray[i]);
        }
    }

    //Ordenar o array por meio da classe Arrays
    public void ordenarArray(){
         Arrays.sort(array);
    }

    public static void main(String[] args) {
        ArrayInteiros array = new ArrayInteiros(4);
        array.preencherArray();
        System.out.println(array.imprimirArray());
        array.ordenarArray();
        System.out.println(array.imprimirArray());
        array.frequenciaAbsoluta();
        array.maiorValor();
    }

}
