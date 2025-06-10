import java.math.BigDecimal;
import java.util.Scanner;

import org.shop.java.Product;
import org.shop.java.Smartphone;

public class App {
    public static void main(String[] args) throws Exception {
        Product prodotto = new Product("cazzo", "merda", new BigDecimal(14.55), new BigDecimal(22));
        int userChoise = -1;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Selezionare 1 per aggiungere un telefono, 0 per uscire");
            userChoise = input.nextInt();

            switch (userChoise) {
                case 1:
                    System.out.println("Aggiungi nome telefono:");
                    String nome = input.nextLine();

                    System.out.println("Aggiungi brand telefono:");
                    String brand = input.nextLine();

                    System.out.println("Aggiungi prezzo telefono:");
                    BigDecimal prezzo = input.nextBigDecimal();

                    System.out.println("Aggiungi iva telefono:");
                    BigDecimal iva = input.nextBigDecimal();

                    System.out.println("Aggiungi IMEI telefono:");
                    String IMEI = input.nextLine();

                    System.out.println("Aggiungi memoria telefono:");
                    int memoria = input.nextInt();

                    break;

                case 2:

                    break;
                case 3:

                    break;
            }

        } while (userChoise != 0);

    }
}
