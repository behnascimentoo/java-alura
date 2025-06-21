public class ConstrucaoClassesEMetodos {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponivel";
        }
        return "Disponivel";
    }

    public static void main(String[] args) {
        ConstrucaoClassesEMetodos l = new ConstrucaoClassesEMetodos();
        l.titulo = "Java para Iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}
