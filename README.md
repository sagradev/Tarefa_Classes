📘 Projeto: ContaBancaria em Java

📖 Descrição
Este projeto implementa uma classe ContaBancaria em Java para simular operações básicas de uma conta bancária.
O objetivo é praticar conceitos de Programação Orientada a Objetos (POO), como atributos, métodos, encapsulamento e regras de negócio.

🏦 Estrutura da Classe
Atributos
titular → Nome do dono da conta

numeroConta → Identificador único da conta

saldo → Valor atual disponível

tipoConta → Tipo da conta (corrente, poupança, etc.)

ativa → Status da conta (ativa ou bloqueada)

Métodos
depositar(valor) → Adiciona dinheiro ao saldo (se a conta estiver ativa e valor válido)

sacar(valor) → Retira dinheiro do saldo (se houver saldo suficiente e conta ativa)

consultarSaldo() → Exibe o saldo atual

ativarConta() → Reativa a conta bloqueada

bloquearConta() → Bloqueia a conta

exibirInformacoes() → Mostra os dados principais da conta

🧪 Classe de Teste
A classe TesteContaBancaria demonstra o uso da ContaBancaria com exemplos práticos:

Criação de uma conta.

Depósito de valores.

Saques válidos e inválidos.

Bloqueio e reativação da conta.

Exibição das informações finais.

▶️ Como Executar
Compile os arquivos:

bash
javac ContaBancaria.java TesteContaBancaria.java
Execute o programa:

bash
java TesteContaBancaria
📌 Saída Esperada (exemplo simplificado)
Código

=== Informações iniciais da conta ===
Titular: Gustavo
Número da Conta: 4361-7
Tipo de Conta: Corrente
Status: Ativa
Saldo: R$0.0

=== Depósito ===
Depósito de R$500.0 realizado com sucesso.
Saldo atual: R$500.0

=== Saque válido ===
Saque de R$200.0 realizado com sucesso.
Saldo atual: R$300.0

=== Saque inválido (saldo insuficiente) ===
Saldo insuficiente ou valor inválido.

=== Bloqueando a conta ===
Conta bloqueada.

=== Depósito em conta bloqueada ===
Conta bloqueada. Não é possível depositar.

=== Reativando a conta ===
Conta ativada com sucesso.

=== Novo depósito ===
Depósito de R$300.0 realizado com sucesso.
Saldo atual: R$600.0

=== Informações finais da conta ===
Titular: Gustavo
Número da Conta: 4361-7
Tipo de Conta: Corrente
Status: Ativa
Saldo: R$600.0

🎯 Objetivo Didático

Este exercício reforça:

Criação de classes e objetos.

Uso de construtores.

Encapsulamento e validação de regras de negócio.

Simulação de cenários reais com métodos.