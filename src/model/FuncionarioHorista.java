package src.model;

public class FuncionarioHorista extends Funcionario{
    private Integer quantidadeHorasTrabalhadas;
    private Double valorPorHora;

    public FuncionarioHorista(String nome, Integer numeroCarteiraTrabalho, Integer quantidadeHorasTrabalhadas, Double valorPorHora) {
        super(nome, numeroCarteiraTrabalho);
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer getQuantidadeHorasTrabalhadas() {
        return quantidadeHorasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setQuantidadeHorasTrabalhadas(Integer quantidadeHorasTrabalhadas) {
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double calcularSalario(){
        return this.valorPorHora*this.quantidadeHorasTrabalhadas;
    }

    public void display(){
        System.out.println("Funcionário Horista");
        super.display();
        System.out.println("Horas Trabalhadas: " + this.getQuantidadeHorasTrabalhadas());
        System.out.println("Valor por hora: " + this.getValorPorHora());
        System.out.println("");
    }
}
