package src.model;
/**
 *
 * @author (Luiz Moura - 326495 )
 * @author (Matheus Maica - 264449)
 * @version (11/22)
 *
 */
public class ExteriorComPorta extends Exterior implements IPortaExterna {
    private String descricaoPorta;
    private Local localPorta;

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

    public void setDescricaoPorta(String descricaoPorta) {
        this.descricaoPorta = descricaoPorta;
    }

    public void setLocalPorta(Local localPorta) {
        this.localPorta = localPorta;
    }
}
