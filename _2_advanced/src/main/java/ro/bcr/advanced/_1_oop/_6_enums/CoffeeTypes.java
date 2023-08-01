package ro.bcr.advanced._1_oop._6_enums;

public enum CoffeeTypes {
    AMERICANO(5, "black coffee"),
    LATTE(10, "coffee with milk"),
    ESPRESSO(7, "simple coffee");

    private int price;
    private String description;

    // private by default
    CoffeeTypes(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CoffeeTypes{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
