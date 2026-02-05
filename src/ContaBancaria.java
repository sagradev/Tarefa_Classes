public class ContaBancaria {

    //Nome do titular
    private String titular;

    //Número da conta
    private String numeroConta;

    //Saldo atual
    private double saldo;

    //Tipo de conta (corrente, poupança)
    private String tipoConta;

    // Status da conta (ativa/inativa)
    private boolean ativa;

    // O construtor para criar uma nova conta
    public ContaBancaria(String titular, String numeroConta, String tipoConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = 0.0; // todas as contas começam com saldo zerado
        this.ativa = true; // conta começa ativa

        // -----------------------------
        // MÉTODOS
        // -----------------------------
    }
        public void depositar (double valor){
            if (ativa) {
                if (valor > 0) {
                    saldo += valor; // adiciona o saldo
                    System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
                } else {
                    System.out.println("Valor de depósito inválido.");
                }
            } else {
                System.out.println("Conta inativa. Não é possível realizar depósitos.");
            }

        }

        public void sacar ( double valor){
            if (ativa) {
                if (valor > 0 && valor <= saldo) {
                    saldo -= valor; // retida do saldo
                    System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido para saque.");
                }
            } else {
                System.out.println("Conta inativa. Não é possível realizar saques.");
            }
        }

        // contultar o saldo
        public void consultarSaldo () {
            System.out.println("Saldo atual: R$" + saldo);
        }

        // ativar a conta
        public void ativarConta () {
            ativa = true;
            System.out.println("Conta ativada com sucesso.");
        }

        // desativar a conta
        public void desativarConta () {
            ativa = false;
            System.out.println("Conta desativada com sucesso.");
        }
        public void exibirInformacoes () {
            System.out.println("Titular: " + titular);
            System.out.println("Número da Conta: " + numeroConta);
            System.out.println("Tipo de Conta: " + tipoConta);
            System.out.println("Saldo: R$" + saldo);
            System.out.println("Status da Conta: " + (ativa ? "Ativa" : "Inativa"));
        }
}
