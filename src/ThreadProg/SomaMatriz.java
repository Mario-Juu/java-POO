package ThreadProg;

public class SomaMatriz extends Thread {
    private String nome;
    private int [][] matriz;
    private int linhaMatriz;

    public SomaMatriz(String nome, int[][] matriz, int linhaMatriz){
        this.nome = nome;
        this.matriz = matriz;
        this.linhaMatriz = linhaMatriz;
        start();
    }
    public void run(){
        int sum = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            sum += matriz[linhaMatriz][i];
        }
        System.out.println("Soma da linha " + linhaMatriz + " da " + this.nome + " = "  + sum);
        }
}
