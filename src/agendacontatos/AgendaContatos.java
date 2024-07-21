package agendacontatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agenda;

    public AgendaContatos(){
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(this.agenda.containsKey(nome)){
            this.agenda.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(this.agenda);
    }

    public Integer pesquisarPorNome(String nome){
        if(this.agenda.containsKey(nome)){
            return this.agenda.get(nome);
        }

        return null;
    }

}
