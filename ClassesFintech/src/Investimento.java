
public abstract class Investimento {
            private String idInvestimento;
            private String nomeInvestimento;
            private double valorInvestido;
            private double valorAtual;
            private double taxaRetornoEsperada; // Taxa de retorno esperada

            public Investimento(String idInvestimento, String nomeInvestimento, double valorInvestido, double taxaRetornoEsperada) {
                this.idInvestimento = idInvestimento;
                this.nomeInvestimento = nomeInvestimento;
                this.valorInvestido = valorInvestido;
                this.taxaRetornoEsperada = taxaRetornoEsperada;
                this.valorAtual = valorInvestido; // Inicialmente, o valor atual é o valor investido
            }

            // Métodos de acesso
            public String getIdInvestimento() {
                return idInvestimento;
            }
            public String getNomeInvestimento() {
                return nomeInvestimento;
            }
            public double getValorInvestido() {
                return valorInvestido;
            }
            public double getValorAtual() {
                return valorAtual;
            }
            public double getTaxaRetornoEsperada() {
                return taxaRetornoEsperada;
            }
            // Metodo para calcular o retorno do investimento, deve ser implementado pelas subclasses
            public abstract void calcularValorAtual();

            @Override
            public String toString() {
                return "Investimento{" +
                        "idInvestimento='" + idInvestimento + '\'' +
                        ", nomeInvestimento='" + nomeInvestimento + '\'' +
                        ", valorInvestido=" + valorInvestido +
                        ", valorAtual=" + valorAtual +
                        ", taxaRetornoEsperada=" + taxaRetornoEsperada +
                        '}';
            }
    }
