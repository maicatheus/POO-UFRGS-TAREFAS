package src.model;
/**
 *
 * @author (Luiz Moura - 326495 )
 * @author (Matheus Maica - 264449)
 * @version (11/22)
 *
 */
public class Comodo extends Local {
    protected String decoracao;

    public Comodo(String nome, String decoracao) {
        super(nome);
        this.decoracao = decoracao;
    }

    public String getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(String decoracao) {
        this.decoracao = decoracao;
    }

    public String descricao() {
        String listaSaida = "";
        Local[] saidas = super.saidas;

        for(Local saida: saidas) {
            listaSaida = listaSaida + "-  < " + saida.getNome() + " >\n";
        }

        return "Voce esta na(o) " + this.getNome() + ". Voce ve " + this.decoracao + " aqui. Daqui voce ve saida para os seguintes comodos:  \n" + listaSaida;
    }
}
