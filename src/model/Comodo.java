package src.model;

public class Comodo extends Local {
    public String decoracao;

    public Comodo(String nome, String decoracao) {
        super(nome);
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
