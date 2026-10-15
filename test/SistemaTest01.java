package Sistema_de_Gestão_de_Projetos_Tarefas.test;

import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Funcionario;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Gerente;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.Projeto;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.StatusTarefa;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.Tarefa;
import Sistema_de_Gestão_de_Projetos_Tarefas.servico.RelatorioColaborador;

public class SistemaTest01 {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Davi", "daviestuda10@gmail.com", 5000, 0.20);
        Funcionario funcionario1 = new Funcionario("Davi", "daviestuda10@gmail.com", 2000);

        Projeto projeto1 = new Projeto("Analisar se o codigo funciona", gerente1);
        Tarefa tarefa1 = new Tarefa("Ver se o codigo funciona", 15, StatusTarefa.PENDENTE, funcionario1, projeto1);


        Projeto[] projetos = {projeto1};
        gerente1.setProjetos(projetos);

        Tarefa[] tarefas = {tarefa1};
        funcionario1.setTarefas(tarefas);

        System.out.println("--- TESTANDO RELATÓRIO DO GERENTE ---");
        RelatorioColaborador.imprimeProjeto(gerente1);

        System.out.println("\n--- TESTANDO RELATÓRIO DO FUNCIONÁRIO ---");
        RelatorioColaborador.imprimeProjeto(funcionario1);
    }
}