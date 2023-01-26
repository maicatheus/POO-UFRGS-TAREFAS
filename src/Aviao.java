package src;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Aviao {
    String marca;
    String modelo;
    Integer capacidade;
    Piloto piloto;
    Integer minimoHoras;

    public Aviao() {
    }

    public Aviao(String marca, String modelo, Integer capacidade, Integer minimoHoras) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.minimoHoras = minimoHoras;
    }

    public Boolean inserirPiloto(Piloto piloto) {
        if (piloto.horasVoo >= this.minimoHoras) {
            System.out.println("O piloto " + piloto.nome + " e o novo piloto do " + this.marca + " - " + this.modelo);
            this.piloto = piloto;
            return true;
        } else {
            System.out.println("O Piloto nao esta autorizado a operar este aviao!");
            return false;
        }
    }

    public void voar(Integer tempo) {
        if (this.piloto == null) {
            System.out.println("Impossivel voar! Nao tenho piloto!");
        } else {
            this.piloto.realizarVoo(tempo);
            System.out.println(this.marca + " - " + this.modelo + " decolando com o piloto " + this.piloto.nome);
        }

    }

    public String toString() {
        return this.piloto == null ? "Aviao " + this.marca + " - " + this.modelo + " com capacidade para " + this.capacidade + " passageiros\nNao possui piloto!" : "Aviao " + this.marca + " - " + this.modelo + " com capacidade para " + this.capacidade + " passageiros\nPilotado por: \n" + this.piloto.toString() + "\n";
    }
}

