package src.model;

public class ExteriorComEsconderijo extends Exterior implements IEsconderijo {
    private String nomeEsconderijo;

    public ExteriorComEsconderijo(String nome, Boolean quente, String esconderijo) {
        super(nome, quente);
        this.nomeEsconderijo = esconderijo;
    }

    public String getNomeEsconderijo() {
        return this.nomeEsconderijo;
    }

    public void setNomeEsconderijo(String nomeEsconderijo) {
        this.nomeEsconderijo = nomeEsconderijo;
    }
}
