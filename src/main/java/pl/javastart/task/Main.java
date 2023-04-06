package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Carlsberg", "piwo", 5, Product.CATEGORY_BEER);
        Product product2 = new Product("Snickers", "baton", 4, Product.CATEGORY_SWEETS);
        Product product3 = new Product("Wymarzony dom", "książka", 10, null);

        ProductGrossCalculator productGrossCalculator = new ProductGrossCalculator();

        printInfoAboutProductAndPrice(product1, productGrossCalculator);
        printInfoAboutProductAndPrice(product2, productGrossCalculator);
        printInfoAboutProductAndPrice(product3, productGrossCalculator);

    }

    private static void printInfoAboutProductAndPrice(Product product, ProductGrossCalculator productGrossCalculator) {
        double productGrossPrice = productGrossCalculator.convertNetToGross(product);
        System.out.println("Produkt: " + product.getName() + " - " + product.getDescription() + "\ncena netto: "
                + product.getNetPrice() + " zł" + "\ncena brutto: " + productGrossPrice + " zł" + "\n");
    }
}
