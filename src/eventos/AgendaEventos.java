package eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        this.eventos.put(data, new Evento(nome, atracao));
    }
}
