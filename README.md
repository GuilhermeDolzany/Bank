# Sistema Bancario em Java

Um aplicativo de linha de comando (CLI) desenvolvido em Java que simula as operacoes basicas de uma conta bancaria. Este projeto foi criado com o objetivo de aplicar e consolidar conceitos fundamentais de Programacao Orientada a Objetos (POO).

## Funcionalidades

O sistema apresenta um menu interativo que permite ao usuario realizar as seguintes operacoes:
* Abertura de conta com definicao de Agencia, Conta e Titular.
* Consulta de saldo em tempo real.
* Depositos com validacao de valores (apenas valores positivos).
* Saques com validacao de saldo disponivel.
* Tratamento de erros para entradas invalidas (como digitar letras em vez de numeros).

## Tecnologias e Conceitos Aplicados

* Linguagem: Java
* Paradigmas: Programacao Orientada a Objetos (POO)
* Conceitos em destaque:
  * Encapsulamento (Modificadores de acesso restritos e metodos Getters/Setters).
  * Variaveis de Instancia vs. Variaveis Estaticas (Uso do modificador static).
  * Validacao de estado interno da aplicacao.
  * Estruturas de repeticao e controle (while, switch-case).
  * Tratamento de Excecoes (try-catch) utilizando a classe Scanner.

## Estrutura do Projeto

O projeto esta dividido em duas classes principais, respeitando o principio da separacao de responsabilidades:

* `Account.java`: Representa a entidade da conta bancaria. Contem os dados do cliente (agencia, conta, nome, saldo) de forma privada e possui a logica de negocios (regras para sacar e depositar).
* `App.java`: E a interface do aplicativo. Contem o metodo principal (`main`), gerencia as entradas do usuario atraves do terminal e exibe as mensagens de retorno.

## Como Executar

Para rodar este projeto localmente, voce precisa ter o Java Development Kit (JDK) instalado na sua maquina.

1. Clone este repositorio:
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git

2. Acesse o diretorio do projeto onde os arquivos .java estao localizados:
   cd src/com/guilhermedolzany/bank

3. Compile os arquivos Java:
   javac App.java Account.java

4. Execute o aplicativo:
   java App
