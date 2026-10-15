package Sistema_de_Gestão_de_Projetos_Tarefas.servico;

import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Colaborador;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Funcionario;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes.Gerente;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.Projeto;
import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.Tarefa;

public class RelatorioColaborador {
    public static void imprimeProjeto(Colaborador colaborador){
        System.out.println("=== Colaboradores ===");
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("email: " + colaborador.getEmail());
        System.out.println("Salario: " + colaborador.getSalarioBase());

        if (colaborador instanceof Funcionario){
            Funcionario funcionario = (Funcionario) colaborador;

            if (funcionario.getTarefas() == null){
                System.out.println("Não tem nenhuma tarefa atribuida ao funcionario" + funcionario.getNome());
            }
            else{
                for (Tarefa tarefa : funcionario.getTarefas()){
                    tarefa.imprime();
                }
            }
        }

        else{
            Gerente gerente = (Gerente) colaborador;

            if (gerente.getProjetos() == null){
                System.out.println("Não tem nenhum projeto atribuido ao gerente");
            }
            else {
                for (Projeto projeto : gerente.getProjetos()){
                    projeto.imprime();
                }
            }
        }

    }
}
