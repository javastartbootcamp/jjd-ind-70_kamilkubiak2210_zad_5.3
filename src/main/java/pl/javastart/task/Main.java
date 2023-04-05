package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Carlsberg", "piwo", 5, "piwa");
        Product product2 = new Product("Snickers", "baton", 4, "słodycze");
        Product product3 = new Product("Wymarzony dom", "książka", 10, "książki");

        ProductPriceVat productPriceVat = new ProductPriceVat();

        printInfoAboutProductAndPrice(product1, productPriceVat);
        printInfoAboutProductAndPrice(product2, productPriceVat);
        printInfoAboutProductAndPrice(product3, productPriceVat);

    }

    private static void printInfoAboutProductAndPrice(Product product, ProductPriceVat productPriceVat) {
        double productGrossPrice = productPriceVat.convertNetToGross(product);
        System.out.println("Produkt: " + product.getName() + " - " + product.getDescription() + "\ncena netto: "
                + product.getNetPrice() + " zł" + "\ncena brutto: " + productGrossPrice + " zł" + "\n");
    }
}
