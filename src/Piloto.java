package src;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Piloto {
    String nome;
    Integer breve;
    Integer horasVoo;

    public Piloto() {
    }

    public Piloto(String nome, Integer breve, Integer horasVoo) {
        this.nome = nome;
        this.breve = breve;
        this.horasVoo = horasVoo;
    }

    public void realizarVoo(Integer horas) {
        this.horasVoo = this.horasVoo + horas;
    }

    public String toString() {
        return "Piloto: " + this.nome + "\nBreve: " + this.breve + "\nPossui " + this.horasVoo + " horas de voo\n";
    }
}

