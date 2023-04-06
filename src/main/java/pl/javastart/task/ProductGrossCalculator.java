package pl.javastart.task;

public class ProductGrossCalculator {

    public static final int VAT_FOR_ALCOHOL_IN_PERCENT = 25;
    public static final int VAT_FOR_SWEETS_IN_PERCENT = 20;
    public static final int VAT_UNIVERSAL = 10;

    public double convertNetToGross(Product product) {

        double getNetPrice = product.getNetPrice();
        String category = product.getCategory();

        int vat = VAT_UNIVERSAL;
        if (category != null) {
            vat = switch (category) {
                case Product.CATEGORY_BEER -> VAT_FOR_ALCOHOL_IN_PERCENT;
                case Product.CATEGORY_SWEETS -> VAT_FOR_SWEETS_IN_PERCENT;
                default -> VAT_UNIVERSAL;
            };
        }
        return ((100 + vat) * getNetPrice / 100);
    }
}
