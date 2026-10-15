package Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas;

public enum StatusTarefa {
    PENDENTE(1, "Pendente"),
    CONCLUIDO(2, "Concluída");

    int id;
    String descricao;

    StatusTarefa(int id, String descricao){
       this.id = id;
       this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
