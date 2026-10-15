package Sistema_de_Gestão_de_Projetos_Tarefas.dominio.FuncionariosGerentes;

public abstract class Colaborador {
    private String nome;
    private String email;
    private double salarioBase;

    public Colaborador(String nome, String email, double salarioBase){
        this.nome = nome;
        this.email= email;
        this.salarioBase= salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


}
