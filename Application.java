import src.classes.CafeVirtual;
import src.classes.Cliente;
import src.classes.XicaraCafe;

import java.util.Scanner;

/**
 * @author Matheus Maica
 *
 * */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("C – Capuccino");
        System.out.println("P – Pingado");
        System.out.println("E – Expresso");
        System.out.println("L – Latte");
        System.out.println("X – Sair");

        String bebida = "";
        int temperatura = 0;

        System.out.print("Digite a bebida e a temperatura desejada (separadas por espaço): ");
        String entrada = scanner.nextLine().toUpperCase();

        try {

            if (entrada.equals("X")) {
                System.out.println("Até logo!");
                return;
            }

            String[] valores = entrada.split(" ");

            if (valores.length != 2) {
                throw new IllegalArgumentException("Entrada inválida: é necessário informar a bebida e a temperatura separadas por espaço.");
            }


            bebida = valores[0];
            temperatura = Integer.parseInt(valores[1]);

            if (temperatura < 0 || temperatura > 100) {
                throw new IllegalArgumentException("Temperatura inválida: deve estar entre 0 e 100 graus.");
            }

            System.out.println("Você pediu uma " + pegarNomeDoCafe(bebida)+ " a " + temperatura + " graus.");

            XicaraCafe xicara = new XicaraCafe(temperatura, bebida);
            Cliente cliente = new Cliente();
            CafeVirtual cafe = new CafeVirtual();

            cafe.serveCliente(cliente, xicara);

        } catch (NumberFormatException e) {
            System.out.println("Erro: a temperatura deve ser um número inteiro.");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            System.exit(1);
        }

    }

    private static String pegarNomeDoCafe(String tipo){
        switch (tipo) {
            case "C":
                return "cappuccino";
            case "P":
                return "pingado";
            case "E":
                return "espresso";
            default:
                return "latte";
        }
    }
}
