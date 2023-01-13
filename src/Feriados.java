import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Feriados {
    List<Feriado> feriados = new ArrayList<>();

    public Feriados() {

    }

    public void addFeriado(String data, String feriado) {
        this.feriados.add(new Feriado(data, feriado));
    }

    public String isFeriado(String data) {
        for (Feriado feriado : feriados) {
            if (Objects.equals(feriado.getData(), data)) {
                System.out.println("Encontrei um feriado:");
                return data + " => " + feriado.getFeriado();
            }
        }

        return "Não existe feriado nesta data!";
    }

    public void getFeriados() {
        for (Feriado feriado : feriados) {
            System.out.println(feriado.getData() + " => " + feriado.getFeriado());
        }
    }
}
