package Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas;

import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Funcionario;

public class Tarefa {
    private String descricacao;
    private int prazo;
    private Projeto projeto;
    private Funcionario funcionario;
    private StatusTarefa statusTarefa;

    public Tarefa(String descricacao, int prazo, StatusTarefa statusTarefa, Funcionario funcionario, Projeto projeto){
        this.descricacao = descricacao;
        this.prazo = prazo;
        this.statusTarefa = statusTarefa;
        this.funcionario = funcionario;
        this.projeto = projeto;
    }

    public void imprime(){
        System.out.println("=== Tarefa do funcionario " + funcionario.getNome());
        System.out.println("Projeto: " + projeto.getTitulo());
        System.out.println("Descricao: " + getDescricacao());
        System.out.println("Prazo: " + getPrazo());
        System.out.println("Estatus: " + getStatusTarefa());
    }

    public String getDescricacao() {
        return descricacao;
    }

    public int getPrazo() {
        return prazo;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public StatusTarefa getStatusTarefa() {
        return statusTarefa;
    }
}
