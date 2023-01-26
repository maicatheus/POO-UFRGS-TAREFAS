package src.model;

public class ExteriorComPorta extends Exterior implements IPortaExterna {
    public String descricaoPorta;
    public Local localPorta;

    public ExteriorComPorta(String nome, Boolean quente, String descricaoPorta) {
        super(nome, quente);
        this.descricaoPorta = descricaoPorta;
    }

    public String getDescricaoPorta() {
        return this.descricaoPorta;
    }

    public Local getLocalPorta() {
        return this.localPorta;
    }
}
