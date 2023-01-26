package src.model;

public class Funcionario {
    protected String nome;
    protected Integer numeroCarteiraTrabalho;
    protected Double salario;
    public Funcionario() {
    }

    public Funcionario(String nome, Integer numeroCarteiraTrabalho) {
        this.nome = nome;
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroCarteiraTrabalho(Integer numeroCarteiraTrabalho) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    protected Double calcularSalario(Double salario){
        return salario;
    }

    public void display(){
        System.out.println(
                "Nome: " + this.nome + "\n" +
                "Carteira deTrabalho: "  + this.numeroCarteiraTrabalho
//                "Salário: " + this.salario
        );
    }
}
