package ThreadProg;

public class SomaMatriz extends Thread {
    //Declaração dos atributos
    private String nome;
    private int [][] matriz;
    private int linhaMatriz;

    //Construtor da classe
    public SomaMatriz(String nome, int[][] matriz, int linhaMatriz){
        this.nome = nome;
        this.matriz = matriz;
        this.linhaMatriz = linhaMatriz;
        start();
    }
    public void run(){
        //Registra a variável de apoio para a soma
        int sum = 0;
        //Soma todos os valores da linha da matriz
        for (int i = 0; i < matriz[0].length; i++) {
            sum += matriz[linhaMatriz][i];
        }
        //Imprime a soma da linha, qual a linha e qual a thread dedicada
        System.out.println("Soma da linha " + linhaMatriz + " da " + this.nome + " = "  + sum);
        }
}
