package TryCatch.customException;

public class loginInvalidoException extends Exception{
    public loginInvalidoException(){
        super("Usuário ou senha inválidos.");
    }
}
