package src.model;

public class ComodoComEsconderijo extends Comodo implements IEsconderijo {
    private String esconderijo;

    public ComodoComEsconderijo(String nome, String decoracao, String esconderijo) {
        super(nome, decoracao);
        this.esconderijo = esconderijo;
    }

    public String getEsconderijo() {
        return esconderijo;
    }

    public void setEsconderijo(String esconderijo) {
        this.esconderijo = esconderijo;
    }

    public String getNomeEsconderijo() {
        return this.esconderijo;
    }
}