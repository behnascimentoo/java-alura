import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"};
        double[] vendas = {4000.00, 8000.0, 12000.00, 5000.00};

        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("%s - comissão %.2f");
        }

        System.out.println("\nTestando o While");
        int j = 0;
        boolean imprimeOutro = true;
        Scanner leitura = new Scanner(System.in);

        while (imprimeOutro) {
            System.out.println("%s - comissão %.2f");
            j++;
            System.out.println("Deseja imprimir outro? ");
            imprimeOutro = leitura.nextBoolean();
        }

        //do while
        do {
            System.out.println("do while");
            j++;
            System.out.println("Deseja imprimir outro? ");
            imprimeOutro = leitura.nextBoolean();
        } while (imprimeOutro);

        //for eath
        for  (String nomeVendedor: vendedores) {
            System.out.println("Nome: " + nomeVendedor);
        }
    }
}
