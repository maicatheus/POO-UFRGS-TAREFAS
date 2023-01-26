package src.model;

public class ComodoComEsconderijo extends Comodo implements IEsconderijo {
    public String esconderijo;

    public ComodoComEsconderijo(String nome, String decoracao, String esconderijo) {
        super(nome, decoracao);
        this.esconderijo = esconderijo;
    }

    public String getNomeEsconderijo() {
        return this.esconderijo;
    }
}