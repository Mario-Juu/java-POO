package TryCatch.customException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar("Mario", "121");
        } catch (loginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar(String usuarioDigitado, String senhaDigitada) throws loginInvalidoException{
        String usuario = "Mario";
        String senha = "123";
        if(usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)){
            System.out.println("Usuário logado.");
    } else {
            throw new loginInvalidoException();
        }
    }
}
