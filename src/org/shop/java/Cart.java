package org.shop.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {

    Product[] cart = new Product[0];
    BigDecimal total;

    public Cart(Product[] cart) {
        this.cart = cart;
        this.total = BigDecimal.ZERO;
    }

    public void setItem(Product item) {
        // copio in array temp e aggiungo nuovo item
        Product[] tempArr = new Product[this.cart.length + 1];

        for (int i = 0; i < tempArr.length; i++) {
            if (i < tempArr.length - 1) {
                tempArr[i] = this.cart[i];
            } else {
                tempArr[i] = item;
            }
        }

        // aumento length array
        this.cart = new Product[tempArr.length];

        // ricopio temp array in array originale
        this.cart = tempArr;

        setTotal(this.cart);
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            this.total = total.add(products[i].getTaxedPrice());

        }
    }

    @Override
    public String toString() {
        String stringCart = "";
        if (this.cart.length > 0) {
            for (int i = 0; i < this.cart.length; i++) {
                stringCart += "\n Nome:" + cart[i].getName() + " | ";
            }
        } else {
            return stringCart = "Nessun prodotto nel carrello" + "\nTotale: " + getTotal();
        }
        return stringCart + "\nTotale: " + getTotal();
    }

    public static void main(String[] args) throws Exception {
        Cart cart = new Cart(new Product[0]);
        int userChoise = -1;
        Scanner input = new Scanner(System.in);

        boolean hasCard;
        do {
            System.out.println("Hai la carta fedelta? (true/false):");
            hasCard = input.nextBoolean();
        } while (hasCard != true && hasCard != false);

        do {

            System.out.println(
                    "Selezionare 1 per aggiungere un telefono, 2 per aggiungere un televisore, 3 per aggiungere delle cuffie, 4 per visualizzare il carrello, 0 per uscire");
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
                            phoneMemory, hasCard);
                    cart.setItem(newPhone);

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
                            tvDepth, hasCard);
                    cart.setItem(newTv);

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

                    Headphones newHp = new Headphones(hpColor, isWireless, hpName, hpBrand, hpPrice, hpIva, hasCard);
                    cart.setItem(newHp);

                    System.out.println(newHp);

                    break;
                case 4:
                    System.out.println(cart);
                    break;
            }

        } while (userChoise != 0);
        input.close();
    }

}
