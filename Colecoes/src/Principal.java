import java.awt.image.ImageProducer;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //Lista
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João"); //add - adiciona
        funcionarios.add("Maria");
        funcionarios.add("João"); //Aceita nomes repetidos
        System.out.println(funcionarios.get(1)); //.get() - pega a posição

        //Set
        Set<String> produtos = new HashSet<>();
        produtos.add("Água"); //add - adiciona
        produtos.add("Coca-Cola");
        produtos.add("Água"); //Não aceita repetidos, ira mostrar apenas uma vez a "Água"
        System.out.println(produtos);

        //Map
        Map<Integer, String> clientes = new HashMap<>(); //Em coleçoes usamos o tipo wrapper (Integer e afins)
        clientes.put(1, "Maria"); // put- adiciona
        clientes.put(2, "Marcos"); // Não acessa o conteudo pelo índice, e sim pelo número chave
        clientes.put(1, "Ana"); // Se tiver o mesmo número ira subscrever, e valerá o ultimo declarado
        System.out.println(clientes);
    }
}
