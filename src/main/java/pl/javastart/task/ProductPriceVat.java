package pl.javastart.task;

public class ProductPriceVat {

    public double convertNetToGross(Product product) {
        double getNetPrice = product.getNetPrice();
        String category = product.getCategory();

        switch (category) {

            case "piwa" -> {
                return getNetPrice * 1.25;
            }
            case "słodycze" -> {
                return getNetPrice * 1.20;
            }
            default -> {
                return getNetPrice * 1.10;
            }
            case null -> {
                return getNetPrice * 1.10;
            }
        }
    }
}


