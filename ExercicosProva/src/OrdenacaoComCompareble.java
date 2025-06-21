import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoComCompareble{
    String titulo;

    public OrdenacaoComCompareble(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(OrdenacaoComCompareble outra) {
        return this.titulo.compareTo(outra.titulo);
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
