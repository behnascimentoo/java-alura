import java.util.ArrayList;

public class UsoDeFor {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar java");
        tarefas.add("Fazer exercicios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }
}
