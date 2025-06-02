import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now(); //pega a data atual
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        //Verifica se a data da parcela esta na data atual
        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Hoje é o dia de vencimento");
        } else {
            System.out.println("Ainda não está no vencimento");
        }

        //formata para a data brasileira
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + dataCompra.format(formato));

        //Pega a data do brasil
        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra: " + dataConclusaoCompra);
        //Pega outro fuso horario
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra NY: " + dataCompraNy);

        //Variaveis horas
        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim = LocalTime.of(17,30);

        //Pega a duração entre essas horas/minutos
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");

        //Pega a duração entre meses/dias
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em meses: " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    }

}
