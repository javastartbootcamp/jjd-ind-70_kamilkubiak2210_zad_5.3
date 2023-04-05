package pl.javastart.task;

public class Product {
    private final String name;
    private final String description;
    private final double netPrice;
    private final String category;

    public Product(String name, String description, double netPrice, String category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public String getCategory() {
        return category;
    }

}

