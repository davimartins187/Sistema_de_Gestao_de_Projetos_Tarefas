#  Sistema de Gestão de Projetos e Tarefas em Java

> Um sistema desenvolvido em Java para praticar e aplicar conceitos avançados de **Programação Orientada a Objetos (POO)** e separação de responsabilidades.

---

##  Estrutura do Projeto

O projeto segue uma arquitetura limpa dividida em três pacotes principais:

* 📦 **`dominio`**: Entidades de negócio (`Colaborador`, `Funcionario`, `Gerente`, `Projeto`, `Tarefa`, `StatusTarefa`).
* ⚙️ **`servico`**: Lojas de regras de negócio e geração de relatórios polimórficos (`Relatorio`).
* 🧪 **`test`**: Classe principal (`SistemaTest01`) para inicialização e testes manuais.

---

##  Conceitos Aplicados

* **Herança e Classes Abstratas** (`Colaborador` como base para `Funcionario` e `Gerente`).
* **Polimorfismo e `instanceof`** para tratamento dinâmico de objetos.
* **Interfaces** para contratos de comportamento.
* **Enumerações (Enums)** customizadas com construtores (`StatusTarefa`).
* **Associações Bidirecionais** entre colaboradores, projetos e tarefas.

---

##  Como Executar

1. Clone este repositório na sua máquina.
2. Abra a pasta do projeto na sua IDE favorita (IntelliJ IDEA, Eclipse, etc.).
3. Navegue até a classe `SistemaTest01.java` (no pacote `desafioJavaPOO.test`).
4. Execute o método `main` para ver os relatórios gerados no console.

---