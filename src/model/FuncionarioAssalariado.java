package src.model;

public class FuncionarioAssalariado extends Funcionario{
    private Double salarioFixo;

    public FuncionarioAssalariado(String nome, Integer numeroCarteiraTrabalho, Double salarioFixo) {
        super(nome, numeroCarteiraTrabalho);
        this.salarioFixo = salarioFixo;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double calcularSalario(){
        return this.salarioFixo;
    }

    public void display(){
        System.out.println("Funcionário Assalariado");
        super.display();
        System.out.println("Salário: " + this.calcularSalario());
        System.out.println("");
    }
}
