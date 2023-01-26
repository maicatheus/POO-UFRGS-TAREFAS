package src.model;

public abstract class Local {
    protected String nome;
    protected Local[] saidas;

    public Local(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public Local[] getSaidas() {
        return saidas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaidas(Local[] saidas) {
        this.saidas = saidas;
    }

    public abstract String descricao();
}
