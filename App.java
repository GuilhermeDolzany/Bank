package com.guilhermedolzany.bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   BEM-VINDO AO SISTEMA BANCÁRIO");
        System.out.println("==================================");
        System.out.println("Para começar, vamos abrir a sua conta.\n");

        System.out.print("Digite o número da Agência: ");
        String ag = scanner.nextLine();

        System.out.print("Digite o número da Conta: ");
        String cc = scanner.nextLine();

        System.out.print("Digite o nome do Titular: ");
        String name = scanner.nextLine();

        Account account = new Account(ag, cc, name);

        System.out.println("\n----------------------------------");
        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + account.getName());
        System.out.println("Agência: " + account.getAg() + " | Conta: " + account.getCc());
        System.out.println("----------------------------------");

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.printf("-> Saldo atual: R$ %.2f\n", account.getBalance());
                    break;

                case "2":
                    System.out.print("Valor do depósito: R$ ");
                    try {
                        // Converte o texto digitado em número decimal
                        double valorDep = Double.parseDouble(scanner.nextLine());
                        if (account.deposit(valorDep)) {
                            System.out.println("-> Depósito realizado com sucesso!");
                        } else {
                            System.out.println("-> ERRO: Valor deve ser maior que zero.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("-> ERRO: Por favor, digite apenas números válidos (ex: 50.50).");
                    }
                    break;

                case "3":
                    System.out.print("Valor do saque: R$ ");
                    try {
                        double valorSaque = Double.parseDouble(scanner.nextLine());
                        if (account.withDraw(valorSaque)) {
                            System.out.println("-> Saque realizado! Retire o seu dinheiro.");
                        } else {
                            System.out.println("-> ERRO: Saldo insuficiente ou valor inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("-> ERRO: Por favor, digite apenas números válidos.");
                    }
                    break;

                case "4":
                    System.out.println("-> Encerrando o sistema. Até logo!");
                    rodando = false;
                    break;

                default:
                    System.out.println("-> Opção inválida. Digite um número de 1 a 4.");
            }
        }

        scanner.close();
    }
}