package grossprice.logic;

import grossprice.data.Product;

public class GrossPrice {

    private double grossPrice;

    public double getGrossPrice(Product product) {
        switch (product.getCat()) {
            case "spozyka":
                grossPrice = product.getNetPrice() * 1.08;
                break;
            case "AGD/RTV":
                grossPrice = product.getNetPrice() * 1.23;
                break;
        }
        return grossPrice;
    }
}
