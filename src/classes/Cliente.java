package src.classes;

import src.exceptions.ColdException;
import src.exceptions.HotException;

public class Cliente {
    public void bebeCafe(XicaraCafe xic) throws ColdException, HotException {
        int temperatura = xic.getTemp();
        if (temperatura < 65) {
            throw new ColdException("O café está muito frio!");
        } else if (temperatura > 85) {
            throw new HotException("O café está muito quente!");
        } else {
            System.out.println("O cliente está bebendo o café...");
        }
    }
}
