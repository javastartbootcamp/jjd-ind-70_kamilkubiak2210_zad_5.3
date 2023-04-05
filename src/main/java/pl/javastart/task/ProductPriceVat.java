package pl.javastart.task;

public class ProductPriceVat {

    public double convertNetToGross(Product product) {
        double getNetPrice = product.getNetPrice();
        String category = product.getCategory();
        double universalPrice = getNetPrice * 1.10;

        if (category == null) {
            return universalPrice;
        }

        switch (category) {

            case "piwa" -> {
                return getNetPrice * 1.25;
            }
            case "słodycze" -> {
                return getNetPrice * 1.20;
            }
            default -> {
                return universalPrice;
            }
        }
    }
}


