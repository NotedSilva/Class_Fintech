
import java.util.Scanner;

public class Login {
    private String cpf;
    private String senhaDeSeisDigitos;
    private String nomeDoUsuario;


    public void loginSimples() {
        System.out.println("Bem-vindo a nossa Fintech." + nomeDoUsuario);
    }

    public static void main(String[] args) {
        boolean constaNoSistema = true; //Irei usar essa variavel futuramente para confirmar se uma conta consta no sistema

        System.out.println("Bem vindo! Faça login ou cadastro inserindo seu CPF");
        Scanner scanner = new Scanner(System.in);

        String cpf = scanner.nextLine();

        System.out.println(String.format("O Cpf %s está correto?", cpf));
        if (constaNoSistema){
            System.out.println("Verificamos que já possuí uma conta conosco. Siga para o login");
            System.out.println("Digite sua senha");
            Scanner scanner1 = new Scanner(System.in);
            int senhaDeSeisDigitos = scanner1.nextInt();
            System.out.println("Login efetuado com sucesso!");
        }
        scanner.close();
    }

}
