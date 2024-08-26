public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String cpf, String email, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void detalhesCliente() {
        System.out.println("Detalhes geral do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereco: " + endereco);
    }

    public void criarConta() {
        System.out.println("Criação de conta!");
    }

    public void consultarSaldo() {
        System.out.println("Consultar o saldo!");
    }

}
