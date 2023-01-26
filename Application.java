import src.Aviao;
import src.Piloto;

/**
 * Write a description of class Application here.
 *
 * @author (Matheus Maica)
 * @version (11/22)
 */
public class Application{
    public static void main(String[] args){
        
        //questao (a)
        Piloto piloto1 = new Piloto("Jose da Silva", 123456, 2000);
        Piloto piloto2 = new Piloto("Maria das Graças", 456789, 19350);
        
        //questao (b)
        Aviao aviao1 = new Aviao("Boeing", "737", 215, 1000);
        Aviao aviao2 = new Aviao("AirBus", "A320", 200, 3000);
        Aviao aviao3 = new Aviao("Northrop", "f5", 1, 30000);
        
        System.out.println("questao (c)");
        System.out.println(piloto1);
        System.out.println(piloto2);
        
        System.out.println(aviao1);
        System.out.println(aviao2);
        System.out.println(aviao3);
        System.out.println("\n");
        
        
        System.out.println("\n\nquestao (d) apos inserir os pilotos");
        aviao1.inserirPiloto(piloto1);
        aviao2.inserirPiloto(piloto1);
        aviao3.inserirPiloto(piloto1);
        
        
        aviao2.inserirPiloto(piloto2);
        aviao3.inserirPiloto(piloto2);
        
        
        System.out.println(aviao1.toString());
        System.out.println(aviao2.toString());
        System.out.println(aviao3.toString());
        
        
        //questao (e)
        System.out.println("\n\nquestao (e) voando ");
        aviao1.voar(20);
        aviao2.voar(20);
        aviao3.voar(20);
        
        System.out.println(piloto1.toString());
        System.out.println(piloto2.toString());
        
        //questao (f)
        System.out.println("\n\nquestao (f) voando ");
        piloto2.realizarVoo(10630);
        aviao3.inserirPiloto(piloto2);
        aviao3.voar(5);
        
    
    }
}
