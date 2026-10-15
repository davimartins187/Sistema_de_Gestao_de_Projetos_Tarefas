package Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes;

import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.Tarefa;

public class Funcionario extends Colaborador {
    private Tarefa[] tarefas;

    public Funcionario(String nome, String email, double salarioBase){
        super(nome, email,salarioBase);
    }

    public Funcionario(String nome, String email, double salarioBase, Tarefa[] tarefas){
        super(nome, email, salarioBase);
        this.tarefas = tarefas;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}
