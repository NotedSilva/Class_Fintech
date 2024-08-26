import java.util.Date;

public class Transacao {
    private String idTransacao;
    private double valor;
    private String tipoTransacao;
    private String contaOrigem;
    private String contaDestino;
    private Date dataTransacao;

    public Transacao(String idTransacao, double valor, String tipoTransacao, String contaOrigem, String contaDestino, Date dataTransacao) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.dataTransacao = new Date();
    }

    public void realizaDeposito(double valor) {
        System.out.println("Realizando deposito: " + valor);
    }

    public void realizaSaque(double valor) {
        System.out.println("Realizando saque: " + valor);
    }

    public void realizarTransferencia(double valor) {
        System.out.println("Transferencia realizada com sucesso. No valor: " + valor + " de " + contaOrigem + " para " + contaDestino);
    }



    public void detalhesTransacao() {
        System.out.println("Detalhes da transação:");
        System.out.println("Id: " + idTransacao);
        System.out.println("Valor: " + valor);
        System.out.println("Tipo: " + tipoTransacao);
        System.out.println("Conta origem: " + contaOrigem);
        System.out.println("Conta destino: " + contaDestino);
        System.out.println("Data: " + dataTransacao);
    }

}
