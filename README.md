# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Incrementos na minha versão

Foi implementado um extrato completo com todas as transações feitas e informações relevantes sobre ela no seguinte formato:

**(*ID da transação*) *Descrição* para *Nome da pessoa*(*Tipo de conta*) em *Data e hora***

Exemplos:
```
(0001) Deposito de R$ 100.0 em 23/05/2022 00:00
(0002) Saque de R$ 100.0 em 23/05/2022 00:00
(0003) Transferencia de R$ 100,00 para Venilton(Poupanca) em 23/05/2022 00:00
```

Foi adicionada uma classe chamada Transação, para facilitar a exibição do extrato e modularizar o código. Também foi inserido o campo CPF em cliente, visto que geralmente é um dado importante.
