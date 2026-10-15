package Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes;

import Sistema_de_Gestão_de_Projetos_Tarefas.dominio.ProjetosTarefas.Projeto;

public class Gerente extends Colaborador implements InfoGerente{
    private double gratificacao;
    private Projeto[] projetos;

    public Gerente(String nome, String email, double salarioBase, double gratificacao){
        super(nome, email, salarioBase);
        this.gratificacao = gratificacao;
    }

    public Gerente(String nome, String email, double salarioBase, double gratificacao, Projeto[] projetos){
        super(nome, email, salarioBase);
        this.gratificacao = gratificacao;
        this.projetos = projetos;
    }

    public double salarioTotal(){
        return getSalarioBase() + getGratificacao();
    }

    @Override
    public double getGratificacao() {
        return this.gratificacao * getSalarioBase();
    }

    @Override
    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Projeto[] getProjetos() {
        return projetos;
    }

    public void setProjetos(Projeto[] projetos) {
        this.projetos = projetos;
    }
}
