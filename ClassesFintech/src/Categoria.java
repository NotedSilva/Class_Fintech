public class Categoria {
    private String nome;
    private String descricao;

    public Categoria() {}

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Adicionar uma nova categoria
    public void adicionarCategoria() {
        System.out.println("Adicionando categoria: " + nome);
    }

    // Exibir informações da categoria
    public void exibirInfoCategoria() {
        System.out.println("Exibindo informações da categoria: " + nome);
    }
}
