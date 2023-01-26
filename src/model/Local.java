package src.model;

public abstract class Local {
    public String nome;
    public Local[] saidas;

    public Local(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSaidas() {
        String saidasFormatadas = null;
        Local[] var2 = this.saidas;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Local saida = var2[var4];
            saidasFormatadas = saidasFormatadas + " - " + saida.nome + "\n";
        }

        return saidasFormatadas;
    }

    public abstract String descricao();
}
