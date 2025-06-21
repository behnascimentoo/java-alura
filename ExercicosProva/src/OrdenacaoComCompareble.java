import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoComCompareble implements Comparable<OrdenacaoComCompareble>{
    String titulo;

    public OrdenacaoComCompareble(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(OrdenacaoComCompareble outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }

    public static void main(String[] args) {
        List<OrdenacaoComCompareble> tarefas = new ArrayList<>();
        tarefas.add(new OrdenacaoComCompareble("Estudar"));
        tarefas.add(new OrdenacaoComCompareble("Almoçar"));
        tarefas.add(new OrdenacaoComCompareble("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}
