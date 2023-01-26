package src.model;

public class ComodoComPorta extends ComodoComEsconderijo implements IPortaExterna {
    public String descricaoPorta;
    public Local localPorta;

    public ComodoComPorta(String nome, String decoracao, String esconderijo, String descricaoPorta) {
        super(nome, decoracao, esconderijo);
        this.descricaoPorta = descricaoPorta;
    }

    public String getDescricaoPorta() {
        return this.descricaoPorta;
    }

    public Local getLocalPorta() {
        return this.localPorta;
    }
}