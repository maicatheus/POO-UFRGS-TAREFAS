package src.classes;

import src.exceptions.ColdException;
import src.exceptions.HotException;

public class CafeVirtual {
    public void serveCliente(Cliente cli, XicaraCafe xic) {
        try {
            cli.bebeCafe(xic);
        } catch (ColdException e) {
            System.out.println("O cliente ficou insatisfeito: " + e.getMessage());
        } catch (HotException e) {
            System.out.println("O cliente ficou insatisfeito: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
