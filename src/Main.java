public class Main {
    public static void main(String[] args) {
        // Criar uma nova conta bancária
        ContaBancaria minhaConta = new ContaBancaria("Gustavo", "4361-7", "Corrente");

        // Exibir informações da conta
        minhaConta.exibirInformacoes();

        // Depositar dinheiro
        minhaConta.depositar(500.0);

        // Consultar saldo
        minhaConta.consultarSaldo();

        // Sacar dinheiro
        minhaConta.sacar(200.0);

        // Consultar saldo novamente
        minhaConta.consultarSaldo();

        // Desativar a conta
        minhaConta.desativarConta();

        // Tentar sacar dinheiro de uma conta inativa
        minhaConta.sacar(100.0);

        // Ativar a conta novamente
        minhaConta.ativarConta();

        // Sacar dinheiro após reativar a conta
        minhaConta.sacar(100.0);

        // Consultar saldo final
        minhaConta.consultarSaldo();
    }
}