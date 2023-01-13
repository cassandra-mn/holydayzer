import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Calendário de feriados!");
        System.out.println();

        Feriados feriados = new Feriados();
        feriados.addFeriado("01/01/2023", "Confraternização mundial");
        feriados.addFeriado("21/02/2023", "Carnaval");
        feriados.addFeriado("17/04/2023", "Páscoa");
        feriados.addFeriado("21/04/2023", "Tiradentes");
        feriados.addFeriado("01/05/2023", "Dia do trabalho");
        feriados.addFeriado("08/06/2023", "Corpus Christi");
        feriados.addFeriado("07/09/2023", "Independência do Brasil");
        feriados.addFeriado("12/10/2023", "Nossa Senhora Aparecida");
        feriados.addFeriado("02/11/2023", "Finados");
        feriados.addFeriado("15/11/2023", "Proclamação da República");
        feriados.addFeriado("25/12/2023", "Natal");

        System.out.println("Qual data você deseja verificar? Digite no formato DD/MM/YYYY");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        System.out.println(feriados.isFeriado(data));
        System.out.println();
        
        System.out.println("Aqui estão todos os feriados do ano:");
        feriados.getFeriados();
    }
}
