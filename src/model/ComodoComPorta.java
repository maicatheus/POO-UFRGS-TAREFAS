package src.model;
/**
 *
 * @author (Luiz Moura - 326495 )
 * @author (Matheus Maica - 264449)
 * @version (11/22)
 *
 */
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