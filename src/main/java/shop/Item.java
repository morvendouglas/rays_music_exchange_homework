package shop;

public abstract class Item implements ISell {

    private String description;
    private double boughtPrice;
    private double sellPrice;

    public Item(String description, double boughtPrice, double sellPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice -= this.boughtPrice;
    }
}
