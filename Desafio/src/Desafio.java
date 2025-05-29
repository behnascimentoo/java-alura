import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in);
        String nome = "Brenda Guedes";
        String tipoConta = "Corrente";
        double saldo = 14543;

        System.out.println("**************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("**************************");
        System.out.println("\nOperações\n");


        int res = 0;
        while (res != 4) {
            System.out.println("""
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """);
            System.out.print("Digite a opção desejada: ");
            res = teclado.nextInt();
            if (res == 1) {
                System.out.println("\nSeu saldo é de " + saldo + "\n");
            } else if (res == 2) {
                System.out.print("Informe o valor a receber: ");
                double valor = teclado.nextDouble();
                saldo += valor;
                System.out.println("\nSaldo atualizado R$ " + saldo + "\n");
            } else if (res == 3) {
                System.out.print("Quando deseja transferir: ");
                double transferido = teclado.nextDouble();
                if (transferido > saldo) {
                    System.out.println("\nNão ha saldo suficiente para transferencia!\n");
                } else {
                    saldo -= transferido;
                    System.out.println("\nValor " + transferido + " transferido, saldo atual de " + saldo + "\n");
                }
            } else if (res == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
