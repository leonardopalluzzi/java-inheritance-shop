import java.math.BigDecimal;
import java.util.Scanner;

import org.shop.java.Headphones;
import org.shop.java.Product;
import org.shop.java.Smartphone;
import org.shop.java.Televisions;

public class App {
    public static void main(String[] args) throws Exception {
        int userChoise = -1;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println(
                    "Selezionare 1 per aggiungere un telefono, 2 per aggiungere un televisore, 3 per aggiungere delle cuffie, 0 per uscire");
            userChoise = input.nextInt();

            switch (userChoise) {
                case 1:
                    input.nextLine();

                    System.out.println("Aggiungi nome telefono:");
                    String phoneName = input.nextLine();

                    System.out.println("Aggiungi brand telefono:");
                    String phoneBrand = input.nextLine();

                    System.out.println("Aggiungi prezzo telefono:");
                    BigDecimal phonePrice = input.nextBigDecimal();

                    System.out.println("Aggiungi iva telefono:");
                    BigDecimal phoneIva = input.nextBigDecimal();

                    input.nextLine();
                    System.out.println("Aggiungi IMEI telefono:");
                    String phoneIMEI = input.nextLine();

                    System.out.println("Aggiungi memoria telefono:");
                    int phoneMemory = input.nextInt();

                    Smartphone newPhone = new Smartphone(phoneName, phoneBrand, phonePrice, phoneIva, phoneIMEI,
                            phoneMemory, false);

                    System.out.println(newPhone);
                    break;

                case 2:

                    input.nextLine();

                    System.out.println("Aggiungi nome Televisione:");
                    String tvName = input.nextLine();

                    System.out.println("Aggiungi brand Televisione:");
                    String tvBrand = input.nextLine();

                    System.out.println("Aggiungi prezzo Televisione:");
                    BigDecimal tvPrice = input.nextBigDecimal();

                    System.out.println("Aggiungi iva Televisione:");
                    BigDecimal tvIva = input.nextBigDecimal();

                    boolean isSmart;

                    System.out.println("Scrivi 'true' se la TV è smart, 'false' se non lo è:");
                    while (!input.hasNextBoolean()) {
                        System.out.println("Valore non valido, specificare true o false");
                        input.next();
                    }
                    isSmart = input.nextBoolean();

                    System.out.println("Aggiungi altezza Televisione:");
                    int tvHeight = input.nextInt();

                    System.out.println("Aggiungi larghezza Televisione:");
                    int tvWidth = input.nextInt();

                    System.out.println("Aggiungi profondita Televisione:");
                    int tvDepth = input.nextInt();

                    Televisions newTv = new Televisions(tvName, tvBrand, tvPrice, tvIva, isSmart, tvHeight, tvWidth,
                            tvDepth, false);

                    System.out.println(newTv);

                    break;
                case 3:

                    input.nextLine();

                    System.out.println("Aggiungi nome cuffie:");
                    String hpName = input.nextLine();

                    System.out.println("Aggiungi brand cuffie:");
                    String hpBrand = input.nextLine();

                    System.out.println("Aggiungi prezzo cuffie:");
                    BigDecimal hpPrice = input.nextBigDecimal();

                    System.out.println("Aggiungi iva cuffie:");
                    BigDecimal hpIva = input.nextBigDecimal();

                    input.nextLine();
                    System.out.println("Aggiungi colore cuffie:");
                    String hpColor = input.nextLine();

                    boolean isWireless;

                    System.out.println("Scrivi 'true' se le cuffie sono wireless, 'false' se non lo sono:");
                    while (!input.hasNextBoolean()) {
                        System.out.println("Valore non valido, specificare true o false");
                        input.next();
                    }
                    isWireless = input.nextBoolean();

                    Headphones newHp = new Headphones(hpColor, isWireless, hpName, hpBrand, hpPrice, hpIva, false);

                    System.out.println(newHp);

                    break;
            }

        } while (userChoise != 0);
        input.close();
    }
}
