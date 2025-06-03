import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        //Filter - Filtra todos os funcionarios que começam com a letra A
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");
        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A")).toList();
        System.out.println(funcionariosLetraA);

        //Map - Faz uma conta
        //Collect - Coleta e coloca dentro da lista
        List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
        List<Double> comissao = valorVendas.stream().map(v -> v * 0.05)
                .collect(Collectors.toList());
        System.out.println(comissao);

        //Reduce - Soma todos os valores que estão na lista
        double totalVendas = valorVendas.stream().reduce(0.0, Double::sum); //0.0 - é o valor inicial que começa a soma
        System.out.println("Total vendas: " + totalVendas);

    }
}
