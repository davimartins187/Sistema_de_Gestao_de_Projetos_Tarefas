package Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas;

import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Gerente;

import java.util.Arrays;

public class Projeto{
    private String titulo;
    private Gerente gerente;
    private Tarefa[] tarefas;

    public Projeto(String titulo, Gerente gerente){
        this.titulo = titulo;
        this.gerente = gerente;
    }

    public Projeto(String titulo, Gerente gerente, Tarefa[] tarefas){
        this.titulo = titulo;
        this.gerente = gerente;
        this.tarefas = tarefas;
    }

    public void imprime(){
        if(this.tarefas == null){
            return;
        }

        System.out.println("=== TAREFAS DO PROJETO ===");
        for (int i = 0; i < this.tarefas.length; i++) {
            System.out.println("Tarefa " + i + ":" + this.tarefas[i].getDescricacao());
            System.out.println("Prazo " + i + ":" + this.tarefas[i].getPrazo());
            System.out.println("Estatus " + i + ":" + this.tarefas[i].getStatusTarefa());
            System.out.println("================================");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Projeto{" + "tarefas=" + Arrays.toString(tarefas) + '}';
    }
}
