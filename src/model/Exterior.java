package src.model;
/**
 *
 * @author (Luiz Moura - 326495 )
 * @author (Matheus Maica - 264449)
 * @version (11/22)
 *
 */
public class Exterior extends Local {
    protected Boolean quente;

    public Exterior(String nome, Boolean quente) {
        super(nome);
        this.quente = quente;
    }

    public Boolean getQuente() {
        return quente;
    }

    public void setQuente(Boolean quente) {
        this.quente = quente;
    }

    public String descricao() {
        String estaQuente = this.quente ? ". Esta muito quente aqui. " : ".";
        String listaSaida = "";
        Local[] var3 = this.saidas;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Local var10000 = var3[var5];
            listaSaida = listaSaida + "-  < " + this.getNome() + " >\n";
        }

        return "Voce esta na(o) " + this.getNome() + estaQuente + "\nDaqui voce ve saida para os seguintes comodos: \n " + listaSaida;
    }
}
