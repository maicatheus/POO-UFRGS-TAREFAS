package src.model;

public class FuncionarioComissionado extends Funcionario {
    private Integer percentualComissao;
    private Double valorVenda;

    public FuncionarioComissionado(String nome, Integer numeroCarteiraTrabalho, Integer percentualComissao, Double valorVenda) {
        super(nome, numeroCarteiraTrabalho);
        this.percentualComissao = percentualComissao;
        this.valorVenda = valorVenda;
    }

    public Integer getPercentualComissao() {
        return percentualComissao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setPercentualComissao(Integer percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setValorVendar(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double calcularSalario() {
        return this.valorVenda * this.percentualComissao;
    }

    public void display(){
        System.out.println("Funcionário Comissionado");
        super.display();
        System.out.println("Porcentagem de Vendas: " + this.getPercentualComissao() + "%");
        System.out.println("Valor de Vendas: " + this.getValorVenda());
        System.out.println("");
    }

}
