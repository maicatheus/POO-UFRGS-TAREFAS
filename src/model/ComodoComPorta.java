package src.model;

public class ComodoComPorta extends ComodoComEsconderijo implements IPortaExterna {
    private String descricaoPorta;
    private Local localPorta;

    public ComodoComPorta(String nome, String decoracao, String esconderijo, String descricaoPorta) {
        super(nome, decoracao, esconderijo);
        this.descricaoPorta = descricaoPorta;
    }

    public void setDescricaoPorta(String descricaoPorta) {
        this.descricaoPorta = descricaoPorta;
    }

    public void setLocalPorta(Local localPorta) {
        this.localPorta = localPorta;
    }

    public String getDescricaoPorta() {
        return this.descricaoPorta;
    }

    public Local getLocalPorta() {
        return this.localPorta;
    }
}