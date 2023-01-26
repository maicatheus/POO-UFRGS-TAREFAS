package src;


import src.model.*;

import java.util.Scanner;

public class EscondeEsconde {
    int movimentos;
    Local localizacaoAtual;
    ComodoComPorta salaEstar;
    ComodoComEsconderijo salaJantar;
    ComodoComPorta cozinha;
    Comodo escadas;
    ComodoComEsconderijo hallSuperior;
    ComodoComEsconderijo banheiro;
    ComodoComEsconderijo quartoPrincipal;
    ComodoComEsconderijo quartoMenor;
    ExteriorComPorta quintalFrente;
    ExteriorComPorta quintalFundos;
    ExteriorComEsconderijo jardim;
    ExteriorComEsconderijo calcada;
    Oponente oponente;
    Scanner leitor;

    public EscondeEsconde() {
        this.criaObjetos();
        this.oponente = new Oponente(this.quintalFrente);
        this.movimentos = 0;
        this.localizacaoAtual = null;
        this.leitor = new Scanner(System.in);
        this.escreverMenu();
    }

    public void criaObjetos() {
        this.salaEstar = new ComodoComPorta("Sala de Estar", "um carpete antigo", "na lareira", "porta de carvalho");
        this.salaJantar = new ComodoComEsconderijo("Sala de Jantar", "um lustre de cristal", "embaixo da mesa");
        this.cozinha = new ComodoComPorta("Cozinha", "elétrodomésticos de aço inoxidável", "atrás da geladeira", "porta com tela");
        this.escadas = new Comodo("Escadas", "um corrimão de madeira");
        this.hallSuperior = new ComodoComEsconderijo("Hall Superior", "um quadro com a foto da família", "atrás do sofá");
        this.banheiro = new ComodoComEsconderijo("Banheiro", "uma pia e banheira", "no chuveiro");
        this.quartoPrincipal = new ComodoComEsconderijo("Quarto Principal", "uma cama grande", "embaixo da cama");
        this.quartoMenor = new ComodoComEsconderijo("Quarto Menor", "uma cama de solteiro", "embaixo da cama");
        this.quintalFrente = new ExteriorComPorta("Quintal da Frente", false, "porta de carvalho");
        this.quintalFundos = new ExteriorComPorta("Quintal dos Fundos", true, "porta de tela");
        this.jardim = new ExteriorComEsconderijo("Jardim", false, "no galpão");
        this.calcada = new ExteriorComEsconderijo("Calçada", true, "na garagem");
        this.salaEstar.saidas = new Local[]{this.salaJantar, this.escadas};
        this.salaJantar.saidas = new Local[]{this.salaEstar, this.cozinha};
        this.cozinha.saidas = new Local[]{this.salaJantar};
        this.escadas.saidas = new Local[]{this.salaEstar, this.hallSuperior};
        this.hallSuperior.saidas = new Local[]{this.escadas, this.banheiro, this.quartoMenor, this.quartoPrincipal};
        this.banheiro.saidas = new Local[]{this.hallSuperior};
        this.quartoPrincipal.saidas = new Local[]{this.hallSuperior};
        this.quartoMenor.saidas = new Local[]{this.hallSuperior};
        this.quintalFrente.saidas = new Local[]{this.quintalFundos, this.jardim, this.calcada};
        this.quintalFundos.saidas = new Local[]{this.quintalFrente, this.jardim, this.calcada};
        this.jardim.saidas = new Local[]{this.quintalFrente, this.quintalFundos};
        this.calcada.saidas = new Local[]{this.quintalFrente, this.quintalFundos};
        this.salaEstar.localPorta = this.quintalFrente;
        this.quintalFrente.localPorta = this.salaEstar;
        this.cozinha.localPorta = this.quintalFundos;
        this.quintalFundos.localPorta = this.cozinha;
    }

    public void finalizarJogo() {
        System.out.println("============================================");
        System.out.println("Você encontrou seu oponente em " + this.movimentos + " Movimentos");
        IEsconderijo local = (IEsconderijo)this.localizacaoAtual;
        System.out.println("Ele estava escondido " + local.getNomeEsconderijo());
        this.movimentos = 0;
        this.localizacaoAtual = null;
        System.out.println("Deseja jogar novamente? [1 - SIM] [2 - NÃO]");
        int opcao = this.leitor.nextInt();
        if (opcao == 2) {
            System.exit(0);
        }

    }

    public void verificarEsconderijo() {
        ++this.movimentos;
        if (this.oponente.checar(this.localizacaoAtual)) {
            this.finalizarJogo();
        } else {
            System.out.println("Oponente não está aqui :(");
            this.escreverMenu();
        }

    }

    public void esconder() {
        for(int i = 0; i < 10; ++i) {
            this.oponente.mover();
            System.out.println("" + i + "...");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var3) {
                System.err.println("Erro: " + var3.getMessage());
            }
        }

        System.out.println("Prontos ou não, lá vou eu!");
    }

    public void mover(Local novoLocal) {
        ++this.movimentos;
        this.localizacaoAtual = novoLocal;
    }

    private void escreverMenu() {
        boolean ativa2 = false;
        boolean ativa3 = false;
        if (this.localizacaoAtual == null) {
            this.esconder();
            this.localizacaoAtual = this.salaEstar;
            this.escreverMenu();
        } else {
            System.out.println("============================================");
            System.out.println(this.localizacaoAtual.descricao());
            System.out.println("============================================");
            System.out.println("Ir Para:");

            int pos;
            for(pos = 0; pos < this.localizacaoAtual.saidas.length; ++pos) {
                System.out.println("\t" + (pos + 100) + " - " + this.localizacaoAtual.saidas[pos].nome);
            }

            if (this.localizacaoAtual instanceof IPortaExterna) {
                ativa2 = true;
                System.out.println("2 - Sair pela " + ((IPortaExterna)this.localizacaoAtual).getDescricaoPorta());
            }

            if (this.localizacaoAtual instanceof IEsconderijo) {
                ativa3 = true;
                System.out.println("3 - Checar " + ((IEsconderijo)this.localizacaoAtual).getNomeEsconderijo());
            }

            System.out.print("Informe sua escolha: ");
            int opcao = this.leitor.nextInt();
            if (opcao >= 100) {
                pos = opcao - 100;
                this.mover(this.localizacaoAtual.saidas[pos]);
            } else if (opcao == 2 && ativa2) {
                this.mover(((IPortaExterna)this.localizacaoAtual).getLocalPorta());
            } else if (opcao == 3 && ativa3) {
                this.verificarEsconderijo();
            } else {
                System.out.println("Opção Incorreta! Informe Novamente");
            }

            this.escreverMenu();
        }

    }
}
