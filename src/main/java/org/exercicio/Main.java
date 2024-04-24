package org.exercicio;


import java.util.Scanner;

public class Main {


    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer numero = 0;
        String agencia = "000-0";
        String nome= "Exemplo";
        double saldo = 00.00;
        double deposito = 00.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo!! \n Informe os dados abaixo para continuar a aplicação!\n");
        System.out.println("Qual o seu nome? ");
            nome = scanner.nextLine();
        System.out.println("Informe a agência: " );
        agencia = scanner.nextLine();

        System.out.println("Informe o numero da conta: ");
            numero = scanner.nextInt();

        System.out.println("Informe o valor do deposito: ");
            deposito = scanner.nextDouble();
            saldo = deposito;

    System.out.println("Parabens " + nome + "!!! sua conta de numero: " + numero
                            + " agência: " + agencia +" possui um saldo de: R$"+ saldo +".");
    }
}