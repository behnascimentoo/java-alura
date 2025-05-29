import java.util.Random;
import java.util.Scanner;

public class Codigo {
    //Variaveis
    static Scanner teclado = new Scanner(System.in);

    //Metodos
    public static void cabecalho() {
        System.out.println("-=-=-=-=-=-=-==-=-=-=-=-=");
        System.out.println("     JOGO ADVINHAÇÃO     ");
        System.out.println("-=-=-=-=-=-=-==-=-=-=-=-=");
        System.out.println("Computador diz: Advinhe o número que eu pensei!");
        System.out.println("-----------------------------------------------");

    }


static int tentativas = 0;

    public static void jogo() {

        while (tentativas < 6) {
            Random numAleatorio = new Random(); // gera um número aleatorio
            int computador = numAleatorio.nextInt(5) + 1; //pega um numero aleatorio de 1 a 5
            int jogador = 0; // jogador começa com 0

            while (jogador < 1 || jogador > 5) { // enquando o numero for menor ou maior doq esperado faça
                System.out.print(">>Numero Invalido<< \nApenas números entre 1 e 5: ");
                jogador = teclado.nextInt();
            }

            for (int i = 1; i < 6; i--) {
                System.out.print("Digite o seu palpite [1 ate 5]: ");
                jogador = teclado.nextInt(); //jogador tenta adivinhar

                if (jogador == computador) {
                    System.out.print("Você acertou! com " + tentativas + " O número era " + computador);
                    break;
                } else if (jogador != computador) {
                    System.out.println("Você errou, mas ainte tem " + i + " tentativas");
                } else {
                    System.out.println("Tentativas esgotadas! O número era " + computador);
                }
            }
            }
    }
}

