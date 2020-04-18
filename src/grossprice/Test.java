package grossprice;

import grossprice.data.Product;
import grossprice.logic.GrossPrice;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Product("Jogurt", "Jogurt owocowy", 2.34, "spozyka");
        products[1] = new Product("Telewizor", "Telewizor 55 cali", 4599.99, "AGD/RTV");
        
        System.out.println(products[0].toString());
        System.out.println(products[1].toString());

        GrossPrice grossPrice = new GrossPrice();

        System.out.println(products[0].getName() + " -> cena + VAT: " + grossPrice.getGrossPrice(products[0]));
        System.out.println(products[1].getName() + " - >cena + VAT: " + grossPrice.getGrossPrice(products[1]));


    }
}
