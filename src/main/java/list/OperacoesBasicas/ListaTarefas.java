package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String decricao){
        tarefaList.removeIf(tarefa -> tarefa.descricao.equalsIgnoreCase(decricao));

    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        for (Tarefa tarefa :tarefaList){
            System.out.println(tarefa.descricao);
        }
    }


}
