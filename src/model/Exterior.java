package src.model;

public class Exterior extends Local {
    public Boolean quente;

    public Exterior(String nome, Boolean quente) {
        super(nome);
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
