package src.model;

public class FuncionarioProducao extends Funcionario{
    private Integer pecasProduzidas;
    private Double salarioFixo;

    public FuncionarioProducao(String nome, Integer numeroCarteiraTrabalho, Double salarioFixo,Integer pecasProduzidas ) {
        super(nome, numeroCarteiraTrabalho);
        this.pecasProduzidas = pecasProduzidas;
        this.salarioFixo = salarioFixo;
    }

    public Integer getPecasProduzidas() {
        return pecasProduzidas;
    }

    public Double getSalarioFixo() {
        return this.salarioFixo;
    }

    public void setPecasProduzidas(Integer pecasProduzidas) {
        this.pecasProduzidas = pecasProduzidas;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double calcularSalario(){
        Double percentualProducao = (double) ((pecasProduzidas - 1000)/1000);
        return this.getSalarioFixo() + percentualProducao * this.getSalarioFixo();
    }

    public void display(){
        System.out.println("Funcionário Produção");
        super.display();
        System.out.println("Salário: " + this.calcularSalario());
        System.out.println("Quantidade de Peças Produzidas: " + this.getPecasProduzidas());
        System.out.println("");
    }

}
