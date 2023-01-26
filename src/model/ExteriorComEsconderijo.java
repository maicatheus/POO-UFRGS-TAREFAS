package src.model;

public class ExteriorComEsconderijo extends Exterior implements IEsconderijo {
    public String esconderijo;

    public ExteriorComEsconderijo(String nome, Boolean quente, String esconderijo) {
        super(nome, quente);
        this.esconderijo = esconderijo;
    }

    public String getNomeEsconderijo() {
        return this.esconderijo;
    }
}
