package src.model;
/**
 *
 * @author (Luiz Moura - 326495 )
 * @author (Matheus Maica - 264449)
 * @version (11/22)
 *
 */
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
