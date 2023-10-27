package TryCatch;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    private static void divisao(double num1, double num2){
        if(num2 == 0){
            throw new IllegalArgumentException("O divisor não pode ser 0.");
        }
        double result = num1/num2;
        System.out.println(result);
    }
}
