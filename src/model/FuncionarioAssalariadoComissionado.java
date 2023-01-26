package src.model;

public class FuncionarioAssalariadoComissionado extends Funcionario {
    private Double salarioBase;
    private Integer percentualComissao;
    private Double valorVenda;

    public FuncionarioAssalariadoComissionado(String nome, Integer numeroCarteiraTrabalho, Double salarioBase, Integer percentualComissao, Double valorVenda) {
        super(nome, numeroCarteiraTrabalho);
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
        this.valorVenda = valorVenda;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Integer getPercentualComissao() {
        return percentualComissao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double calcularSalario(){
        return this.salarioBase * (1 + this.getPercentualComissao());
    }

    public void setPercentualComissao(Integer percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void display(){
        System.out.println("Funcionário Salário Base + Comissão");
        super.display();
        System.out.println("Porcentagem de Vendas: " + this.getPercentualComissao() + "%");
        System.out.println("Valor de Vendas: " + this.getValorVenda());
        System.out.println("");
    }
}
